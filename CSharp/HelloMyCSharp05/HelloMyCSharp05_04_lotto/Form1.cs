using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloMyCSharp05_04_lotto
{

    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //텍스트 박스 초기화
            textBox1.Text = "";
            textBox1.Text = Create_LottoNumber();
  
        }
    
        private string Create_LottoNumber()
        {
            string Temp = "";
            string Num = "";
            string Bonusnum = "";
            int[] ArrayNum = new int[7];

            for(int i = 0; i<7; i++)
            {
                Random rand  = new Random();
                //1~45
                ArrayNum[i] = rand.Next(1, 45);
                for(int j =0; j<i; j++)
                {
                    if (ArrayNum[i] == ArrayNum[j])
                    {
                        i = i - 1; //배열에서 하나 빼줌 ㅇㅅㅇ 
                    }
                }
            }
            //Temp = ArrayNum.ToString();
            Temp = String.Join(", ", ArrayNum);
            //Lotto num
            Num = Temp.Substring(0, Temp.LastIndexOf(',') - 1);
            //Bonus Num
            Bonusnum = Temp.Substring(Temp.LastIndexOf(',') + 1, 2).Trim();
            return "Lotto Number : " + Num + ", BonusNumber : " + Bonusnum;
                }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void LottoTitleLabel_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }



        /*
          Label[] LottoArray = new Label[] {label2, label3, label4, label5, label6, label7};  
                Random rand = new Random();
                for(int lottoindex=0; lottoindex<LottoArray.Length+1; lottoindex++)
                {
                    int lottoCheckIndex = lottoindex;
                    int lottoNumber = rand.Next(1,46);
                    for(; lottoindex>=0; lottoindex--)
                    {
                        if (LottoArray[lottoCheckIndex].Text == lottoNumber.ToString()){
                            lottoCheckIndex = lottoindex;
                            lottoNumber = rand.Next(1, 46);
                        }
                    }
                    LottoArray[lottoindex].Text = lottoNumber.ToString();   
         */

        /*버블 정렬 ㅇㅅㅇ 
         int temp = 0;
        for(int i = 0; i<lotto.Length; i++) // 버블 정렬 
            for(int j -1+1; j<lotto.Length-1 ; j++){ //마지막 자리 없으니 -1
        if(lotto[i]>lotto[j])
            {
                temp = lotto[i];
                lotto[i]=lotto[j];
                lotto[j]=temp;
            }
        }

         */

    }
}
