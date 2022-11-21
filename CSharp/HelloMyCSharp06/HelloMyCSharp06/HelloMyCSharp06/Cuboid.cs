using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06
{
    //생성자는... 조상클래스를 무조건 먼저 호출함. 
    public class Cuboid : Rect   //클래스 cuboid 를 만든다, 부모클래스  Rect를 상속받아서.
                                 //보이지않는 super();생성자 즉 베이스가 있다. 
                                 //Rect에 있는 생성자와 cuboid생성자 둘다 호출 함!!! ㅇㅅㅇ!!!
    {
        //Rect의 w,h가 포함되어 있다.
        public int z { get; set; }
        //Rect의 getArea()가 포함되어 있다.
        public int getVolume()
        {
            return w * h * z;
        }
    }
}
