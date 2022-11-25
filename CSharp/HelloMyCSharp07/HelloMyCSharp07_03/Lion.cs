using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_03
{
    public class Lion : Animal
    {
        public override void eat()
        {
            System.Windows.Forms.MessageBox.Show($"{name}은/는 사자같이 울부짖으며 냠뇽냥ㅁ꺼억~~ 먹는당");
            //throw new NotImplementedException();
        }
    }
}
