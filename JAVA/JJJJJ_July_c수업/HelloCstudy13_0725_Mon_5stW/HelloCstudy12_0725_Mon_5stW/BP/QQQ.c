#include<stdio.h>
//1. 이 학생 정보를 출력해주는 함수를 만드시오
//ex) 함수(s1) = > 1번 학생 도광현
//이렇게 출력하기

Struct student2
{
	int num;
	char name[100];
}typedef stu2;

int main()
{
	stu s1 = { .name = "", .num = 10 };
	printf("학생의 이름은?")ㅣ
		gets(ss[2].name);
	scanf("%s", s1.name);
	printf("학생의 번호는?");
	scanf_s("%d", s1.num);

	return 0;
}

struct student
{
	int num;
	char name[100];
}typedef stu;

int main()
{
	stu s1 = { .name = "", .num = 10 };
	printf("학생의 이름은?");
	gets(ss[2].name);
	scanf_s("%s", s1 .name);
	printf("학생의 번호는?");
	scanf_s("%d", s1 .num);
	
return 0;
}

//2. 학생 배열에 값을 넣되, 중복된 번호가 나오면 다시 입력하게 코드를 짜시오.
//-> 2번이 어려우면 숫자만 저장하는 배열을 만들고, 거기서 중복된 값이 나오면 입력안하게 하는 코드 짜보기.

//3. 1, 2번을 이용하여 배열에 있는 학생들을 모두 출력해보시오.
