#include<stdio.h>
int factorial(int num)
{
	if (num <= 1)  //num이 1일때 1을 반환하고 재귀호출을 끝냄. // num=1 이 아니라  <=으로 해야함담.
		return 1;	//종료조건이 없으면 무한루프에 빠진댱.
	return num * factorial(num - 1); //num과 factorial(함수-myself)에 num-1(매개변수)을 넣어서 반환된 값을 곱함.
	//핵심은 반환값 !!! 재귀호출로 num-1을 전달하다가, 
	//num이 1일때 비로소 1을 반환하면서
	//num과 곱하고
	//다시 결괏값 반환.
	//그 뒤 n과 반환된 결과값을 곱하여 다시 반환하는 과정을 반복
	//반환 = semiring 되돌려줌 = 다시입력 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
}

int main()
{
	printf("%d", factorial(0));
	return 0;
}
