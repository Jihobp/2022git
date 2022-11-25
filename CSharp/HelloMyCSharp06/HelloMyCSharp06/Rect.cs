using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06
{
    public class Rect
    {
        /* java의 방식. 
         * private int width;
         * publlic int getWidth()
         * { return width;}
         * public void setWidth(int w)
         * {this.width=w;}
         */

        //w라는 변수를 읽고, 쓰게 되면 width 에 접근이 됨.
        //getter랑 setter가 아래와 같이 줄어든 것.
        //value : 대입되는 값을 의미. 
        //public int w { get { return width; } set { width = value; } }
        //public int w { get => width;  set { width = value; }  } 

        //그냥 public int w라고 적어도 되는가?
        //지금 당장은 상관없으나 추후 datagridview 등을 쓸 때 문제가 됨
        //그래서 get;set;도 같이 써줘야 한다.
        public int w { get; set; }
        public int h { get; set; }
        public int getArea() //rect의 w, h를 정해놓으면 자동으로 넓이 알아서 구해줌. 클래스안에 같이 넣어둠.,
        {
            return w * h;
        }
        public Rect()
        {
            Console.WriteLine("Rect 생성자 호출");
        }
    }
}
