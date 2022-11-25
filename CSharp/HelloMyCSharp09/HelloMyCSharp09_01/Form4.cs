using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp09_01
{
    public partial class Form4 : Form
    {
        //멤버변수들 필요
        ISubject fb1; //form1 fb1;
        IObserver ob1; //Form2 fb;  IObserver를 구현한 것들이 ob1, ob2 이녀석을 해도 상관없다. 다형성.
        IObserver ob2; //Form 3 fb3; 
        public Form4()
        {
            InitializeComponent();
        }

        //Form4를 호출할때 Form1, Form2, Form3를 보낸다. 
        public Form4(ISubject sub, IObserver ob1, IObserver ob2) //생성자 복붙 오버로딩 > 매개변수 !!!
        {
            InitializeComponent();
            this.fb1 = sub;
            this.ob1 = ob1;
            this.ob2 = ob2;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            fb1.unregister(ob1); //ob1 삭제
        }

        private void button2_Click(object sender, EventArgs e)
        {
            fb1.unregister(ob2);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            fb1.register(ob1); 
        }

        private void button4_Click(object sender, EventArgs e)
        {
            fb1.register(ob2);
        }
    }
}
