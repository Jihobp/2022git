#include<stdio.h>
int main()
{
	//1. 5���� ���ڸ� �Է¹ް� �� �߿��� ���� ū ���ڿ� ���� ���ڸ� ã������.
	//�ּڰ� �ִ� 
	//http://ehpub.co.kr/tag/10%EA%B0%9C%EC%9D%98-%EC%A0%95%EC%88%98%EB%A5%BC-%EC%9E%85%EB%A0%A5%EB%B0%9B%EC%95%84-%EC%B5%9C%EC%86%8C%EA%B0%92%EA%B3%BC-%EC%B5%9C%EB%8C%80%EA%B0%92%EC%9D%84-%EC%B6%9C%EB%A0%A5%ED%95%98%EB%8A%94/
	if (0)
	{
		int a, b, c, d, e;
		printf("5���� ���ڸ� �Է��Ͻÿ�.");
		scanf_s("%d %d %d %d %d", &a, &b, &c, &d, &e);

		if (a > b && a > c && a > d && a > e)
			printf("���� ū ���� %d", a);

		else if (b > a && b > c && b > d && b > e)
			printf("���� ū ���� %d", b);

		else if (c > a && c > b && c > d && c > e)
			printf("���� ū ���� %d", c);

		else if (d > a && d > b && d > c && d > e)
			printf("���� ū ���� %d", d);

		else if (e > a && e > b && e > c && e > d)
			printf("���� ū ���� %d", e);

		int num[5]; //�迭�� ũ�� 0~4
		int max;
		int min;

		for (int i = 0; i < 5; i++)
			max = num[0];
	}
	
	int numbers[5]; //���� 5���� ������ //5���� �Ѳ����� �����ؼ� ������ ������
	//����� ���⿡�� �⺻������ '�����Ⱚ'�� ��.(���� ���� �ִ��� ���� ��)
	
	//ù��°�Ÿ� �ִ����� �ּҰ����� �����ҰŴ�. => �� �Ȱ��� ������ �� �����ϱ�.

	for (int i = 0; i < 5; i++)
	{

	}

		//�迭�� ���̸� ���ϴ� ���
		int size = sizeof(numbers) / sizeof(int);
		size = 50; //�̷��� �ߺ������� �� �� //int size =50;xxxxxxxxx
		size = 5; // ������ "����" �ߴٸ� �� �ڿ� ������ ����.

		//sizeof -> byte �� ���ϴ� ��.
		//numbers�� 5ĭ ¥�� �迭�̴ϱ� 20
		//�ֳĸ� int 5�� �����ϴ� �Ű�
		//int �� 1���� 4 byte �ϱ�~~~~~~~~~~~~~~~~~~~~~~
		//size �r = 20/4 = 5
	for (int i = 0; i < size; i++) //0,1,2,3,4, �ټ��� �����Ѵ�.
	{
		int num;
		scanf_s("%d", &num); // num�� �� ����.
		numbers[i] = num; //i��° ĭ���ٰ� ������.(������ĭ���ٰ� ���� ��~~ �ִ� �Ŵ�! '��'/! 
	}

	//�����Ŷ� �Ʒ��� ����.

	for (int i = 0; i < size; i++)
	{
		printf("%d��° ���� �Է�\n", i);
		//int num;
		//scanf_s("%d", &num); //num�� �� ����.
		//numbers[i] = num; //i��° ĭ���ٰ� ������.
		scanf_s("%d", &numbers[i]);
	}

	// int max, min = 0;(x) �̷��� ������������. �������� �ִ� ã���� max ���� 0�� ���´�.
	//���� ù��°�� �ִ� �ּҷ� ������ �Ѵ�.
	//�ټ��� ���ڰ� �� �Ȱ��� ���� �ִ�.  //���� �ټ����� �Ȱ��� �� �ֱ⶧���� �ִ����� �����ϴ� ��.
	int max = numbers[0];
	int min = numbers[0];

	for (int i = 1; i < size; i++)
	{
		if (max < numbers[i])
		{
			max = numbers[i]; //max���� ū�� ������ max�� i��°�� �ٲ��ش�,//max���� ū�� ������ max�� i��°�� �ٲ��ش�,
		}
		if (min > numbers[i])
			min = numbers[i]; //min���� ������ ������ min�� i��°�� �ٲ��ش�,
	}
	printf("�ִ� :%d, �ּڰ� :%d\n", max, min);






	//2. ���ڿ� 2���� �Է¹ް�, �� 2���� ������ �ٸ��� ���θ� ������ּ���.
	/*���ڿ� 2���� �Է¹ް�,
	�� 2���� ������ �ٸ��� ���θ� ������ּ���.*/
	char sentense1[1024]; //���Ƿ� ����.
	char sentense2[1024];
	printf("���ڿ�1 �Է����ּ���.");
	gets(sentense1); //rewind �ʿ�x, scanf rewind �ʿ�o
	printf("���ڿ�2 �Է����ּ���.");
	gets(sentense2);
	//for(�ʱ⺯������ ; �������� ; ��������)
	//�ʱ⺯�� ���� : int i = 0;
	//�������� : i <10;
	//�������� : i++�̳� i--�� �ִ´�.

	int i = 0; //for �ٱ����� �� //�� �������ִ� ��. 
	int isSame = 10;
	for (i = 0; sentense1[i] != '\0' && sentense2[i] != '\0'; i++) //���߿� �ϳ��� �ΰ��̸� ������ �ƴϸ� �ȳ����� //�ΰ��� �ƴϸ� for�� �� ����!
	{
		if (sentense1[i] != sentense2[i]) //�ٸ����ϱ� ���ٽ� ��� ���ڿ� �� ������ �� �Ȱ����� {}�� ����ȵȴ�. 
		{
			i = -1; // ?????????????????????????? -> ����ü�� �ǹ̰� ���� ǥ��. �̹����� ���ų�  �ٸ��ٰ� �ϱ� ����?���������� �ϱ�����.
					//�ߴ��ϰ� �ϱ�����. -�� ������ �����ϱ�. �ؿ��� �������� ��������,.
			isSame = -10;
			//printf("�� ������ �ٸ��ϴ�.\n");
			break;//return 0;
		}
	}
	//if (i != -1)
	//if(isSame==1)
	if(i>=0)
		printf("���� �Ȱ���. %s %s\n", sentense1, sentense2);
	else
		printf("�� ������ �ٸ��ϴ�.\n");

	if (0)
	{
		//����
		int i = 0; //for �ٱ����� ��
		for (i = 0; sentense1[i] != '\0' && sentense2[i] != '\0'; i++)
		{
			if (sentense1[i] != sentense2[i])
			{
				//i = -1;
				printf("�� ������ �ٸ��ϴ�.\n");
				break;
			}
		}
		if (i != -1)
			printf("���� �Ȱ���. %s %s\n", sentense1, sentense2);

	}

	return 0;
}