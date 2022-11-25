using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp08_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Blitzcrank b = new Blitzcrank();
            b.sayHello();
            
            b.MoveDown();
            b.MoveUp();
            b.MoveLeft();
            b.MoveRight();

            b.Attack();

            b.Qkey();
            b.Wkey();
            b.Ekey();
            b.Rkey();

        }
    }
}
