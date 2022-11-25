#include<stdio.h>
int main()
{
	//int, double, char
	//정수
	int age = 28; //제일 많이 씀
	long bigValue = 9999999999;
	//long long  :  8바이트 와~~~~~~~~
	short smallValue = 5;
	//실수
	double pi_value = 3.1415;//8byte 실수 = 많이씀
	float myPi = 3.14; //4byte 실수

	char MyInitial = 'P';
	//age값과 nowYear 값에 따라 출력 값이 바뀜.
	int nowYear = 2022;
	printf("내가 태어난 연도는 %d입니다.\n",
		nowYear + 1 - age);
	printf("원주율 값은 %f입니다.\n", pi_value);

	//c오버플로우overflow : 값을 초과하면 돈다.??

	//변수를 통해서 값을 입력받아보자.
	//내가 입력한 숫자의 제곱값을 구해보자.

	int input;
	printf("숫자 입력해주세요.");
	scanf_s("%d", &input);
	printf("그 숫자의 제곱은 %d입니다.\n", input * input);
	int result = input * input;
	printf("답 : %d\n", result);

	//1. int age 라는 변수를 선언 후 이 변수에 나의 나이를 입력한다. 
	//2. 내 나이는 age살입니다. 출력
	//3. age 변수를 이용해서 내가 태어난 연도를 확인해보기.(한국식 나이 기준)
	//4.. 원의 반지름 r 값을 입력받고, 원의 넓이와 원의 둘레값 출력하기
	//원의 넓이: r*r*3.14
	//원의 둘레: 2*r*3.14
	//5. byte를 입력받고 긔에 해당하는 bit값 출력하기
	//입력 : 1 입력 :5
	//출력 : 8 출력 : 40
	//6. bit값을 입력받고 그에 해당하는 byte값 출력하기
	//입력 : 8 출력 : 1
	//입력 : 40 출력 : 5
	//7. 5,6번에서 입력받은 걸 가지고 출력하기.
	//mybit * 8 = mybyte 값입니다.
	


	return 0;
}