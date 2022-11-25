#include<stdio.h>
int main()
{   //1. 나이를 입력한다. 그리고 20살 미만이면 아이, 20살 이상이면 성인이라고 출력한다.
	int age;
	printf("몇 살이에요?");
	scanf_s("%d", &age);

	age < 20 ? printf("아이\n") : printf("성인");

	//Q. 음수에 대한 추가 경우의 수를 적고 싶다면 어떻게 해야할까요? 
	//삼항연산자를 중첩을 시킨다.
	age < 20 ?
		age < 0 ? printf("음수") : printf("아이") : printf("성인"); 
	//age < 20 ? (age < 0 ? printf("음수") : printf("아이")) : printf("성인"); 
	//가로로 묶어도 되고 안묶어도 됨...?


	//2. 1번에 대해서 0 미만의 숫자인 경우는 잘못된 것이라는 메시지 예외처리 추가한다.
	printf("\n숫자를 입력해주세요.");
	int number;
	scanf_s("%d", &number);

	number > 0 ? printf("\n양수\n") : (number == 0 ? printf("\n0\n") : printf("\n음수\n")); 
	//나머지 음수는 굳이 입력할 필요 x
	//음수는 양수도 아니고 0도 아닌것.
	
	//3. 숫자를 입력한다. 양수, 0, 음수 중 하나를 출력한다.
	
	//hint) 삼항연산자는 중첩이 된다. (괄호로 묶기 등을 이용해서 시도해보기.)
	return 0;
}