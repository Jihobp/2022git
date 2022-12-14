using System;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class sign_up : Form
    {
        DataManager datamanager = AdminManager.Instance;
        DBHelper dbhelper = AdminHelper.Instance;
        public sign_up()
        {
            InitializeComponent();
            this.KeyPreview = true;
        }

        protected override CreateParams CreateParams // 버퍼링 없애주는 코드
        {
            get
            {
                var cp = base.CreateParams;
                cp.ExStyle |= 0x02000000;
                return cp;
            }
        }

        private void btn_Register_Click(object sender, EventArgs e)
        {
            if (txt_ID.Text.Trim() == "")
                MessageBox.Show("아이디를 입력해주세요");
            else if (txt_PW.Text.Trim() == "")
                MessageBox.Show("비밀번호를 입력해주세요.");
            else
                try
                {
                    int result = dbhelper.insertQuery(txt_ID.Text, txt_PW.Text, txt_Name.Text, txt_Phone.Text, txt_Email.Text);
                    if (result != 0)
                    {
                        string contents = $"회원 {txt_ID.Text} 을/를 등록 하였습니다.";
                        MessageBox.Show(contents);
                        WriteLog(contents);
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"DB 연결에 문제가 있습니다.");
                        WriteLog($"DB 연결에 문제가 있습니다.");
                    }
                    else
                    {
                        MessageBox.Show($"회원 {txt_ID.Text} 을/를 등록하지 못했습니다.");
                        WriteLog($"회원 {txt_ID.Text} 을/를 등록하지 못했습니다.");
                    }
                }
                catch (Exception)
                {
                }
        }
        private void WriteLog(string contents)
        {
            string log = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss")}]" + $"{contents}";
            datamanager.printLog(log);
        }

        private void sign_up_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }

        private void Signup_button2_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("http://www.google.com");
        }

        private void Signup_button3_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.whatsapp.com");
        }

        private void Signup_button4_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.facebook.com");
        }

        private void Signup_button5_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.instagram.com/");
        }

        private void Signup_button1_Click(object sender, EventArgs e)
        {
            Dispose();
        }
    }
}
