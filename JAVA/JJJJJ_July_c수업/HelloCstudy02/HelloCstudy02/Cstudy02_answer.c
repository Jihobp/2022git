#include<stdio.h>
int main()
{
	printf("몇 초인가요?(1번)");
	int sec;
	scanf_s("%d", &sec);
	//123->2분3초
	//분을 구할 땐 나누기(/)
	//초를 구할 땐 나머지(%)

	printf("%d분 %d초\n", sec / 60, sec % 60);
	
	//T_T..........................................why am i ~~~

	
	printf("2x+b의 해 구하기(2번)\n");
	printf("x는?");
	int x, b;//정수 변수 x와 b 선언
	scanf_s("%d", &x);
	printf("b는?");
	scanf_s("%d", &b);
	printf("2x+b=%d\n", (2 * x) + b);



	//3. 자신의 기분 정보(+ - 0 중 하나), mbti, 혈액형(RH +와 -도 입력),
	//키, 나이 이런 정보들을 입력받고, 출력해봐라.
	//저의 기분은 %c입니다. 제 mbti는 %s이고, 혈액형은 %s입니다.
	//제 키는 %.2f이며, 나이는 %d살입니다.
	printf("기분은?");
	rewind(stdin);//char 입력받기 전이므로 rewind.
	//char feel = cetchar();
	char feel;
	scanf_s("%c", &feel, 1);
	printf("mbti?");
	rewind(stdin); 
	char mbti[5];
	scanf_s("%s", mbti, sizeof(mbti));
	printf("혈액형?");
	rewind(stdin);
	char bType[10];
	gets(bType);

	//double 타입 변수(scanf_s)에 값을 넣을때
	//lf로 하기
	//출력도.. lf로. f로 해도 되긴한데
	//double타입은 long float이므로 lf가 맞다. 
	//f를 일괄되게 쓰고 싶다면 float을 쓰면된다.
	//숫자는 무조건 scanf_s,
	//문자는 get든 scanf_s든 Ok~~~~~~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!!!!
	double cm;
	printf("키는?");
	scanf_s("%lf", &cm);
	printf("나이는?");
	int age;
	scanf_s("%d", &age);
	printf("제 기분은 %c입니다. 제 mbti는 %s입니다. 혈액형은 %s입니다. 제 키는 %.2f이며, 나이는 %d살입니다.\n",
		feel, mbti, bType, cm, age);

	//4. 변수 a를 새로 선언해서 다음 식의 해를 구하라.
	//(x+a)(x+b) = > x^2 + (a+b)x + (a*b)
	//위에서 x,b 선언해서 선언안됨.
	// 2개 이상의 값 입력하기
	//scanf_s("%d %d", &x, &b);
	printf("x는?");
	int a;//정수 변수 x와 a, b 선언
	scanf_s("%d", &x);
	printf("a는?");
	scanf_s("%d", &a);
	printf("b는?");
	scanf_s("%d", &b);
	printf("(%d+%d)(%d+%d)=%d\n", x,a,x,b, (x*x)+((a+b)*x)+(a*b) );


	return 0;
}