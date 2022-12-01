//9. 1부터 n까지의 값을 곱하는 함수를 작성하시오(재귀함수)
#include<stdio.h> 


int factorial(int num)
{
	if (num == 1)  
		return 1;	

	return num * factorial(num - 1);
}

int main()
{
	printf("%d", factorial(5));
	return 0;
}
