using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp09_03
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //추가
        private void button1_Click(object sender, EventArgs e)
        {
            studentBindingSource.Add(new Student()
            {
                name = textBox1.Text,
                hakbeon = textBox2.Text,
                gender = textBox3.Text
            });
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //이름으로 찾아서 나머지 값들을 수정해보기
            //즉, textBox1의 값을 기준으로 찾겠다.
            string name = textBox1.Text;
            for(int i = 0; i<studentBindingSource.Count; i++)
            {
                Student s = studentBindingSource[i] as Student;
                if(s.name == name)
                {
                    s.hakbeon = textBox2.Text;
                    s.gender = textBox3.Text;
                    studentBindingSource[i] = s;
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            {
                //이름으로 찾아서 나머지 값들을 삭제해보기
                //즉, textBox1의 값을 기준으로 찾겠다.
                string name = textBox1.Text;
                //역 for문!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@
                for (int i = studentBindingSource.Count-1; i >=0 ; i--) //지우는 거기때문에 역순으로
                {
                    Student s = studentBindingSource[i] as Student;
                    if (s.name == name)
                    {
                        studentBindingSource.RemoveAt(i); //0 부터 차례차례로 ㅇㅅㅇ
                    }
                }
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            //이름으로 찾아서 나머지 값들을 수정해보기
            //즉, textBox1의 값을 기준으로 찾겠다.
            string name = textBox1.Text;
            List<Student> ss = new List<Student>();
            for (int i = 0; i < studentBindingSource.Count; i++)
            {
                Student s = studentBindingSource[i] as Student;
                if (s.name == name)
                {
                    ss.Add(s);
                }
            }
            dataGridView2.DataSource = null; // 없으면 갱신이 안됩니다 ㅇㅅㅇㅅㅇㅅㅇㅅㅇ 꼭 null, 넣고 그 다음 값을 넣어줘야 합니다. 
            dataGridView2.DataSource = ss;
        }
    }
}
