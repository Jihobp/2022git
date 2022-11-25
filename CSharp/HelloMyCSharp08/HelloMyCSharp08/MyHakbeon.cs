using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08
{
    internal class MyHakbeon
    {
        public string name { get; set; }
        public int number { get; set; }

        //alt + enter 생성자!!! 기본 생성자 nono.
        public MyHakbeon(string name, int number)
        {
            this.name = name;
            this.number = number;
        }
    }
}
