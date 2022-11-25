#include<stdio.h>
//�迭�� �������̱� ������ �Լ��� �Ű������� ���̰� �Ǹ� 
//�Լ����� ���� ��ȭ�� ���� �� �迭������ ���� ��ȭ�� �ִ�.
//void increaseNum(int* numbers[])
//����� ���� �ѱ���� , || �ƴϸ� ������ ���� �� �ִ°� �̿��ϵ���....
//�׳� ������ ���� �Ѱ��ָ� ��.
//a. ���� ������ ĭ �̿ܿ� �ٸ�ĭ(�����Ⱚ���̾� ����)�� �����Ϸ��� ������ �� ���ɼ��� ����. 
//q. �׷��� size�� �־��ִ°�,

//1.
void increaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] += n;
}
//2. �Ű����� �ְ� ��ȯ�� ���� �迭 �� ��� ����ϴ� �Լ� �����
void printArr(int arr[], int size)
{
	printf("\n");
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}
//3. decreaseNum�� �����.(�Ű�����, ��ȯ�� increaseNum�̶� �Ȱ���)
void decreaseNum(int numbers[], int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] -= n;
}
//4. 2�� �Լ��� �Ȱ��� ������ �Լ��� ����� �Ʒ� ������ ����
	//1. ���ҽ�ų ���� ������ �� ��
	//2. ���� ���ҽ��״� �� ������ ������ �� ���
	//�Լ� ����(break ���� return �Ẹ��)
void decreaseNum_q4(int numbers[], int size, int n)
{
	//�Ű������� ������ ���͵� �� �ǰ�
	//���� ���� �� ������ �Ǹ� ��� ����
	if (n < 0)
		return; // �̷��� �� ���� if else�� ��� �ص� �ȴ�.
	//void�� return�� �Ⱦ��°� �ƴ϶� ���������ϴ�. ���ٸ� return;���� �������.

	for (int i = 0; i < size; i++)
	{
		int num = numbers[i];
		num -= n;
		if (num < 0) //n�� ���µ� �������? ��� ����
			return; //�Լ� ��ü�� ����������. ���� return�� {} ������ ���� ������.
					// =break �ᵵ �ȴ�. �극��ũ�� �ݺ����� ������ ������ �Լ���ü�� ������.
		numbers[i] = num;

	} 
}

int main()
{
	//�ϳ��� ������ ���ؼ� ���� ���� ���ڸ� ������ �� �ִ°� �迭.
	//ó���� �������ڸ��� �� �ֱ�.
	int ages[5] = { 23,25,30,29,50 };
	int ages2[3]={ 10,20,30 };
	
	//�����ϰ��� �� �ֱ�
	int ages3[3];
	ages3[0] = 20;
	ages3[1] = 30;
	ages3[2] = 40;
	
	for (int i = 0; i < 5; i++)
	{
		printf("%d\n", ages[i]);
		ages[i] = i * i + ages[i];//�ƹ����̳� �־
	}


	printf("----------------1��----------------\n");
	//1. ���� ���� increaseNum�� ȣ���غ��� ��� Ȯ���غ���
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);
	increaseNum(ages2, 3, 100);
	printf("-----��ȭ ��-----\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);


	printf("----------------2��----------------\n");
		printArr(ages, sizeof(ages) / sizeof(int)); //5


	printf("----------------3��----------------\n");
	decreaseNum(ages, sizeof(ages) / sizeof(int), 15);
	printArr(ages, sizeof(ages) / sizeof(int));

	
	ages3[0] = 150;
	ages3[1] = 50;
	ages3[2] = 500;
	printf("----------------4��----------------\n");
		decreaseNum_q4(ages3, 3, 100);
	printArr(ages3, 3);

	return 0;
}