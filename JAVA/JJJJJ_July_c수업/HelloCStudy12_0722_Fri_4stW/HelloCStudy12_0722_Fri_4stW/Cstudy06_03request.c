#include<stdio.h>

//1. Rectangle �̶�� ����ü�� �����. ���� width, height �Ӽ��� �ִ�.
	struct Rectangle //2���� ������ ���´�.
	{
		int width;
		int height;
	}typedef Rectangle; //strucht ��������
	
	

	//2.�� Rectangle�� �Ű������� �� �Լ��� �����
	// �� Rectangle�� ���̰�(width * height)�� �����ϰ� �Ѵ�.
	int area(Rectangle r)
	{
		return r.width * r.height;
	}




	//3. main���� �� ���� ȣ���Ѵ�.
		//���� �Լ��� ��ƴٸ� main���� �� ��� �۾��� �غ���
		//�簢���� 2�� ���� ������
		//1���� �ڵ�� �� �ְ�
		//1���� scanf_s�� �� �־��

int main()
{
	struct Rectangle r1;
	r1.width = 50;
	r1.height = 10;
	printf("���� : %d\n", r1.width * r1.height);
	Rectangle r2; //typedef Rectangle �� ������ �տ� �׻� strucht�� �پ�� ��!!!
	scanf_s("%d %d", &r2.width, &r2.height);
	printf("���� : %d\n", r2.width * r2.height);
	printf("���� : %d\n", area(r2)); //�Լ�Ȱ��


	Rectangle recs[3];
	recs[0] = r1;
	recs[1] = r2;
	recs[2].width = r1.width;
	recs[2].height = r2.height;


	return 0;
}