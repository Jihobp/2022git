namespace CSharp_teamProject.Map
{
    public class Locale
    {
        public string Name { get; set; }
        public double Lat { get; set; }
        public double Lng { get; set; }


        //오버로딩
        public Locale(string name, double lat, double lng)
        {
            this.Name = name;
            Lat = lat;
            Lng = lng;
        }

        public override string ToString() //=> Name;
        {
            return Name; //String으로 변환시 이름만 리턴. 
        }
    }
}
