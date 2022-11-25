using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp07
{
    public partial class Form1 : Form
    {
        //ref 키워드 : 참조자
        //포인터랑 같은 점 : 그 변수의 위치를 가리킴
        //포인터와 다른 점 : 출려해보면 값을 출력(이상한 주소값 말고)


        //포인터즌 주소지이지만, ref는 위치다.
        //a만 단독으로 부르면 값, ref int a 는 그 위치.
        //복붙한다고 값이 바뀌진 않는당. 위치를 바꾸면 그 값을 바꿔짐. 
        void swapFunction(ref int a, ref int b)//바깥에 영향을 줌
        {
            int temp = a;
            a = b;
            b = temp;
        }
        void swapFunction(int a, int b)//바깥에 영향을 주지 않음
        {
            int temp = a;
            a = b;
            b = temp;
        }
        public Form1()
        {
            InitializeComponent();
            label5.Text = ""; //프로그램 시작할 땐 아무 것도 없음.ㅇㅅㅇ
            int a = 3;
            int b = 5;
            swapFunction(a, b);//ref 없는 거
            Console.WriteLine($"a={a}, b={b}");
            swapFunction(ref a, ref b);
            Console.WriteLine(  $"a={a}, b={b}");

            //label1.Click += 까지 적고 tab키 두 번
            //안 되면 alt enter나 ctrl space로 자동완성해서
            //이벤트 만들어주면 된다.
            //그거 안 되면 그냥 매개변수 2개(object, EventArgs)있는 거
            //함수 만들면 된다.
            label1.Click += Label1_Click; ;
        }

        private void Label1_Click(object sender, EventArgs e)
        {
            label1.Text = "a=";
            label2.Text = "b=";
            label3.Text = "a=";
            label4.Text = "b=";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int a);
            int.TryParse(textBox2.Text, out int b);
            swapFunction(ref a, ref b);
            textBox3.Text = a.ToString();
            textBox4.Text = b.ToString();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {   //interval = 1000ms 1초에 한번씩, enabled=true, 돌아간다.
            //대문자 M = Month, 소문자 m = minute
            //대문자 H = 24시간제, 소문자 h = 12시간제
            label5.Text
                = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff");
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
