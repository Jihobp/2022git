//10. 다음 규칙을 갖는 함수를 작성하시오.
// //F(n) = F(n-1) - F(n-2)?????????????????????????????????
// //Note that F(n) = F(n - 1) - F(n - 2) is the same as F(n) - F(n - 1) + F(n - 2) = 0 
// which makes it a linear difference equation. 
//n == 0 = > 0
//n == 1 = > 1
//n > 1 = > f(n - 1) + f(n - 2)
//숫자 패턴
//1, 1, 2, 3, 5, 8, 13   21
//n = 1 n = 2  n = 3   n = 4  n = 5   n = 6   n = 7  n = 8
//f(n)=f(n-1)+f(n-2) like tree


//재귀함수 recursion.ver
#include<stdio.h>
int fibonacci(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1; //n이 일보다 작거나 같으면 1을 저장해서 값을 구해줄랭??? 알겠지???
	return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int n;
	scanf_s("%d", &n);
	printf("%d", fibonacci(n));
	return 0; 
}


//호출 = 함수, 
//나를 부르는 함수를 재귀함수.