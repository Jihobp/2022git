#include<stdio.h>
#include"Student.h"
int main()
{
	//�켱...�л� 1���� ����� ���غ���.
	//�������ڸ��� �� �ο��ϴ� �� ����.
	Stu s1 = { .math = 40, .kor = 50, .eng = 55 };//�Ӽ� ����
	Stu s2 = { 50,60,55 };//math eng kor ������� �� ��.

	int avg = (s1.math + s1.kor + s1.eng) / 3;
	int avg2 = (s2.math + s2.kor + s2.eng) / 3;

	if (avg >= avg2)
		printf("ù ��° �л��� ����� �� ũ��. \n");
	else
		printf("�� ��° �л��� ����� �� ũ��. \n");



	//���� 3��° ���� �Ф�

	Stu students[5];
	for (int i = 0; i < 5; i++)
	{
		printf("�л��� ������ ���� �Է��ϼ���.");
		scanf_s("%d %d %d",
			&students[i].kor, &students[i].eng, &students[i].math);
	}
	Stu Elite = students[0]; //�ƹ��ų� �־ ok. ��¥�� �� ���δ����༭ ���x
	int num;
	for (int i = 0; i < 5; i++)
	{
		int average = students[i].kor + students[i].eng + students[i].math;
		int max = Elite.kor + Elite.eng + Elite.math;
		max /= 3;
		
		if (max < average) //�ƽ��� ��պ��� ������??????????? ���������� �ƽ����� ũ�� ����Ʈ �� �ٲ٤ż�...
		{
			Elite = students[i];
			num = i;
		}
	}
	printf("%d��° �л��� 1���̴�. \n", num);

	return 0;
}