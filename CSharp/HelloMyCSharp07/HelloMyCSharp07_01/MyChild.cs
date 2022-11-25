using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_01
{
    public class MyChild : MyParent //Myparent 상속받은 Mychild
    {   //부모가 자신은 없는, but 자식한테는 있는 걸 쓰려면 "형변환" 스킬. 을 이용해서 써야 한다. 
        public MyChild() : base() //생성자  base() 생략가능
            { 
                money--;
            }

        public void study() { Console.WriteLine("LOL공부"); }
        public void playgame() { Console.WriteLine("LOL"); }
        public void buyBitCoin(int m)  //새 클래스 매개변수? 
        {
            money += m;
        }

   

    }
}
