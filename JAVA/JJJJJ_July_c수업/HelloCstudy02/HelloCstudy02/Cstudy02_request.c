#include<stdio.h>
int main()
{
	//1. 숫자를 입력 받고 아래와 같이 출력한다. 
	//123 = > 2분 3초
	int seconds = 60;
	int minutes = 1;
	scanf_s("%d", &minutes);
	printf("몇분몇초?");
	

	//2. 2x+b라는 수식이 있을 때, x와 b를 입력하여 해를 구하여라.
	int x;
	int b;
	printf("해를 구하시오.\n");
	scanf_s("%d", &x);
	scanf_s("%d", &b);
	printf("2x+b %d %d",x,b);





	//3. 자신의 기분 정보(+ - 0 중 하나), mbti, 혈액형(RH +와 -도 입력),
	//키, 나이 이런 정보들을 입력받고, 출력해봐라.
	//저의 기분은 %c입니다. 제 mbti는 %s이고, 혈액형은 %s입니다.
	//제 키는 %.2f이며, 나이는 %d살입니다.
	char c;
	printf("내 기분은 오늘 +? -? 0?");
	scanf_s("%c", &c, 1);
	printf("내 기분은 오늘 %c입니다.\n", c);
	
	rewind(stdin);
	char mbti [100];
	printf("mbti?");
	gets(mbti);
	printf("내 mbti는 %s입니다.\n, mbti");
	
	char Btype[2];
	printf("Btype?");
	gets(Btype);
	printf("내 혈액형은 %s입니다.\n, Btype");

	rewind(stdin);
	printf("제 키는 %.2f이며, 나이는 %d살입니다");


	//ex) 저의 기분은 +입니다. 제 mbti는 infj이고, 혈액형은 b rh+입니다.
	//제 키는 158.3이며, 나이는 28살입니다.

	//4. 변수 a를 새로 선언해서 다음 식의 해를 구하라.
	//(x+a)(x+b) = > x^2 + (a+b)x + (a*b)
	int a;
	printf("해를 구하시오.\n");
	scanf_s("%d", &a);
	printf("(x+a)(x+b)", &a);

	//5. 두 개의 숫자를 입력받는다. (둘다 3자리)
	//1) 첫번째 숫자 곱하기 두번째 숫자의 1의 자리 수(472*5)
	//2) 첫번째 숫자 곱하기 두번째 숫자의 10의 자리 수(472*8)
	//3) 첫번째 숫자 곱하기 두번쨰 숫자의 100의 자리 수(472*3)
	//4) 첫번째 숫자 곱하기 두번째 숫자(472*385)
	int a=472;
	scanf_s("%d", &a);
	printf("%d", &a * 5);


	return 0;
}
