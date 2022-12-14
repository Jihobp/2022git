using System.Net;
namespace CSharp_teamProject
{
    public class KakaoAPI
    {
        public static Locale SearchClick(string text)
        {
            Locale hotel = new Locale();
            string site = "https://dapi.kakao.com/v2/local/search/keyword.json";
            string query = $"{site}?query={text}";
            string restApiKey = "b6cdd3240cfda6158e35e52008661839";
            string Header = $"KakaoAK {restApiKey}";

            WebRequest request = WebRequest.Create(query);
            request.Headers.Add("Authorization", Header);

            return hotel;
        }
    }
}