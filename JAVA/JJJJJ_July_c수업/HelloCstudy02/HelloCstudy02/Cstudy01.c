#include<stdio.h>
int main()
{
	//int, double, char
	//����
	int age = 28; //���� ���� ��
	long bigValue = 9999999999;
	//long long  :  8����Ʈ ��~~~~~~~~
	short smallValue = 5;
	//�Ǽ�
	double pi_value = 3.1415;//8byte �Ǽ� = ���̾�
	float myPi = 3.14; //4byte �Ǽ�

	char MyInitial = 'P';
	//age���� nowYear ���� ���� ��� ���� �ٲ�.
	int nowYear = 2022;
	printf("���� �¾ ������ %d�Դϴ�.\n",
		nowYear + 1 - age);
	printf("������ ���� %f�Դϴ�.\n", pi_value);

	//c�����÷ο�overflow : ���� �ʰ��ϸ� ����.??

	//������ ���ؼ� ���� �Է¹޾ƺ���.
	//���� �Է��� ������ �������� ���غ���.

	int input;
	printf("���� �Է����ּ���.");
	scanf_s("%d", &input);
	printf("�� ������ ������ %d�Դϴ�.\n", input * input);
	int result = input * input;
	printf("�� : %d\n", result);

	//1. int age ��� ������ ���� �� �� ������ ���� ���̸� �Է��Ѵ�. 
	//2. �� ���̴� age���Դϴ�. ���
	//3. age ������ �̿��ؼ� ���� �¾ ������ Ȯ���غ���.(�ѱ��� ���� ����)
	//4.. ���� ������ r ���� �Է¹ް�, ���� ���̿� ���� �ѷ��� ����ϱ�
	//���� ����: r*r*3.14
	//���� �ѷ�: 2*r*3.14
	//5. byte�� �Է¹ް� �ῡ �ش��ϴ� bit�� ����ϱ�
	//�Է� : 1 �Է� :5
	//��� : 8 ��� : 40
	//6. bit���� �Է¹ް� �׿� �ش��ϴ� byte�� ����ϱ�
	//�Է� : 8 ��� : 1
	//�Է� : 40 ��� : 5
	//7. 5,6������ �Է¹��� �� ������ ����ϱ�.
	//mybit * 8 = mybyte ���Դϴ�.
	


	return 0;
}