#include<stdio.h>
//	3.������ �Լ� ¥��
//	1) �⺻ �������� main���� ¥����
//	2) �⺻ ������ ������ִ� �� �Լ��� ����� main���� ȣ���غ���
void gugu()
{
	int gugudan, z;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("%d��\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
	}
}

//	4. �� �ܺ��� �� �ܱ��� �׸���
//	���ϱ� �� ���� ���ϱ� �� ������ ������ �Է��ؼ� ������ �����ϰ� �ϱ�
//	�Ű������� ��ȯ���� ����
void gugudan()
{

}

int main()
{

	gugu();


	int x,y,n,m;
	for (x = 2; x <= 9; x++)
	{
		printf("%d�ܺ��� %d�ܱ���?\n", x,y);
		scanf_s("%d x %d", &x, &y);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
	}
	
	return 0;

}