#include<stdio.h>
//	3.구구단 함수 짜기
//	1) 기본 구구단을 main에서 짜보기
//	2) 기본 구구단 출력해주는 걸 함수로 만들고 main에서 호출해보기
void gugu()
{
	//기본적인 구구단(2단부터 9단까지 x1부터 x9까지)
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
			printf("%d x %d = %d\n", i, j, i * j);
	}
}
//	4. 몇 단부터 몇 단까지 그리고
//	곱하기 몇 부터 곱하기 몇 까지를 구할지 입력해서 구구단 수행하게 하기
//	매개변수와 반환형은 없음
void gugudan()
{
	printf("몇단부터 몇단?\n");
	int dan_s, dan_e;
	scanf_s("%d %d", &dan_s, &dan_e);
	printf("x몇 부터 x 몇까지?");
	int x_s, x_e;
	scanf_s("%d %d", &x_s, &x_e);
	for (int i = dan_s; i <= dan_e; i++)
	{
		for (int j = x_s; j <= x_e; j++)
			printf("%d x %d = %d\n", i, j, i * j);
	}
}

int main()
{
	//기본적인 구구단(2단부터 9단까지 x1부터 x9까지)
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
			printf("%d x %d = %d\n", i, j, i * j);
	}
	gugu(); //함수로 2번째 호출 ㅇㅅㅇ
	gugudan();
	return 0;
}