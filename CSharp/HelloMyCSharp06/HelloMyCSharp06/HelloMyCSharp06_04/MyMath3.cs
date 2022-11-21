using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp06_04
{
    public class MyMath3
    {
        //static 이 붙은 것
        //클래스 변수, 클래스 메소드.
        //클래스 변수와 마찬가지로 공통된 기능.,
        //클래스명. 메소드명()호출함.
        //인스턴스
        
        //pwer(10) = > 100
        //
        //뒷부분에 있는 매개변수(=파라메터)는 생략이 가능하다.
        //필수 매개변수, 선택적 매개변수(반드시 뒤에 와야함.) 

        //제곱
        public static int power(int x, int c=2)
        {
            int result = 1;
            for (int i = 0; i < c; i++)
                result *= x;
            return result;
        }

        //두 숫자곱
        public static int multi(int x, int y)
        {
            return x* y;
        }

        //거듭제곱
        //위에 적혀 있는 power랑 이름이 똑같음.
        //매개변수의 개수가 다랄서 다른 메소드로 취급.
        //이렇게 매개변수(=파라메터)의 개수나
        //타입이 다르면 다른 메소드로 취급함 = 오버로딩
        //public static int power(int x, int c)
        //{
        //    //Math.Pow 는 double 타입.
        //    //return (int)Math.Pow(x, c);
        //    int result = 1;
        //    for (int i = 0; i < c; i++)
        //        result *= x;
        //    return result;
        //}

    }
}
