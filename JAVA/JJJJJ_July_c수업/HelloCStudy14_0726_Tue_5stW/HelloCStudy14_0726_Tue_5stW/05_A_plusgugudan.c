#include<stdio.h>
//1. 구구단 값의 합을 리턴(= 반환)하는 함수 작성
//2. 매개변수 이용해서, 특정 단만 출력
//ex) 매개변수 5 면 5x1 ~5x9 출력
//3. 매개변수 2개 이용하기
//x몇부터 x몇까지 출력할지 결정
//ex) 1, 5 -> 2x1~2x5 ~9x1 ~9x5
//4. 매개변수 2개를 이용해서 결과 출력하고
//그 합을 리턴
//2, 6 -> 2~6단까지 출력하고 그 합을 리턴

//void라면 return; 적거나
//생략가능
//int, double, char 등이라면
//반드시 return을 적어야 함
//깜빡하고 return 안 적어도
//동작하거나 이상한 동작을 할 수도 있는 데
//그 원인은 모르겠고... 여튼
//int 앞에 적었으면 반드시 return 정수;
//적어야 함
int gugudan_sum() //1번 반환
{
	int sum = 0;
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
			sum += (i * j);
	}
	return sum;
}

void q2_dan_print(int dan) //2번 출력
{
	for (int i = 1; i <= 9; i++)
		printf("%d x %d=%d\n", dan, i, dan * i);
}

void q3_gugu_gob(int s, int e) //3번 출력
{	
	for (int i = 2; i <= 9; i++)
	{
		for (int j = s; j <= e; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}
}
int q4_gugudan_sum(int s, int e) //반환   
{	//s랑 e값중에 s 값이 더 크면 ? ? ? ? ? ? ? swap 함수를 쓰거나, 함수 내에서 바꿔 주면 좋당!
	int sum = 0;
	for (int i = s; i <= e; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d", i, j, i * j);
			sum += i * j;  
		}
	}
	return sum;
}
int main()
{	
	printf("q1 : %d", gugudan_sum());
	int dan;
	printf("\nq2\n");
	scanf_s("%d", &dan);
	q2_dan_print(dan);
	printf("\nq3 x몇부터 x몇까지 할까요?");
	int start, end;
	scanf_s("%d %d", &start, &end);
	q3_gugu_gob(start, end);
	printf("몇 단부터 몇 단?\n");
	int start_dan, end_dan;
	scanf_s("%d %d", &start_dan, &end_dan);
	int result = q4_gugudan_sum(start_dan, end_dan);
	printf("\n4번 결과 : %d\n", q4_gugudan_sum(start_dan, end_dan));
	return 0;
}