#include<stdio.h>
#include<time.h>

void bubblepop_sort(int arr[], int n) 
{	
	int i, j, temp; 
	for (i = 0; i < n; i++) 
	{																			
		for (j = 0; j < n - 1; j++)
		{
			if (arr[j] > arr[j + 1]) 						
			{																					
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}

int main()
{
	int num[6] = { 0 };
	int bonus[1] = { 1 };
	srand(time(NULL)); 
	printf("�ζǹ�ȣ 6���� �����ϰ� ����ϼ���.\n"); 
	rand(); 
	for (int i = 0; i < 6; i++) 
	{
		num[i] = rand(); 
		num[i] = (num[i] % 45) + 1; 
		for (int j = 0; j < i; j++)
		{
			if (num[i] == num[j]) 
				i--;
		}
	}

	for (int i = 0; i < 6; i++) 
	{
		printf("%d\n", num[i]); 
	}



	printf("���ʽ� ���ڸ� 1�� ��������. ��, ���� ���ڿ� �ߺ��Ǹ� �ȵ˴ϴ�.\n"); 
	for (int i = 0; i < 1; i++)
	{
		bonus[0] = (rand() % 45) + 1;
		for (int j = 0; j < 6; j++) 
			if (num[j] == bonus[0]) 
			{
				i--; 
			}
	}
	printf("%d\n", bonus[0]);
	


	//���� ���� ���� (ũ�� ������ �����Ѵ�. )
	bubblepop_sort(num, sizeof(num) / sizeof(int)); /


	printf("----\n");

	for (int i = 0; i < 6; i++)  
	{
		printf("%d\n", num[i]);
	}

	return 0;
}



