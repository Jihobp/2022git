#include<stdio.h>
int main()
{
	printf("�� ���ΰ���?(1��)");
	int sec;
	scanf_s("%d", &sec);
	//123->2��3��
	//���� ���� �� ������(/)
	//�ʸ� ���� �� ������(%)

	printf("%d�� %d��\n", sec / 60, sec % 60);
	
	//T_T..........................................why am i ~~~

	
	printf("2x+b�� �� ���ϱ�(2��)\n");
	printf("x��?");
	int x, b;//���� ���� x�� b ����
	scanf_s("%d", &x);
	printf("b��?");
	scanf_s("%d", &b);
	printf("2x+b=%d\n", (2 * x) + b);



	//3. �ڽ��� ��� ����(+ - 0 �� �ϳ�), mbti, ������(RH +�� -�� �Է�),
	//Ű, ���� �̷� �������� �Է¹ް�, ����غ���.
	//���� ����� %c�Դϴ�. �� mbti�� %s�̰�, �������� %s�Դϴ�.
	//�� Ű�� %.2f�̸�, ���̴� %d���Դϴ�.
	printf("�����?");
	rewind(stdin);//char �Է¹ޱ� ���̹Ƿ� rewind.
	//char feel = cetchar();
	char feel;
	scanf_s("%c", &feel, 1);
	printf("mbti?");
	rewind(stdin); 
	char mbti[5];
	scanf_s("%s", mbti, sizeof(mbti));
	printf("������?");
	rewind(stdin);
	char bType[10];
	gets(bType);

	//double Ÿ�� ����(scanf_s)�� ���� ������
	//lf�� �ϱ�
	//��µ�.. lf��. f�� �ص� �Ǳ��ѵ�
	//doubleŸ���� long float�̹Ƿ� lf�� �´�. 
	//f�� �ϰ��ǰ� ���� �ʹٸ� float�� ����ȴ�.
	//���ڴ� ������ scanf_s,
	//���ڴ� get�� scanf_s�� Ok~~~~~~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!!!!
	double cm;
	printf("Ű��?");
	scanf_s("%lf", &cm);
	printf("���̴�?");
	int age;
	scanf_s("%d", &age);
	printf("�� ����� %c�Դϴ�. �� mbti�� %s�Դϴ�. �������� %s�Դϴ�. �� Ű�� %.2f�̸�, ���̴� %d���Դϴ�.\n",
		feel, mbti, bType, cm, age);

	//4. ���� a�� ���� �����ؼ� ���� ���� �ظ� ���϶�.
	//(x+a)(x+b) = > x^2 + (a+b)x + (a*b)
	//������ x,b �����ؼ� ����ȵ�.
	// 2�� �̻��� �� �Է��ϱ�
	//scanf_s("%d %d", &x, &b);
	printf("x��?");
	int a;//���� ���� x�� a, b ����
	scanf_s("%d", &x);
	printf("a��?");
	scanf_s("%d", &a);
	printf("b��?");
	scanf_s("%d", &b);
	printf("(%d+%d)(%d+%d)=%d\n", x,a,x,b, (x*x)+((a+b)*x)+(a*b) );


	return 0;
}