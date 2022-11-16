using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp03_03_youtube_Hamburger
{
    /*HelloMyCSharp02_04_GUI02.csproj 누르면실행
    https://youtu.be/nLfzH4xOVqo 3:17
    https://youtu.be/N5oZnV3cA64 <할꺼
    41, 39, 40 블랙
    182, 172, 0 노란색
    179, 8, 55 레드
     */

    internal static class Program
    {
        /// <summary>
        /// 해당 애플리케이션의 주 진입점입니다.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
