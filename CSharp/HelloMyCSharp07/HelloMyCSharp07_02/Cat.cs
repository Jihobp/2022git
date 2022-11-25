using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_02
{
    public class Cat
    {
        public string name { get; set; }
        public int age { get; set; }
        public void sleep() //메소드 3개
        {   //mbox ! tab tab! 
            System.Windows.Forms.MessageBox.Show
                ($"{name}:{age}살 답게 잠을 잘 잔댜.");
        }

        //하이딩
        public void eat() //public new void? 
        {
            System.Windows.Forms.MessageBox.Show
                ($"{name}:{age}살 답게 잘 먹는댜.");
        }

        //오버라이딩
        public virtual void fight() //virtual 쓰는 거만 빼면 자바랑 비슷
        {
            System.Windows.Forms.MessageBox.Show
                ($"{name}:{age}살 답게 잠을 잘 싸운다.");
        }
    }
}
