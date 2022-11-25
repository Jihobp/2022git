#include<stdio.h>
//8. 1부터 n까지의 값을 곱하는 함수=factorial를 작성하시오(반복문)
int factorialfor()
{
	int i, N;
	int mul = 1;
	printf("\n1부터 N까지의 곱을 구하시오.");
	scanf("%d", &N);
	scanf("%d", &N);
	for (i = 1; i <= N; i++)
	{
		mul *= i
	}
	printf("\n1부터 %d까지의 곱은 %d\n", N, mul);
}



//9. 1부터 n까지의 값을 곱하는 함수를 작성하시오(재귀함수=recursive function)
//https://blockdmask.tistory.com/321 //https://dojang.io/mod/page/view.php?id=585

int factorial(int num)
{
	if (num == 1)  //num이 1일때 1을 반환하고 재귀호출을 끝냄. if (num <= 1)
		return 1;	//종료조건이 없으면 무한루프에 빠진댱.


	return num * factorial(num - 1); //num과 factorial(함수-myself)에 num-1(매개변수)을 넣어서 반환된 값=저장된 값을 곱함.
	//핵심은 반환값 !!! 재귀호출로 num-1을 전달하다가, 
	//num이 1일때 비로소 1을 반환하면서
	//num과 곱하고
	//다시 결괏값 반환.
	//그 뒤 n과 반환된 결과값을 곱하여 다시 반환하는 과정을 반복
	//반환 = semiring 되돌려줌 = 다시입력 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	//5! = 5x4! (1부터 5까지의 곱)-을 구하려면 1부터 4까지의 곱도 알아야 하는 법.
	//4! = 4x3! (1부터 4까지의 곱)
	//..
	//1! = 1 (1x0!
	//0! = 0x-1!
	//-1 ! = -1x-2!
	//재귀함수는 반드시 완전히 종료되는 시점을 적어 줘야 함.
}

int main()
{
	printf("%d", factorial(5));
	return 0;
}


