using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Text;
using System.Web.Script.Serialization;

namespace CSharp_teamProject.Map
{
    public class KakaoAPI
    {   //https://jihobp.github.io/maphosting/
        public static List<Locale> Search(string text)
        {
            List<Locale> list = new List<Locale>();
            string site = "https://dapi.kakao.com/v2/local/search/keyword.json";
            string query = $"{site}?query={text}";
            string restApiKey = "b9c8f4180eb87bcf26d1d2a21849b691";
            string Header = $"KakaoAK {restApiKey}";

            WebRequest request = WebRequest.Create(query);
            request.Headers.Add("Authorization", Header);

            //응답받기
            WebResponse response = request.GetResponse();
            //Using System.IO
            Stream stream = response.GetResponseStream();
            StreamReader reader = new StreamReader(stream, Encoding.UTF8);
            string json = reader.ReadToEnd();
            //프로젝트에서 패키지관리>찾아보기>맨위에꺼 설치>>>  밑에 빨간줄 누겟 using 어쩌구 추가
            JavaScriptSerializer js = new JavaScriptSerializer();
            //dynamic = js에서의 let 같은 것.

            dynamic dob = js.Deserialize<dynamic>(json);
            dynamic docs = dob["documents"];
            object[] buf = docs;
            int length = buf.Length;
            for (int i = 0; i < length; i++)
            {
                string lname = docs[i]["place_name"];
                double x = double.Parse(docs[i]["x"]);
                double y = double.Parse(docs[i]["y"]);
                list.Add(new Locale(lname, y, x));//y먼저 ㅇㅅㅇ
            }
            return list;
        }
    }
}
