using System;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void Login_button1_Click(object sender, EventArgs e)
        {
            Dispose();
            //?? 로그인 한다음 뜨는거??
        }

        private void Login_button_Login_Click(object sender, EventArgs e)
        {
            string id = maskedTextBox1.Text;
            string pw = maskedTextBox2.Text;
            if (id == "admin" && pw == "1234")
                MessageBox.Show("관리자");
            if (id.Equals("admin") && pw.Equals("1234"))
                MessageBox.Show("관리자이십니다!");
        }
    }
}
