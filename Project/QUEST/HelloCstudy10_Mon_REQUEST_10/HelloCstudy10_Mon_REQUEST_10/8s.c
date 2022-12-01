//8. 1부터 n까지의 값을 곱하는 함수=factorial를 작성하시오(반복문)
#include<stdio.h>
int factorialfor(int N)
{
	int mul = 1;
	for (int i = 1; i <= N; i++)
	{
		mul *= i;
	}
	return mul;
}


int main()
{
	int m;
	printf("1부터 N까지의 곱을 구하시오.");
	scanf_s("%d", &m);
	printf("\n1부터 %d까지의 곱은 %d\n", m,factorialfor(m));
}
