using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08_03
{
    public class Dog : ICharming
    {
        //ICharming에 있는 메소드들을 반드시 구현 해야함을 의미.
        /// <summary>
        /// ?????????????????????????????
        /// </summary>
        public string name { get; set; }
        public int age { get; set; }

        public void actCute()
        {
            System.Windows.Forms.MessageBox.Show("ㄷㄷ");
        }

        public void smile()
        {
            System.Windows.Forms.MessageBox.Show("^^");
        }

        public void welCome()
        {
            System.Windows.Forms.MessageBox.Show("ㅎㅇ");
        }
    }

}
