﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06
{

    //다중 상속은 안됨.
    //다중 상속이 되는 것처럼은 할 수있따. 
    //인터페이스,>  ,해서 줄줄히 이어나가면 ok.
    public class Sphere : Circle
    {
        //base = java의 super랑 같음.
        //즉 조상클래스의 생성자를 부름

        //Sphere 생성자 호출할 때 
        //조상클래스의 생성자 부르고, 그 다음에 Sphere의 생성자 호출
        public Sphere(int r) : base(r)
        {
        }
        public double getVolume()
        {
            // 4/3 = 1
            // 4.0 /3 =1.3333

            //PI가 protected 라서 circle의 자손인 
            //Sphere에서도 쓸 수 있는 것,
            return (4.0 / 3) * PI * r * r * r;
        }
    }
}
