#include<stdio.h>
//4. 반환값은 없고 매개변수 char 2개에 의하여 배경색과 화면색을 바꾸는 함수 구하시오.
void q4(char a, char b)
{
	char color[9] = "color ";
	color[6] = a;
	color[7] = b;
	color[8] = NULL;
	system(color);
}
//5. 1부터 100까지 더하는 함수를 만들되,
//1 + 2 + 3..... + 100 = 5050 이라는 메시지도 출력해주는 함수
//만들기(단 5050값은 반환해준다)
int q5()
{
	int total = 1;
	printf("1");
	for (int i = 2; i <= 100; i++)
	{
		printf("+%d", i);
		total += i;
	}
	printf("\ntotal=%d\n", total);
	return total;
}
//6. a부터 b까지 곱하는 함수를 만들고
//1x2x......xb = 결과 출력하고 반환값 주는 함수 만들기
//예시
//1x2x3x4x5
//total = 120
int q6(int a, int b)
{
	int total = a;
	printf("%d", total);
	for (int i = a + 1; i <= b; i++)
	{
		total *= i;
		printf("x%d", i);
	}
	printf("\ntotal:%d\n", total);
	return total;
}
int q5_for_q7(int a, int b)
{
	int total = a;
	printf("%d", total);
	for (int i = a + 1; i <= b; i++)
	{
		printf("+%d", i);
		total += i;
	}
	printf("\ntotal=%d\n", total);
	return total;
}
void q7(int a, int b, int c)
{
	switch (c)
	{
	case '+':
		q5_for_q7(a, b);
		break;

	case '*':
	case 'x':
	case 'X':
		q6(a, b);
		break;

	default:
		break;
	}
}
int main()
{
	//char color[9] = "color ";
	//color[6] = '2';
	//color[7] = 'a';
	//color[8] = NULL;
	//system(color);
	printf("4번 문제 문자 입력\n");
	char a = getchar();
	rewind(stdin);
	char b = getchar();
	q4(a, b);

	printf("5번\n");
	//int total = 1;
	//printf("1");
	//for (int i = 2; i <= 100; i++)
	//{
	//	printf("+%d", i);
	//	total += i;
	//}
	//printf("\ntotal=%d\n", total);
	printf("5번의 리턴값 : %d\n", q5());


	printf("6번\n");
	int aa, bb;
	printf("aa?");
	scanf_s("%d", &aa);
	//int total = aa;

	printf("bb?");
	scanf_s("%d", &bb);
	//printf("%d", aa);
	printf("6번의 리턴값 : %d\n", q6(aa, bb));
	//for (int i = aa+1; i <= bb; i++)
	//{
	//	total *= i;
	//	printf("x%d", i);
	//}
	//printf("\ntotal:%d\n", total);

	//7번
	printf("7번\n");
	//aa와 bb 이용할 것임
	rewind(stdin);
	char c = getchar();
	//switch (c)
	//{
	//case '+':
	//	q5_for_q7(aa, bb);
	//	break;

	//case '*':
	//case 'x':
	//case 'X':
	//	q6(aa, bb);
	//	break;

	//default:
	//	break;
	//}
	q7(aa, bb, c);

	return 0;
}