#include<stdio.h>
#include"Mystructs.h"
int main()
{

	//�л� 1�� �����(����) ù��° ���
	KBStudent k1 = { 100,90,"�̵���" };

	//�л� 1�� �����(����) �ι��� ���
	KBStudent k2 = { .cScore = 100, .javaScore = 100, .name = "������" };

	//�л� 1�� ������(����) - ����° ���,
	KBStudent k3;
	k3.cScore = 100;
	k3.javaScore = 0;
	strcpy(k3.name, "�赿��");

	//�л� 1�� �����(�Է�)
	KBStudent k4;
	scanf_s("%d %d", &k4.cScore, &k4.javaScore);
	rewind(stdin);
	gets(k4.name); //.......???????????????????????????????? 
	//gets �� �ƴ϶� scanf ���� ���ڿ� �޺κ� ��©���ٱ�???????????????????????????????????????????????????????????????
	printf("%d %d %s", k4.cScore, k4.javaScore, k4.name);

	//�ִ� �ּ� ���ϴ� �͵� �־
	//�迭�� �ؾ� �Ѵ�.
	KBStudent students[5];
	//����
	/*KBStudent students[5] //������ �����ϴ� ��.
		= {{.cScore=10,.javaScore=10,"��ī��1"},
			{.cScore=10,.javaScore=10,"��ī��2"},
			{.cScore=10,.javaScore=10,"��ī��3"},
			{.cScore=10,.javaScore=10,"��ī��4"},
			{.cScore=10,.javaScore=10,"��ī��5"},
	};*/
	//3.
	for (int i = 0; i < 5; i++)
	{
		rewind(stdin); /// ? ? ? 
		printf("�̸��� ������?");
		gets(students[i].name);
		printf("C, Java ������?");
		scanf_s("%d %d",
			&students[i].cScore, &students[i].javaScore);
	}
	int cSum = 0;
	int javaSum = 0;
	for (int i = 0; i < 5; i++)
	{
		cSum += students[i].cScore;
		javaSum += students[i].javaScore;
	}
	printf("c, java ������ �� �� %d %d\n", cSum, javaSum);
	double cAvg = cSum / 5.0; ////q. �Ǽ��� �ϴ� ������ ?????????????????????
	double javaAvg = javaSum / 5.0;
	printf("c, java ������ ��� %f %f\n", cAvg, javaAvg);

	//4.
	int maxC = 0;
	int maxJava = 0;
	double avg_max = 0;
	int index_max = 0; //1�� �ε���(���)
	int index_max_C = 0; //1�� �ε���(C)
	int index_max_Java = 0; //1�� �ε���(Java)
	maxC = students[0].cScore; //// ����ü cScore�� students[0]��°�� maxC�� �ִ´� ?????
	maxJava = students[0].javaScore;
	avg_max = (students[0].cScore + students[0].javaScore) / 2.0;
	for (int i = 0; i < 5; i++)
	{
		if (maxC < students[i].cScore)
		{
			maxC = students[i].cScore;
			index_max_C = i;
		}
		if (maxJava < students[i].javaScore)
		{
			maxJava = students[i].javaScore;
			index_max_Java = i;
		}
		if (avg_max < (students[i].cScore + students[i].javaScore) / 2.0)
		{
			avg_max = (students[i].cScore + students[i].javaScore) / 2.0;
			index_max = i;
		}
	}

	printf("C 1�� : %s\n", students[index_max_C].name);
	printf("Java 1�� : %s\n", students[index_max_Java].name);
	printf("��� 1�� : %s\n", students[index_max].name);

	
	return 0;
}