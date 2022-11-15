using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace HelloMyCSharp02_04_guiQuest
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            string info = "내 숫자는 " + textBox1.Text + "입니다.";
            MessageBox.Show(info);
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            string info = "내 숫자는 " + textBox2.Text + "입니다.";
            MessageBox.Show(info);
        }

       

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("두 숫자의 합은 " +   (int.Parse(textBox1.Text) + int.Parse(textBox2.Text)));
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("두 숫자의 빼기 " + (int.Parse(textBox1.Text) - int.Parse(textBox2.Text)));
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MessageBox.Show("두 숫자의 곱은 " + (int.Parse(textBox1.Text) * int.Parse(textBox2.Text)));
        }

        private void button4_Click(object sender, EventArgs e)
        {
            MessageBox.Show("두 숫자의 나누기한 몫은 " + (int.Parse(textBox1.Text) / int.Parse(textBox2.Text)));
        }

        private void button5_Click(object sender, EventArgs e)
        {
            MessageBox.Show("두 숫자의 나누기한 나머지는 " + (int.Parse(textBox1.Text) % int.Parse(textBox2.Text)));
        }
    }
}

/*텍스트 박스 2개를 만든다.
각 박스 안에 숫자를 넣는다.

첫 번째 버튼을 누르면 두 숫자의 합을
메시지 박스로 띄움

두 번째 버튼을 누르면 두 숫자의 빼기를
메시지 박스로 띄움

세 번째 버튼을 누르면 두 숫자의 곱을
메시지 박스로 띄움

네 번째 버튼을 누르면 두 숫자의 나누기한 몫을
메시지 박스로 띄움

다섯 번째 버튼을 누르면 두 숫자의 나누기한 나머지를
메시지 박스로 띄움
*/