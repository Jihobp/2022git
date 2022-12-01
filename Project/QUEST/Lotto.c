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
	printf("로또번호 6개를 생성하고 출력하세요.\n"); 
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



	printf("보너스 숫자를 1개 뽑으세요. 단, 원래 숫자와 중복되면 안됩니다.\n"); 
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
	


	//버블 정렬 수행 (크기 순으로 정렬한다. )
	bubblepop_sort(num, sizeof(num) / sizeof(int)); /


	printf("----\n");

	for (int i = 0; i < 6; i++)  
	{
		printf("%d\n", num[i]);
	}

	return 0;
}



