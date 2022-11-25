#include<stdio.h>
//4. 1, 2번 코드들을 이용해서 아래와 같이 동작하게끔 코드를 짠다.
//int a = inputNum();
//int b = inputNum();
//printNum(a);
//printNum(b);
//swap(&a, &b);
//printNum(a);
//printNum(b);
int inputNum()
{
	int a;
	scanf_s("%d", &a);
	return a;
}
void printNum(int a)
{
	printf("%d\n", a);
}
void swap(int* pa, int* pb)
{
	int temp = *pa;
	*pa = *pb;
	*pb = temp;
}
int main()
{
	int a = inputNum();
	int b = inputNum();
	printNum(a);
	printNum(b);
	swap(&a, &b);
	printNum(a);
	printNum(b);
	return 0;
}
