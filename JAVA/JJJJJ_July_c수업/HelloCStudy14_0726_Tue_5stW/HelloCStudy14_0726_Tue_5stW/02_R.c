#include<stdio.h>
void noSwap(int a, int b)//main �� ��ȭ �� ��Ŵ (copy��)
{					//�Ű������� "��"�� �����ؿ��Ƿ�
	int temp = a;	//�����̶� ���� ���� ����
	a = b;			//�� �Լ��� ������ �����.
	b = temp;
}

void Swap(int* a, int* b)//main �� ��ȭ ��ų �� �ִ�. (�ٷΰ���)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main()
{
	int a = 3;
	int b = 5;

	noSwap(a, b);
	printf("a=%d, b=%d\n", a, b); //a=3, b=5	(�׳� ���)
	Swap(&a, &b);
	printf("a=%d, b=%d\n", a, b); //a=5, b=3(�� �ٲ�)
	int* pa = &a;
	int* pb = &b;
	Swap(pa, pb); //�Ű������� �ּҰ��� ���� ��. (�� �ٲ�)
	printf("a=%d, b=%d\n", a, b); //a=3, b=5(���� �ѹ��� ���Ƽ� �ٽ� ����ġ�� )

}