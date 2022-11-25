using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp08_03
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dog d = new Dog();
            d.actCute();
            d.smile();
            d.welCome();    

            //인터페이스도 다형성이 적용됨
            ICharming pet1 = new Dog();
            ICharming pet2 = new RobotPet();

            pet1.actCute();
            pet2.actCute();
        }

        //함수 만들기
        //ICharming 을 구현한 모든 것들이 c 자리에 들어갈 수 있다. 
        void cute_smile_wel(ICharming c)
        {
            c.actCute();
            c.smile();
            c.welCome();
        }

        void fightForMe(IFight f, string m)
        {
            f.attackTarget();
            f.killTarget();
            f.protectMaster(m);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cute_smile_wel(new Dog());
            cute_smile_wel(new RobotPet());
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //IFight 를 구현하는 클래스만 들어갈 수 있다.
            List<IFight> fighters = new List<IFight>();
            fighters.Add(new RobotPet());
            fighters.Add(new Dron());

            //fightForMe :  IFight 를 구현하는 클래스만 매개변수로 됨.
            foreach (IFight item in fighters)
                fightForMe(item, textBox1.Text);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Android a = new Android();
            //다형성에 의해서 오른쪽은 인스턴스(해당 인터페이스 구현)
            //왼쪽은 인터페이스(혹은 조상클래스)
            IMyRobot i = new Android();
            IFight f = new Android();
            ICharming c = new Android();

            a.printMessage("헬로월드");
            a.actCute();
            a.smile();
            a.welCome();
            a.attackTarget();
            a.killTarget();
            a.protectMaster("주인");

            //shift alt 방향키!!
            i.printMessage("안녕세상");
            i.actCute();
            i.smile();
            i.welCome();
            i.attackTarget();
            i.killTarget();
            i.protectMaster("마스터");


            f.attackTarget();
            f.killTarget();
            f.protectMaster("동쥬니");

            c.actCute();
            c.smile();
            c.welCome();

        }
    }
}
