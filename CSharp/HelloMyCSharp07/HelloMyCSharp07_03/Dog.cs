using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_03
{
    public class Dog : Animal
    {
        public override void eat()
        {
            //throw new NotImplementedException();
            System.Windows.Forms.MessageBox.Show("댕댕이같이 먹는당.냠뇽댕~~~~~~~춉챱춉챱챱");
        }
    }
}
