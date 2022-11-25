using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_01
{
    public class MyParent
    {
        public static int money { get; set; } //가정의 재산
        public static void openDoor() //가정의 도어락
        {
            Console.WriteLine("문을 여시오!");
        } 
        
        public string name { get; set; }
        public int age { get; set; }

        public void eat()
        {
            Console.WriteLine("냠냠 먹습니댜요"+name);
        }
        public void sleep()
        {
            Console.WriteLine(age + "쿨쿨 잡니댜요");
        }
    }
}
