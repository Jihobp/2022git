using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace useLocalMap
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            //textBox1 위에 키보드를 누르고 그 키가 올라올 때
            //이벤트 추가
            //람다 사용함
            //키가 엔터일 때, button1을 눌러준다.
            textBox1.KeyUp += (sender, e) =>
            {
                if (e.KeyCode == Keys.Enter)
                    button1.PerformClick();
            };
        }

        private void button1_Click(object sender, EventArgs e)
        {
            List<Locale> locales = KakaoAPI.Search(textBox1.Text); //Locale 리스트여서 x,y 값 포함. tostring 은 네임값만 리턴하도록 오버라이딩해서 네임값만 리턴.
            listBox1.Items.Clear();
            foreach (Locale item in locales)
            {
                listBox1.Items.Add(item);
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex == -1)
                return;
            Locale ml = listBox1.SelectedItem as Locale; //선택한 것을 ??????//선택한 것을 Locale로 변환
            object[] pos = new object[] { ml.Lat, ml.Lng };
            HtmlDocument hdoc = webBrowser1.Document;
            //webBrowser 안에 setCenter를 호출한 것.
            //pos가 매개변수가 된 것.
            hdoc.InvokeScript("setCenter", pos);

        }
    }
}
