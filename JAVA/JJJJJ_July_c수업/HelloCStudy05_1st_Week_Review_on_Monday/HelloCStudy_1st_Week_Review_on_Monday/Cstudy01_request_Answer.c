#include<stdio.h>
int main()
{	if(0)
{//1.���丮���� ����غ�����. 
	// �Է� : 5
	// ��� : 5!=5x4x3x2x1
	printf("�� ���丮��?");
	int fact;
	scanf_s("%d", &fact);
	printf("%d!=%d", fact, fact);	// ??????????????????????????????????????????????????
	//ex : fact�� 5���
	//i�� 4���� 1����
	for (int i = fact - 1; i > 0; i--)
	{
		printf("x%d", i);
	}

	//2. n���� m������ ���� ���ϵ�, m�� n���� ���ų� Ŀ���Ѵ�. 
	//if�� �༭ m�� ������
	//�����޼��� ����� ���� �ְ�
	//�ƴϸ� �� ������ ���� �ٲ��� ���� �ִ�.
	//������ ���� �ٱ��ִ°� �غ���...
	//3������ �����޼��� ����ϴ°� �غ���.

	int n, m;
	printf("\nn�� m �Է��ϼ���.");
	scanf_s("%d %d", &n, &m);
	if (n > m) //n�� �� Ŭ ��� ���� ���� ���� �ٲ�.
	{
		int temp = m; //temporary
		m = n;
		n = temp;
	}

	int sum = 0;
	for (int i = n; i <= m; i++)
		sum += i;
	printf("%d���� %d������ ���� %d�̴�.\n", n, m, sum);

	//��xxxxxxxxxxxxxxxxxxx���Ѱ�xxxxxxxxxxxxxxxxxxxxxxxx
	if (0)
	{
		int n, m;
		int sum;
		printf("n���� m������ ���� ���Ͻÿ�.\n");
		for (int n; n > 0; n++)
			printf("%d", &n);

	} // ���� ��



	//3. 2�� ������ �����ε�, ¦���� �ո� ���Ѵ�. �� continue ����� ��.
	// �� ����
	if (0)
	{
		printf("\n¦���� ���� ���Ͻÿ�.");
		scanf_s("%d %d", &n, &m);
		for (int i = n; i <= m; i++)
		{
			if (i % 2 != 0)
				continue;
			printf("¦�� d%\n", i);
		}
	}	 //����

	printf("n? m? �Է�");
	scanf_s("%d %d", &n, &m);
	if (n > m)
	{
		printf("ù��°�� �ι�°���� Ŀ�� �� �� ����!\n");
	}
	else
	{
		sum = 0; //�ʱ�ȭ ����� ���� �� �ִ�.
		for (int i = n; i <= m; i++) //i �� ����.
		{
			if (i % 2 != 0)
				continue; //¦���� ��쿡�� sum�� �� ���� ����

			sum += i;
		}
		printf("%d���� %d������ ���� %d�̴�.\n", n, m, sum);
	}



	//4. ���ڸ� �Է¹ް�, �� ���� ������ ����ϴ� �ڵ带 ¥��, ���ѹݺ��Ѵ�.
	//�� 0 ������ ���ڸ� �Է¹����� �� �ڵ带 �����Ų��.

	while (1)
	{
		int input;
		printf("�Է�");
		scanf_s("%d", &input);
		if (input <= 0)
			break;
		printf("������ : %d\n", input * input);
	}
	printf("4�� ����� \n");

	//do while�� ����ó�� input�� 0�̾
	//while ������ �������� �� �ص� ������ �� ���� �����Ѵ�.
	//�� ���ѷ����� ���ų� �ȵ��ų� ó���� ���� ������
	//�޾ƾ� �Ѵٸ� do while �� ����.
}
	


	//5. ���� �Է¿� ���� ����� �غ�����.
	int input = 0;
	int N;
	printf("�Է�");
	scanf_s("%d", &N);
	for (int i = 0; i < 2 * N; i++)//��κ�
	{
		int onOFFSwitch = i;
		for (int j = 0; j < N; j++)
		{
			if (onOFFSwitch % 2 == 0)
				printf("*");
			else
				printf(" ");
			onOFFSwitch++;
		}
		printf("\n"); //�� �� ����ϰ� �� �� ���� ��.
	}

	
//�Է�: 1
//��� : *
//�Է� : 2
//��� : *
      //*
	//*
	  //*
//�Է� : 3
//��� : **
//*
//**
//*
//**
//*

	return 0;
}