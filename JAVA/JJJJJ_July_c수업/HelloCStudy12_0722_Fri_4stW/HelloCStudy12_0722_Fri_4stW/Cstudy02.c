#include<stdio.h>
#include<stdlib.h>//���� �迭��
int main()
{
	//10ĭ¥�� �迭 �ϼ�
	int* dynamic_arr = (int*)malloc(10 * sizeof(int));
	dynamic_arr[0] = 1;
	dynamic_arr[1] = 3;
	dynamic_arr[2] = 5;
	
	for (int i = 0; i < 3; i++)
		printf("%d\n", dynamic_arr[i]);
	int size;
	printf("�迭 ������ ����");
	scanf_s("%d", &size);
	int* dynamic_arr2 = (int*)malloc(size * sizeof(int));
	for (int i = 0; i < size; i++)
		dynamic_arr2[i] = i + 10;//�ǹ�x
	for (int i = 0; i < size; i++)
		printf("%d\n", dynamic_arr2[i]);

	//sizeof �迭�� ũ�� ���ִ°�.
	//�迭�ȿ� ������ ũ�⸦ �迭�� �����Ѵ�??????  ��������������������������������������������������������������������������
	// �� �������� �迭�� �״��� �޸𸮿� �ö󰡴µ� ���ÿ� stack�� �ö󰡸� ������ ������ ����. //
	// int a[5]={1,2,3,4,5} poooooooooooooooooooooooo
	// int a[n]={1,2,3,4,5} xxxxxxxxxxxxxxxxxxxxxxxxxxxx �׷��⶧���� malloc�̶� calloc ���ָ� ok
	
	//�����ʹ� c���� �ִܤ�.�����Ҵ� �����ȿ� �ִ� heap ���������� c#, java������ ���̱� ������ ���°�.
	// 
	//int main() //b��� �迭�� ��ũ�� 
	//{
	//	int a;
	//	scanf_s("%d", &a);
	//	int* b = (int*)malloc(sizeof(int) * a);
	//	b[a]; //������ �ȳ��� �ȴ�. 
	//}
		
	// ���� ���� �Լ��� c��� ~�ϰ���ۿ� ġ�� �Լ� ã�Ƽ� ����/. ����� ������Ÿ� �������, �����Ǿ����� ����./
	// 
	//malloc - > �޸� �ʱ�ȭ�� �ȵ� //trash ��.
	//calloc - > 0���� �ʱ�ȭ ����. //0���� ä��
	//10ĭ¥�� ���� �迭�� ������µ�, 
	//�ȿ� ���� 0���� �ʱ�ȭ �Ǿ� �ִ�.
	int* mynumbers = (int*)calloc(10, sizeof(4));
	for (int i = 0; i < 10; i++)
		printf("%d\n", mynumbers[i]);

	//���� �޸𸮴� ���α׷��Ӱ� �������� �Ҵ��� ���̶� �� ��ٸ� free�� ������� ��. 
	//�̰� �Ⱦ��ָ� �޸� ����(memory leak) ���� ����.
	//�� �޸𸮰� ���� ��.
	//���� ���α׷��� �̴�� �����ٸ� ���� free�� ���� �ʿ� ����.
	//�ٵ� �� �ڿ��� ���α׷��� ��� �ǰ�, �̰� ���̻� �Ⱦ��ٸ�
	//free�� �ؾ� �Ѵ�.
	free(mynumbers);
	free(dynamic_arr);
	free(dynamic_arr2);


	//	1. �迭�� ����� ��, �迭�� ũ�⸦ ����ڰ� ���Ѵ�.
	//	2. �迭�� ũ�⸸ŭ ���ڸ� �Է��Ѵ�.
	int n;
	scanf_s("%d", &n);
	int* jpnum = (int*)malloc(sizeof(int)*n);
	for (int i = 0; i < n; i++) //0���� n-1���� �ݺ�  i=1; i<=n
	{
		scanf_s("%d", &jpnum[i]); //jpnum�� i��°���� �Է¹޴´�.
	}
	for (int i = 0; i < n; i++) 
	{
		printf("%d", jpnum[i]); //jpnum�� i��°���� ��¹޴´�.
	}

	//	3. �� �߿��� ���� ū ������
	//	�ε����� ã�Ƴ���.
	int max = jpnum[0];
	int min = jpnum[0];
	int maxindex = 0;
	int minindex = 0;

	for (int i=1; i < n; i++)
	{
		if (max < jpnum[i])
		{
			max = jpnum[i];
			maxindex = i; //��������� ã������� +1
		}
		if (min > jpnum[i])
		{ 
			min = jpnum[i];
			minindex = i;
		}
	}

	printf("\nmax=%d min=%d", max, min);
	printf("\nmaxindex=%d minindex=%d", maxindex, minindex);
	

	//	4. 1~2���� ���� ���� �迭��
	//	�Ű������� �Ͽ� ���� ���� ������
	//	�ε����� �������ش�. (�Լ��� ���� �� ȣ��)
	
	
	return 0;
}