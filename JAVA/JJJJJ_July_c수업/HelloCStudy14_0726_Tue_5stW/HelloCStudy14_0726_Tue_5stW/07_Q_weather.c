#include<stdio.h>
void season() //2
{
	int month;
	printf("�� ���� �Դϱ�?");
	scanf_s("%d���� �Դϴ�.", &month);
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......���보��");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring ���ٶ� �ֳ�����~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer ���� �ʹ�����");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall õ������ ����");
		break;
	default:
		printf("�߸��ƽ��ϴ�.");
		break;
	}
} //2

void seasonp(int seaseap) //3
{
	//int month;
	//printf("�� ���� �Դϱ�?\n");
	//scanf_s("\n%d���� �Դϴ�.", &month);
	switch (seaseap)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......���보��");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring ���ٶ� �ֳ�����~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer ���� �ʹ�����");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall õ������ ����");
		break;
	default:
		printf("�߸��ƽ��ϴ�.");
		break;
	}
}

void Year()
{
	int age, year;
	printf("\n�� �⵵�� �¾���ϱ�?\n");
	scanf_s("\n%d�⿡ �¾���ϴ�.", &year);
	age = 2023 - year;
	printf("\n���� %d���Դϴ�.", age);
	return age;
}

int yearp(int year_parameter)
{
	int age, year;
	printf("\n�� �⵵�� �¾���ϱ�?\n");
	scanf_s("\n%d�⿡ �¾���ϴ�.", &year);
	age = 2023 - year;
	printf("\n���� %d���Դϴ�.", age);
	return age;
}
int yearsp(int year)
{
	return 2023 - year;
}

int main()
{	//1. ������ ����ϴ� �ڵ� main�� �ۼ�
	int month;
	printf("\n�� ���� �Դϱ�?\n");
	scanf_s("\n%d���� �Դϴ�.", &month);
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......���보��");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring ���ٶ� �ֳ�����~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer ���� �ʹ�����");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall õ������ ����");
		break;
	default:
		printf("�߸��ƽ��ϴ�.");
		break;
	}
	
	//2. 1���� �Լ�ȭ�ؼ� main���� ȣ���ϱ� (�Ű����� ��ȯ�� ����)
	printf("\n");
	season();

	//3. �Ű������� ���ؼ� ���� ����ϴ� �Լ�
	int S;
	printf("\n�� ���� �Դϱ�?\n");
	scanf_s("%d", &S);
	//printf("\n%d���� �Դϴ�.\n", seasonp(S));
	seasonp(S);


	//for (i = 0; i < 3 || i = 12; i++)
	
	//4. �¾ ������ �Է��ϰ� ���̸� �����ϴ� �Լ� (�Ű�����x)
	printf("\n"); 
	Year();
	printf("\n");
	//5. �¾ ������ �Ű������� �ް� ���� �����ϴ� �Լ� (�Ű����� o)
	int Y;
	printf("\n�� �⵵�� �¾���ϱ�?");
	scanf_s("%d", &Y);
	printf("%d���Դϴ�.", yearsp(Y));


	return 0;
}