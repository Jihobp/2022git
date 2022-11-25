#include<stdio.h>
int main()
{
	int age = 28;
	//1. scanf_s("%d\n", &age); 하지 말기
	//(\n 붙이는거 아니다!!!!!!!!! )
	//2. 값을 입력받고 있는게 있다면 그걸 끄고 다시 실행하기.
	//3. (참고사항_ 프로그램 켜자마자 아무것도 안뜨는데.. 
	//값을 입력해야 그 다음 단계로 넘어감.
	scanf_s("%d", &age);
	printf("내 나이 : %d\n", age);

	//3번 태어난 연도 계산
	printf("나는 %d년생입니다.\n", 2022 + 1 - age);

	//4번 원의 넓이와 둘레
	int r;
	printf("반 지름 입력해요\n");
	scanf_s("%d", &r);
	printf("원의 넓이 : %f\n", r * r * 3.14);
	printf("원의 둘레 : %f\n", 2 * r * 3.14);

	//4-1 방법 두번째
	double area = 2 * r * 3.14;
	printf("원의 둘레 : %f\n", area);

	//5번 byte를 입력받고 그에 해당하는 bit 찾기
	printf("몇 byte?\n");
	int byte;
	scanf_s("%d", &byte);
	printf("%d byte = %d bit\n", byte, byte * 8);

	//6번 bit를 입력받고 그에 해당하는 byte 찾기
	int bit;
	printf("몇 bit?\n");
	scanf_s("%d", &bit);
	printf("%d bit = %d byte\n", bit, bit / 8);

	//7번 byte=8  bit=byte*8/xxxx-> int mybit = byte; int mybyte = mybit * 8;
	int mybyte = byte;
	int mybit = byte * 8;

	printf("%d byte*8 = %d bit\n",
		mybyte, mybit);

	
	return 0; //return 0; 0라는 결과를 주는것.
	//alt 키누르고 +++ 화살표 누르면 코드 이동가능~~~~!!!!!!!!!!!
}

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