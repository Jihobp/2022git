using CSharp_teamProject.HotelF;
using System.Collections.Generic;
using System.IO;

namespace CSharp_teamProject
{
    public abstract class DataManager
    {
        public List<User> Users = new List<User>();
        public List<Hotel> Hotels = new List<Hotel>();

        public abstract void Load(string user_id_box = "");
        public abstract string Load(string id, string pw);
        // id값을 가져올 것
        public abstract User MypageLoad(string id);
        public abstract void bookInsert(Book bookInfo);
        public abstract List<string> bookSelect(string id);
        public abstract List<User> adminSelect(string id);
        public abstract int adminInsert(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email);
        public abstract int adminUpdate(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email);
        public abstract int adminDelete(string user_id, string user_passWord);
        public abstract List<Hotel> hotelSelect(string hotelName);
        public abstract int hotelInsert(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng);
        public abstract int hotelUpdate(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng, int hNum);
        public abstract int hotelDelete(int hNum);
        public abstract void Save();

        public void printLog(string contents)
        {
            DirectoryInfo di = new DirectoryInfo("Admin_History");
            if (di.Exists == false)
                di.Create();

            using (StreamWriter w = new StreamWriter("Admin_History\\Admin_History.txt", true))
            {
                w.WriteLine(contents);
            }
        }
    }
}
