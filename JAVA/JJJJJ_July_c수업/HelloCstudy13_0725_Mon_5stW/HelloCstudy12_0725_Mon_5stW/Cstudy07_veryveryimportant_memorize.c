#include<stdio.h>
void swap(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
int main()
{
	int a = 3;
	int b = 5;
	swap(&a, &b);
	printf("%d %d", a, b); //5 3 ���
	return 0;
	//2. ���� a = 3, b = 5�� ��
	//2���� ���� �ٲٴ� �Լ��� �ۼ��Ѵ�.
	//main���� �ٲ�� ���� ���� ���� ����Ѵ�.
}

