namespace useLocalMap
{   //위치정보 적을거임. < 위치이름, 그 위치의 좌표들 > 
    public class Locale
    {
        public string name { get; set; }
        public double Lat { get; set; } //Y
        public double Lng { get; set; } //X

        public Locale(string name, double lat, double lng) //이 정보를 이용해서 setCenter 호출할거. 
        {
            this.name = name;
            Lat = lat;
            Lng = lng;
        }

        //overridng = 덮어쓰기. 
        public override string ToString()
        {
            return name; //String으로 변환시 이름만 리턴. 
        }
    }
}
