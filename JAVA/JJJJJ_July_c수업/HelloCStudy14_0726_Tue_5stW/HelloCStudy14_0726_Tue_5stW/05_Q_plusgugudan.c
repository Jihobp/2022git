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
int gugudan(int dan, int dandan, int mul, int mulmul) //���� ����ϱ� ���� int�� �Լ�
{
	int sum;
	sum = 0;
	for (; dan <= dandan; dan++)
	{
		printf("\n%d�ܺ��� %d����\n", dan, dandan);
		for (int i= mul; i<= mulmul; i++)
		{
			printf("%3d x %d = %2d", dan, i, dan * i);
			sum += dan * i;
		}
	}
	return sum;
}

int main()
{
	int dan,dandan, mul, mulmul;
	printf("\n��ܺ��� ��ܱ���, ����� ����� ���ұ��?");
	scanf_s("%d %d %d %d", &dan, &dandan, &mul, &mulmul); //�Է��� \n ������ ����.
	//char c;
	//scanf_s("\n%c", &c,1); //�׳� rewind ���� scanf���!(�����ҋ���!!!!)

	printf("\n%d", gugudan(dan, dandan, mul, mulmul));//\n���� ���� �ϸ� ���� ����.
	return 0;
}



/*
int gugudan() //���� ����ϱ� ���� int�� �Լ� // �ܼ� �հ�
{
	int gugudan,z;
	int sum;
	sum = 0;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("\n%d��\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%3d x %d = %2d", gugudan, z, gugudan * z);
			sum += gugudan * z;
		}
	}
	return sum;
}

int main()
{
	int s = gugudan();
	printf("�հ�� %d", s);
	return;
}
*/