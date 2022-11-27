using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp05_03
{

    public partial class Form1 : Form
    {   //list는 Form1클래스의 멤버변수.
        public List<String> list = new List<string>();




        public Form1()
        {
            InitializeComponent();
            //초기 화면 세팅
            //label4 라는 글자 대신 "" 을 넣고
            //버튼 8개에 랜덤한 값을 넣어줄 것.

            ListText.Text = ""; //프로그램시작하면
            //디자인 창에 있는 label4라는 글자대신 ""을 넣는다. 
            Random rand = new Random();
            button1.Text = rand.Next(100).ToString();
            button2.Text = rand.Next(100) + ""; //위랑 같은거.
            button3.Text = "" + rand.Next(100);
            button4.Text = rand.Next(100).ToString();
            button5.Text = button1.Text;
            button6.Text = button1.Text;
            button7.Text = button1.Text;
            button8.Text = button1.Text;
            label1.Text = Math.Abs(-90).ToString();
            label2.Text = Math.Ceiling(50.123).ToString();
            label3.Text = Math.Floor(50.123).ToString();

        }


        //함수 만들어서 버튼에 집어넣기? 

        public void Buttons(object sender, EventArgs e)
        {
            InitializeComponent();
            list.Add((sender as Button).Text);
            ListText.Text = "";
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

     



        public void button(object sender, EventArgs e)
        {


            //button1~button4까지는 ListText에 글자를 추가할 것.
            //1부터 4까지 button_click 내용 복사붙여넣기
            /*private void button1_Click(object sender, EventArgs e)
            {
                list.Add((sender as Button).Text);
                ListText.Text = ""; //label에 있는 텍스트를 리셋해줌
                foreach (var item in list)
                {
                    ListText.Text += item + " "; // 아이템에 있는 값을 집어넣는당.
                }
            }

            //글자를 지우는 거
            private void button5_Click(object sender, EventArgs e)
            {
                list.Remove((sender as Button).Text); //이벤트를 발생시키는 SENDER 에 TEXT를 집어넣음
                ListText.Text = "";
                foreach (var item in list)
                {
                    ListText.Text += item + " ";
                }
            }
            */



        }

        private void button2_Click(object sender, EventArgs e)
        {

        }
    }
}
