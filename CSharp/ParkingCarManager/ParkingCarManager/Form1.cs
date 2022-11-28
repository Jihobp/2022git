using System;
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
        }
        private void WriteLog(string contents)
        {
            string log
                = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss")}]" +
                $"{contents}";
            DataManager.printLog(log); //파일에 적기
            listBox1.Items.Insert(0, log); //화면에 적기

        }

        private void button1_Click(object sender, EventArgs e)
        {
            WriteLog("주차");
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label1.Text = DateTime.Now.ToString
                ($"yyyy년 MM월 dd일 HH시 mm분 ss초");
        }
    }
}
