using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp08
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //제너릭 : 어떤 타입이 올지 모르겠다고 하는 것. 
        private void button1_Click(object sender, EventArgs e)
        {
            //<int>의 의미 : Student 클래스의 T타입을 int타입으로 정의하겠다.
            //리스트랑 비슷하다 ㅇ0ㅇ
            Student<int> s = new Student<int>();
            s.age = 10;
            s.name = "이동준";
            s.hakbeon = 09; //hakbeon이 int타입이라서 앞의 0은 짤라버림.

            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, 학번:{s.hakbeon}");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Student<string> s = new Student<string>("조영탁", "09", 20); //생성자에 값 채워보쟈 
            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, 학번:{s.hakbeon}");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MyHakbeon h = new MyHakbeon("경북산업직업전문학교", 1);
            Student<MyHakbeon> s = new Student<MyHakbeon>(h, "이유나", 24);

            Student<MyHakbeon> s2 = new Student<MyHakbeon>
                (new MyHakbeon("영진직업전문학교", 2),"이동준", 34 );

            Student<MyHakbeon> s3 = new Student<MyHakbeon>();
            s3.name = "김홍근";
            s3.age = 40;

            /*
             Student<MyHakbeon> s3 = new Student<MyHakbeon>();
            s3.name = "김홍근";
            s3.age = 40;
            s3.hakbeon = h;
            s3.hakbeon = new MyHakbeon("코리아IT", 3);

            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, " +
                $"학번:{s.hakbeon.name}, {s.hakbeon.number}");

            Int32 age = 100;
            int age2 = age;
            */

        }
    }
}
