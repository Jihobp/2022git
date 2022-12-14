using CSharp_teamProject.HotelF;
using System;
using System.Collections.Generic;
using System.Data;

namespace CSharp_teamProject
{
    public class AdminManager : DataManager
    {
        private static AdminManager _instance;

        public static AdminManager Instance
        {
            get
            {
                if (_instance == null)
                {
                    _instance = new AdminManager();
                    _instance.Load();
                }
                return _instance;
            }
        }

        private AdminManager()
        {
        }

        public override void Load(string user_id_box = "")
        {
            try
            {
                AdminHelper.Instance.selectQuery(user_id_box);
                Users.Clear();
                foreach (DataRow item in AdminHelper.Instance.dt.Rows)
                {
                    User temp = new User();
                    temp.user_num = int.Parse(item["user_num"].ToString());
                    temp.user_id = item["user_id"].ToString();
                    temp.user_passWord = item["user_passWord"].ToString();
                    temp.user_name = item["user_name"].ToString();
                    temp.user_phoneNum = item["user_phoneNum"].ToString();
                    temp.user_email = item["user_email"].ToString();
                    temp.user_createTime = item["user_createTime"].ToString() == "" ?
                    new DateTime() :
                        DateTime.Parse(item["user_createTime"].ToString());

                    Users.Add(temp);
                }
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "load");
                printLog(e.StackTrace + "load");
            }
        }

        public override string Load(string id, string pw)
        {
            string result = "";
            try
            {
                if (id == "admin" && pw == "1234")
                {
                    result = "admin";
                    return result;
                }
                else
                {
                    result = AdminHelper.Instance.loginQuery(id, pw);
                    return result;
                }
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "load");
                printLog(e.StackTrace + "load");
                return "";
            }
        }

        public override User MypageLoad(string id)
        {
            User MyPageUser = AdminHelper.Instance.MyPageSelect(id);
            return MyPageUser;
        }

        public override void bookInsert(Book bookInfo)
        {
            AdminHelper.Instance.insertQuery(bookInfo);
        }

        public override List<string> bookSelect(string id)
        {
            List<string> MyBook = AdminHelper.Instance.bookSelectQuery(id);
            return MyBook;
        }

        public override void Save()
        {
            throw new System.NotImplementedException();
        }

        public override List<User> adminSelect(string id)
        {
            List<User> u = AdminHelper.Instance.selectQuery(id);
            return u;
        }

        public override int adminInsert(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email)
        {
            int result = AdminHelper.Instance.insertQuery(user_id, user_passWord, user_name, user_phoneNum, user_email);
            return result;
        }

        public override int adminUpdate(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email)
        {
            int result = AdminHelper.Instance.updateQuery(user_id, user_passWord, user_name, user_phoneNum, user_email);
            return result;
        }
        public override List<Hotel> hotelSelect(string hotelName)
        {
            List<Hotel> li = AdminHelper.Instance.hotelSelectQuery(hotelName);
            return li;
        }

        public override int adminDelete(string user_id, string user_passWord)
        {
            int result = AdminHelper.Instance.deleteQuery(user_id, user_passWord);
            return result;
        }

        public override int hotelInsert(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng)
        {
            int result = AdminHelper.Instance.hotelInsertQuery(hotel_name, hotel_tell, hotel_post, hotel_addr, hotel_roomNumber, hotel_lat, hotel_lng);
            return result;
        }

        public override int hotelUpdate(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng, int hNum)
        {
            int result = AdminHelper.Instance.hotelUpdateQuery(hotel_name, hotel_tell, hotel_post, hotel_addr, hotel_roomNumber, hotel_lat, hotel_lng, hNum);
            return result;
        }

        public override int hotelDelete(int hNum)
        {
            int result = AdminHelper.Instance.hotelDeleteQuery(hNum);
            return result;
        }
    }
}
