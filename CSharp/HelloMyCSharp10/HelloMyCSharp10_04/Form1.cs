using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;

namespace HelloMyCSharp10_04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            //using System.Xml.Linq;
            XElement x = XElement.Load(url);
            Console.WriteLine(x);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            //using System.Xml.Linq;
            XElement x = XElement.Load(url);
            //태그가 data 인 것들만 가져옵니다.
            //Descendants = 자손들
            var xq = from item in x.Descendants("data") select item;
            foreach(var item in xq) 
            {
                Console.WriteLine(item.Element("hour").Value);
                Console.WriteLine(item.Element("wfKor").Value);
                Console.WriteLine(item.Element("wfEn").Value);
                Console.WriteLine(item.Element("temp").Value);
            }
            //Console.WriteLine(x);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            //using System.Xml.Linq;
            XElement x = XElement.Load(url);
            //태그가 data 인 것들만 가져옵니다.
            //Descendants = 자손들
            var xq = from item in x.Descendants("data") select 
                     new
                     {
                         hour = item.Element("hour").Value,
                         wf = item.Element("wfKor").Value,
                         temp = item.Element("temp").Value
                     };
            foreach (var item in xq)
            {
                Console.WriteLine(item.hour);
                Console.WriteLine(item.wf);
                Console.WriteLine(item.temp);
             
            }
            //Console.WriteLine(x);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            //using System.Xml.Linq;
            XElement x = XElement.Load(url);
            //태그가 data인 것들만 가져옵니다.
            //Descendants = 자손들

            //링큐의 약점
            //저기서 hour, wf, temp 중 하나라도 잘못되면
            //이 덩어리 자체를 한 줄로 보고, 오류가 났다고 함
            //즉 정확히 어딘지 찾기가 매우 어렵다.
            var xq = from item in x.Descendants("data")
                     select
                     new Weather() //익명 객체 대신에 객체 정해줌. 
                     {
                         hour = int.Parse(item.Element("hour").Value),
                         wf = item.Element("wfKor").Value.ToString(),
                         temp = double.Parse(item.Element("temp").Value)
                     };

            //List 형태로 변환하는 법. 
            List<Weather> w = xq.ToList<Weather>();
            foreach (var item in xq)
            {
                Console.WriteLine(item.hour);
                Console.WriteLine(item.wf);
                Console.WriteLine(item.temp);

            }
            //Console.WriteLine(x);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            XElement x = XElement.Load(url);
         
            var xq = from item in x.Descendants("data") //
                     select
                     new Weather() //익명 객체 대신에 객체 정해줌. 
                     {
                         hour = int.Parse(item.Element("hour").Value),
                         wf = item.Element("wfKor").Value.ToString(),
                         temp = double.Parse(item.Element("temp").Value)
                     };
            List<Weather> w = new List<Weather>(xq);
            //List<Weather> w=xq.ToList<Weather>(); //ToList 로 받는 방법도 있다!!
            weatherBindingSource.DataSource = null;
            weatherBindingSource.DataSource = w;
        }

        //DataGridView에 기상청 데이터 뿌려보기
        /*    D:\shareFolder\djCharp\HelloMyCSharp10\기상청18_동네예보 조회서비스_오픈API활용가이드
            엑셀 파일 참조해서 지역코드 바꾸고 싶으면 바꿔도 됨
            혹은 다른 거 긁어와도 됨
            꼭 이거 아니어도 됨
         */


    }
}
