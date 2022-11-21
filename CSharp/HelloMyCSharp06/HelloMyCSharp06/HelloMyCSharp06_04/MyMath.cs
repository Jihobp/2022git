using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06_04
{
    public class MyMath
    {
        //전부 인스턴시 메소드 = > new MyMath() 로 new 키워드를 통해 인스턴스를 호출해야함. 

        //제곱
        public int power(int x)
        {
            return x* x;
        }

        //두 숫자곱
        public int multi(int x, int y)
        {
            return x* y;
        }

        //거듭제곱
        //위에 적혀 있는 power랑 이름이 똑같음.
        //매개변수의 개수가 다랄서 다른 메소드로 취급.
        //이렇게 매개변수(=파라메터)의 개수나
        //타입이 다르면 다른 메소드로 취급함 = 오버로딩
        public int power(int x, int c)
        {
            //Math.Pow 는 double 타입.
            //return (int)Math.Pow(x, c);
            int result = 1;
            for (int i = 0; i < c; i++)
                result *= x;
            return result;
        }

    }
}
