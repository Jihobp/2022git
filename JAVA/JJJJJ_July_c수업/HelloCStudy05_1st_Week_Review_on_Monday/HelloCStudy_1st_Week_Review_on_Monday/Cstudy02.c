#include<stdio.h>	
int main()
{
	//�ݺ����� ���ؼ� �� �� �غ���.
	
	//1. for������ ���ѷ��� �����.
	for (;;)
	{
		printf("a");;
	}


	for (int i = 0; i < 1;) 
	{
		printf("a");;
	}

	system("color a");
	for (int i = 0;;i++	)
	{
		//printf("a");
		printf("%d",i);;
		break;
	}

	//2. while���� ��ø�� �ǹǷ� while������ ������ © �� �ִ�.

	//3. �ݺ��� �̿��ؼ� ���ڿ� �ȿ� �ִ�
	//����� �ϳ��ϳ� � ���� �ִ�.
	char name[100];
	printf("�̸��� ����?");
	gets(name);
	//'\0' = NULL
	//for (int) 
	for (int i = 0; name[i] != '\0'; i++)
	printf("%c", name[i]);
	//

	return 0;
}

