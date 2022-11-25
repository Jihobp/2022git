using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08_03
{
    public class RobotPet : ICharming, IFight
    {
        public void actCute()
        {
            System.Windows.Forms.MessageBox.Show("뾰잉뾰잉");
        }

        public void attackTarget()
        {
            System.Windows.Forms.MessageBox.Show("죽어라");
        }

        public void killTarget()
        {
            System.Windows.Forms.MessageBox.Show("불타 죽어라");
        }

        public void protectMaster(string name)
        {
            System.Windows.Forms.MessageBox.Show("방어해봤자 죽으실듯 버릴게요");
        }

        public void smile()
        {
            System.Windows.Forms.MessageBox.Show("웃어?");
        }

        public void welCome()
        {
            System.Windows.Forms.MessageBox.Show("오는것도 가는것도 자유란다");
        }
    }
}
