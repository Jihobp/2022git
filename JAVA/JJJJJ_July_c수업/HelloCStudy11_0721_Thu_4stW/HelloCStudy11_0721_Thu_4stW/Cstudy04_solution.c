#include<stdio.h>
//1번 문제 (main에서 해보기 
//둘 중 더 큰 거 출력

//이 a,b는 main의 a,b와 아무 상관없다.
//이 a,b가 값 바뀌어도 main의 a,b는 그대로!
void printBig(int a, int b)
{
	if (a >= b)
	{
		printf("%d\n", a);
		return;
	}
	printf("%d\n", b);
}

int printBigReturn(int a, int b)
{
	if (a >= b)
		return a;
	//else //b가 a보다 클 경우... else 안 적어도 됨.
	return b;
}
int main()
{	
	//1.//삼항 연산자
	//a가 b보다 크거나 같으면 a 출력
	//그게 아니면 b 출력
	int a, b;
	printf("숫자 두개 입력(3 5 이렇게)\n");
	scanf_s("%d %d", & a, &b);
	a >= b ? printf("%d\n", a) : printf("%d\n", b);
	
	//2.//삼항연산자 없이 하기
	if (a >= b)
		printf("%d\n", a);
	else
		printf("%d\n", b);

	//3.//함수
	printBig(a, b); //a와 b 중에 더 큰 거 출력
	
	//4.//return
	int result = printBigReturn(a, b);
	printf("%d\n", result);
	return 0;
}


