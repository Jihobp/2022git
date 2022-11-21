using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp05
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //char자체는 바로 숫자로 대응되기 때문에 가능함 ㅇㅅㅇ>
            for(char i = '가'; i<='힣'; i++)
            {
                Console.Write(i); //i값 찍기. 모든 한글을 찍음
            }
            Label label = new Label();
            label.AutoSize = true;
            //Point는 c #에서 만든 구조체. 
            //주로 위치를 나타날 때 쓰임./
            label.Location = new Point(0, 100); //x:0; y:100;

            for (char i = '가'; i <= '힣'; i++)
            {
                label.Text += i;
                if(i%100==0)
                    label.Text+=Environment.NewLine; //\n이랑 같음. 
                    //Environment.NewLine = 환경에 맞게 한 줄 띄는 것.
            }
            label.Name = "mylabel"; //디자인창에서의 변수이름 ㅇㅅㅇ
            Controls.Add(label);
        }

        private void button2_Click(object sender, EventArgs e)
        {   
            //Controls 의 길이만큼 동작하는 반복문
            //item은 Controls에 있는 다양한 타입들의
            //구성요소들을 의 - 미.
            foreach (var item in Controls)
            {
                //is = 타입 체크
                //var 자체는 타입이 없는데 ,
                //대입되는 값에 따라서 타입 정해짐.
                //Controls 에 있는 버튼, Label 등이 다 item 인데.
                //그 중에서 Label 타입인 것을 만나면 이 조건문으로 들어옴.
                if(item is Label) //타입 체크
                {
                    Label temp = item as Label; //형번환
                    //item이랑 temp라는 변수는  똑같이
                    //똑같은 곳을 가리키게 됨. (Label은 클래스니가)
                    //KBBank 랑 같은 상황.
                    //구조체는 값을 저장, 클래스는 메모리를 할당하고 걔ㅖ를 가리키는 경우. 
                    if (temp.Name == "mylabel") //Name을 체크
                    {
                        Controls.Remove(temp); //해당 위치 가리키는 곳을 삭제.
                        break;
                    }
                }

                
            }
        }
    }
}
