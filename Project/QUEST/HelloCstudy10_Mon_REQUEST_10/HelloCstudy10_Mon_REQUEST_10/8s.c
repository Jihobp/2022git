//8. 1���� n������ ���� ���ϴ� �Լ�=factorial�� �ۼ��Ͻÿ�(�ݺ���)
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
	printf("1���� N������ ���� ���Ͻÿ�.");
	scanf_s("%d", &m);
	printf("\n1���� %d������ ���� %d\n", m,factorialfor(m));
}
