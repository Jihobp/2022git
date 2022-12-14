using CSharp_teamProject.Map;
using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
            //textBox1 위에 키보드를 누르고 그 키가 올라올 때
            //이벤트 추가
            //람다 사용함
            //키가 엔터일 때, button1을 눌러준다.
            Main_Map_textBox.KeyUp += (sender, e) =>
            {
                if (e.KeyCode == Keys.Enter)
                    Main_Map_button.PerformClick();
            };


            //차트
            Datachart.ChartAreas[0].AxisX.LabelStyle.Interval = 1;
            for (int i = 1; i < 20; i++)
            {
                //Series[0], Series[1] 말고
                //Series["축이름"]을 넣을 수도 있다.
                Datachart.Series["Series1"].Points.AddXY(i, i + 10);
            }


            //사이드 버튼(움직일때마다 따라가는거)
            panel_side.Height = Mainbutton1.Height; //첫번째 버튼의 높이로 바꿈
            panel_side.Top = Mainbutton1.Top; //첫번째 버튼의 y값으로 바꿈.
                                              //FirstControl 로 만든 유저컨트롤을 맨 앞으로 보냄.


        }

        private void Mainbutton_x_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void Main_Map_button_Click(object sender, EventArgs e)
        {
            List<Locale> locales = KakaoAPI.Search(Main_Map_textBox.Text); //Locale 리스트여서 x,y 값 포함. tostring 은 네임값만 리턴하도록 오버라이딩해서 네임값만 리턴.
            Main_Map_listBox.Items.Clear();
            foreach (Locale item in locales)
            {
                Main_Map_listBox.Items.Add(item);
            }
        }

        private void Main_Map_listBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (Main_Map_listBox.SelectedIndex == -1)
                return;
            Locale ml = Main_Map_listBox.SelectedItem as Locale; //선택한 것을 ??????//선택한 것을 Locale로 변환
            object[] pos = new object[] { ml.Lat, ml.Lng };
            HtmlDocument hdoc = Main_Map_webBrowser.Document;
            //webBrowser 안에 setCenter를 호출한 것.
            //pos가 매개변수가 된 것.
            hdoc.InvokeScript("setCenter", pos);
        }

        private void Main_Map_webBrowser1_DocumentCompleted(object sender, WebBrowserDocumentCompletedEventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void Mainbutton1_Click(object sender, EventArgs e)
        {
            panel_side.Height = Mainbutton1.Height; //첫번째 버튼의 높이로 바꿈
            panel_side.Top = Mainbutton1.Top; //첫번째 버튼의 y값으로 바꿈.
            //map 로 만든 유저컨트롤을 맨 앞으로 보냄.
            //map.BringToFront(); //맨 앞으로 보냄.
        }

        private void Mainbutton2_Click(object sender, EventArgs e)
        {
            panel_side.Height = Mainbutton1.Height; //첫번째 버튼의 높이로 바꿈
            panel_side.Top = Mainbutton1.Top; //첫번째 버튼의 y값으로 바꿈.
        }


    }
}
