#include<stdio.h>
main()
{
	//문제1
	if (0)
	{

	char name[10];
	printf_s("이름을 입력하세요\n");
	scanf_s("%s", name, sizeof(name));
	printf("내 이름은 %s입니다.", name);
	rewind(stdin);
	}
	//문제2
	if (0)
	{
		int age;
		printf_s("나이를 입력하세요\n");
		scanf_s("%d", &age);
		printf("내 나이는 %d살입니다.", age);

	}
	//문제 3
	if (0)
	{
		int a, b;
		printf("a와 b값을 각각 입력 ㄱㄱ\n");
		scanf_s("%d%d", &a, &b);
		printf("피타고라스의 법칙 결과는 %d^2 + %d^2 = %d입니다. ",a,b,a*a+b*b);
	}
	//문제 4번
	if(0)
	{
		char tonari[200];
		printf("옆자리의 학생의 이름을 입력하세요\n");
		gets(tonari);
		printf("옆자리의 학생의 이름은 %s입니다.", tonari);

	}
	//5번
	if (0)
	{
		int dala;
		printf("몇 달라에요?\n");
		scanf_s("%d", &dala);
		printf("이건 %f원" ,dala * 1298.89);
	
	}
	//6번
	if (0)
	{
		printf("숫자 입력해봐\n");
			int n;
		scanf_s("%d", &n);
		if (n < 0)
			printf("음수입니다");
		else if (n == 0)
			printf("0입니다");
		else
		{
			if (n % 2 == 1)
				printf("홀수");
			else
				printf("짝수");
		}
		/* 다른방법
		범위만 같게해주면 && 사용해서 if를 써도 된다
	
		
		*/




	}

		//7. 구구단 5단을 출력할 것.
		//5x1 = 5    5x9 = 45
		if (0)
		{
		
			for (int i = 1; i < 10; i++)
				printf("%d ", i * 5);

		}
		//8번
		if (0)
		{
			printf("몇단을 출력할까?\n");
				int n;
					scanf_s("%d", &n);
				for (int i = 1; i < 10; i++)
				{
					printf("%d * %d = %d ", n,i,n*i);
				}
		}
		//9번 구구단은 컴공학생들의 기본이다.
		if (0)
		{

			for (int i = 2; i < 10; i++)
			{
				for(int n=1;n<10;n++)
				printf("%d곱%d=%d ",i,n, i * n);
				printf("\n");
				
			}

		}

		/* 10. 1부터 n까지의 합을 구하되 아래와 같은 출력 
		양식 단 0 이하의 숫자일 경우 잘못된 입력이라고 출력해주기
	     입력 : 5         1 + 2 + 3 + 4 + 5 = 15 */

		if (1)
		{
			int sum = 0;
			printf("몇까지 합할까요?\n");
			int n;
			scanf_s("%d", &n);
		    printf("1");
			sum = 1;
			for (int i = 2; i <= n; i++)
			{
				sum += i; //값 누적
				printf("+%d", i); //메시지 출력
			}
			printf("=%d\n", sum);




		}


	return 0;	
}