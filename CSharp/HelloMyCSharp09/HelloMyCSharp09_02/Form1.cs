using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace HelloMyCSharp09_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            //name, gender = 컬럼명(실제 처리할 때 필요한 값)
            //이름, 성별 = 컬럼의 Text 값(겉에 보이는 값)
            dataGridView3.Columns.Add("name", "이름");
            dataGridView3.Columns.Add("gender", "성별");

            productBindingSource.Add(new Product() { Name = "감자", Price = 500 });
            productBindingSource.Add(new Product() { Name = "토마토", Price = 700 });
            productBindingSource.Add(new Product() { Name = "젤리", Price = 100 });

            //dataGridView5.Columns.Add("name", "이름");
            //dataGridView5.Columns.Add("hakbeon", "학번");
            //dataGridView5.Columns.Add("gender", "성별");


        }


        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            dataGridView3.Rows.Add(textBox1.Text, textBox2.Text);
            textBox1.Text = "";
            textBox2.Text = "";
        }


        private void button1_Click(object sender, EventArgs e)
        {
            dataGridView3.Rows.Add(textBox1.Text, textBox2.Text);
            textBox1.Text = "";
            textBox2.Text = "";
        }


        private void button2_Click(object sender, EventArgs e)
        {
            List<Product> products = new List<Product>();
            products.Add(new Product() { Name = "김치", Price = 5000 });
            products.Add(new Product() { Name = "시금치", Price = 990 });
            products.Add(new Product() { Name = "감귤", Price = 4990 });

            //반드시 null로 초기화해주고 나서 DataSource를 넣는다.
            //만약 products가 추가 삭제 되도, 마찬가지로
            //DataSource를 null로 해주고
            //DataSource 다시 products로 바꿔야 됨.
            //이게 싫으면 productBindSource를 쓰면 됨.
            //productBindSource 자체를 Add Remove해도 바로 반영 됨.
            dataGridView4.DataSource = null;
            dataGridView4.DataSource = products;
        }

        private void button3_Click(object sender, EventArgs e) //무조건 리스트에 넣어줘야함.
        {
            List<Student> students = new List<Student>();
            students.Add(new Student() { Name = "박지호", Hakbeon = "80", Gender = "남성" });
            students.Add(new Student() { Name = "오세룡", Hakbeon = "80", Gender = "여성" });
            students.Add(new Student() { Name = "이범식", Hakbeon = "80", Gender = "여성" });

            dataGridView5.DataSource = null;
            dataGridView5.DataSource = students;

        }

        private void button4_Click(object sender, EventArgs e)
        {
            //바인딩 되어있을때
            studentBindingSource1.Add(new Student() { Name = textBox3.Text, Hakbeon = textBox4.Text, Gender = textBox5.Text });
            //바인딩이 안되어있을때 
            //dataGridView5.Rows.Add(textBox3.Text, textBox4.Text, textBox5.Text); 
            textBox3.Text = "";
            textBox4.Text = "";
            textBox5.Text = "";
        }

    }
}
