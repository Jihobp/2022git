#include<stdio.h>
void swap(int* pa, int* pb)
{
	int temp = *pa;
	*pa = *pb;
	*pb = temp;
}
int main()
{
	int a, b;
	printf("a b �Է��ض�.");
	scanf_s("%d %d", &a, &b);
	swap(&a, &b);
	printf("a=%d, b=%d\n", a, b); 
	return 0;
	//3. 2������ �ۼ��� �Լ��� ����ϵ�, a�� b ���� scanf�� �Է¹ް� ����
	//main���� �ٲ�� ���� ���� ���� ����Ѵ�.
	//2�� 3�� �Ȱ����� scanf�� ���� �ް� �ִ�.

}