#include<stdio.h>
int q1(int a, int b, int c)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c != 0)
			sum += i;
	}
	return sum;
}
int q2(int Sec)
{
	if (Sec >= 3600)
	{
		printf("Error!");
		return -1;
	}
	int m = Sec / 60;
	printf("%d분 %d초\n", m, Sec % 60);
	return m;
}
void q3()
{
	system("color 3a");
}
int main()
{
	/*
	1. 변수 a와 b와 c의 값을 입력받고, a부터 b까지의 합을 구하되, c의 배수 부분은
제외하고 합을 구할 것.
이 값을 main에 반환하는 함수 작성하기(못하겠다면 그냥 main에 먼저 짜보기)
	*/
	//a = 1
	//b = 100
	//c = 3
	//1부터 100까지의 합을 구하는 데 3의 배수 빼고 더한다.
	int a, b, c;
	printf("숫자를 입력하세요.");
	scanf_s("%d %d %d", &a, &b, &c);
	//int sum = 0;
	//for (int i = a; i <= b; i++)
	//{
	//	if (i % c != 0)
	//		sum += i;
	//}
	printf("%d부터 %d까지의 합(%d 배수 제외)은 %d입니다.\n", a,b,c, q1(a, b, c));
	//2. Sec(초) 값을 입력받아서 시간이 h분 m초라는 걸 출력하되, 3600이상의 값을 받으면
	//오류 메시지를 출력한다.
	//그리고 m 값은 반환한다.
	printf("2. 초 값을 입력받으세요.");
	int Sec;
	scanf_s("%d", &Sec);
	//if (Sec >= 3600)
	//	printf("Error!");
	//else
	//	printf("%d분 %d초\n", Sec / 60, Sec % 60);
	int result_q2 = q2(Sec);
	printf("2번 반환값 :%d\n", result_q2);

	//system("color 3a");
	q3();

	return 0;

}