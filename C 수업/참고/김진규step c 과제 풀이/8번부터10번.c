#include<stdio.h>
//8. 1부터 n까지의 값을 곱하는 함수를 작성하시오(반복문)
int q8(int n)
{
	int total = 1;
	for (int i = 1; i <= n; i++)
		total *= i;
	return total;
}
//9. 1부터 n까지의 값을 곱하는 함수를 작성하시오(재귀함수)
int q9(int n)
{
	if (n <= 1)
		return 1;
	return n * q9(n - 1);
}
/*
* 10. 다음 규칙을 갖는 함수를 작성하시오.
n == 0 => 0
n == 1 => 1
n >1   => f(n-1) + f(n-2)
숫자 패턴
1,   1,   2,   3,     5,   8,   13   21
n=1 n=2  n=3   n=4  n=5   n=6   n=7  n=8
*/
int q10(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	return q10(n - 1) + q10(n - 2);

}
int main()
{
	printf("8번\n");
	int num;
	scanf_s("%d", &num);
	printf("%d", q8(num));
	printf("\n9번\n");
	printf("%d", q9(num));
	printf("\n10번\n");
	printf("%d", q10(num));
	return 0;
}