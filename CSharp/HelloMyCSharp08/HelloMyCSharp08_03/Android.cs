using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08_03
{
    public class Android : IMyRobot
    {
        public void actCute()
        {
            System.Windows.Forms.MessageBox.Show("뀨잉");
        }

        public void attackTarget()
        {
            System.Windows.Forms.MessageBox.Show("공격");
        }

        public void killTarget()
        {
            System.Windows.Forms.MessageBox.Show("즉살");
        }

        public void printMessage(string message)
        {
            System.Windows.Forms.MessageBox.Show(message);
        }

        public void protectMaster(string name)
        {
            System.Windows.Forms.MessageBox.Show(name+"을 지킨다");
        }

        public void smile()
        {
            System.Windows.Forms.MessageBox.Show("미소");
        }

        public void welCome()
        {
            System.Windows.Forms.MessageBox.Show("인사");
        }
    }
}
