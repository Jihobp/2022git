#include<stdio.h>// #1
//1. �� �л� ������ ������ִ� �Լ��� ����ÿ�
//ex) �Լ�(s1) = > 1�� �л� ������ //�̷��� ����ϱ�
//2. �л� �迭�� ���� �ֵ�, �ߺ��� ��ȣ�� ������ �ٽ� �Է��ϰ� �ڵ带 ¥�ÿ�.
//-> 2���� ������ ���ڸ� �����ϴ� �迭�� �����, �ű⼭ �ߺ��� ���� ������ �Է¾��ϰ� �ϴ� �ڵ� ¥����.
//3. 1, 2���� �̿��Ͽ� �迭�� �ִ� �л����� ��� ����غ��ÿ�.
struct Student
{
	int num;
	char name[100];
}typedef Student; 
void printStudent(Student s)
{
	printf("%d�� �л� %s\n", s.num, s.name);
}
int main()
{
	Student s = { .name = "������", .num=1 };
	printStudent(s);
	Student students[3];
	for (int i = 0; i < 3; i++) //i++
	{
		int temp;
		printf("�л��� ��ȣ��?\n");
		scanf_s("%d", &temp);
		int duplicate = 0;
		for (int j = 0; j < i; j++)
		{
			if (students[j].num == temp)
			{
				printf("�ߺ���ȣ!\n");
				i--;
				duplicate = 1;
				break;
			}
		}
		if (duplicate == 0)
		{
			students[i].num = temp;
			printf("�̸���?\n");
			rewind(stdin);
			gets(students[i].name);
		}
	}
	for (int i = 0; i < 3; i++)
		printStudent(students[i]);


	return 0;
}