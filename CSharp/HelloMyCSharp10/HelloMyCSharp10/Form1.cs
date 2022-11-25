﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp10
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //밑에서부터 생김
        private void button1_Click(object sender, EventArgs e)
        {
            listBox1.Items.Add(textBox1.Text);
        }

        //위에서 갱신됨
        private void button2_Click(object sender, EventArgs e)
        {
            //최근 내용이 위로 오기 떄문에
            //가장 최근에 발생한 이벤트들을 파악하기가 쉽다.
            //0번째 (=첫번쨰)에 새로운 데이터를 삽입. 
            listBox1.Items.Insert(0,textBox1.Text);
        }
    }
}
