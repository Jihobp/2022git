using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
//컨트롤러 같은 곳
namespace ParkingCarManager
{
    //메소드들은 전부 클래스 메소드
    //인스턴스 따로 만들거나 상속받을 게 없다.
    //하나의 메소드만 쓰면 된다.
    //하나의 변수만 쓸 것
    public class DataManager
    {
        //자동차들 저장하는 List 변수
        public static List<ParkingCar> Cars
            = new List<ParkingCar>();

        //정적 생성자
        //딱 한 번만 호출
        //DataManager 관련된 호출이 보이면
        //(DataManager에 접근하려고 할 때)
        //그 때 호출됨
        static DataManager()
        {
            Load();
        }

        public static void Load()
        {
            try
            {
                DBHelper.selectQuery();
                Cars.Clear();
                foreach (DataRow item in DBHelper.dt.Rows)
                {
                    ParkingCar car = new ParkingCar();
                    car.ParkingSpot = int.Parse(item["parkingspot"].ToString());
                    car.carNumber = item["carnumber"].ToString();
                    car.driverName = item["drivername"].ToString();
                    car.phoneNumber = item["phonenumber"].ToString();
                    car.parkingTime = item["parkingtime"].ToString() == "" ?
                        new DateTime() /*DateTime의 기본 값*/
                        : DateTime.Parse(item["parkingtime"].ToString());
                    Cars.Add(car);
                }
            }
            catch (System.Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message + "load");
                printLog(e.StackTrace + "load");
            }
        }
        //파일에 내용 적는 것
        public static void printLog(string contents)
        {
            //ParkingHistory 폴더
            DirectoryInfo di = new DirectoryInfo("ParkingHistory");
            if (di.Exists == false) //해당 폴더 없다면
                di.Create(); //폴더 생성함

            //ParkingHistory 폴더 안에 ParkingHistory.txt에 글을 쓸 것
            //끝에 붙은 true 의미
            //append를 한다. 즉 새로운 내용을 뒤에 추가한다는 뜻
            using (StreamWriter w = new StreamWriter
                ("ParkingHistory\\ParkingHistory.txt", true))
            {
                w.WriteLine(contents);
            }
        }

        //주차 출차용 Save (함수 오버로딩)
        public static void Save(string parkingSpotText,
            string carNumber, string driverName, string phoneNumber, bool isRemove = false)
        {
            try
            {   //업데이트 쿼리랑 매개변수가 똑같다. //true면 출차//false면 주차
                DBHelper.updateQuery(parkingSpotText, carNumber, driverName,
                    phoneNumber, isRemove);
            }
            catch (Exception)
            {

                throw;
            }
        }

        //주차 공간 추가/삭제용 Save 
        //Save 이름 오버로딩
        //리턴 타입은 상관없고 매개변수의 개수 및 타입이 다름
        public static bool Save(string command, string parkingSpot, out string contents)
        {
            //out ref의 차이
            //ref : 그 값의 참조값 읽음. //c의 포인터랑 비슷함. 
            //ref에 해당하는게 바뀌면 함수 바깥에서도 바뀜.

            //해당 공간이 이미 있는지 없는지 체크한다. 
            DBHelper.selectQuery(int.Parse(parkingSpot));
            contents = ""; //out : 반드시 값 대입해줘야 함.
            if (command == "insert")
                return DBInsert(parkingSpot, ref contents); //alt + enter 메소드 생성.
            else
                return DBDelete(parkingSpot, ref contents);

        }

        private static bool DBDelete(string parkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count != 0) //공간 삭제 가능
            {
                DBHelper.deleteQuery(parkingSpot);
                contents = $"주차공간{parkingSpot}이/가 삭제되었습니다.";
                return true; //삭제하는데ㅅ 성공하면 true 리턴
            }
            else //삭제 안됨
            {
                contents = $"주차공간 없습니다.";
                return false;
            }
            //throw new NotImplementedException();
        }

        private static bool DBInsert(string parkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count == 0) // 공간 추가됨
            {
                DBHelper.insertQuery(parkingSpot);
                contents = $"주차 공간 {parkingSpot}이/가 추가되었습니다.";
                return true;
            }
            else //해당 공간이 이미 존재하는 경우
            {
                contents = $"해당 공간이 이미 있습니다.";
                return false;
            }
            //throw new NotImplementedException();
        }
        //공간 추가 / 삭제용 함수


    }
}
