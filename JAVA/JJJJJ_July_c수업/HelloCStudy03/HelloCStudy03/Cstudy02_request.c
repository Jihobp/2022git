#include<stdio.h>
int main()
{

	//1. 나이를 입력한다. 그리고 20살 미만이면 아이, 20살 이상이면 성인이라고 출력한다.
	int num;
	char age;
	age = 20 < num  & num <= 20 ? printf("아이") : printf("성인");


	//2. 1번에 대해서 0 미만의 숫자인 경우는 잘못된 것이라는 메시지 예외처리 추가한다.
	scanf_s("%d\n", num < 0); 
	printf("0 미만의 숫자는 잘못된 것입니다.");


	//3. 숫자를 입력한다. 양수, 0, 음수 중 하나를 출력한다.
	printf("숫자 num 값을 입력해라.");
	scanf_s("%d", &num);
	printf("%d\n", num > 0);

	//hint) 삼항연산자는 중첩이 된다. (괄호로 묶기 등을 이용해서 시도해보기.)



	return 0;
}