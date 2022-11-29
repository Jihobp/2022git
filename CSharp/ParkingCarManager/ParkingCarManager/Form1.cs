using System;
using System.Linq;
using System.Windows.Forms;

namespace ParkingCarManager
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            //프로그램 시작하자마자 현재시간 표시해줌. 
            label1.Text = DateTime.Now.ToString
               ($"yyyy년 MM월 dd일 HH시 mm분 ss초");
            try
            {
                //+""하든지. TOString()하기
                maskedTextBox1.Text = DataManager.Cars[0].ParkingSpot + "";
                maskedTextBox2.Text = DataManager.Cars[0].carNumber;
                maskedTextBox3.Text = DataManager.Cars[0].driverName;
                maskedTextBox4.Text = DataManager.Cars[0].phoneNumber;
                maskedTextBox5.Text = maskedTextBox1.Text;
            }
            catch (Exception)
            {

            }
            //Cars 길이가 0인데,.
            //DataSource로 넣으려고 하면 셀 선택시 오류가 남.
            //셀 : datagridview의 칸들을 의미(엑셀의 셀처럼)
            if (DataManager.Cars.Count > 0)
                dataGridView1.DataSource = DataManager.Cars;
        }


        private void button1_Click(object sender, EventArgs e)
        {
            //WriteLog("주차");
            if (maskedTextBox1.Text.Trim() == "")
                MessageBox.Show("주차 공간 번호 입력하세요(주차");
            else if (maskedTextBox2.Text.Trim() == "")
                MessageBox.Show("차량 번호 입력해주세요.");
            else
            {
                try
                {   //Single = List에서 원하는거 하나만 가져오는 것.
                    //값을 갖고 오는 게 아니고 참조값을 가져옴.
                    //즉 car를 바구면 Cars안에 있는 내용도 같이 바뀜/
                    //만약 못찾으면 catch 로 빠진다.
                    //즉 엉뚱한 공간에 주차하려고 하면 catch로 빠짐

                    //람다 ver
                    ParkingCar car =
                        DataManager.Cars.Single //람다 대신 델리게이트 들어가도 된다고 ????? true나 false나 람다형태로 들어간거.
                        (x => x.ParkingSpot.ToString() == maskedTextBox1.Text);
                    //델리게이트 ver
                    // DataManager.Cars.Single
                    //(delegate(ParkingCar x) { return x.ParkingSpot.ToString() == textBox1.Text; })

                    //공간이 있는데 이미 그 공간에 차가 있다면?
                    if (car.carNumber.Trim() != "")
                        MessageBox.Show("해당 공간에 이미 차가 있습니다.");
                    else
                    {
                        car.carNumber = maskedTextBox2.Text;
                        car.driverName = maskedTextBox3.Text;
                        car.phoneNumber = maskedTextBox4.Text;
                        car.parkingTime = DateTime.Now;

                        //데이터 그리드 뷰에 반영
                        dataGridView1.DataSource = null;
                        dataGridView1.DataSource = DataManager.Cars;

                        DataManager.Save(maskedTextBox1.Text, maskedTextBox2.Text,
                            maskedTextBox3.Text, maskedTextBox4.Text); //끝에 bool 생략 = 주차
                        string contents = $"주차 공간 {maskedTextBox1.Text}에" +
                            $"{maskedTextBox2.Text}차를 주차했습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);


                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {maskedTextBox1.Text}은/는 없습니다.");
                    WriteLog($"주차공간 {maskedTextBox1.Text}은/는 없습니다.");
                }
            }
        }


        private void button2_Click(object sender, EventArgs e)
        {
            //WriteLog("주차");
            if (maskedTextBox1.Text.Trim() == "")
                MessageBox.Show("주차 공간 번호 입력하세요(출차");
            else
            {
                try
                {   //Single = List에서 원하는거 하나만 가져오는 것.
                    //값을 갖고 오는 게 아니고 참조값을 가져옴.
                    //즉 car를 바구면 Cars안에 있는 내용도 같이 바뀜/
                    //만약 못찾으면 catch 로 빠진다.
                    //즉 엉뚱한 공간에 주차하려고 하면 catch로 빠짐

                    //람다 ver
                    ParkingCar car =
                        DataManager.Cars.Single //람다 대신 델리게이트 들어가도 된다고 ????? true나 false나 람다형태로 들어간거.
                        (x => x.ParkingSpot.ToString() == maskedTextBox1.Text);
                    //델리게이트 ver
                    // DataManager.Cars.Single
                    // (delegate (ParkingCar x) { return x.ParkingSpot.ToString()};

                    //공간이 있는데 이미 그 공간에 차가 있다면?
                    if (car.carNumber.Trim() == "")
                        MessageBox.Show("아직 차가 없습니다.");
                    else
                    {
                        string oldCar = car.carNumber; //기존에 주차된 차.
                        car.carNumber = "";
                        car.driverName = "";
                        car.phoneNumber = "";
                        car.parkingTime = new DateTime(); //기본값

                        //데이터 그리드 뷰에 반영
                        dataGridView1.DataSource = null;
                        dataGridView1.DataSource = DataManager.Cars;

                        //출차할 땐 어짜피 첫번째랑 끝에 매개변수만 사용함.
                        DataManager.Save(maskedTextBox1.Text, maskedTextBox2.Text,
                            maskedTextBox3.Text, maskedTextBox4.Text, true); //끝에 bool 생략 = 주차
                        string contents = $"주차 공간 {maskedTextBox1.Text}에" +
                            $"{oldCar}차를 출차했습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {maskedTextBox1.Text}은/는 없습니다.");
                    WriteLog($"주차공간 {maskedTextBox1.Text}은/는 없습니다.");
                }
            }

        }


        //주차공간 번호에 있는 차 번호를 리턴하는 함수
        private string lookUpParkingSpot(int parkingSpot)
        {
            string parkedCarNum = "";
            //Single을 써서 특정 공간에 있는 차를 찾을 수도 있다.
            //Single이 부담스럽다면, for문이나 foreach문으로 탐색 가능.
            foreach (var item in DataManager.Cars)
            {
                if (item.ParkingSpot == parkingSpot)
                {
                    parkedCarNum = item.carNumber;
                    break;
                }
            }
            return parkedCarNum;
        }
        //공간조회
        //메세지 박스로 해당 공간에 뭐가 있는디 띄움
        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                int parkingSpot = int.Parse(maskedTextBox5.Text); //Converter
                string parkingCar = lookUpParkingSpot(parkingSpot);
                string contents = "";
                if (parkingCar.Trim() != "")
                    contents = $"주차공간{parkingSpot}에" + $"주차된 차는 {parkingCar}입니다.";
                else
                    contents =
                        $"주차공간{parkingSpot}에 차가 없습니다.";
                WriteLog(contents);
                MessageBox.Show(contents);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
                WriteLog(ex.Message + ex.StackTrace + "조회");
            }
        }

        //공간추가
        private void button4_Click(object sender, EventArgs e)
        {
            spot_add_delete(maskedTextBox5.Text, "insert");
        }

        private void spot_add_delete(string text, string v)
        {
            text = text.Trim(); //공백 제거 후 진행
            int.TryParse(text, out int pSpot);//주차 공간 번호 가져옴
            if (pSpot <= 0)    //공간번호가 0 이하 혹은 이상한 값인 경우. // 0 이하읽경우 잘못됐댜.
            {
                WriteLog("주차 공간 번호는 0 이상의 숫자여야 함.");
                MessageBox.Show("주차 공간 번호는 0 이상의 숫자여야 함.");
                return; //메소드 종료(이벤트 종료)
            }
            string contents = "";
            //contents  : DataManager 에서 out과 ref로 인하여 함수 호출 뒤
            //변환 값이 저장되어 있음. 
            bool check = DataManager.Save(v, text, out contents);
            //throw new NotImplementedException();
            if (check) //true
                button6.PerformClick(); //리프레시 버튼을 누름
            MessageBox.Show(contents);
            WriteLog(contents);
        }


        //공간삭제
        private void button5_Click(object sender, EventArgs e)
        {
            spot_add_delete(maskedTextBox5.Text, "delete"); //spot_add_delete 메소드 생성
        }
        //전체 갱신(db에서 값 새로 불러오는 것)
 		//주차 공간 추가/삭제시 활용할 예정
        private void button6_Click(object sender, EventArgs e)
        {
            DataManager.Load();
            dataGridView1.DataSource = null;
            if (DataManager.Cars.Count > 0)
                dataGridView1.DataSource = DataManager.Cars;
        }


        private void WriteLog(string contents)
        {
            string log
                = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss")}]" +
                $"{contents}";
            DataManager.printLog(log); //파일에 적기
            listBox1.Items.Insert(0, log); //화면에 적기

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label1.Text = DateTime.Now.ToString
                ($"yyyy년 MM월 dd일 HH시 mm분 ss초");
        }

        //CellContentClick = >셀 안에 있는 내용을 눌러야 됨
        //CurrentCellChanged => try catch 로 반드시 감싸야 함.(책 참고)
        //Cell
        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            ParkingCar car =
                dataGridView1.CurrentRow.DataBoundItem as ParkingCar;
            maskedTextBox1.Text = car.ParkingSpot.ToString();
            maskedTextBox2.Text = car.carNumber;
            maskedTextBox3.Text = car.driverName;
            maskedTextBox4.Text = car.phoneNumber;
            maskedTextBox5.Text = maskedTextBox1.Text;
        }
    }
}

