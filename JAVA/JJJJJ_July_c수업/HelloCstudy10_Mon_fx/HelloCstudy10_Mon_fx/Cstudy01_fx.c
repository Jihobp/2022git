#include<stdio.h>
int main()
{
	//scanf와 printf도 함수
	//scanf : 입력받는 함수, printf : 프린트하는 함수.
	//함수로 한번에 주석처리 해놓으면 일괄 수정 되므로 노가다 안해두 된당 'ㅅ'/

	int result = printf("Hello");
	printf("\n%d\n", result);
	int n, m;
	int a = scanf_s("%d", &n);
	int b = scanf_s("%d %d", &n, &m);
	result = printf("%d %d", n, m);
	printf("\nresult=%d, a=%d, b=%d\n",
		result, a, b);


	return 0;
}