#include<stdio.h>
int main()
{
//1. int age 라는 변수를 선언 후 이 변수에 나의 나이를 입력한다. 
int age = 28;

//2. 내 나이는 age살입니다. 출력
printf("내 나이는 %d살입니다.",age);

//3. age 변수를 이용해서 내가 태어난 연도를 확인해보기.(한국식 나이 기준)
int nowYear = 2022;
printf("내가 태어난 년도는 %d입니다.\n",
	nowYear + 1 - age);
;
//4.. 원의 반지름 r 값을 입력받고, 원의 넓이와 원의 둘레값 출력하기
//원의 넓이: r*r*3.14
//원의 둘레: 2*r*3.14
double pi_value=3.1415;
printf("원주율값은 %f입니다.\n", pi_value);

//5. byte를 입력받고 긔에 해당하는 bit값 출력하기
//입력 : 1 입력 :5
//출력 : 8 출력 : 40
int input;
double byte = 1; input = 5;
printf("bit=%d, byte =8");
printf("bit=%d, byte =40");


//6. bit값을 입력받고 그에 해당하는 byte값 출력하기
//입력 : 8 출력 : 1
//입력 : 40 출력 : 5
float bit;
printf("byte=%d, bit 8");
printf("byte=%d, bit 40");

//7. 5,6번에서 입력받은 걸 가지고 출력하기.
//mybit * 8 = mybyte 값입니다.

return 0;
}