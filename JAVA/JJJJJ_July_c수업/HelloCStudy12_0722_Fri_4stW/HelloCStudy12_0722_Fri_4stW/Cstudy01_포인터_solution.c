#include<stdio.h>

//�迭�� �Լ��� �Ű������� �ѱ� �� �ִ�.
//�̷� �� �迭�� ũ�⵵ ���� �Ѱ���� ��.
//�׸��� �Ű������� int numbers[]��� �ص� �ǰ�
//int* numbers��� �ص� ��.  //Int* ptr < �̰� �� ��ȣ./Int* ptr/Int* ptr/�� �Ȱ���.
//�ֳĸ� �迭�� �����ʹϱ�!
void printArr(int numbers[], int size)
{	
	//printf("%d", numbers); //�ּ��� ���
	for (int i = 0; i < size; i++)
		printf("%d\n", numbers[i]);

	//�̷��� ��� ����� �Ȱ���. '��' ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~��������������������������������������
	//for (int i = 0; i < size; i++)
	//	printf("%d\n", *(numbers+i));

}


//main ���� ������ �ּҰ� ������ ������ �Լ�FX-void �ȿ��� �󸶳� �������, �ּҰ� ������ ����.
//������ġ�� �˰� �������� �о�� �� �κ����� �𸥴�.
//�迭�� �Ű������� �Ѱ��ٶ��� size�� �� �����!!!!


//2. �迭 ���� �ִ��� ��ȯ�ϰ�
//�ּڰ��� printf�� ����ϴ� �Լ���
//����� ȣ���غ�����.
//= > �� �ϰڴٸ� �켱 ���ο����� �غ�����.

//int* numbers ��� int numbers[]�̰� �ᵵ ok !!
int findMax(int* numbers, int size)
{
	int max = numbers[0];
	int min = numbers[0];
	for (int i = 1; i < size; i++)
	{
		if (max < numbers[i])
			max = numbers[i];
		if (min > numbers[i])
			min = numbers[i];
	}
	printf("�ּڰ� : %d\n", min);
	return max;
}


//3. �迭 ���� ��ȣ�� ���� ������
//�Լ��� ����� ȣ���ؼ� �׽�Ʈ�غ�����.
//(�迭�� �����Ͷ�� ���� �����غ��� ��)
	// ? ;��; ?
//void reverse_arr(int* numbers, int size)
void reverse_arr(int* numbers, int size)
{
	for (int i = 0; i < size; i++)
		numbers[i] *= -1;
}

int main()
{	
	//�迭
	//1���� ������ ���� ���� ���� ������.

	int numbers1[5] = { 5,4,10,-2,1 }; //4byte int*
	int numbers2[3]={3,2,1};
	//numbers2[0] = 100;
	//numbers2[1] = 200;
	//numbers2[2] = -300;

	for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++)
		printf("%d\n", numbers1[i]);
	//1. printArr�� ȣ���غ�����. �� size�� �Ѱ���� �ϴ����� �����غ�����.
	printArr(numbers1, 5); //numbers1�� �ִ� ���� �����ϴ� �Լ�.
	
	//2.
	int max = findMax(numbers2,
		sizeof(numbers2) / sizeof(int));
	printf("numbers2�� �ִ� : %d\n", max);

	//3.
	printf("-----------------\n");
	printArr(numbers2, 3);
	printf("-----------------\n");
	reverse_arr(numbers2,3);
	printArr(numbers2, 3); //����� �̷��Ը� �ص� ..
	return 0;
}