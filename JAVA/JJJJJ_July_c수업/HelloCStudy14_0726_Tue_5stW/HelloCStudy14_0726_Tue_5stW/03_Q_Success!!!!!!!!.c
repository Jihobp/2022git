#include<stdio.h>
void numswap(int *a, int *b, int *c)
{
	int temp = *a;
	*a = *b;
	*b = *c;
	*c = temp;
}

//void swap(int *aaa, int *bbb, int *ccc)
//{
//	int temp
//}

int main()
{
	int aa, bb, cc;
	int aa2, bb2, cc2;
	printf("���� �Է��ϼ���.\n");
	scanf_s("%d %d %d", &aa, &bb, &cc);
	aa2 = aa;
	bb2 = bb;
	cc2 = cc;
	numswap(&aa, &bb, &cc);
	printf("%d %d %d\n", aa, bb, cc);

	//1. 
	// ���� a,b,c�� �ִ� ���� ���� �ٲٴ� �Լ� �����
	//��, ���� a,b,c�� ���ο� �ִ�.
	//(a->b, b->c, c->a�� �ٲٸ� ��.)
	//--------------------------------------------------------------
	//2.
	//�Լ��� ������ٸ� main���� swap ȣ���ؼ� ���� �ٲ㺸��.
	//��, ó���� scanf�� �Էµ� ������ ���ƿ� ������ �ٲٱ�.
	//ex)a=1, b=2, c=3�̰�
	//swap ��� ȣ���ؼ� a = 1, b = 2, c = 3�� �ٽ� ���� ������ ������
	//(�������ε� �غ��� �ݺ������ε� �غ���)

	//����
	numswap(&aa, &bb, &cc); //������ �����غ���.
	numswap(&aa, &bb, &cc);
	printf("%d %d %d\n", aa, bb, cc);
	//int *ap = &aa;
	//int *bp = &bb;
	//int *cp = &cc;

	//numswap(ap, bp, cp);
	//printf("%d %d %d", aa, bb, cc);

	//-----------------------------------------------------------------------------------------
	//�ݺ��� - do while ���ǰ��� �ִ´�. �׳� while�� aa bb cc�� �ٰ����� ������ �ȴ�.
	//�� ������ �ݺ������� ���� ����
	//do while�� �� �� ��쿣 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	//�� �� �������� �����ϰ� ������ ������ �ݺ������� ���������� ���ƿ� ���θ� üũ ����
	//do while�� �� ����
	//ó���� �翬�� aa,bb,cc�� aa2,bb2,cc2�� ���� �Ȱ���.
	//�׷��� �׳� while���� �ٷ� ����
	//������ do-while�� ���� while ������ ���
	//������ �� ���� ������
	//�׸��� �� �������� ���ǿ� ���� �ݺ����� ����.

	do
	{
		numswap(&aa, &bb, &cc);
		printf("aa=%d bb=%d cc=%d\n", aa, bb, cc); //�Է��� ���Ŀ� ���� �Ȱ��� ���ͼ� ������ ���´�. ���������� ������ �ѹ� ������!!! �׷��� �ٲٰ� ���� ���� �ȴ�.
	} while (aa2 != aa && bb2 != bb && cc2 != cc); //aa2�� aa�� �ٸ���, bb cc�� �ٸ���. 
	printf("%d %d %d\n", aa, bb, cc);


	//----------------------------------
	//	3.
	// ������ �Լ� ¥��
	//	1. �⺻ �������� main���� ¥����
	//	2. �⺻ ������ ������ִ� �� �Լ��� �����
	//	main���� ȣ���غ���

	//	3. �� �ܺ��� �� �ܱ��� �׸���
	//	���ϱ� �� ���� ���ϱ� �� ������ ������
	//	�Է��ؼ� ������ �����ϰ� �ϱ�
	//	�Ű������� ��ȯ���� ����

	//main.ver
	int gugudan,z;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("%d��\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
		printf("\n���� %d\n");
	}


	return 0;
}