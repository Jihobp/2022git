#include<stdio.h>

//1. printArr�� ȣ���غ�����.
//�� size�� �Ѱ���� �ϴ����� �����غ�����.

	void printArr(int numbers[], int size)
	{
		for (int i = 0; i < size; i++)
			printf("%d\n", numbers[i]);
	}


//2. �迭 ���� �ִ��� ��ȯ�ϰ�
//�ּڰ��� printf�� ����ϴ� �Լ���
//����� ȣ���غ�����.
//= > �� �ϰڴٸ� �켱 ���ο����� �غ�����.


	void maxmin(int max, int min)
	{
		if (max > min)
		{
			printf("�ִ��� %d�̴�.", max);
		}
		else
		{
			return min;
		}
	}

	int main()
	{	
		int numbers1[5] = { 5,4,10,-2,1 }; //4byte int*

		int numbers2[3];
		numbers2[0] = 100;
		numbers2[1] = 200;
		numbers2[2] = -300;

		for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++)
			printf("%d\n", numbers1[i]);

		//1.
		int a=5;
		printArr(numbers1, a);
		
		
		//2.
		int b, c;
		maxmin(b, c);
		int result = maxmin(b,c);


		return 0;
	}


//3. �迭 ���� ��ȣ�� ���� ������
//�Լ��� ����� ȣ���ؼ� �׽�Ʈ�غ�����.
//(�迭�� �����Ͷ�� ���� �����غ��� ��)
	// ? ;��; ?






