#include<stdio.h>
//1. ������ ���� ���� ����(= ��ȯ)�ϴ� �Լ� �ۼ�
//2. �Ű����� �̿��ؼ�, Ư�� �ܸ� ���
//ex) �Ű����� 5 �� 5x1 ~5x9 ���
//3. �Ű����� 2�� �̿��ϱ�
//x����� x����� ������� ����
//ex) 1, 5 -> 2x1~2x5 ~9x1 ~9x5
//4. �Ű����� 2���� �̿��ؼ� ��� ����ϰ�
//�� ���� ����
//2, 6 -> 2~6�ܱ��� ����ϰ� �� ���� ����

//void��� return; ���ų�
//��������
//int, double, char ���̶��
//�ݵ�� return�� ����� ��
//�����ϰ� return �� ���
//�����ϰų� �̻��� ������ �� ���� �ִ� ��
//�� ������ �𸣰ڰ�... ��ư
//int �տ� �������� �ݵ�� return ����;
//����� ��
int gugudan_sum() //1�� ��ȯ
{
	int sum = 0;
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
			sum += (i * j);
	}
	return sum;
}

void q2_dan_print(int dan) //2�� ���
{
	for (int i = 1; i <= 9; i++)
		printf("%d x %d=%d\n", dan, i, dan * i);
}

void q3_gugu_gob(int s, int e) //3�� ���
{	
	for (int i = 2; i <= 9; i++)
	{
		for (int j = s; j <= e; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}
}
int q4_gugudan_sum(int s, int e) //��ȯ   
{	//s�� e���߿� s ���� �� ũ�� ? ? ? ? ? ? ? swap �Լ��� ���ų�, �Լ� ������ �ٲ� �ָ� ����!
	int sum = 0;
	for (int i = s; i <= e; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d", i, j, i * j);
			sum += i * j;  
		}
	}
	return sum;
}
int main()
{	
	printf("q1 : %d", gugudan_sum());
	int dan;
	printf("\nq2\n");
	scanf_s("%d", &dan);
	q2_dan_print(dan);
	printf("\nq3 x����� x����� �ұ��?");
	int start, end;
	scanf_s("%d %d", &start, &end);
	q3_gugu_gob(start, end);
	printf("�� �ܺ��� �� ��?\n");
	int start_dan, end_dan;
	scanf_s("%d %d", &start_dan, &end_dan);
	int result = q4_gugudan_sum(start_dan, end_dan);
	printf("\n4�� ��� : %d\n", q4_gugudan_sum(start_dan, end_dan));
	return 0;
}