#include<stdio.h>
int q1(int a, int b, int c)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c != 0)
			sum += i;
	}
	return sum;
}
int q2(int Sec)
{
	if (Sec >= 3600)
	{
		printf("Error!");
		return -1;
	}
	int m = Sec / 60;
	printf("%d�� %d��\n", m, Sec % 60);
	return m;
}
void q3()
{
	system("color 3a");
}
int main()
{
	/*
	1. ���� a�� b�� c�� ���� �Է¹ް�, a���� b������ ���� ���ϵ�, c�� ��� �κ���
�����ϰ� ���� ���� ��.
�� ���� main�� ��ȯ�ϴ� �Լ� �ۼ��ϱ�(���ϰڴٸ� �׳� main�� ���� ¥����)
	*/
	//a = 1
	//b = 100
	//c = 3
	//1���� 100������ ���� ���ϴ� �� 3�� ��� ���� ���Ѵ�.
	int a, b, c;
	printf("���ڸ� �Է��ϼ���.");
	scanf_s("%d %d %d", &a, &b, &c);
	//int sum = 0;
	//for (int i = a; i <= b; i++)
	//{
	//	if (i % c != 0)
	//		sum += i;
	//}
	printf("%d���� %d������ ��(%d ��� ����)�� %d�Դϴ�.\n", a,b,c, q1(a, b, c));
	//2. Sec(��) ���� �Է¹޾Ƽ� �ð��� h�� m�ʶ�� �� ����ϵ�, 3600�̻��� ���� ������
	//���� �޽����� ����Ѵ�.
	//�׸��� m ���� ��ȯ�Ѵ�.
	printf("2. �� ���� �Է¹�������.");
	int Sec;
	scanf_s("%d", &Sec);
	//if (Sec >= 3600)
	//	printf("Error!");
	//else
	//	printf("%d�� %d��\n", Sec / 60, Sec % 60);
	int result_q2 = q2(Sec);
	printf("2�� ��ȯ�� :%d\n", result_q2);

	//system("color 3a");
	q3();

	return 0;

}