namespace CSharp_teamProject
{
    public class Locale
    {
        public string name { get; set; }
        public double Lat { get; set; } // Y 좌표
        public double Lng { get; set; } // X 좌표

        public Locale()
        {
        }
        public Locale(string name, double lat, double lng)
        {
            this.name = name;
            Lat = lat;
            Lng = lng;
        }

        public override string ToString()
        {
            return name;
        }
    }
}