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
    public partial class Form1 : Form, ISubject
    {
        public Form1()  //생성자
        {
            InitializeComponent();


            //this = Form1 을 의미
            //Form1 이 들어갈 수 있는 이유는 ISubject를 구현해서 그렇다.
            Form2 frm2 = new Form2(this); //form2 생성자안에 this
            frm2.TopLevel = false;
            frm2.FormBorderStyle = FormBorderStyle.None;
            panel1.Controls.Add(frm2);
            frm2.Show();

            Form3 frm3 = new Form3(this); //form3 생성자안에 this
            frm3.TopLevel = false;
            frm3.FormBorderStyle = FormBorderStyle.None;
            panel2.Controls.Add(frm3);
            frm3.Show();

            Form4 frm4 = new Form4(this,frm2,frm3); //form4 생성자안에 this, frm2,frm3 다넣어야함
            frm4.TopLevel = false;
            frm4.FormBorderStyle = FormBorderStyle.None;
            panel3.Controls.Add(frm4);
            frm4.Show();

        }

        List<IObserver> observers = new List<IObserver>(); //new LIst 안에 form2,form3를 집어넣을거다!!! form1은 통제사령부

        public void notify(string msg) //일괄적으로 호출합니다.......
        {
            //throw new NotImplementedException();
            foreach (IObserver o in observers)
            {
                o.update(msg);
            }
        }

        public void register(IObserver o)
        {
            //throw new NotImplementedException();
            observers.Add(o);
        }

        public void unregister(IObserver o)
        {
            //throw new NotImplementedException();
            observers.Remove(o);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //옵저버 = 관찰자  = 와드 열심히 박는 정글러 같은거 //와드는 고정식, //옵저버는 이동식
            //관찰자들( 특정 인터페이스를 구현한 것들) 을 관리
            //등록/ 삭제 / 일괄통지
            //이 인터페이스를 구현한 클래스들은 update 라는 메소드를 호출할 수 있따.
            //하나의 Notifer-list에서 여러개 옵저버를 관리한다. 여러개 옵저버를 넣꼬빼고를 레지스터,언레지스터. 


            //다형성에 의해서 둘 다 된다.
            //Notifier n = new Notifier(); 둘중 하나 편한 방식으로.
            ISubject s = new Notifier();
            s.register(new Observer1() { name = "스타1" });
            s.register(new Observer2());

            //Observer1 o1 = new Observer1(); 이렇게 만들었다면
            //형변환 안해도 된다.
            //둘중 하나 편한 방식으로. 
            IObserver o1 = new Observer1();
            (o1 as Observer1).name = "허영무의 옵저버"; //형변환해서 써줘야한다.
            s.register(o1);
            s.notify("스타크래프트"); //옵저버 3마리가 업데이트를 한다.
            s.unregister(o1);         //허영무의 옵저버가 빠진 상태에서, 
            s.notify(",스2,");        //2마리의 옵저버만 update를 호출함. 

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
           //notify(textBox1.Text);
            notify((sender as TextBox).Text);
        }
    }
}
