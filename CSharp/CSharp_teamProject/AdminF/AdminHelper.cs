using CSharp_teamProject.HotelF;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;

namespace CSharp_teamProject
{
    public class AdminHelper : DBHelper
    {
        private static AdminHelper _instance;

        public static AdminHelper Instance
        {
            get
            {
                if (_instance == null)
                    _instance = new AdminHelper();
                return _instance;
            }
        }

        private AdminHelper()
        {
        }

        public override List<User> selectQuery(string user_id)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (user_id == "")
                {
                    UsersSelect.Clear();
                    cmd.CommandText = "select * from user_table";

                    da = new SqlDataAdapter(cmd);
                    ds = new DataSet();
                    da.Fill(ds, "uesr_table");
                    dt = ds.Tables[0];

                    return UsersSelect;
                }

                else
                {
                    cmd.CommandText = "select * from user_table where user_id like '%" + user_id + "%'";
                    SqlDataReader sdr = cmd.ExecuteReader();
                    UsersSelect.Clear();

                    while (sdr.Read())
                    {
                        User us = new User();
                        us.user_num = int.Parse(sdr["user_num"].ToString());
                        us.user_id = sdr["user_id"].ToString();
                        us.user_passWord = sdr["user_passWord"].ToString();
                        us.user_name = sdr["user_name"].ToString();
                        us.user_phoneNum = sdr["user_phoneNum"].ToString();
                        us.user_email = sdr["user_email"].ToString();
                        us.user_createTime = sdr["user_createTime"].ToString() == "" ?
                    new DateTime() :
                        DateTime.Parse(sdr["user_createTime"].ToString());

                        UsersSelect.Add(us);
                    }
                    return UsersSelect;
                }

            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "select");
                AdminManager.Instance.printLog("select" + e.StackTrace);
                return UsersSelect;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int updateQuery(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "update user_table set user_name=@p3, user_phoneNum=@p4, user_email=@p5 where user_id=@p1 and user_passWord=@p2";
                cmd.Parameters.AddWithValue("@p1", user_id);
                cmd.Parameters.AddWithValue("@p2", user_passWord);
                cmd.Parameters.AddWithValue("@p3", user_name);
                cmd.Parameters.AddWithValue("@p4", user_phoneNum);
                cmd.Parameters.AddWithValue("@p5", user_email);
                // cmd.Parameters.AddWithValue("@p6", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff"));
                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show("update" + e.Message);
                AdminManager.Instance.printLog("update" + e.StackTrace);
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int deleteQuery(string user_id, string user_passWord)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "delete user_table where user_id=@p1 and user_passWord=@p2";
                cmd.Parameters.AddWithValue("@p1", user_id);
                cmd.Parameters.AddWithValue("@p2", user_passWord);
                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show("delete" + e.Message);
                AdminManager.Instance.printLog("delete" + e.StackTrace);
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int insertQuery(string user_id, string user_passWord, string user_name, string user_phoneNum, string user_email)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "insert into user_table(user_id, user_passWord, user_name, user_phoneNum, user_email, user_createTime) values (@p1, @p2, @p3, @p4, @p5, getdate())";
                cmd.Parameters.AddWithValue("@p1", user_id);
                cmd.Parameters.AddWithValue("@p2", user_passWord);
                cmd.Parameters.AddWithValue("@p3", user_name);
                cmd.Parameters.AddWithValue("@p4", user_phoneNum);
                cmd.Parameters.AddWithValue("@p5", user_email);
                // cmd.Parameters.AddWithValue("@p6", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff"));
                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }

        public override string loginQuery(string user_id, string user_pw)
        {
            string result = "";
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select user_id, user_passWord from user_table where user_id = @p1 and user_passWord = @p2";
                cmd.Parameters.AddWithValue("@p1", user_id);
                cmd.Parameters.AddWithValue("@p2", user_pw);
                SqlDataReader sdr = cmd.ExecuteReader();

                if (sdr.Read())
                    result = sdr["user_id"].ToString();
                return result;
            }
            catch (Exception e)
            {
                return "";
            }
            finally
            {
                conn.Close();
            }
        }

        public override User MyPageSelect(string user_id)
        {
            User us = new User();
            try
            {
                ConnectDB(); // db 연결

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn; // 어디에 커맨드 보낼지 지정
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";

                sqlcommand = "select * from user_table where user_id=@p1";
                cmd.Parameters.AddWithValue("@p1", user_id);
                cmd.CommandText = sqlcommand;
                SqlDataReader sdr = cmd.ExecuteReader();

                while (sdr.Read())
                {
                    us.user_name = sdr["user_name"].ToString();
                    us.user_id = sdr["user_id"].ToString();
                    us.user_phoneNum = sdr["user_phoneNum"].ToString();
                    us.user_email = sdr["user_email"].ToString();
                }
                return us;
            }
            catch (Exception e)
            {
                return us;
            }
            finally
            {
                conn.Close();
            }
        }

        public override void insertQuery(Book bookInfo)
        {
            Book b = new Book();
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandText = "insert into book_table (book_id, book_name, book_hotelName, book_createTime) values (@p1, @p2, @p3, getdate());";
                cmd.Parameters.AddWithValue("@p1", bookInfo.book_id);
                cmd.Parameters.AddWithValue("@p2", bookInfo.book_name);
                cmd.Parameters.AddWithValue("@p3", bookInfo.book_hotelName);
                SqlDataReader sdr = cmd.ExecuteReader();

                if (sdr.Read())
                {
                    b.book_id = sdr["book_id"].ToString();
                    b.book_name = sdr["book_name"].ToString();
                    b.book_hotelName = sdr["book_hotelName"].ToString();
                }
            }
            catch (Exception e)
            {
            }
            finally
            {
                conn.Close();
            }
        }

        public override List<string> bookSelectQuery(string id)
        {
            List<string> l = new List<string>();
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandText = "select * from book_table where book_id = @p1";
                cmd.Parameters.AddWithValue("@p1", id);
                SqlDataReader sdr = cmd.ExecuteReader();

                l.Clear();
                while (sdr.Read())
                {
                    l.Add(sdr["book_hotelName"].ToString() + "  " + sdr["book_createTime"].ToString());
                }
                return l;
            }
            catch (Exception e)
            {
                return l;
            }
            finally
            {
                conn.Close();
            }
        }

        public override List<Hotel> hotelSelectQuery(string hotelName)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (hotelName == "")
                {
                    HotelSelect.Clear();
                    cmd.CommandText = "select * from hotel_table";
                    SqlDataReader sdr = cmd.ExecuteReader();

                    while (sdr.Read())
                    {
                        Hotel ho = new Hotel();
                        ho.hotel_num = int.Parse(sdr["Hotel_Num"].ToString());
                        ho.hotel_name = sdr["Hotel_Name"].ToString();
                        ho.hotel_tell = sdr["Hotel_Tell"].ToString();
                        ho.hotel_post = sdr["Hotel_Post"].ToString();
                        ho.hotel_addr = sdr["Hotel_Addr"].ToString();
                        ho.hotel_roomNumber = int.Parse(sdr["Hotel_RoomNum"].ToString());
                        ho.hotel_lat = double.Parse(sdr["Hotel_Lat"].ToString());
                        ho.hotel_lng = double.Parse(sdr["Hotel_Lng"].ToString());

                        HotelSelect.Add(ho);
                    }
                    return HotelSelect;
                }

                else
                {
                    HotelSelect.Clear();
                    cmd.CommandText = "select * from hotel_table where Hotel_Name like '%" + hotelName + "%'";
                    SqlDataReader sdr = cmd.ExecuteReader();

                    while (sdr.Read())
                    {
                        Hotel ho = new Hotel();
                        ho.hotel_num = int.Parse(sdr["Hotel_Num"].ToString());
                        ho.hotel_name = sdr["Hotel_Name"].ToString();
                        ho.hotel_tell = sdr["Hotel_Tell"].ToString();
                        ho.hotel_post = sdr["Hotel_Post"].ToString();
                        ho.hotel_addr = sdr["Hotel_Addr"].ToString();
                        ho.hotel_roomNumber = int.Parse(sdr["Hotel_RoomNum"].ToString());
                        ho.hotel_lat = double.Parse(sdr["Hotel_Lat"].ToString());
                        ho.hotel_lng = double.Parse(sdr["Hotel_Lng"].ToString());

                        HotelSelect.Add(ho);
                    }
                    return HotelSelect;
                }
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "select");
                AdminManager.Instance.printLog("select" + e.StackTrace);
                return HotelSelect;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int hotelInsertQuery(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "insert into hotel_table(Hotel_Name, Hotel_Tell, Hotel_Post, Hotel_Addr, Hotel_RoomNum, Hotel_Lat, Hotel_Lng) values (@p1, @p2, @p3, @p4, @p5, @p6, @p7)";
                cmd.Parameters.AddWithValue("@p1", hotel_name);
                cmd.Parameters.AddWithValue("@p2", hotel_tell);
                cmd.Parameters.AddWithValue("@p3", hotel_post);
                cmd.Parameters.AddWithValue("@p4", hotel_addr);
                cmd.Parameters.AddWithValue("@p5", hotel_roomNumber);
                cmd.Parameters.AddWithValue("@p6", hotel_lat);
                cmd.Parameters.AddWithValue("@p7", hotel_lng);
                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int hotelUpdateQuery(string hotel_name, string hotel_tell, string hotel_post, string hotel_addr, string hotel_roomNumber, string hotel_lat, string hotel_lng, int hNum)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "update hotel_table set Hotel_Name=@p2, Hotel_Tell=@p3, Hotel_Post=@p4, Hotel_Addr=@p5, Hotel_RoomNum=@p6, Hotel_Lat=@p7, Hotel_Lng=@p8 where Hotel_Num=@p1";
                cmd.Parameters.AddWithValue("@p1", hNum);
                cmd.Parameters.AddWithValue("@p2", hotel_name);
                cmd.Parameters.AddWithValue("@p3", hotel_tell);
                cmd.Parameters.AddWithValue("@p4", hotel_post);
                cmd.Parameters.AddWithValue("@p5", hotel_addr);
                cmd.Parameters.AddWithValue("@p6", hotel_roomNumber);
                cmd.Parameters.AddWithValue("@p7", hotel_lat);
                cmd.Parameters.AddWithValue("@p8", hotel_lng);
                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show("update" + e.Message);
                AdminManager.Instance.printLog("update" + e.StackTrace);
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }

        public override int hotelDeleteQuery(int hNum)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                sqlcommand = "delete hotel_table where Hotel_Num=@p1";
                cmd.Parameters.AddWithValue("@p1", hNum);

                cmd.CommandText = sqlcommand;
                int result = cmd.ExecuteNonQuery();
                return result;
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show("delete" + e.Message);
                AdminManager.Instance.printLog("delete" + e.StackTrace);
                return -9;
            }
            finally
            {
                conn.Close();
            }
        }
    }
}
