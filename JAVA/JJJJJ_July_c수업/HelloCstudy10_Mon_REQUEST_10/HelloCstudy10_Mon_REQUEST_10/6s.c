//6. a���� b���� ���ϴ� �Լ��� �����
//1x2x......xb = ��� ����ϰ� ��ȯ�� �ִ� �Լ� �����
//����
//1x2x3x4x5
//total = 120
#include<stdio.h>
int mulmul(int a ,int b)
{
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;
		if (i == b)
			printf("%d = %d", i, mul);
		else
			printf("%d x ", i);

	}
	return mul;
}

int main()
{
	int a, b;
	scanf_s("%d %d", &a, &b);
	printf("a���� b���� ���� ���� = %d\n", mulmul(a,b));
	return 0;
}