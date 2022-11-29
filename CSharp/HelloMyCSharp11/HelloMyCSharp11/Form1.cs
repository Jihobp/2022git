using System.Windows.Forms;

namespace HelloMyCSharp11
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            chart1.Series[0].Name = "에펙티어";
            chart1.Series[0].Points.AddXY(1, 2);
            chart1.Series[0].Points.AddXY(2, 3);
            chart1.Series[0].Points.AddXY(3, 4);

            //두번째 차트
            chart2.Series[0].Points.AddXY(0.0, 10);
            chart2.Series[0].Points.Add(new double[] { 2.0 });
            chart2.Series[0].Name = "level";
            chart2.Series.Add("data");
            chart2.Series[0].Points.Add(new double[] { 5.0 });
            chart2.Series[1].Points.Add(new double[] { 20.0 });
            chart2.Series[1].Points.Add(new double[] { 50.0 });
            //chart2.Series[1].Points[0].Name = "test2";

            //세번째 차트
            chart3.ChartAreas[0].AxisX.LabelStyle.Interval = 1;
            for (int i = 1; i < 20; i++)
            {
                //Series[0], Series[1] 말고
                //Series["축이름"]을 넣을 수도 있다.
                chart3.Series["Series1"].Points.AddXY(i, i + 10);
            }
        }
    }
}
