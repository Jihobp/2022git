#include<stdio.h>
struct MyStruct
{
	int width;
	int height;
}typedef Rectangle; //���� �̸��� ���� �������
//���ǵ� �̸����� �θ��ų�
//�����̸����� �θ� �� �ִ�.


int main()
{//1. �簢�� 5�� �Է¹ް�
//���̰� ���� ���� �簢���� width�� height�� ����϶�.
if (0)
{/*
	struct Rectangle
	{
		int width;
		int height;
	}typedef Rectangle;

	int main()
	{
		struct Rectangle r1;
		scanf_s("%d %d", &r1.width, &r1.height);
		printf("���� : %d\n", r1.width * r1.height);
		Rectangle r2;
		scanf_s("%d %d", &r2.width, &r2.height);
		printf("���� : %d\n", r2.width * r2.height);
		Rectangle r3;
		scanf_s("%d %d", &r3.width, &r3.height);
		printf("���� : %d\n", r3.width * r3.height);
		Rectangle r4;
		scanf_s("%d %d", &r4.width, &r4.height);
		printf("���� : %d\n", r4.width * r4.height);
		Rectangle r5;
		scanf_s("%d %d", &r5.width, &r5.height);
		printf("���� : %d\n", r5.width * r5.height);


		int maxRec;

		result = max

			printf("���� : %d\n", ());

		return 0;
	}
	*/
} //����

Rectangle recs[5];
for (int i = 0; i < 5; i++)
{
	printf("�簢���� width�� height �Է��ϱ�");
	scanf_s("%d %d", &recs[i].width, &recs[i].height);
}
Rectangle maxRec = recs[0];//ddgdg�ƹ��ų� ok �Ϲ������� ù���� 0�� ������
for (int i = 1; i < 5; i++)
{
	//2���� ���� ����ó��1(���� ���� ó��)
	//����ó�� ���� ��쿣 if���� �����
	if (recs[i].width < 0 || recs[i].height < 0)
		continue;

	int area = recs[i].width * recs[i].height;
	int maxRecArea = maxRec.width * recs[i].height;
	if (maxRecArea < area)//���̰� ���� ū �ɷ� ��ü
		maxRec = recs[i]; //area ���� �ȴ볶? int���� ����ü�� ���ϱ� ���������� ��ȯ�� �� ����.
}
//2���� ���� ����ó��2(����ó�� ���� ��쿣 if���� �����)
if (maxRec.width >= 0 && maxRec.height >= 0)
{
	printf("���� ���� �簢���� width:%d, height:%d\n",
		maxRec.width, maxRec.height);
}

return 0;
}

//2. 1���� �ϵ�, width�� height�� ������ ����
//���ܸ� ����� �Ѵ�.(����ó�� �ʿ�)
//
//------------------------------------ -
//
//3. �ռ� ���� Student ����ü�� typeddef�� ����
//Stu ��� Ÿ������ �����.
//
//4. 5���� �л��� �Է¹޴´�.
//
//5. ��� ������ ���� ���� �л��� �� ��° �л����� ���







