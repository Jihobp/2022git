using Newtonsoft.Json.Linq;
using System;
using System.Net;
using System.Text;
using System.Windows.Forms;

namespace CSharp_teamProject
{
    public partial class Weather : Form
    {
        public string api_key = "c02b275b3821812edd753f1fe03f1d18";

        public string name;
        public double lat;
        public double lon;
        public double lat2;
        public double lon2;

        public Weather()
        {
            InitializeComponent();
            this.KeyPreview = true;
        }

        public void findlocation(string words)
        {
            using (WebClient wc = new WebClient())
            {
                string locationuri = $"http://api.openweathermap.org/geo/1.0/direct?q={words}&limit=5&appid=";
                wc.Encoding = Encoding.UTF8; // 인코딩변경
                var json = wc.DownloadString(locationuri + api_key);
                var jArray = JArray.Parse(json);

                weather_textBox1.Text = jArray[0]["lat"].ToString();
                weather_textBox2.Text = jArray[0]["lon"].ToString();
                name = jArray[0]["name"].ToString();
            }
        }

        private void weather_button1_Click(object sender, EventArgs e)
        {
            if (weather_textBox1.Text == "" || weather_textBox2.Text == "")
                MessageBox.Show("위도, 경도를 적어주세요");
            else
            {
                using (WebClient wc = new WebClient())
                {
                    double.TryParse(weather_textBox1.Text, out lat2);
                    double.TryParse(weather_textBox2.Text, out lon2);
                    string weatheruri = $"https://api.openweathermap.org/data/2.5/weather?lat={lat2}&lon={lon2}&appid=";
                    var json = wc.DownloadString(weatheruri + api_key);
                    var jArray = JObject.Parse(json);

                    string o = jArray["main"]["temp"].ToString();
                    //200~
                    double apitemp;
                    double diftemp = 273.15;
                    double.TryParse(o, out apitemp);
                    double dtemp = apitemp - diftemp;
                    string temp = Math.Floor(dtemp).ToString();
                    string Sweather = "";

                    if (jArray["weather"][0]["main"].ToString() == ("Thunderstorm"))
                        Sweather = "번개";
                    else if (jArray["weather"][0]["main"].ToString() == ("Drizzle"))
                        Sweather = "이슬비";
                    else if (jArray["weather"][0]["main"].ToString() == ("Rain"))
                        Sweather = "비";
                    else if (jArray["weather"][0]["main"].ToString() == ("Snow"))
                        Sweather = "눈";
                    else if (jArray["weather"][0]["main"].ToString() == ("Clear"))
                        Sweather = "맑음";
                    else if (jArray["weather"][0]["main"].ToString() == ("Clouds"))
                        Sweather = "흐림";

                    weather_richTextBox1.Text = $"{name}의 정보\r\n" + $"위도{lat2}, 경도{lon2}\r\n" + "날씨 : " + Sweather + "\r\n" + "온도 : " + temp + "\r\n" + "\r\n";
                }
            }
        }

        private void weather_button2_Click(object sender, EventArgs e)
        {
            if (weather_textBox1.Text == "" || weather_textBox2.Text == "")
                MessageBox.Show("위도, 경도를 적어주세요");
            else
            {
                // api는 있으나 시간마다 있어서 데이터 가공이 필요함..
                // json 줄이 길때 크롬 json viewer 편함
                double.TryParse(weather_textBox1.Text, out lat2);
                double.TryParse(weather_textBox2.Text, out lon2);

                string myuri = $"https://api.openweathermap.org/data/2.5/forecast?lat={lat2}&lon={lon2}&appid=c02b275b3821812edd753f1fe03f1d18";
                using (WebClient wc = new WebClient())
                {
                    var json = wc.DownloadString(myuri);
                    var jArray = JObject.Parse(json);
                    var jArray2 = JArray.Parse(jArray["list"].ToString());

                    // 현재 날짜와 시간을 가져온다 데이터가 3시간마다있으니깐..주간은
                    // 12시기준으로 1개만 가져오자
                    // 현재 날짜

                    DateTime nowDate = DateTime.Now;

                    string Year = nowDate.Year.ToString();
                    string Month = nowDate.Month.ToString();
                    string Day = nowDate.Day.ToString();
                    string newYear = Year;
                    string newMonth = Month;
                    int nowHour = nowDate.Hour;
                    string nowDateTime = "";

                    // " 12:00:00"; 
                    // 현재시간에서  03 06 09 12 15 18 21 00 시에서 가까운걸 선택해야할것같음.
                    // if문이 너무 많이 사용된다 ㅠ
                    if (nowHour >= 01 && nowHour < 03)
                        nowDateTime = " 00:00:00";
                    else if (nowHour > 02 && nowHour < 06)
                        nowDateTime = " 03:00:00";
                    else if (nowHour > 05 && nowHour < 09)
                        nowDateTime = " 06:00:00";
                    else if (nowHour > 08 && nowHour < 12)
                        nowDateTime = " 09:00:00";
                    else if (nowHour > 11 && nowHour < 15)
                        nowDateTime = " 12:00:00";
                    else if (nowHour > 14 && nowHour < 18)
                        nowDateTime = " 15:00:00";
                    else if (nowHour > 17 && nowHour < 21)
                        nowDateTime = " 18:00:00";
                    else if (nowHour > 20 && nowHour <= 24)
                        nowDateTime = " 21:00:00";
                    // 현재날짜 1자리수면 0붙여서 가져오는거 까지 했음.
                    // 그리고 1씩증가하면서 날짜가 제대로 나오는지 확인해야함

                    string date = Year + "-" + Month + "-" + Day + "" + nowDateTime;
                    weather_richTextBox1.Text = jArray["city"]["name"].ToString() + "의 날씨 " + nowDateTime + "기준" + "\r\n" + "\r\n";
                    int dateIndex = 0; // 인덱스 만들기

                    foreach (var item in jArray2)
                        dateIndex++;
                    // 0~40 모든데이터를 하나씩 접근한다
                    // 현재날짜 ex / 5일에 12시를 하나 찾는다.
                    // 찾았다면 6일 
                    // 찾았다면 7일 
                    // ~~10일

                    int lastDay = DateTime.DaysInMonth(DateTime.Now.Year, DateTime.Now.Month); // 오늘 달의 마지막날이 몇일인지

                    for (int i = 0; i < dateIndex; i++)
                    {
                        // 주의할점은 year, month 가 바뀔수 있음.

                        if (int.Parse(Day) > lastDay)
                        {
                            Day = 1 + "";
                            newMonth = (int.Parse(Month) + 1).ToString();
                        }
                        if (int.Parse(newMonth) > 12)
                        {
                            newMonth = 1 + "";
                            newYear = (int.Parse(Year) + 1).ToString();
                        }

                        // 한자리수앞에 0붙이기
                        if (int.Parse(Day) < 10)
                            Day = string.Format("{0:D2}", int.Parse(Day));
                        if (int.Parse(newMonth) < 10)
                            newMonth = string.Format("{0:D2}", int.Parse(newMonth));
                        date = newYear + "-" + newMonth + "-" + Day + "" + nowDateTime;

                        // 만약 월이나 년도가 바뀌었으면 해당 월의 lastDay를 재정의
                        if (Year != newYear || Month != newMonth)
                        {
                            lastDay = DateTime.DaysInMonth(int.Parse(newYear), int.Parse(newMonth)); //lastday를 해당 월로 
                            Year = newYear;
                            Month = newMonth;
                        }
                        // 현재날짜 Day+1만큼 5번 반복하면서 12시기준의 날씨를 가져온다.
                        // 포문안에서 이프문에 충족할때 +1하도록 했음 

                        if (jArray2[i]["dt_txt"].ToString() == date)
                        {
                            string o = jArray2[i]["main"]["temp"].ToString();
                            // 200~
                            double apitemp;
                            double diftemp = 273.15;
                            double.TryParse(o, out apitemp);
                            double dtemp = apitemp - diftemp;
                            string temp = Math.Floor(dtemp).ToString();
                            string Sweather = "";

                            if (jArray2[i]["weather"][0]["main"].ToString() == ("Thunderstorm"))
                                Sweather = "번개";
                            else if (jArray2[i]["weather"][0]["main"].ToString() == ("Drizzle"))
                                Sweather = "이슬비";
                            else if (jArray2[i]["weather"][0]["main"].ToString() == ("Rain"))
                                Sweather = "비";
                            else if (jArray2[i]["weather"][0]["main"].ToString() == ("Snow"))
                                Sweather = "눈";
                            else if (jArray2[i]["weather"][0]["main"].ToString() == ("Clear"))
                                Sweather = "맑음";
                            else if (jArray2[i]["weather"][0]["main"].ToString() == ("Clouds"))
                                Sweather = "흐림";

                            weather_richTextBox1.Text += "날짜 : " + jArray2[i]["dt_txt"].ToString().Split(' ')[0] + "\r\n" + "날씨 : " + Sweather + "\r\n" + "온도 : " + temp + "\r\n" + "\r\n";
                            // "날짜 : " + jArray2[i]["dt_txt"].ToString() + "\r\n" + "날씨 : " + Sweather + "\r\n" + "온도 : " + temp + "\r\n" + "\r\n";
                            Day = (int.Parse(Day) + 1).ToString();
                        }
                    } // for
                } // using
            }
        }

        private void weather_button3_Click(object sender, EventArgs e)
        {
            findlocation("Seoul");
        }

        private void weather_button4_Click_1(object sender, EventArgs e)
        {
            findlocation("Incheon");
        }

        private void weather_button5_Click(object sender, EventArgs e)
        {
            findlocation("Chuncheon");
        }
        private void weather_button6_Click(object sender, EventArgs e)
        {
            findlocation("Gangneung");
        }

        private void weather_button7_Click(object sender, EventArgs e)
        {
            findlocation("Ulleungdo");
        }

        private void weather_button8_Click(object sender, EventArgs e)
        {
            findlocation("Daejeon");
        }

        private void weather_button9_Click(object sender, EventArgs e)
        {
            findlocation("Cheongju");
        }

        private void weather_button10_Click(object sender, EventArgs e)
        {
            findlocation("Daegu");
        }

        private void weather_button11_Click(object sender, EventArgs e)
        {
            findlocation("Jeonju");
        }

        private void weather_button12_Click(object sender, EventArgs e)
        {
            findlocation("Changwon");
        }

        private void weather_button13_Click(object sender, EventArgs e)
        {
            findlocation("Ulsan");
        }

        private void weather_button14_Click(object sender, EventArgs e)
        {
            findlocation("Gwangju");
        }

        private void weather_button15_Click(object sender, EventArgs e)
        {
            findlocation("Busan");
        }

        private void weather_button16_Click(object sender, EventArgs e)
        {
            findlocation("Jeju");
        }

        private void Weather_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Escape)
                this.Close();
        }
    }
}
