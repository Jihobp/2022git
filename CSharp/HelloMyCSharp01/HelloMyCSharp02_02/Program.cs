using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp02_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BKBank b1= new BKBank();
            b1.Name = "박재형";
            b1.Balance = 1000000;
            BKBank b2 = b1; //b1의 Name, Balance를 복사
            b2.Balance = 0; //b2의 Balance값만 바꿈
            //두명의 박재형이 서로 잔액이 다르다.
            b1.info();
            b2.info();

            KBBank kb1 = new KBBank();
            kb1.Name = "박지호";
            kb1.Balance = 50000000;
            KBBank kb2 = kb1;
            kb2.Balance= 0;

            //둘 다 - 이다.. 내 오천만원..아..
            kb1.info();
            kb2.info();

        }
    }
}
