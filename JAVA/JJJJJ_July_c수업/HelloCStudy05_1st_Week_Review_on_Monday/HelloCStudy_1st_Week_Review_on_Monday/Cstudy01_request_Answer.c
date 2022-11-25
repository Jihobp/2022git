#include<stdio.h>
int main()
{	if(0)
{//1.팩토리얼을 출력해보세요. 
	// 입력 : 5
	// 출력 : 5!=5x4x3x2x1
	printf("몇 팩토리얼?");
	int fact;
	scanf_s("%d", &fact);
	printf("%d!=%d", fact, fact);	// ??????????????????????????????????????????????????
	//ex : fact가 5라면
	//i는 4부터 1까지
	for (int i = fact - 1; i > 0; i--)
	{
		printf("x%d", i);
	}

	//2. n부터 m까지의 합을 구하되, m은 n보다 같거나 커야한다. 
	//if문 줘서 m이 작으면
	//에러메세지 출력할 수도 있고
	//아니면 그 변수의 값을 바꿔줄 수도 있다.
	//변수의 값을 바궈주는걸 해보고...
	//3번에선 에러메세지 출력하는걸 해보자.

	int n, m;
	printf("\nn과 m 입력하세요.");
	scanf_s("%d %d", &n, &m);
	if (n > m) //n이 더 클 경우 둘의 값을 서로 바꿈.
	{
		int temp = m; //temporary
		m = n;
		n = temp;
	}

	int sum = 0;
	for (int i = n; i <= m; i++)
		sum += i;
	printf("%d부터 %d까지의 합은 %d이다.\n", n, m, sum);

	//ㄱxxxxxxxxxxxxxxxxxxx망한거xxxxxxxxxxxxxxxxxxxxxxxx
	if (0)
	{
		int n, m;
		int sum;
		printf("n부터 m까지의 합을 구하시오.\n");
		for (int n; n > 0; n++)
			printf("%d", &n);

	} // 망한 거



	//3. 2번 문제의 연장인데, 짝수의 합만 구한다. 단 continue 사용할 것.
	// ㄱ 내꺼
	if (0)
	{
		printf("\n짝수의 합을 구하시오.");
		scanf_s("%d %d", &n, &m);
		for (int i = n; i <= m; i++)
		{
			if (i % 2 != 0)
				continue;
			printf("짝수 d%\n", i);
		}
	}	 //내꺼

	printf("n? m? 입력");
	scanf_s("%d %d", &n, &m);
	if (n > m)
	{
		printf("첫번째가 두번째보다 커서 합 못 구함!\n");
	}
	else
	{
		sum = 0; //초기화 해줘야 더할 수 있당.
		for (int i = n; i <= m; i++) //i 값 누적.
		{
			if (i % 2 != 0)
				continue; //짝수인 경우에만 sum에 값 누적 가능

			sum += i;
		}
		printf("%d부터 %d까지의 합은 %d이다.\n", n, m, sum);
	}



	//4. 숫자를 입력받고, 그 것의 제곱을 출력하는 코드를 짜되, 무한반복한다.
	//단 0 이하의 숫자를 입력받으면 이 코드를 종료시킨다.

	while (1)
	{
		int input;
		printf("입력");
		scanf_s("%d", &input);
		if (input <= 0)
			break;
		printf("제곱값 : %d\n", input * input);
	}
	printf("4번 종료됨 \n");

	//do while은 지금처럼 input이 0이어서
	//while 조건을 만족하지 못 해도 무조건 한 번은 실행한다.
	//즉 무한루프를 돌거나 안돌거나 처음에 값은 무조건
	//받아야 한다면 do while 을 쓴다.
}
	


	//5. 다음 입력에 따른 출력을 해보세요.
	int input = 0;
	int N;
	printf("입력");
	scanf_s("%d", &N);
	for (int i = 0; i < 2 * N; i++)//행부분
	{
		int onOFFSwitch = i;
		for (int j = 0; j < N; j++)
		{
			if (onOFFSwitch % 2 == 0)
				printf("*");
			else
				printf(" ");
			onOFFSwitch++;
		}
		printf("\n"); //한 줄 출력하고 한 줄 띄우는 것.
	}

	
//입력: 1
//출력 : *
//입력 : 2
//출력 : *
      //*
	//*
	  //*
//입력 : 3
//출력 : **
//*
//**
//*
//**
//*

	return 0;
}