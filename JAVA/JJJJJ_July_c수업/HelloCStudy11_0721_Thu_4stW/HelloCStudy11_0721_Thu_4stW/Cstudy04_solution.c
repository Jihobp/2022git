#include<stdio.h>
//1�� ���� (main���� �غ��� 
//�� �� �� ū �� ���

//�� a,b�� main�� a,b�� �ƹ� �������.
//�� a,b�� �� �ٲ� main�� a,b�� �״��!
void printBig(int a, int b)
{
	if (a >= b)
	{
		printf("%d\n", a);
		return;
	}
	printf("%d\n", b);
}

int printBigReturn(int a, int b)
{
	if (a >= b)
		return a;
	//else //b�� a���� Ŭ ���... else �� ��� ��.
	return b;
}
int main()
{	
	//1.//���� ������
	//a�� b���� ũ�ų� ������ a ���
	//�װ� �ƴϸ� b ���
	int a, b;
	printf("���� �ΰ� �Է�(3 5 �̷���)\n");
	scanf_s("%d %d", & a, &b);
	a >= b ? printf("%d\n", a) : printf("%d\n", b);
	
	//2.//���׿����� ���� �ϱ�
	if (a >= b)
		printf("%d\n", a);
	else
		printf("%d\n", b);

	//3.//�Լ�
	printBig(a, b); //a�� b �߿� �� ū �� ���
	
	//4.//return
	int result = printBigReturn(a, b);
	printf("%d\n", result);
	return 0;
}


