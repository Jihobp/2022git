#include<stdio.h>
int main()
{
//1. int age ��� ������ ���� �� �� ������ ���� ���̸� �Է��Ѵ�. 
int age = 28;

//2. �� ���̴� age���Դϴ�. ���
printf("�� ���̴� %d���Դϴ�.",age);

//3. age ������ �̿��ؼ� ���� �¾ ������ Ȯ���غ���.(�ѱ��� ���� ����)
int nowYear = 2022;
printf("���� �¾ �⵵�� %d�Դϴ�.\n",
	nowYear + 1 - age);
;
//4.. ���� ������ r ���� �Է¹ް�, ���� ���̿� ���� �ѷ��� ����ϱ�
//���� ����: r*r*3.14
//���� �ѷ�: 2*r*3.14
double pi_value=3.1415;
printf("���������� %f�Դϴ�.\n", pi_value);

//5. byte�� �Է¹ް� �ῡ �ش��ϴ� bit�� ����ϱ�
//�Է� : 1 �Է� :5
//��� : 8 ��� : 40
int input;
double byte = 1; input = 5;
printf("bit=%d, byte =8");
printf("bit=%d, byte =40");


//6. bit���� �Է¹ް� �׿� �ش��ϴ� byte�� ����ϱ�
//�Է� : 8 ��� : 1
//�Է� : 40 ��� : 5
float bit;
printf("byte=%d, bit 8");
printf("byte=%d, bit 40");

//7. 5,6������ �Է¹��� �� ������ ����ϱ�.
//mybit * 8 = mybyte ���Դϴ�.

return 0;
}