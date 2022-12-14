using System;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace CSharp_teamProject
{
    public partial class MainForm : Form
    {
        public static string myName;

        AdminManager adminmanager = AdminManager.Instance;
        // Login_up login = new Login_up();

        public MainForm()
        {

            InitializeComponent();

            this.KeyPreview = true;
            chart();
            new Login_up().ShowDialog();

            if (Login_up.loginstatus != "admin")
            {
                Mainbutton4.Text = "  MyPage";
            }
            string myId = Login_up.loginstatus;

            User myUser = adminmanager.MypageLoad(myId);
            myName = myUser.user_name.ToString();
            panel_side.Height = Mainbutton1.Height;
            panel_side.Top = Mainbutton1.Top;
        }

        private void Mainbutton_x_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void Mainbutton1_Click(object sender, EventArgs e)
        {
            panel_side.Height = Mainbutton1.Height;
            panel_side.Top = Mainbutton1.Top;
        }

        private void Mainbutton2_Click(object sender, EventArgs e)
        {
            panel_side.Height = Mainbutton2.Height;
            panel_side.Top = Mainbutton2.Top;
            new Hotel_Form().ShowDialog();
        }

        private void Mainbutton3_Click(object sender, EventArgs e)
        {
            panel_side.Height = Mainbutton3.Height;
            panel_side.Top = Mainbutton3.Top;
            new Weather().ShowDialog();
        }

        private void Mainbutton4_Click(object sender, EventArgs e) // admin
        {
            panel_side.Height = Mainbutton4.Height;
            panel_side.Top = Mainbutton4.Top;
            if (Login_up.loginstatus == "admin")
                new Admin_Form().ShowDialog();
            else
                new MyPage().ShowDialog();
        }

        private void chart()
        {
            Main_chart1.Titles.Add("방한외국인의 증가추세");
            Main_chart1.ChartAreas[0].AxisY.Title = "여행객 수";
            Main_chart1.ChartAreas[0].AxisX.LabelStyle.Format = "yyyy-MM";
            Main_chart1.ChartAreas[0].AxisX.Interval = 1;
            Main_chart1.ChartAreas[0].AxisX.IntervalType = DateTimeIntervalType.Months;
            Main_chart1.ChartAreas[0].AxisX.IntervalOffset = 1;
            Main_chart1.ChartAreas[0].AxisX.LabelStyle.Angle = -45;

            var d = new DateTime(2021, 11, 1);

            // 여성 인원수
            Main_chart1.Series[0].Points.Clear();
            Main_chart1.Series[0].Points.AddXY(d, 17924);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(1), 17325);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(2), 13328);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(3), 28987);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(4), 20258);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(5), 34785);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(6), 52188);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(7), 80549);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(8), 98160);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(9), 126434);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(10), 139322);
            Main_chart1.Series[0].Points.AddXY(d.AddMonths(11), 224985);

            Main_chart1.Series[0].XValueType = ChartValueType.DateTime;

            // 남성 인원수
            Main_chart1.Series[1].Points.Clear();
            Main_chart1.Series[1].Points.AddXY(d, 36184);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(1), 32854);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(2), 28834);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(3), 36184);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(4), 37477);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(5), 56183);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(6), 82169);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(7), 105712);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(8), 121199);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(9), 140007);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(10), 154721);
            Main_chart1.Series[1].Points.AddXY(d.AddMonths(11), 201483);

            Main_chart1.Series[1].XValueType = ChartValueType.DateTime;

            // 남여 인원수 추세선
            Main_chart1.Series[2].Points.Clear();
            Main_chart1.Series[2].Points.AddXY(d, 54108);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(1), 50179);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(2), 42162);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(3), 65171);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(4), 57735);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(5), 90968);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(6), 134357);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(7), 186261);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(8), 219359);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(9), 266441);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(10), 294043);
            Main_chart1.Series[2].Points.AddXY(d.AddMonths(11), 426468);

            Main_chart1.Series[2].XValueType = ChartValueType.DateTime;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            main_timer.Text = DateTime.Now.ToString("yyyy-MM-dd hh:mm:ss");
        }

        private void MainForm_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }

        private void Mainbutton_share_Click(object sender, EventArgs e)
        {
            this.Hide();
            new Login_up().ShowDialog();
            if (Login_up.loginstatus != "admin")
                Mainbutton4.Text = "  MyPage";
            else
                Mainbutton4.Text = "  Admin";
            this.Show();
        }
    }
}
