using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp04
{   //12지신 c#
    //c# label 이론 https://cosmosproject.tistory.com/554
    //switch 문 if문 차이 +  ppt 이론정리 https://floz.tistory.com/entry/4-Javascript-%EC%A1%B0%EA%B1%B4%EB%AC%B8-switch
    public partial class Form1 : Form
    {   //f5를 눌러서 끄면 디버깅상태, 코드에 대해서 실시간으로 볼 수 있다. x나 정지버튼으로 끌수 있음/
        //ㄴ>원하는 위치 코드 볼 수 있고, 원하는 위치 값도 보고, 돌아가고 있는데 수정도 가능. (잠깐 멈추고 보고 수정하고 다시 실행)
        //shift f5 : 
        //ctrl f 5 는 아무것도 안보임 그냥 실행, 코드를 중간에서 볼 수도 없다.
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //디버깅 찍혀있는 위치까지만 보이고 그 뒤는 안보임.
            //조사식에서 내가 원하는 식을 입력할 수도 있당.
            //일시정지 하기.
            int a = 5;
            int b = 10;
            int c = 0;
            c = a + b;
            c= c-a;
            c++;
            int d = 100;
            Console.WriteLine("안녕하세요!");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            for(char c='가'; c<='힣'; c++)
            {
                Console.Write(c);
            }
            
        }
        private void label1(object sender, EventArgs e)
        {
            Label lbl = new Label();


            for (char c = '가'; c <= '힣'; c++)
            {
                Console.WriteLine(c);
                lbl.Text = "";
            }
        }


        private void label2_Click(object sender, EventArgs e)
        {
            for (char c = '가'; c <= '힣'; c++)
            {
                if(c=='나')
                    label2.Text +="\n";
                    label2.Text += c;
            }

            /*
             private void button1_Click(object sender, EventArgs e)
        {
            int a = 5;
            int b = 10;
            int c = 0;
            c = a + b;
            c = c - a;

            string hello = "안녕";
            Console.WriteLine(hello.Contains("안"));//True

            Console.WriteLine("안녕하세요");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            for (char i = '가'; i <= '힣'; i++)
            {
                Console.Write(i);
            }
            Console.WriteLine();
            Label label = new Label();
            label.AutoSize = true;
            label.Location = new Point(0, 400);
            //for (char i = '가'; i <= '힣'; i++)
            //{
            //    label.Text += i;
            //    if (i % 150 == 0)
            //        label.Text += "\n";
            //}
            for (char i = '가'; i <= '힣'; i++)
            {
                label.Text += i;
                if (i % 100 == 0)
                    label.Text += "\n";
            }
            Controls.Add(label);
            /* 하나의 라벨을 만들고 거기 auto size를 줬당. 쌤풀이
            */
        

        }
    }
}
