#include<stdio.h>
main()
{
	//����1
	if (0)
	{

	char name[10];
	printf_s("�̸��� �Է��ϼ���\n");
	scanf_s("%s", name, sizeof(name));
	printf("�� �̸��� %s�Դϴ�.", name);
	rewind(stdin);
	}
	//����2
	if (0)
	{
		int age;
		printf_s("���̸� �Է��ϼ���\n");
		scanf_s("%d", &age);
		printf("�� ���̴� %d���Դϴ�.", age);

	}
	//���� 3
	if (0)
	{
		int a, b;
		printf("a�� b���� ���� �Է� ����\n");
		scanf_s("%d%d", &a, &b);
		printf("��Ÿ����� ��Ģ ����� %d^2 + %d^2 = %d�Դϴ�. ",a,b,a*a+b*b);
	}
	//���� 4��
	if(0)
	{
		char tonari[200];
		printf("���ڸ��� �л��� �̸��� �Է��ϼ���\n");
		gets(tonari);
		printf("���ڸ��� �л��� �̸��� %s�Դϴ�.", tonari);

	}
	//5��
	if (0)
	{
		int dala;
		printf("�� �޶󿡿�?\n");
		scanf_s("%d", &dala);
		printf("�̰� %f��" ,dala * 1298.89);
	
	}
	//6��
	if (0)
	{
		printf("���� �Է��غ�\n");
			int n;
		scanf_s("%d", &n);
		if (n < 0)
			printf("�����Դϴ�");
		else if (n == 0)
			printf("0�Դϴ�");
		else
		{
			if (n % 2 == 1)
				printf("Ȧ��");
			else
				printf("¦��");
		}
		/* �ٸ����
		������ �������ָ� && ����ؼ� if�� �ᵵ �ȴ�
	
		
		*/




	}

		//7. ������ 5���� ����� ��.
		//5x1 = 5    5x9 = 45
		if (0)
		{
		
			for (int i = 1; i < 10; i++)
				printf("%d ", i * 5);

		}
		//8��
		if (0)
		{
			printf("����� ����ұ�?\n");
				int n;
					scanf_s("%d", &n);
				for (int i = 1; i < 10; i++)
				{
					printf("%d * %d = %d ", n,i,n*i);
				}
		}
		//9�� �������� �İ��л����� �⺻�̴�.
		if (0)
		{

			for (int i = 2; i < 10; i++)
			{
				for(int n=1;n<10;n++)
				printf("%d��%d=%d ",i,n, i * n);
				printf("\n");
				
			}

		}

		/* 10. 1���� n������ ���� ���ϵ� �Ʒ��� ���� ��� 
		��� �� 0 ������ ������ ��� �߸��� �Է��̶�� ������ֱ�
	     �Է� : 5         1 + 2 + 3 + 4 + 5 = 15 */

		if (1)
		{
			int sum = 0;
			printf("����� ���ұ��?\n");
			int n;
			scanf_s("%d", &n);
		    printf("1");
			sum = 1;
			for (int i = 2; i <= n; i++)
			{
				sum += i; //�� ����
				printf("+%d", i); //�޽��� ���
			}
			printf("=%d\n", sum);




		}


	return 0;	
}