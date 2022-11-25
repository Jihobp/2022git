//10. ���� ��Ģ�� ���� �Լ��� �ۼ��Ͻÿ�.
// //F(n) = F(n-1) - F(n-2)?????????????????????????????????
// //Note that F(n) = F(n - 1) - F(n - 2) is the same as F(n) - F(n - 1) + F(n - 2) = 0 
// which makes it a linear difference equation. 
//n == 0 = > 0
//n == 1 = > 1
//n > 1 = > f(n - 1) + f(n - 2)
//���� ����
//1, 1, 2, 3, 5, 8, 13   21
//n = 1 n = 2  n = 3   n = 4  n = 5   n = 6   n = 7  n = 8
//f(n)=f(n-1)+f(n-2) like tree


//����Լ� recursion.ver
#include<stdio.h>
int fibonacci(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1; //n�� �Ϻ��� �۰ų� ������ 1�� �����ؼ� ���� �����ٷ�??? �˰���???
	return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
	int n;
	scanf_s("%d", &n);
	printf("%d", fibonacci(n));
	return 0; 
}


//ȣ�� = �Լ�, 
//���� �θ��� �Լ��� ����Լ�.