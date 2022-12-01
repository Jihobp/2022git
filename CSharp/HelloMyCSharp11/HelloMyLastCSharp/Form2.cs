using System.Windows.Forms;

namespace HelloMyLastCSharp
{
    public partial class Form2 : Form
    {
        //form2는 쉽게, form3는 어렵게. 책이랑 좀 다른당,
        public Form2()
        {
            InitializeComponent();
            dataGridView1.DataSource = null;
            if (DataManager.Books.Count > 0)
                dataGridView1.DataSource = DataManager.Books;
        }

        private void button1_Click(object sender, System.EventArgs e)
        {
            //책 추가
            bool existBook = false; //책 존재 여부
            foreach (var item in DataManager.Books)
            {
                if (item.Isbn == textBox1.Text)
                {
                    existBook = true; //textbox에 없으면 false, 없어야 책 추가를 할 수 있다!
                    break;
                }
            }
            if (existBook)
                MessageBox.Show("이미 존재하는 도서입니다.");
            else
            {
                Book book = new Book();
                book.Isbn = textBox1.Text;
                book.Name = textBox2.Text;
                book.Publisher = textBox3.Text;
                //텍스트로 인한 오류 줄이고 싶다면
                //try catch 나 int.TryParse를 쓰면 된다.
                book.Page = int.Parse(textBox4.Text);
                DataManager.Books.Add(book);

                dataGridView1.DataSource = null;
                dataGridView1.DataSource = DataManager.Books;
                DataManager.Save(); //Save 해야 XML에 반영이 됨.
            }
        }

        private void button2_Click(object sender, System.EventArgs e)//수정
        {
            Book book = null; //널을 집어넣어줘야, 다음 입력도 할 수 있다! 
            for (int i = 0; i < DataManager.Books.Count; i++)
            {
                if (DataManager.Books[i].Isbn == textBox1.Text)
                {
                    book = DataManager.Books[i];
                    book.Name = textBox2.Text;
                    book.Publisher = textBox3.Text;
                    book.Page = int.Parse(textBox4.Text);

                    dataGridView1.DataSource = null;
                    dataGridView1.DataSource = DataManager.Books;
                    DataManager.Save();
                }
            }
            if (book == null)
                MessageBox.Show("없는 책입니다.");
        }


        private void button3_Click(object sender, System.EventArgs e) //삭제
        {
            bool existBook = false;
            for (int i = 0; i < DataManager.Books.Count; i++)
            {
                if (DataManager.Books[i].Isbn == textBox1.Text)
                {
                    //DataManager.Books.RemoveAt(i); //new Book();만들어서 새로 만들면 못지운다. 
                    DataManager.Books.Remove(DataManager.Books[i]); //인덱스로 지워야함 둘중 하나.
                    existBook = true;
                }
            }
            if (existBook == false)
                MessageBox.Show("없는 책입니다.");
            else
            {
                dataGridView1.DataSource = null;
                if (DataManager.Books.Count > 0)
                    dataGridView1.DataSource = DataManager.Books;
                DataManager.Save();
            }
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            Book book = dataGridView1.CurrentRow.DataBoundItem as Book;
            textBox1.Text = book.Isbn;
            textBox2.Text = book.Name;
            textBox3.Text = book.Publisher;
            textBox4.Text = book.Page.ToString();

        }
    }
}
