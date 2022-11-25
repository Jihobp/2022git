#include<stdio.h>
void swap(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
int main()
{
	int a = 3;
	int b = 5;
	swap(&a, &b);
	printf("%d %d", a, b); //5 3 출력
	return 0;
	//2. 변수 a = 3, b = 5일 때
	//2개의 값을 바꾸는 함수를 작성한다.
	//main에서 바뀌기 전과 후의 값을 출력한다.
}

