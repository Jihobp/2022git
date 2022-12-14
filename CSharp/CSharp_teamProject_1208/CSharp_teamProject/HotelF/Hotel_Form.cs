using CSharp_teamProject.HotelF;
using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class Hotel_Form : Form
    {
        List<String> choice_list = new List<string>();

        private void ReadHotelList()
        {
            StreamReader file = new StreamReader("HotelList.csv", System.Text.Encoding.Default);
            DataTable table = new DataTable();
            string line1 = file.ReadLine();
            string[] data1 = line1.Split(',');

            table.Columns.Add(data1[1]); // 호텔명
            table.Columns.Add(data1[2]); // 전화번호
            table.Columns.Add(data1[3]); // 우편번호
            table.Columns.Add(data1[4]); // 도로명주소
            table.Columns.Add(data1[5]); // 객실수

            while (!file.EndOfStream)
            {
                string line = file.ReadLine();
                string[] data = line.Split(',');
                table.Rows.Add(data[1], data[2], data[3], data[4], data[5]);
            }
            hotel_dataGridView1.DataSource = table;
            file.Close();
        }

        private void Choice_Area(List<String> choice_text)
        {
            StreamReader file = new StreamReader("HotelList.csv", System.Text.Encoding.Default);
            DataTable table = new DataTable();
            string line1 = file.ReadLine();
            string[] data1 = line1.Split(',');

            table.Columns.Add(data1[1]);
            table.Columns.Add(data1[2]);
            table.Columns.Add(data1[3]);
            table.Columns.Add(data1[4]);
            table.Columns.Add(data1[5]);

            while (!file.EndOfStream)
            {
                string line = file.ReadLine();
                string[] data = line.Split(',');
                foreach (var item in choice_list)
                {
                    if (data[4].ToString().Contains(item))
                        table.Rows.Add(data[1], data[2], data[3], data[4], data[5]);
                }
            }
            hotel_dataGridView1.DataSource = table;
            file.Close();
        }

        private void Search_Area(string search_text)
        {
            StreamReader file = new StreamReader("HotelList.csv", System.Text.Encoding.Default);
            DataTable table = new DataTable();
            string line1 = file.ReadLine();
            string[] data1 = line1.Split(',');

            table.Columns.Add(data1[1]);
            table.Columns.Add(data1[2]);
            table.Columns.Add(data1[3]);
            table.Columns.Add(data1[4]);
            table.Columns.Add(data1[5]);

            while (!file.EndOfStream)
            {
                string line = file.ReadLine();
                string[] data = line.Split(',');
                if (data[1].ToString().Contains(search_text))
                    table.Rows.Add(data[1], data[2], data[3], data[4], data[5]);
            }
            hotel_dataGridView1.DataSource = table;
            file.Close();
        }

        private void CleanList()
        {
            hotel_dataGridView1.DataSource = null;
        }

        private void CleanChoiceList(string txt)
        {
            choice_list.Remove(txt);
        }

        public Hotel_Form()
        {
            InitializeComponent();
            this.KeyPreview = true;
            ReadHotelList();
            hotel_textBox1.KeyUp += (sender, e) =>
            {
                if (e.KeyCode == Keys.Enter)
                    hotel_button1.PerformClick();
            };
        }

        private void hotel_button1_Click(object sender, EventArgs e)
        {
            CleanList();
            Search_Area(hotel_textBox1.Text);
        }

        private void hotel_checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox1.Checked)
                choice_list.Add(hotel_checkBox1.Text);
            else
                CleanChoiceList(hotel_checkBox1.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox2.Checked)
                choice_list.Add(hotel_checkBox2.Text);
            else
                CleanChoiceList(hotel_checkBox2.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox3.Checked)
                choice_list.Add(hotel_checkBox3.Text);
            else
                CleanChoiceList(hotel_checkBox3.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox4_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox4.Checked)
                choice_list.Add(hotel_checkBox4.Text);
            else
                CleanChoiceList(hotel_checkBox4.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox5_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox5.Checked)
                choice_list.Add(hotel_checkBox5.Text);
            else
                CleanChoiceList(hotel_checkBox5.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            if (hotel_checkBox6.Checked)
                choice_list.Add(hotel_checkBox6.Text);
            else
                CleanChoiceList(hotel_checkBox6.Text);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            string region_name = "전라";
            if (hotel_checkBox7.Checked)
                choice_list.Add(region_name);
            else
                CleanChoiceList(region_name);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            string region_name = "경상";
            if (hotel_checkBox8.Checked)
                choice_list.Add(region_name);
            else
                CleanChoiceList(region_name);
            Choice_Area(choice_list);
        }

        private void hotel_checkBox9_CheckedChanged(object sender, EventArgs e)
        {
            CleanList();
            string region_name = "충청";
            if (hotel_checkBox9.Checked)
                choice_list.Add(region_name);
            else
                CleanChoiceList(region_name);
            Choice_Area(choice_list);
        }
        string[] myhotel = new string[2];

        private void hotel_dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            StreamReader file = new StreamReader("HotelList.csv", System.Text.Encoding.Default);

            int rowIndex = hotel_dataGridView1.CurrentCell.RowIndex;
            string cellclick_text = hotel_dataGridView1.Rows[rowIndex].Cells[0].Value.ToString();
            Locale ml = KakaoAPI.SearchClick(cellclick_text);
            string addr = "";
            while (!file.EndOfStream)
            {
                string line = file.ReadLine();
                string[] data = line.Split(',');

                if (data[1].ToString().Contains(cellclick_text))
                {
                    ml.name = data[1].ToString();
                    ml.Lat = double.Parse(data[6].ToString());
                    ml.Lng = double.Parse(data[7].ToString());
                    addr = data[4].ToString();
                    break;
                }
            }
            file.Close();
            myhotel[0] = ml.name;
            myhotel[1] = addr;

            object[] pos = new object[] { ml.Lat, ml.Lng };
            HtmlDocument hdoc = hotel_webBrowser1.Document;
            hdoc.InvokeScript("setCenter", pos);
        }

        private void Hotel_Form_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }

        private void hotel_button2_Click(object sender, EventArgs e)
        {
            Book bookInfo = new Book();
            bookInfo.book_id = Login_up.loginstatus;
            bookInfo.book_name = MainForm.myName;
            bookInfo.book_hotelName = myhotel[1] + myhotel[0];

            AdminManager.Instance.bookInsert(bookInfo);
        }
    }
}
