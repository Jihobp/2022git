#include<stdio.h>// #1
//1. 이 학생 정보를 출력해주는 함수를 만드시오
//ex) 함수(s1) = > 1번 학생 도광현 //이렇게 출력하기
//2. 학생 배열에 값을 넣되, 중복된 번호가 나오면 다시 입력하게 코드를 짜시오.
//-> 2번이 어려우면 숫자만 저장하는 배열을 만들고, 거기서 중복된 값이 나오면 입력안하게 하는 코드 짜보기.
//3. 1, 2번을 이용하여 배열에 있는 학생들을 모두 출력해보시오.
struct Student
{
	int num;
	char name[100];
}typedef Student; 
void printStudent(Student s)
{
	printf("%d번 학생 %s\n", s.num, s.name);
}
int main()
{
	Student s = { .name = "독형굔", .num=1 };
	printStudent(s);
	Student students[3];
	for (int i = 0; i < 3; i++) //i++
	{
		int temp;
		printf("학생의 번호는?\n");
		scanf_s("%d", &temp);
		int duplicate = 0;
		for (int j = 0; j < i; j++)
		{
			if (students[j].num == temp)
			{
				printf("중복번호!\n");
				i--;
				duplicate = 1;
				break;
			}
		}
		if (duplicate == 0)
		{
			students[i].num = temp;
			printf("이름은?\n");
			rewind(stdin);
			gets(students[i].name);
		}
	}
	for (int i = 0; i < 3; i++)
		printStudent(students[i]);


	return 0;
}