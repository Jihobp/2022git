#include<stdio.h>
int main()
{
	int numbers[5];
	for (int i = 0; i < 5; i++)
	{
		int n;
		printf("�����Է�");
		scanf_s("%d", &n);
		if (checkDuplicate(numbers, i, n) == 0)
			numbers[i] = n;
		else
			i--; //�ٽ� ������ ���� ���� �ٽ� �־�� ��.
	}
	return 0;

	//Lightshot
	//chrome
	//onenote
	//download files
}