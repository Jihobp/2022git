//10. 다음 규칙을 갖는 함수를 작성하시오.
// //F(n) = F(n-1) - F(n-2)? ????????????????????????????????
// //Note that F(n) = F(n - 1) - F(n - 2) is the same as F(n) - F(n - 1) + F(n - 2) = 0 
// which makes it a linear difference equation. 
//n == 0 = > 0
//n == 1 = > 1
//n > 1 = > f(n - 1) + f(n - 2)
//숫자 패턴
//1, 1, 2, 3, 5, 8, 13   21
//n = 1 n = 2  n = 3   n = 4  n = 5   n = 6   n = 7  n = 8
//f(n)=f(n-1)+f(n-2) like tree

//https://www.geeksforgeeks.org/c-program-for-fibonacci-numbers/ 긱스 영상 


//재귀함수 recursion.ver
int fibonacci(int n)
{
	if (n <= 1)
		return n;
	return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int n = 8;
	printf("%d", fibonacci(n));
	return 0; 
}

//Dynamic Programming.ver https://hongjw1938.tistory.com/47  다이나믹 프로그래밍 피보나치 함수 설명
//큰 문제를 한 번에 해결하기 힘들 때 작은 여러 개의 문제로 나누어서 푸는 기법.
//작은 문제들을 풀다보면 같은 문제들을 반복해서 푸는 경우가 생깁니다. 
//그 문제들을 매번 재계산하지 않고 값을 저장해두었다가 재사용하는 기법이 동적 프로그래밍입니다.

int fib(int nn)
{
	int f[nn + 1];
	int i;

	f[0] = 0; //initializing 
	f[1] = 1;

	for (i = 2; i < nn; i++)
	{
		f[i] = f[i - 1] + f[i - 2]; //initializing every element of previous 2 element as a sum
	}
	return f[nn - 1]; //=nth fibonacci number
}

int main()
{
	int n = 9; //output=21
	printf("%d", fib(nn));
	return 0; //getchar(); ?????????????????
}



/*
//Fibonacci Series using Recursion
#include<stdio.h>
int fib(int n)
{
	if (n <= 1)
		return n;
	return fib(n - 1) + fib(n - 2);
}

int main()
{
	int n = 9;
	printf("%d", fib(n));
	getchar();
	return 0;
}
*/