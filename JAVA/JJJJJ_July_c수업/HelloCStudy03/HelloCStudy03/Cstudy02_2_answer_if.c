#include<stdio.h>
int main()
{	//if문 - java, c#, js 다 똑같음
	//if = 만..약..에....
	//경우의 수가 여러개 이거나,
	//특정 경우에 대해서만 여러 개의 코드를 작성할 경우 사용함.
	//조건문 반복문이 젤 중요하고.. 포인터는 c에만 있는데 잘 쓰이진 않눈당...;ㅅ;

	int age = 10;

	if (age > 0)
		printf("age는 양수입니다.\n"); //age값이 0이거나
										// 음수면 출력이 안됨.

	age = -1; //if(-1) // age==-1; 같다 라고 표시해줘야함. ????????????
	if (age < 0) //괄호 안에 있는 조건이 true일 때
				//작성해야 하는 코드가 2줄 이상이면 중괄호로 묶어야함... 'ㅅ '~~~~
				//1줄짜리도 중괄호 써도 됨 = > 헷갈리면 한줄 짜리도 중괄호 ok
	{
		printf("age는 음수입니다.\n");
		printf("나이는 음수 일 수 없습니다.\n");
	}
	//if문에 대해서 하고싶은 말들...

	// 1. 제~~ 발! if 끝에 세미콜론;;; 붙이지 말기.
	//if(age==0); <-이거 적으면 이 안에 조건을 무조건 true로 본다.
	// 2. if(age=1) <- age에 1을 대입시키는 거라서 무조건 true.
	// ㄴ >if(1)
	//참고로 0 이외의 숫자는 양수 음수 모두다 true.
	//즉 if(age=-1) 이렇게 적어도 무조건 true처럼 동작을 함.
	age = 0;
	if (age = -1) //if(-1)  =   -1을 age에 대입.
		printf("이건 무조건 출력됨");
	age = 0;
	if (age = 0) //if(0) = false. 
		printf("이건 절~~~~~~~~~~~~~~~~대로 출력 안 됨");

	// 3. 이렇게 적지 않는 게 좋다. 가독성 떨어짐. 한줄 ㄴㄴ if 결과는 밑줄에.
	if (age > 0) printf("age는 양수입니다.");
	if (age > 0) { printf("age는 양수입니다."); }

	// 4. java랑 c계열(c, c++, c#)은 권장 중괄호 위치가 다르다.
	if (age > 0) { // <- 중괄호 이게 자바 스타일????
		printf("age는 양수");
	}

	//경우의 수가 2가지인 경우
	if (age > 0) 
	{
		printf("age는 양수");
	}
	else // if문의 그 경우의 수가 아닌 경우. 모~~~~~~~두
	{
		printf("age는 양수가 아니다.");
	}

	//경우의 수가 3가지 이상인 경우 ~~~~~~~~~~~~~~~~~~~~~
	if (age > 0) //양수
		printf("age는 +");
	else if (age == 0) //else if의 개수는 많이 적을 수 있으나,
		printf("age는 0"); //너무 많으면 코드의 가독성이 떨어짐.
	else // if문의 그 경우의 수가 아닌 경우. 모~~~~~~~두 //0이 될수도, 음수도
		printf("age는 음수");
	// Q. ? ㄴ> if, else if, else 한덩어린데 else if 에서 else 가 빠지면 if, else 가 한덩어리....?버그?
	//*중복 선언 안된당~~~~~~~ age = 10이라고 선언 해놔서 int 놉놉놉~!
	//1. if문은 중첩이 가능하다.
	age = 10;
	if (age > 0)
	{
		if (age % 2 == 0)
			printf("\n\n\n\n짝");
		else
			printf("\n\n\n\n홀");
	}

	//2. if문의 괄호 안에 삼항연산자처럼 여러 개의 식 적기-가능 'ㅅ'~~~
	if (age > 0 && age % 2 == 0)
		printf("\n\n\n\nage는 자연수이면서 짝수이다.");
	if (age > 0 || age % 2 != 0)
		printf("\n\n\n\nage는 자연수이거나 혹은 홀수다.");

	//&& and 이면서-조건 충족, || or 이거나-하나만 조건충족ok, 
	//%나머지, ==같다, !=다르다

	//if젤 쉽고 젤 많이씀. 삼항연산자느 가독성 떨어짐.
	return 0;
}