#include<stdio.h>
//�� 10�����Դϴ�.(���������� ����)���ϱ����ϱ� ���ϰ� Ǫ�ø� �˴ϴ�.
//��� �Լ��� ���� main���� ȣ���ϸ� �Ǵ°̴ϴ�.

//1. ���� a�� b�� c�� ���� �Է¹ް�, a���� b������ ���� ���ϵ�, 
//c�� ��� �κ��� �����ϰ� ���� ���� ��.
//�� ���� main�� ��ȯ�ϴ� �Լ� �ۼ��ϱ�(���ϰڴٸ� �׳� main�� ���� ¥����)

int sum(int a, int b, int c)
{
	int sum = 0;

	for (int i = a; i <= b; i++)
	{
		if (i % c == 0)
			continue;
		else
		{
			sum += i;
		}

	}
	return sum;

}
int main()
{
	int a, b, c;
	scanf_s("%d %d %d", &a, &b, &c);
	//a = 1;
	//b = 100;
	//c = 3;

	printf("��:%d\n", sum(a, b, c)); // sum(1, 100, 3) �� �����ָ� �״�� 

	return 0;
}

