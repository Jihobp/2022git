using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp06_04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        MyMath a = new MyMath();

        //제곱
        private void button1_Click(object sender, EventArgs e)
        {
           // MyMath m = new MyMath();
            label1.Text = a.power(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        //곱하기
        private void button2_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            label1.Text = m.multi(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        //거듭제곱
        private void button3_Click(object sender, EventArgs e)
        {
            //what is TryParse?
            //int.Parse의 보강버전이다. =>>> 강ㅈ ㅔ종료 안됨.
            //out키워드를 통해서 값을 반환해줌.
            
            //int.TryParse
            //1. textBox1에 공백이나 숫자가 아닌것이 있어도 프로그램이 ㅋㅟㅌㅇ기징 않음.
            //만약 공백이나 문자 있으면 int x에 0을 대입해줌.
            //그와 동시에 TryParse라는 함수는 false를 리턴함
            //반대로 숫자 변경 성공하면 int x 에 숫자 대입해주고 
            //TryParse 는 true를 리턴해줌.
            int.TryParse(textBox1.Text, out int x);

            //과거(visual studo 2014)버전이나 그 이전에는
            //int 변수를 밖에 선언해야 했다. (아래와 같이)
            int y = 0;
            int.TryParse(textBox2.Text, out y);
            label1.Text = new MyMath().power(x, y).ToString();
        }

        private void button4_Click(object sender, EventArgs e)
        {   //클래스 메소드를 쓰는 경우
            //"멤버변수"랑 상관없이 
            //매개변수에 따라서 결과가 달라질 경우
            label1.Text 
                = MyMath2.power(int.Parse(textBox1.Text)).ToString();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label1.Text
                = MyMath2.multi(int.Parse(textBox1.Text),
                int.Parse(textBox2.Text)).ToString();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            label1.Text
                = MyMath2.power(int.Parse(textBox1.Text),
                int.Parse(textBox2.Text)).ToString();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int x);
            label1.Text = 
                MyMath3.power(x).ToString();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int x);
            int.TryParse(textBox1.Text, out int y);
            label1.Text =
                MyMath3.multi(x,y).ToString();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int x);
            int.TryParse(textBox1.Text, out int y);
            label1.Text =
                MyMath3.power(x, y).ToString();
        }
    }
}
