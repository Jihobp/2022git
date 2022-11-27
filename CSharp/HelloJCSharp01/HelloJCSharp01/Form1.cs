using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace HelloJCSharp01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            dataGridView2.Columns.Add("name", "이름");
            dataGridView2.Columns.Add("age", "나이");
            dataGridView2.Columns.Add("number", "숫자");

            coachBindingSource.Add(new Coach() { name = "탁오빠", age = 500 }); //기본생성자를 만들어야함?; >>
                                                                             //빈곳을 만들어야함. 몸을 만들어야하는데 몸을 못찾음 ㅠㅠ
            coachBindingSource.Add(new Coach() { name = "귀염둥이", age = 500 });
            coachBindingSource.Add(new Coach() { name = "지호호", age = 500 });
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = textBox1.Text;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            dataGridView2.Rows.Add(textBox2.Text, textBox3.Text, textBox4.Text);
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";

            dataGridView1.Columns.Add("name", "이름");
            dataGridView1.Columns.Add("age", "나이");
            dataGridView1.Columns.Add("number", "숫자");

            List<Crew> crews = new List<Crew>();
            crews.Add(new Crew("박지호1", 1, 3));
            crews.Add(new Crew("박지호2", 2, 2));
            crews.Add(new Crew("박지호3", 3, 1));

            dataGridView1.DataSource = null;
            dataGridView1.DataSource = crews;

        }
    }
}
