using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08_02
{
    public class Blitzcrank : LoLCharacter
    {
        public override void Wkey()
        {
            Console.WriteLine("폭주(overdrive) 크아아아앙~~~~~~~~~");
        }

        public override void Qkey()
        {
            Console.WriteLine("로켓 손(Rocket Grab)~~~~~~~~~~~~~~");
        }

        public override void Ekey()
        {
            Console.WriteLine("강철 주먹(Power Fist)~~~~~~~~~~~~~~~~");
        }

        public override void Rkey()
        {
            Console.WriteLine("정전기장(Static Field)~~~~~~~~~`");
        }

        public override void sayHello()
        {
            Console.WriteLine("인간시대의 끝이 도래했다~~~~~~~~~~~~~~~~~~");
        }

        public new void Attack()
        {
            Console.WriteLine("빅토르 아빠 고마웡 ~~~~~~~~~~~~~~~~~");
        }
    }
}
