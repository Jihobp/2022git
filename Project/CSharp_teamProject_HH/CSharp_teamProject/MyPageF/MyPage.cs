using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class MyPage : Form
    {
        public static string myName;
        AdminManager adminmanager = AdminManager.Instance;

        public MyPage()
        {
            InitializeComponent();
            this.KeyPreview = true;

            string myId = Login_up.loginstatus;

            User myUser = adminmanager.MypageLoad(myId);
            myName = myUser.user_name.ToString();

            MyPage_label5_2.Text = myUser.user_name.ToString();
            MyPage_label6_2.Text = myUser.user_id.ToString();
            MyPage_label7_2.Text = myUser.user_phoneNum.ToString();
            MyPage_label8_2.Text = myUser.user_email.ToString();
        }

        private void MyPage_button1_Click(object sender, EventArgs e)
        {
            string myId = Login_up.loginstatus;
            MyPage_listBox1.Items.Clear();
            List<string> l = adminmanager.bookSelect(myId);
            foreach (var item in l)
                MyPage_listBox1.Items.Add(item);
        }

        private void MyPage_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }
    }
}
