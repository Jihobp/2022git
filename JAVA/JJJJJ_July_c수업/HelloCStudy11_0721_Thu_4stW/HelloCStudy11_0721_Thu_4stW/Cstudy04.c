#include<stdio.h>
extern int a; //CTest.c 에서 온 변수 a
extern int b; //심각도 코드 설명 프로젝트 
//오류 LNK2001 확인할 수ㅡ 없는 외부기호 HELLO 
//선언만.

int main()
{
	//b++; // 여기서 문제 생김!!!!! static 븥어서 
		//CTest.c이오;ㅣ에선 못씀
		//java, c#, c++의 private 같은거.
	a++;
	printf("%d\n", a);
	up_Print();
}
void printfNum(int a)//함수의 정의
{
	printf("%d", a);
}


//1번 문제 (main에서 해보기 
//둘 중 더 큰 거 출력
int a, b;
printf("숫자 두개 입력(3 5 이렇게)\n");
scanf_s("%d %d" &a, &b);
//삼항 연산자
//a가 b보다 크거나 같으면 a 출력
//그게 아니면 b 출력
a >= b ? printf("%d\n", a) : printf("%d\n", b);
//삼항연산자 없이 하기
if ()