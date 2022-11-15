#include<stdio.h>
int main() {
	char a = { 0 }, b = { 0 }, c;
	a = getchar();
	printf("%c\n", a);

	rewind(stdin);
	b = getchar();
	printf("%c\n", b);

	//rewind(stdin); 
	//초기화를 안해줘서 enter가 들어가 있어서 입력자체가 안된다!
	c = getchar();
	printf("%c\n", c);

	//scanf_s("%c", &b);
	//gets();
	//a = getchar();



	//1번 문제. 수정해서 작동하게 만들기. > 출력해서 몽키가 나오개하라.
	char a[7]; //a의 7번째 문자 배열 
	a = "monkey"; //몽키라는 문자가 입력된 a
	printf("%s", &a); //몽키가 들어간 a라는 문자열 출력


	//2번 문제. 1번 문제 안 보고 수정해서 작동하게 만들기.
	int b;
	b = "monkey";
	printf("%c", b);
}