#include<stdio.h>
int main()
{
	//6. 입력한 숫자가 짝수라면 "짝!" 입력한 숫자가 홀수라면 "홀!" 단, 음수일 경우 무조건 "음수!!!"라고만 출력하기
		int num;
		printf("숫자를 입력하세요.");
		scanf_s("%d", &num);
		if (num < 0)
		{
			printf("음수!!!\n");
		}

		else if (num == 0)
		{
			printf("num은 0!!!/n");
		}

		else
		{
			if (num % 2 == 0)
				printf("짝!");
			else printf("홀!\n");
		}

		////////////////
		//else if 적느냐 아니냐의 차이는 if 일일히 다 체크하는것. 
		//else if 는 네개 중 하나만 체크.
		if (0)
		{
			if (num < 0)
				printf("음수!\n");
			else if (num == 0)
				printf("0\n");
			else if (num > 0 && num % 2 == 0)
				printf("짝!\n");
			else if (num > 0 && num % 2 !=0) // !=0??????
				printf("홀!\n");
		}


		// for 문에 대한 복습★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//7. 구구단 5단을 출력할 것.  
		printf("구구단 5단 출력하기\n");
		for (int i = 1; i < 10; i++) 
			printf("5 x%d = %d\n", i, 5 * i);
		// int i 선언하면 안쪽에서만 대입되고 
		//10미만이 참이면 printf 실행, (거짓이면 실행 x)
		//i++ 증가 시킴. i--로 감소도 okz
		//5 x%d = i 값, %d= 5*1 값.

	//8. 구구단 n단을 출력할 것.
		printf("몇 단?");
		int n;
		scanf_s("%d", &n);
		for (int i = 1; i < 10; i++)
			printf("%d x %d = %d\n", n, i, n * i);
		

	//9. 구구단 2단부터 9단까지 출력하기
		for(int n =2; n< 10; n++)//반복
		{
		for (int i = 1; i < 10; i++)
			printf("%d x %d = %d\n", n, i, n * i); //n값을 주는것.
		}


	//10. 1부터 n까지의 합을 구하되 아래와 같은 출력 양식 단 0 이하의 숫자일 경우 잘못된 입력이라고 출력해주기
		//입력 : 5
		//1 + 2 + 3 + 4 + 5 = 15

		int sum = 0;
		printf("몇까지 더할까요?");
		scanf_s("%d", &n);
		printf("1");
		sum = 1; // 1 먼저 출력후 for문에서 2부터 i++
		for (int i = 2; i <= n; i++)
		{
			sum += i; //값 누적
			printf("+%d", i); //메세지 출력
		}
		printf("=%d\n", sum);

		// for 문안에 변수선언하면 for문 안에서만 i 선언된다.
		// else {} 문안에 int 쓰면 else 문 안에서만 선언된다. 
		// Q. 중괄호 안에 있는건 그 안에서만 ->x 변수 안에서 선언.
		return 0;
}
