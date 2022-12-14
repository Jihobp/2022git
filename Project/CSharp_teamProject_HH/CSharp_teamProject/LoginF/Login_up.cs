using System;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class Login_up : Form
    {
        public static string loginstatus;
        AdminManager adminmanager = AdminManager.Instance;

        public Login_up()
        {
            InitializeComponent();
            this.KeyPreview = true;
            Login_TextBox2.KeyUp += (sender, e) =>
            {
                if (e.KeyCode == Keys.Enter)
                    Login_button_Login.PerformClick();
            };
        }

        private void Login_button1_Click(object sender, EventArgs e)
        {
            loginstatus = "admin";
            Application.Exit();
        }

        private void Login_button_Login_Click(object sender, EventArgs e)
        {
            string id = Login_TextBox1.Text;
            string pw = Login_TextBox2.Text;
            string loginId;

            if (Login_TextBox1.Text == "" || Login_TextBox2.Text == "")
            {
                MessageBox.Show("아이디나 비밀번호를 입력해주세요");
            }
            else
            {
                User a = new User();
                loginId = adminmanager.Load(id, pw);

                if (loginId == "admin")
                {
                    MessageBox.Show("어드민 로그인 성공.", "AdminLogin");
                    loginstatus = loginId;
                    Dispose();
                }
                else if (loginId != "")
                {
                    MessageBox.Show("로그인에 성공했습니다.", "LOGIN");
                    loginstatus = loginId;
                    Dispose();
                }
                else
                {
                    MessageBox.Show("로그인 실패.", "LOGIN");
                    Login_TextBox2.Text = "";
                }
            }
        }

        private void label5_Click(object sender, EventArgs e)
        {
            new sign_up().ShowDialog();
        }

        private void Login_up_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                Application.Exit();
        }

        private void Login_button2_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("http://www.google.com");
        }

        private void Login_button5_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.facebook.com");
        }

        private void Login_button3_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.whatsapp.com");
        }

        private void Login_button6_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.instagram.com/");
        }
    }
}
