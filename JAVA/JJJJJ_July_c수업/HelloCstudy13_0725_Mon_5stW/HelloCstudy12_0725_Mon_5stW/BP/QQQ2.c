#include<stdio.h>
//1. no_changeValue가 아무 효과가 없는 것을 확인해보세요.
//---------------- -

//2. 변수 a = 3, b = 5일 때
//2개의 값을 바꾸는 함수를 작성한다.
//main에서 바뀌기 전과 후의 값을 출력한다.
int main()
{
	int* a = 3;
	int* b = 5;

	int* temp = *a;
	*a = *b;
	*b = *temp;
	printf("%d %d", *a, *b);
	return 0;
}


//3. 2번에서 작성한 함수를 사용하되,
//a와 b 값을 scanf로 입력받고 나서
//main에서
//바뀌기 전과 후의 값을 출력한다.
//-------------------------------------------- -
//
//4. 1, 2번 코드들을 이용해서 아래와 같이 동작하게끔 코드를 짠다.
//int a = inputNum();
//int b = inputNum();
//printNum(a);
//printNum(b);
//swap(&a, &b);
//printNum(a);
//printNum(b);

