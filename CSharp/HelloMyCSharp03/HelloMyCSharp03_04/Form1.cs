using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp03_04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string id = textBox1.Text;
            string pw = textBox2.Text;
            if (id == "admin" && pw == "1234")
                MessageBox.Show("관리자");
            if (id.Equals("admin") && pw.Equals("1234"))
                MessageBox.Show("관리자라니까");
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button6_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void label5_Click(object sender, EventArgs e)
        {
            Hide(); //현재 창 감춤
            //Form2를 만듦과 동시에 띄운다.
            //만들때 2개의 string 값도 같이 보냄.
            //ALT  + ENTER 해서 첫번째 생성자 만들긩!!!!!!!!!!!!!!! 오버로딍!!!!!!!!!!!!!!
            new Form2(textBox1.Text, textBox2.Text).ShowDialog(); //코드멈춤
            Show(); //현재창 보여줌
        }
    }
}
