#include<stdio.h>
extern int a; //CTest.c ���� �� ���� a
extern int b; //�ɰ��� �ڵ� ���� ������Ʈ 
//���� LNK2001 Ȯ���� ���� ���� �ܺα�ȣ HELLO 
//����.

int main()
{
	//b++; // ���⼭ ���� ����!!!!! static ��� 
		//CTest.c�̿�;�ӿ��� ����
		//java, c#, c++�� private ������.
	a++;
	printf("%d\n", a);
	up_Print();
}
void printfNum(int a)//�Լ��� ����
{
	printf("%d", a);
}


//1�� ���� (main���� �غ��� 
//�� �� �� ū �� ���
int a, b;
printf("���� �ΰ� �Է�(3 5 �̷���)\n");
scanf_s("%d %d" &a, &b);
//���� ������
//a�� b���� ũ�ų� ������ a ���
//�װ� �ƴϸ� b ���
a >= b ? printf("%d\n", a) : printf("%d\n", b);
//���׿����� ���� �ϱ�
if ()