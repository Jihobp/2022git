#include<stdio.h>
//4. ��ȯ���� ���� �Ű����� char 2���� ���Ͽ� ������ ȭ����� �ٲٴ� �Լ� ���Ͻÿ�.
void q4(char a, char b)
{
	char color[9] = "color ";
	color[6] = a;
	color[7] = b;
	color[8] = NULL;
	system(color);
}
//5. 1���� 100���� ���ϴ� �Լ��� �����,
//1 + 2 + 3..... + 100 = 5050 �̶�� �޽����� ������ִ� �Լ�
//�����(�� 5050���� ��ȯ���ش�)
int q5()
{
	int total = 1;
	printf("1");
	for (int i = 2; i <= 100; i++)
	{
		printf("+%d", i);
		total += i;
	}
	printf("\ntotal=%d\n", total);
	return total;
}
//6. a���� b���� ���ϴ� �Լ��� �����
//1x2x......xb = ��� ����ϰ� ��ȯ�� �ִ� �Լ� �����
//����
//1x2x3x4x5
//total = 120
int q6(int a, int b)
{
	int total = a;
	printf("%d", total);
	for (int i = a + 1; i <= b; i++)
	{
		total *= i;
		printf("x%d", i);
	}
	printf("\ntotal:%d\n", total);
	return total;
}
int q5_for_q7(int a, int b)
{
	int total = a;
	printf("%d", total);
	for (int i = a + 1; i <= b; i++)
	{
		printf("+%d", i);
		total += i;
	}
	printf("\ntotal=%d\n", total);
	return total;
}
void q7(int a, int b, int c)
{
	switch (c)
	{
	case '+':
		q5_for_q7(a, b);
		break;

	case '*':
	case 'x':
	case 'X':
		q6(a, b);
		break;

	default:
		break;
	}
}
int main()
{
	//char color[9] = "color ";
	//color[6] = '2';
	//color[7] = 'a';
	//color[8] = NULL;
	//system(color);
	printf("4�� ���� ���� �Է�\n");
	char a = getchar();
	rewind(stdin);
	char b = getchar();
	q4(a, b);

	printf("5��\n");
	//int total = 1;
	//printf("1");
	//for (int i = 2; i <= 100; i++)
	//{
	//	printf("+%d", i);
	//	total += i;
	//}
	//printf("\ntotal=%d\n", total);
	printf("5���� ���ϰ� : %d\n", q5());


	printf("6��\n");
	int aa, bb;
	printf("aa?");
	scanf_s("%d", &aa);
	//int total = aa;

	printf("bb?");
	scanf_s("%d", &bb);
	//printf("%d", aa);
	printf("6���� ���ϰ� : %d\n", q6(aa, bb));
	//for (int i = aa+1; i <= bb; i++)
	//{
	//	total *= i;
	//	printf("x%d", i);
	//}
	//printf("\ntotal:%d\n", total);

	//7��
	printf("7��\n");
	//aa�� bb �̿��� ����
	rewind(stdin);
	char c = getchar();
	//switch (c)
	//{
	//case '+':
	//	q5_for_q7(aa, bb);
	//	break;

	//case '*':
	//case 'x':
	//case 'X':
	//	q6(aa, bb);
	//	break;

	//default:
	//	break;
	//}
	q7(aa, bb, c);

	return 0;
}