using CSharp_teamProject.HotelF;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;

namespace CSharp_teamProject
{
    public abstract class DBHelper
    {
        protected SqlConnection conn = new SqlConnection();
        protected SqlDataAdapter da;
        protected DataSet ds;
        public DataTable dt;
        public List<User> UsersSelect = new List<User>();
        public List<Hotel> HotelSelect = new List<Hotel>();

        protected void ConnectDB()
        {
            string dataSource = "local";
            string db = "HHDB";
            string security = "SSPI";
            conn.ConnectionString = string.Format
                ("Data Source=({0}); initial Catalog={1};" +
                "integrated Security={2};" +
                "Timeout=3", dataSource, db, security);
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }

        public abstract List<User> selectQuery(string user_id = "");
        public abstract int updateQuery(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email);
        public abstract int deleteQuery(string user_id, string user_passWord);
        public abstract int insertQuery(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email);
        public abstract string loginQuery(string id, string pw);
        public abstract void insertQuery(Book bookInfo);
        public abstract List<string> bookSelectQuery(string id);
        public abstract List<Hotel> hotelSelectQuery(string hotelName);
        public abstract int hotelInsertQuery(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng);
        public abstract int hotelUpdateQuery(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng, int hNum);
        public abstract int hotelDeleteQuery(int hNum);
        public abstract User MyPageSelect(string user_id);
    }
}
