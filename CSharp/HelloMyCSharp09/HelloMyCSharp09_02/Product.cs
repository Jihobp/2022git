using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp09_02
{
    public class Product //의 속성을 가지고 만든 표. ProductBindingSource에다가 Product 타입의 값들을 여러개 넣을 수 있땅 'ㅅ'
    {
        public int Id; //DataGridView 에서 나타나지 않음.
        public string Name { get; set; }
        public int Price { get; set; }  

    }
}
