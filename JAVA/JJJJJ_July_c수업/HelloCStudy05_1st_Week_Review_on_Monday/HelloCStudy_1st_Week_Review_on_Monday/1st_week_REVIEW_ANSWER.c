#include<stdio.h>
int main()
{
	//1. 안녕하세요 제 이름은 ~~~입니다. (~~~대신 자기 이름 넣기)

	printf("안녕하세요 제 이름은 박지호입니다.\n");



	//2. 자신의 나이를 입력받고 출력한다.
	int age;
	printf("나이는 몇살입니까?", &age); //printf("입력 : "); 으로 해도 ok !
	scanf_s("%d", &age);
	scanf_s("제 나이는 %d입니다.", &age);


	//3. 피타고라스의 법칙 피타고라스의 법칙 결과 출력하기 (a^2 + b^2 = c^2 에서의 c^2 값 출력하면 됨)
	//입력1: 3
	//입력2 : 4
	//출력 : 25

	int a, b;
	printf("입력1: ");
	scanf_s("%d", &a);
	printf("입력2: ");
	scanf_s("%d", &b);
	printf("출력 : %d\n", (a * a) + (b * b));

	if (0)
	{
		int a, b;
		printf("a는?b는?\n");

		scanf_s("%d%d", &a, &b);
		printf("피타고라스의 법칙은 a^2(%d) + b^2(%d) = c^2(%d) 입니다. \n", a * a, b * b, a * a + b * b);
	}


	//4. 내 옆자리 학생의 이름은 %s입니다.(%s는 입력받는 것)
	
		char name[100]; //100=영문 99개, 한글 49글자. 
		printf("옆자리 학생의 이름은 무엇입니까?\n");
		rewind(stdin); //문장변경은 rewind.
		gets(name); //(scanf_s는 띄어쓰기 인지 xxx못해서 외국이름은 gets 쓴당~~~~ 숫자는 scanf_S, 문장은 gets 쓴다고 생각./
		//scanf_s("%s", name, sizeof(name));
		printf("제 옆자리 학생의 이름은 %s입니다.\n", name); //문자열은 &x굳이 안해도된당


	//5. 달러를 입력받으면 그에 따른 출력
	//입력: 1
	//출력 : 1298.89 달러

		double dollar; //double 실수 == %lf, //int, %d 적어도 되긴 된당.
		printf("입력 : ");
		scanf_s("%lf", &dollar);
		printf("출력 : %lf\n", dollar * 1298.89);


	//6. 입력한 숫자가 짝수라면 "짝!" 입력한 숫자가 홀수라면 "홀!" 단, 음수일 경우 무조건 "음수!!!"라고만 출력하기
		if (0)
		{

		int num;
		if (num > 0 && num % 2 == 0)
			printf("짝!");
		if (num > 0 && num % 2 == 1)
			printf("홀!");
		}
	

	//7. 구구단 5단을 출력할 것.
	//5x1 = 5
	// ...
	//5x9 = 45
	if (0)
	{

	}



	//8. 구구단 n단을 출력할 것.



	//9. 구구단 2단부터 9단까지 출력하기



	//10. 1부터 n까지의 합을 구하되 아래와 같은 출력 양식 단 0 이하의 숫자일 경우 잘못된 입력이라고 출력해주기
		//입력 : 5
		//1 + 2 + 3 + 4 + 5 = 15



	return;
}