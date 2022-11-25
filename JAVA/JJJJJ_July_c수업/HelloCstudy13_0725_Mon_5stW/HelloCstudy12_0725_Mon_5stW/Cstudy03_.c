#include<stdio.h>
int main()
{
	int numbers[5];
	for (int i = 0; i < 5; i++)
	{
		int n;
		printf("숫자입력");
		scanf_s("%d", &n);
		if (checkDuplicate(numbers, i, n) == 0)
			numbers[i] = n;
		else
			i--; //다시 앞으로 가서 숫자 다시 넣어야 함.
	}
	return 0;

	//Lightshot
	//chrome
	//onenote
	//download files
}