using System;
using System.Data;
using System.Data.SqlClient;

namespace ParkingCarManager
{   //DAO 같은 부분 = DB에 직접 연결하고 
    //CRUD 하는 부분
    public class DBHelper
    {
        //DB연결 부분
        private static SqlConnection conn = new SqlConnection();
        //DB에 있는 데이터를 가져 오는 부분들
        public static SqlDataAdapter da;
        public static DataSet ds;
        public static DataTable dt;

        //db 열고 => crud 수행 = > db 닫아쥼. 'ㅅ'>
        public static void ConnectDB()
        {
            string dataSource = "local";    //로컬에 접송
            string db = "MYDB";
            string security = "SSPI";
            conn.ConnectionString = string.Format("Data Source=({0}); initial Catalog={1};" +
                "integrated Security ={2};" +
                "Timeout=3", dataSource, db, security); //3초정도 시도하고 안되면 nono
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }

        //db에서 데이터를 읽어오는 부분
        //selectQuery() = >parkingSpot 값은 -1
        //selectQuery(n) = >parkingSpot 값은 n값이 들어감
        //자바에서 오버로딩 이면 함수 2개를 만든다.
        public static void selectQuery(int parkingSpot = -1)
        {
            try
            {
                ConnectDB(); //DB 연결
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn; //어디에 커맨드 보낼지 지정.
                if (parkingSpot == -1)  //전체 조회
                    cmd.CommandText = "select * from parkingManager";
                else //특정 번호만 조회. 공간추가/삭제/주차/출차 체크 등에 쓰임
                    cmd.CommandText = "select * from parkingManager" +
                        "where parkingSpot = " + parkingSpot;
                da = new SqlDataAdapter(cmd);   //데이터연결
                ds = new DataSet();             //데이터넣기
                da.Fill(ds, "ParkingManager");
                dt = ds.Tables[0];              //테이블 여러개를 가져오는 경우가 있다, [0],[1],[2],...등등
            }
            catch (Exception e) //????? system에 있는거 가져와서 catch해줘야함.
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "select"); //select 하다 문제가 생겼구나!
                DataManager.printLog("select" + e.StackTrace);
                return;
            }
            finally
            {
                conn.Close(); //DB연결 해제 
            }
        }

        public static void updateQuery
            (string parkingSpotText, string carNumber, string driverName, string phoneNumber, bool isRemove)
        {
            //isRemove = 주차 및 출차 여부
            //실무에서는 싹다 varchar로 통일함.
            //sql문 대문자 구분 상관 없습니다.
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";
                if (isRemove)
                {
                    sqlcommand = "update parkingmanager set carnumber=''," +
                        "drivername='', phonenumber='', parkingtime=null where " +
                        "parkingspot=@p1";
                    //파라메터값을 @에 실어서 보내는 방식.
                    //sql injection(sql 삽입공격) 방지를 위함.
                    cmd.Parameters.AddWithValue("@p1", parkingSpotText);
                }
                else
                {
                    sqlcommand = "update parkingmanager set carnumber=@p1," +
                       "drivername=@p2, phonenumber=@p3, parkingtime=@p4 where " +
                       "parkingspot=@p5";
                    cmd.Parameters.AddWithValue("@p1", carNumber);
                    cmd.Parameters.AddWithValue("@p2", driverName);
                    cmd.Parameters.AddWithValue("@p3", phoneNumber);
                    cmd.Parameters.AddWithValue("@p4", DateTime.Now.ToString
                        ("yyyy-MM-dd HH:mm:ss.fff"));
                    cmd.Parameters.AddWithValue("@p5", parkingSpotText);
                }
                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();

            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show("update" + e.Message);
                DataManager.printLog("update" + e.Message + e.StackTrace);
            }
            finally
            {
                conn.Close();
            }
        }

        //db를 최소 3개로도 분류할수있다. 
        private static void executeQuery(string parkingSpot,
            string command)
        {
            string sqlcommand = "";
            if (command == "insert")
                sqlcommand =
                    "insert into parkingmanager(parkingspot) values (@p1)";
            else
                sqlcommand =
                    "delete from parkingmanager where parkingspot=@p1";
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", parkingSpot);
                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();
            }
            catch (Exception e)
            {

                throw;
            }
        }
        public static void deleteQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "delete");
        }
        public static void insertQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "insert");
        }

    }
}
