#include<stdio.h>
// 함수 : 코드뭉치
// 미리 만들어 둔 코드 덩어리
// 메인 안에다가 다 적어도 되는 내용들이지만
// 메인 안쪽을 최대한 심플하게 하기 위해서 
// 함수라는 것을 만들었다.

//함수 4가지 형태
//반환형(return)과 매개변수(parameter, argument)
//  X                 X
//  O                 X
//  X                 O
//  O                 O
void enterKey() //한 줄 띄는 것만 한다.
{
	printf("\n");
}
void printPowerNumber(int n) //매개변수로 받은
{							//숫자를 제곱해서 출력
	printf("%d", n * n);
}
int inputNum() //숫자를 입력받음
{
	int n;
	printf("숫자 입력해요\n");
	scanf_s("%d", &n);
	return n; //입력값이 리턴값
}
//매개변수랑 반환값 둘 다 있는 것
int PowerNum(int n, int p) //n: 숫자, p:제곱 수
{
	if (p <= 0) //음수 제곱은 하지 말자. 0승 =1
		return 1;
	else if (p == 1)
		return n;
	else {
		int num = n;
		for (int i = 0; i < p - 1; i++) //시작값 -1 -> int i=1;, i<p; i++ 이렇게 해도 ㅇㅋ
			n = n * num; // n *=num
	}
	return n;
}

/*1. 지금 만든 함수들 모두 다 활용해보기 (호출해보기)



*/

void printnumber(int x) //2번. 리턴값x==보이드 
{	
	printf("%d", x);
}

int main()
{
	//3번 2번에서 만든 함수를 이용해 PowerNum의 return값 출력
	int n, p; //변수 ㄷ선언 함수랑은벼ㅑㄹ개
	scanf_s("%d %d", &n, &p);
	printnumber(PowerNum(n,p)); //->>> int PowerNum(int n, int p) 은 출력이 없으니ㅏㅆ까
	

	//4번 2번에서 만든 함수를 이용해
	//PowerNum의 return값 출력하는 데
	//숫자 입력시 우리가 같이 만든 함수를 이용하기
	int num = inputNum();
	int power = inputNum();
	printnumber(PowerNum(num, power));

	/*int=n;
	scanf_s("%d", &n);
	printPowerNumber(n);
	return 0;*/
	if (0)
	{
# pragma region 수업시간에 같이 한 거

		int num = inputNum();
		printPowerNumber(num);
		enterKey(); //한 줄 띄기
		printPowerNumber(inputNum());
		enterKey();
		printf("숫자 2개에 대해서 입력받고 출력해봄\n");
		printf("%d", PowerNum(inputNum(), inputNum())); //이거 안 됨. ???????????????????????????????????????????????/

		//호출해보기(1번)
		enterKey(); //한 줄 띄기 호출
		printPowerNumber(3); //제곱 출력
		enterKey();
		int mynum = inputNum();
		int result = PowerNum(mynum, 3); //세제곱 출력

		//2번 - 새로운 함수 만들어서 테스트도 해봄
		enterKey();
		printnumber(result); // 호출
		enterKey();

		//3번
		//입력한 숫자 반환 - inputNum()
		//PowerNum - 입력한 숫자의 p제곱 출력
		//그 결과를 화면에 뿌림
		printnumber(PowerNum(inputNum(), 2));

#pragma endregion
	}
}

//호출 : 메인에 함수 불러와서 쓰기 

