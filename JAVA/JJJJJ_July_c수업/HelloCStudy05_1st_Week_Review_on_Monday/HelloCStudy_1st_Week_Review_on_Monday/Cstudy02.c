#include<stdio.h>	
int main()
{
	//반복문에 대해서 좀 더 해보기.
	
	//1. for문으로 무한루프 만들기.
	for (;;)
	{
		printf("a");;
	}


	for (int i = 0; i < 1;) 
	{
		printf("a");;
	}

	system("color a");
	for (int i = 0;;i++	)
	{
		//printf("a");
		printf("%d",i);;
		break;
	}

	//2. while문도 중첩이 되므로 while문으로 구구단 짤 수 있다.

	//3. 반복문 이용해서 문자열 안에 있는
	//내용들 하나하나 까볼 수도 있다.
	char name[100];
	printf("이름이 뭔가?");
	gets(name);
	//'\0' = NULL
	//for (int) 
	for (int i = 0; name[i] != '\0'; i++)
	printf("%c", name[i]);
	//

	return 0;
}

