#include<stdio.h>
int main()
{
	//포인터 = 변수의 주소 혹은 위치
	int a = 10;
	int* ptr_a = &a; //ptr_a => a =10 그냥 주소값. 별다른 의미가 없다.
	*ptr_a;

	(* ptr_a)++; //*ptr_a => 이 변수가 가리키는 곳에=&a 직접 접근해서     ++(+1)로 바꾸겠다.
	printf("a=%d\n", a);//11
	a++;
	printf("ptr_a가 가리키는 곳의 값 : %d\n", *ptr_a);//12
	printf("ptr_a : %d\n", ptr_a);//주소 값
	printf("a=%d\n", a);//12


	//a=12;
	int b = a; //12 
	b++; //13
	printf("a=%d\n", a);


	return 0;
}
