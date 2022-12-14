using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class Admin_Form : Form
    {
        DataManager datamanager = AdminManager.Instance;
        AdminManager adminmanager = AdminManager.Instance;
        List<User> users = new List<User>();

        public Admin_Form()
        {
            InitializeComponent();
            this.KeyPreview = true;

            if (datamanager.Users.Count > 0)
            {
                admin_datagridview.DataSource = null;
                admin_datagridview.DataSource = datamanager.Users;
            }
        }

        private void WriteLog(string contents)
        {
            string log = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss")}]" + $"{contents}";
            datamanager.printLog(log);
            log_box.Items.Insert(0, log);
        }

        private void user_search_button_Click(object sender, EventArgs e)
        {
            Hotel_dataGridView1.Hide();
            admin_datagridview.Show();
            try
            {
                if (user_id_box.Text == "")
                {
                    adminmanager.adminSelect(user_id_box.Text);
                    admin_datagridview.DataSource = null;
                    admin_datagridview.DataSource = datamanager.Users;
                }
                else
                {
                    users = adminmanager.adminSelect(user_id_box.Text);
                    admin_datagridview.DataSource = null;
                    admin_datagridview.DataSource = users;
                }
            }
            catch (Exception)
            {
                MessageBox.Show($"회원 {user_id_box.Text} 을/를 조회하지 못했습니다.");
                WriteLog($"회원 {user_id_box.Text} 을/를 조회하지 못했습니다.");
            }
        }

        private void user_create_button_Click(object sender, EventArgs e)
        {
            if (user_id_box.Text.Trim() == "")
                MessageBox.Show("아이디를 입력해주세요");
            else if (user_passWord_box.Text.Trim() == "")
                MessageBox.Show("비밀번호를 입력해주세요.");
            else
                try
                {
                    int result = adminmanager.adminInsert(user_id_box.Text, user_passWord_box.Text, user_name_box.Text, user_phoneNum_box.Text, user_email_box.Text);
                    if (result >= 0)
                    {
                        string contents = $"회원 {user_id_box.Text} 을/를 등록 하였습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                        datamanager.Load();
                        admin_datagridview.DataSource = null;
                        admin_datagridview.DataSource = datamanager.Users;
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"db연결이 끊겼거나 primary key 오류입니다.");
                        WriteLog($"DB연결이 끊어졌거나 PK 중복");
                    }
                }
                catch (Exception)
                {
                }
        }

        private void user_update_button_Click(object sender, EventArgs e)
        {
            if (user_id_box.Text.Trim() == "")
                MessageBox.Show("아이디를 입력해주세요");
            else if (user_passWord_box.Text.Trim() == "")
                MessageBox.Show("비밀번호를 입력해주세요.");
            else
                try
                {
                    int result = adminmanager.adminUpdate(user_id_box.Text, user_passWord_box.Text, user_name_box.Text, user_phoneNum_box.Text, user_email_box.Text);
                    if (result != 0)
                    {
                        string contents = $"회원 {user_id_box.Text} 을/를 수정 하였습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                        datamanager.Load();
                        admin_datagridview.DataSource = null;
                        admin_datagridview.DataSource = datamanager.Users;
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"DB 연결에 문제가 있습니다.");
                        WriteLog($"DB 연결에 문제가 있습니다.");
                    }
                    else
                    {
                        MessageBox.Show($"회원 {user_id_box.Text} 을/를 수정하지 못했습니다.");
                        WriteLog($"회원 {user_id_box.Text} 을/를 수정하지 못했습니다.");
                    }
                }
                catch (Exception)
                {
                }
        }

        private void user_delete_button_Click(object sender, EventArgs e)
        {
            if (user_id_box.Text.Trim() == "")
                MessageBox.Show("아이디를 입력해주세요");
            else if (user_passWord_box.Text.Trim() == "")
                MessageBox.Show("비밀번호를 입력해주세요.");
            else
                try
                {
                    int result = adminmanager.adminDelete(user_id_box.Text, user_passWord_box.Text);
                    if (result != 0)
                    {
                        string contents = $"회원 {user_id_box.Text} 을/를 삭제 하였습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                        datamanager.Load();
                        admin_datagridview.DataSource = null;
                        if (datamanager.Users.Count > 0)
                            admin_datagridview.DataSource = datamanager.Users;
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"DB 연결에 문제가 있습니다.");
                        WriteLog($"DB 연결에 문제가 있습니다.");
                    }
                    else
                    {
                        MessageBox.Show($"회원 {user_id_box.Text} 을/를 삭제하지 못했습니다.");
                        WriteLog($"회원 {user_id_box.Text} 을/를 삭제하지 못했습니다.");
                    }
                }
                catch (Exception)
                {
                }
        }

        private void admin_datagridview_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            User user = admin_datagridview.CurrentRow.DataBoundItem as User;
            user_id_box.Text = user.user_id;
            user_passWord_box.Text = user.user_passWord;
            user_name_box.Text = user.user_name;
            user_phoneNum_box.Text = user.user_phoneNum;
            user_email_box.Text = user.user_email;
        }

        private void Admin_Form_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }

        private void hotel_search_button_Click(object sender, EventArgs e)
        {
            admin_datagridview.Hide();
            Hotel_dataGridView1.Show();
            try
            {
                if (hotel_name_box.Text == "")
                {
                    Hotel_dataGridView1.DataSource = null;
                    Hotel_dataGridView1.DataSource = adminmanager.hotelSelect(hotel_name_box.Text);
                }
                else
                {
                    Hotel_dataGridView1.DataSource = null;
                    Hotel_dataGridView1.DataSource = adminmanager.hotelSelect(hotel_name_box.Text);
                }
            }
            catch (Exception)
            {
                MessageBox.Show($"회원 {user_id_box.Text} 을/를 조회하지 못했습니다.");
                WriteLog($"회원 {user_id_box.Text} 을/를 조회하지 못했습니다.");
            }
        }
        public int hNum;
        private void Hotel_dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            Hotel ho = Hotel_dataGridView1.CurrentRow.DataBoundItem as Hotel;

            hNum = ho.hotel_num;
            hotel_name_box.Text = ho.hotel_name;
            hotel_tell_box.Text = ho.hotel_tell;
            hotel_post_box.Text = ho.hotel_post;
            hotel_addr_box.Text = ho.hotel_addr;
            hotel_roomNumber_box.Text = ho.hotel_roomNumber.ToString();
            hotel_lat_box.Text = ho.hotel_lat.ToString();
            hotel_lng_box.Text = ho.hotel_lng.ToString();
        }

        private void hotel_create_button_Click(object sender, EventArgs e)
        {
            if (hotel_name_box.Text.Trim() == "" || hotel_tell_box.Text.Trim() == "" || hotel_post_box.Text.Trim() == "" || hotel_addr_box.Text.Trim() == "" || hotel_roomNumber_box.Text.Trim() == "" || hotel_lat_box.Text.Trim() == "" || hotel_lng_box.Text.Trim() == "")
                MessageBox.Show("공백이 존재합니다.");
            else
                try
                {
                    int result = adminmanager.hotelInsert(hotel_name_box.Text, hotel_tell_box.Text, hotel_post_box.Text, hotel_addr_box.Text, hotel_roomNumber_box.Text, hotel_lat_box.Text, hotel_lng_box.Text);
                    if (result >= 0)
                    {
                        string contents = $"호텔 {hotel_name_box.Text} 을/를 등록 하였습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"db연결이 끊겼거나 primary key 오류입니다.");
                        WriteLog($"DB연결이 끊어졌거나 PK 중복");
                    }
                }
                catch (Exception)
                {
                }
        }

        private void hotel_update_button_Click(object sender, EventArgs e)
        {
            if (hotel_name_box.Text.Trim() == "" || hotel_tell_box.Text.Trim() == "" || hotel_post_box.Text.Trim() == "" || hotel_addr_box.Text.Trim() == "" || hotel_roomNumber_box.Text.Trim() == "" || hotel_lat_box.Text.Trim() == "" || hotel_lng_box.Text.Trim() == "")
                MessageBox.Show("공백이 존재합니다.");
            else
                try
                {
                    int result = adminmanager.hotelUpdate(hotel_name_box.Text, hotel_tell_box.Text, hotel_post_box.Text, hotel_addr_box.Text, hotel_roomNumber_box.Text, hotel_lat_box.Text, hotel_lng_box.Text, hNum);
                    if (result != 0)
                    {
                        string contents = $"호텔 {hotel_name_box.Text} 을/를 수정 하였습니다.";
                        WriteLog(contents);
                        MessageBox.Show(contents);
                    }
                    else if (result == -9)
                    {
                        MessageBox.Show($"DB 연결에 문제가 있습니다.");
                        WriteLog($"DB 연결에 문제가 있습니다.");
                    }
                    else
                    {
                        MessageBox.Show($"호텔 {hotel_name_box.Text} 을/를 수정하지 못했습니다.");
                        WriteLog($"호텔 {hotel_name_box.Text} 을/를 수정하지 못했습니다.");
                    }
                }
                catch (Exception)
                {
                }
        }

        private void hotel_delete_button_Click(object sender, EventArgs e)
        {
            try
            {
                int result = adminmanager.hotelDelete(hNum);
                if (result != 0)
                {
                    string contents = $"호텔 {hotel_name_box.Text} 을/를 삭제 하였습니다.";
                    WriteLog(contents);
                    MessageBox.Show(contents);
                }
                else if (result == -9)
                {
                    MessageBox.Show($"DB 연결에 문제가 있습니다.");
                    WriteLog($"DB 연결에 문제가 있습니다.");
                }
                else
                {
                    MessageBox.Show($"호텔 {hotel_name_box.Text} 을/를 삭제하지 못했습니다.");
                    WriteLog($"호텔 {hotel_name_box.Text} 을/를 삭제하지 못했습니다.");
                }
            }
            catch (Exception)
            {
            }
        }
    }
}
