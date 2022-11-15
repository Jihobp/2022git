#include<stdio.h>
//8. 1���� n������ ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�(�ݺ���)
int q8(int n)
{
	int total = 1;
	for (int i = 1; i <= n; i++)
		total *= i;
	return total;
}
//9. 1���� n������ ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�(����Լ�)
int q9(int n)
{
	if (n <= 1)
		return 1;
	return n * q9(n - 1);
}
/*
* 10. ���� ��Ģ�� ���� �Լ��� �ۼ��Ͻÿ�.
n == 0 => 0
n == 1 => 1
n >1   => f(n-1) + f(n-2)
���� ����
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
	printf("8��\n");
	int num;
	scanf_s("%d", &num);
	printf("%d", q8(num));
	printf("\n9��\n");
	printf("%d", q9(num));
	printf("\n10��\n");
	printf("%d", q10(num));
	return 0;
}