using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numb = {1,2,3,4,5}; //자세히 
            int[] numbb = new int[5]; //5개 배열 선언


            int[] numbers = { 1, 2, 3 };
            int[] numbers2 = new int[3];    //배열의 칸을 정해준 다음에 안에 숫자를 넣어준다. //변수로 배열의 크기를 잡는게 가능.(new라는 키워드 자체가 메모리를 할당해주는거라 가능.c의 멜록이랑 빗슼 ㅋㅋ)
            numbers2[0] = 1;
            numbers2[1] = 2;
            numbers2[2] = 3;

            //2차원 배열
            //2행 3열. 2줄 3칸 총 6칸.
            //이런 모양이다. ▼
            //ㅁㅁㅁ
            //ㅁㅁㅁ
            int[,] numbers_2 = new int[2, 3]; //yt. 💘해 당 배열의 공간의 개수만큼 실행해랑! \
                                              //배열이 들어가게끔 하는 공간의수 = 2x3 =6 공간의 수
            numbers_2[0,0] = 1;
            numbers_2[0,1] = 2;
            numbers_2[0,2] = 3;
            numbers_2[1,0] = 4;
            numbers_2[1,1] = 5;
            numbers_2[1,2] = 6;

            //for문이랑 while문으로도 되고
            //foreach 문이라는 것도 됨. 
            for (int i = 0; i < numbers.Length; i++)
                Console.WriteLine(numbers[i]);

            //자바의 for(int a : numbers) 똑같음

            //var는 in뒤에 있는것의 타입에 따라서 타입 결정됨.
            //여기선 numbers가 int 배열이므로 var는 int가 됨.
            //자바스크립트의 var랑은 다름. 
            //자바스크립트의 var는 타입이 유동적이다. 
            //c#은 한번 정해지면 안 바뀜.
            var a = 10; //한번 int로 정해지면
                //a ="10"; //다른 타입으로 변경 안됨.
                dynamic b = 10; //dynamic은 var 랑 다르게 자료형을 바꿀 수 있다. 그차이!
                b = "10"; //js의 var나 let 같은 것.
                b = '1';

                //foreach는 배열이나 ArrayList의 길이만큼 반복문 돈다.
                //item 은 그 배열 안에 있는 값.
                //장점 : 반복문을 쉽게 돌린다. (배열안에 있는 값만 쓰고 싶을떈)
                //단점 : 인덱스가 필요할 땐 쓸 필요 없음. 
                foreach (var item in numbers)
                {
                    Console.WriteLine(item);
                }

                //2차원 배열 반복문
                //numbers_2.GetLength(0) : 2
                //numbers_2.GetLength(1) : 3

                //GetLength() :::  해당 번째의 배열. 
                for (int i = 0; i < numbers_2.GetLength(0); i++) //yt. 해당 배열 번째의 공간의 수. 즉 getlength(0)=2!!!!
                {
                    for (int j = 0; j < numbers_2.GetLength(1); j++) //1번째 차원의 길이만큼 돌린다
                        Console.WriteLine($"[{i},{j}]={numbers_2[i, j]}");
                }
        }
    }
}

