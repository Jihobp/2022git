#include<stdio.h>
int main()
{//조건문&반복문 = > 이걸 어떻게 짜느냐에 따라 답을 얻을 수 있다. 'ㅅ'/~~~~~~
	//삼항 연산자
	//엑셀의 if 문이랑 비슷한 것. if문으로 다 퉁칠 수 있당...불가능x 근데 다른 사람이 쓸 수 있어서 삼항연산자 배운 것~

	//숫자가 짝수냐 홀수냐에 따라서 다른 메세지 출력하게 함.
	int num;
	printf("숫자 num 값 입력하기");
	scanf_s("%d", &num);

	//2가지 경우의 수에 대해서 최적화 되어 있다.
	//나는 안 쓰더라도 다른 사람은 쓸 수 있으니
	//형태는 알아두는 것이 좋다. (c#, java에 있음.)
	//= : 대입문. 값을 대입시켜주는 것.
	//==: 같은지 다른지 여부 체크하는 것.
	//삼항 연산자의 기본 구조
	// ? 뒤에 오는 건 왼쪽에 있는 것이 참일 때.
	// :(콜론) 뒤에 오는 건 왼쪽에 있는 것이 거짓 일때.
	num % 2 == 0 ? printf("짝") : printf("홀");

	//&& : AND
	//& : 잘 안쓴다. 2진수~~?
	//두가지 조건이 모두 만족해야 참~~!!! 
	//-1 넣으면 num=0가 출력됨
	//왜냐면 nu,은 0이 아니지만 2로 나눴을 때 나머지가 
	//0이 아니기 때문이다.
	num != 0 & num % 2 == 0 ?
		printf("num은 짝") : printf("num=0");
	//!=은 아니다. NUM !=0 0이 아니다. 다른지 아닌지 체크하는 것.
	
	char score;
	//num이 양수이거나 혹은 -1일 경우엔 score에 A가 들어감 'ㅅ'
	//그 외의 경우엔 B가 들어감.
	//|| = shift+escape 문자/ = or || 
	//둘 중 하나의 조건만 맞으면 된다.
	score = num > 0 || num == -1 ? 'A' : 'B';

	printf("score=%c\n", score);
	//1 = 참 = true, 0 = 거짓 = false
	printf("%d\n", 100 == 100); //1 C++, java, C#,js에선 true
	printf("%d\n", 100 != 100); //0 C++, java, C#,js에선 false
	printf("%d\n", 100 >= 100); //1 100은 100보다 크거나 같다.
	printf("%d\n", 100 < 100); //0


	//if문 - java, c#, js 다 똑같음
	//if = 만..약..에....
	//경우의 수가 여러개 이거나,
	//특정 경우에 대해서만 여러 개의 코드를 작성할 경우 사용함.

	//switch case 문 -java, c#, js 다 똑같음


	//breakpoint = red point = 코드를 멈춰보고 F5 = debugging :)
	return 0;
}