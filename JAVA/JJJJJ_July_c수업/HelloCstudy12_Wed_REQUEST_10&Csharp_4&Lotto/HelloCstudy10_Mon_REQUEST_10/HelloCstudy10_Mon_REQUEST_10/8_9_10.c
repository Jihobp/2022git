#include<stdio.h>
//8. 1���� n������ ���� ���ϴ� �Լ�=factorial�� �ۼ��Ͻÿ�(�ݺ���)
int factorialfor()
{
	int i, N;
	int mul = 1;
	printf("\n1���� N������ ���� ���Ͻÿ�.");
	scanf_s("%d", &N);
	for (i = 1; i <= N; i++)
	{
		mul *= i;
	}
	printf("\n1���� %d������ ���� %d\n", N, mul);
	return 0;
}



//9. 1���� n������ ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�(����Լ�=recursive function)
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


//10. ���� ��Ģ�� ���� �Լ��� �ۼ��Ͻÿ�.
//n == 0 = > 0
//n == 1 = > 1
//n > 1 = > f(n - 1) + f(n - 2)
//���� ����
//1, 1, 2, 3, 5, 8, 13   21
//n = 1 n = 2  n = 3   n = 4  n = 5   n = 6   n = 7  n = 8

//f(n)=f(n-1)+f(n-2) like tree



//����Լ� recursion.ver
int fibonacci(int n)
{
	if (n <= 1)
		return n;
	return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int n;
	printf("���° ����?");
	scanf_s("%d", &n);
	fibonacci(n);
	printf("%d", fibonacci(n));

	return 0; 
}