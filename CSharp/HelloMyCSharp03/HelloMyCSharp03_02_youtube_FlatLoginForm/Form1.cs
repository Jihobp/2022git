using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//https://youtu.be/JB37jM9jXF4

namespace HelloMyCSharp03_02_youtube_FlatLoginForm
{   
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button6_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string id = maskedTextBox1.Text;
            string pw = maskedTextBox2.Text;
            if (id == "admin" && pw == "1234")
                MessageBox.Show("관리자");
            if (id.Equals("admin") && pw.Equals("1234"))
                MessageBox.Show("관리자라니까");
        }

        private void maskedTextBox2_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }

        private void maskedTextBox1_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }
    }
}
