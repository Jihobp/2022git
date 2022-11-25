using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08_01
{   //indexer  설명 
    //클래스를 배열처럼 쓰게 하고 싶은거.
    //참고 https://afsdzvcx123.tistory.com/entry/C-%EB%AC%B8%EB%B2%95-C-%EC%9D%B8%EB%8D%B1%EC%84%9CIndexer-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95 
    //Class1 a1 = new Class1();
    //a1[50] =5;  라면 값은??????????????????????
    public class Class1 
    {
        public int age { get; set; }
        public int this[int i]
        {
            get { return i * i; } 
            set { age = i * value; Console.WriteLine(i + "" + value); } //50*5
        }
    }
}
