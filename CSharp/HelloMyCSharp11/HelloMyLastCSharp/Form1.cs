using System;
using System.Windows.Forms;

namespace HelloMyLastCSharp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            toolStripStatusLabel1.Text
                = DateTime.Now.ToString("yyyy년 MM dd일 HH시 mm분 ss초");

            label5.Text = "";
            label6.Text = "";
            label7.Text = "";
            label8.Text = "";

            label5.Text = DataManager.Books.Count.ToString();
            label6.Text = DataManager.Users.Count.ToString();

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text
                = DateTime.Now.ToString("yyyy년 MM dd일 HH시 mm분 ss초");
        }
    }
}
