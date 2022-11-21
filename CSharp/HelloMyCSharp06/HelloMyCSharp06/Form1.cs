using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            Console.WriteLine("가로?");
            string width = Console.ReadLine();

            Console.WriteLine("세로?");
            string height = Console.ReadLine();

            int result = int.Parse(width) * int.Parse(height);

            Console.WriteLine(result);

        }
    }
}
