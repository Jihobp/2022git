#include<stdio.h>
void swap(int* pa, int* pb)
{
	int temp = *pa;
	*pa = *pb;
	*pb = temp;
}
int main()
{
	int a, b;
	printf("a b 입력해라.");
	scanf_s("%d %d", &a, &b);
	swap(&a, &b);
	printf("a=%d, b=%d\n", a, b); 
	return 0;
	//3. 2번에서 작성한 함수를 사용하되, a와 b 값을 scanf로 입력받고 나서
	//main에서 바뀌기 전과 후의 값을 출력한다.
	//2번 3번 똑같은데 scanf로 값을 받고 있당.

}