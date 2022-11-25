using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp09_01
{   //f7 폼보기
    public partial class Form2 : Form, IObserver
    {
        public Form2()
        {
            InitializeComponent();
        }
        // Notifier(form1) 안에 form2 창을 등록시키겟다.
        public Form2(ISubject sub)
        {
            InitializeComponent();
            //this = Form2
            //Form2 가 IObserver를 구현하기 때문. 
            sub.register(this);
        }

        public void update(string value)
        {
            label1.Text = "옵저버1" + value;
        }

    }
}
