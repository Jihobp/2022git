using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp06_06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox_a1.Text, out int a);
            int.TryParse(textBox_b1.Text, out int b);
            swapFunction(ref a, ref b);
            textBox_a2.Text = a.ToString();
            textBox_b2.Text = b.ToString();
        }
        //포인터즌 주소지이지만, ref는 위치다.
        //a만 단독으로 부르면 값, ref int a 는 그 위치.
        //복붙한다고 값이 바뀌진 않는당. 위치를 바꾸면 그 값을 바꿔짐. 

        private void swapFunction(ref int a, ref int b)
        {
            MessageBox.Show(a.ToString());
            int temp = a;
            a = b;
            b= temp;
            MessageBox.Show(a.ToString());
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
