using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp03_04
{
    public partial class Form2 : Form
    {
        private string text1;
        private string text2;

        public Form2()
        {
            InitializeComponent();
        }

        public Form2(string text1, string text2)
        {
            this.text1 = text1;
            this.text2 = text2;
            InitializeComponent(); //이거 반드시 있어야 함!!!!!!!!!!!!!
            if (text1 == "admin" && text2 == "1234")
                label1.Text = "관리자야 안뇽";
            else
                label1.Text = "넌 누구냥!";

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
