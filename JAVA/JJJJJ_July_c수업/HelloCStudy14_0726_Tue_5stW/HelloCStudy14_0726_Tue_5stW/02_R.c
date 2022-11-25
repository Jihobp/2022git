#include<stdio.h>
void noSwap(int a, int b)//main 값 변화 못 시킴 (copy본)
{					//매개변수로 "값"을 복사해오므로
	int temp = a;	//원본이랑 전혀 관계 없음
	a = b;			//이 함수가 끝나면 사라짐.
	b = temp;
}

void Swap(int* a, int* b)//main 값 변화 시킬 수 있다. (바로가기)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main()
{
	int a = 3;
	int b = 5;

	noSwap(a, b);
	printf("a=%d, b=%d\n", a, b); //a=3, b=5	(그냥 출력)
	Swap(&a, &b);
	printf("a=%d, b=%d\n", a, b); //a=5, b=3(값 바뀜)
	int* pa = &a;
	int* pb = &b;
	Swap(pa, pb); //매개변수로 주소값이 들어가면 됨. (값 바뀜)
	printf("a=%d, b=%d\n", a, b); //a=3, b=5(값이 한바퀴 돌아서 다시 원위치로 )

}