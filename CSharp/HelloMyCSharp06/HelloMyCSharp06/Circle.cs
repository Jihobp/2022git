using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06
{
    public class Circle
    {
        public int r { get; set; }
        protected double PI = 3.14; //Circle, Circle을 상속한 곳에서만 접근 가능. 
                                    //why protected? 실무에서 쓴적이 거의 없긴함. 
                                    //여기에서도 활용할수 있고, circle을 상속한 sphere에서도 쓸 수 있다. 단, program.cs에선 건드리지 못함.
                                    //protected vs private.?  private은 컴퓨터에서 못 읽는다.  
                                    // Public // 같은 클래스, 같은 패키지, 자식 클래스, 그 외 영역에서 접근 가능
                                    // protected // 같은 클래스, 같은 패키지, 자식 클래스에서 접근 가능 //c에선 같은 클래스, 상속받은 자식클래스에서 접근 가능.
                                    // Private // 같은 클래스에서만 접근 가능 // 제일 좁은 범위
                                    // default // 같은 클래스, 같은 패키지에서 접근 가능


        //기본 생성자.
        //굳이 적지 않아도 생김.
        //public Circle()
        //{
        //}
        //아래와 같이 생성자를 명시적으로 하나 만들면
        //아무것도 없는 기본생성자는 삭제가 됨.
        //그래서 new Circle()쓰면 오류난다.
        //만약 원을 만드는 시점에 반지름을 모른다면
        //위와 같이 
        //public Circle()
        //{
        //}
        //이렇게 만들어줘야 함. 
        public Circle(int r)
        {
            this.r = r;
        }

        public double getArea()
        {
            return r * r * PI;
        }
        public double getRound()
        {
            return 2 * r * PI;
        }
    }
}
