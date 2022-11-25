#include<stdio.h>
//8. 1부터 n까지의 값을 곱하는 함수=factorial를 작성하시오(반복문)
int factorialfor()
{
	int i, N;
	int mul = 1;
	printf("\n1부터 N까지의 곱을 구하시오.");
	scanf_s("%d", &N);
	for (i = 1; i <= N; i++)
	{
		mul *= i;
	}
	printf("\n1부터 %d까지의 곱은 %d\n", N, mul);
	return 0;
}



//9. 1부터 n까지의 값을 곱하는 함수를 작성하시오(재귀함수=recursive function)
int factorial(int num)
{
	if (num == 1)
		return 1;
	return num * factorial(num - 1);
}

int main()
{
	printf("%d", factorial(5));
	return 0;
}


//10. 다음 규칙을 갖는 함수를 작성하시오.
//n == 0 = > 0
//n == 1 = > 1
//n > 1 = > f(n - 1) + f(n - 2)
//숫자 패턴
//1, 1, 2, 3, 5, 8, 13   21
//n = 1 n = 2  n = 3   n = 4  n = 5   n = 6   n = 7  n = 8

//f(n)=f(n-1)+f(n-2) like tree



//재귀함수 recursion.ver
int fibonacci(int n)
{
	if (n <= 1)
		return n;
	return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int n;
	printf("몇번째 수열?");
	scanf_s("%d", &n);
	fibonacci(n);
	printf("%d", fibonacci(n));

	return 0; 
}