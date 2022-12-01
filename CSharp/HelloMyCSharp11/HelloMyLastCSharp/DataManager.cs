using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Xml.Linq;

namespace HelloMyLastCSharp
{
    public class DataManager
    {
        public static List<Book> Books = new List<Book>();
        public static List<User> Users = new List<User>();

        //태그 이름들을 미리 적어놓음. //오타날 일이 없다.
        const string ISBN = "isbn";
        const string NAME = "name";
        const string PUBLISHER = "publisher";
        const string PAGE = "page";
        const string USERID = "userid";
        const string USERNAME = "username";
        const string ISBORROWED = "isborrowed";
        const string BORROWEDAT = "borrowedAt";

        const string ID = "id";
        //정적 생성자 ( 아래 둘 중 하나에서 호출됨)
        //처음에 한번만 호출함
        //1. 해당 클래스로 인스턴스를 처음 만들었을 때
        //2. 해당 클래스를 언급할 때 (ex) DataManager.Books
        static DataManager() //정적생성자는 단 한번만 호출함 !!! ㅇㅅㅇ /~~~~~~~~~~~~~!!!!!!!!!!!
        {
            Load();
        }
        public static void Load()
        {
            try
            {
                string booksOutput = File.ReadAllText(@"./Books.xml");
                //Book
                XElement bx = XElement.Parse(booksOutput);
                //LINQ 버전
                Books = (from item in bx.Descendants("book") //컬렉션 시스템추가
                         select new Book()
                         {
                             Isbn = item.Element(ISBN).Value,
                             Name = item.Element(NAME).Value,
                             Publisher = item.Element(PUBLISHER).Value,
                             Page = int.Parse(item.Element(PAGE).Value),
                             BorrowedAt = DateTime.Parse(item.Element(BORROWEDAT).Value),
                             isBorrowed = item.Element(ISBORROWED).Value != "0" ? true : false,
                             UserId = int.Parse(item.Element(USERID).Value),
                             UserName = item.Element(USERNAME).Value
                         }).ToList<Book>();

                //foreach 버전
                string usersOutput = File.ReadAllText(@"./Users.xml");
                XElement ux = XElement.Parse(usersOutput);
                Users.Clear(); //수동으로 클리어 해야함.
                foreach (var item in ux.Descendants("user"))
                {
                    User temp = new User();
                    temp.Name = item.Element(NAME).Value;
                    temp.Id = int.Parse(item.Element(ID).Value);
                    Users.Add(temp);
                }

            }
            catch (Exception)
            {
                //메세지 박스와 차이점
                //메세지 박스는 확인창만 뜨지만
                //이건 계속하기/끝내기 창 2개가 뜨고,
                //누가 봐도 오류창처럼 생긴 창이 나옴...
                System.Windows.Forms.MessageBox.Show("파일 누락! 새로 만듭니다!");
                Save();
                Load();
            }
        }
        //파일이 없을 경우엔 새로 만들고,
        //파일이 있다면 변경 내용을 통쨰로 새로 저장함.
        public static void Save()
        {
            string booksOutput = "";
            booksOutput += "<books>\n";
            //Books 파일이 없거나 books 태그에 아무것도 없다면
            //파일에 <books></books> 만 저장됨.
            foreach (var item in Books)
            {   //\n넣어서 띄워쓰기, 들여쓰기 해줘야 잘보임.
                booksOutput += " <book>\n";
                booksOutput += $"   <{ISBN}>{item.Isbn}</{ISBN}>\n";
                booksOutput += $"   <{NAME}>{item.Name}</{NAME}>\n";
                booksOutput += $"   <{PUBLISHER}>{item.Publisher}</{PUBLISHER}>\n";
                booksOutput += $"   <{PAGE}>{item.Page}</{PAGE}>\n";
                booksOutput += $"   <{BORROWEDAT}>{item.BorrowedAt}</{BORROWEDAT}>\n";
                booksOutput += $"   <{ISBORROWED}>" + (item.isBorrowed ? 1 : 0) + $"</{ISBORROWED}>\n";
                booksOutput += $"   <{USERID}>{item.UserId}</{USERID}>\n";
                booksOutput += $"   <{USERNAME}>{item.UserName}</{USERNAME}>\n";
                booksOutput += " </book>\n";
            }
            booksOutput += "</books>\n";
            //기존 내용을 booksOutput에 저장된 텍스트로 덮어씀
            File.WriteAllText(@"./Books.xml", booksOutput);

            string usersOutput = "";
            usersOutput += "<users>\n";
            foreach (var item in Users)
            {
                usersOutput += " <user>\n";
                usersOutput += $"   <{ID}>{item.Id}</{ID}>\n";
                usersOutput += $"   <{NAME}>{item.Name}</{NAME}>\n";
                usersOutput += $" </user>\n";
            }
            usersOutput += "</users>\n";
            File.WriteAllText(@"./Users.xml", usersOutput);
        }

    }
}
