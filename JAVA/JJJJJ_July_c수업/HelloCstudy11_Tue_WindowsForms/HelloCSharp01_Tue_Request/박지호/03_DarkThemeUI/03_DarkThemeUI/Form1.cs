using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _03_DarkThemeUI
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            panelLeft.Height = buttonDashboard.Height;
            panelLeft.Top = buttonDashboard.Top;
        }

        private void panelLeft_Paint(object sender, PaintEventArgs e)
        {

        }

        private void buttonSeller_Click(object sender, EventArgs e)
        {
            panelLeft.Height = buttonSeller.Height;
            panelLeft.Top = buttonSeller.Top;
        }

        private void buttonCalender_Click(object sender, EventArgs e)
        {
            panelLeft.Top = buttonCalender.Top;
            panelLeft.Height = buttonCalender.Height;
        }

        private void buttonTask_Click(object sender, EventArgs e)
        {
            panelLeft.Height = buttonTask.Height;
            panelLeft.Top = buttonTask.Top;
        }
    }
}
