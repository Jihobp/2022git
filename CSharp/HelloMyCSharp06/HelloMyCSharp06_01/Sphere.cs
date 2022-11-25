using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06_01
{
    public class Sphere : Circle
    {
        public Sphere(int r) : base(r) //super(); 상위(조상) 클래스의 생성자
        {
        }
        public double getVolume()
        {
            return (4.0 / 3) * PI * r * r * r;
        }
    }
}
