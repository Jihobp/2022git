#include<stdio.h>
//총 10문제입니다.(공유폴더에 있음)내일까지니까 편하게 푸시면 됩니다.
//모두 함수로 만들어서 main에서 호출하면 되는겁니다.

//1. 변수 a와 b와 c의 값을 입력받고, a부터 b까지의 합을 구하되, 
//c의 배수 부분은 제외하고 합을 구할 것.
//이 값을 main에 반환하는 함수 작성하기(못하겠다면 그냥 main에 먼저 짜보기)

int sum(int a, int b, int c)
{
	int sum = 0;

	for (int i = a; i <= b; i++)
	{
		if (i % c == 0)
			continue;
		else
		{
			sum += i;
		}

	}
	return sum;

}
int main()
{
	int a, b, c;
	scanf_s("%d %d %d", &a, &b, &c);
	//a = 1;
	//b = 100;
	//c = 3;

	printf("합:%d\n", sum(a, b, c)); // sum(1, 100, 3) 값 정해주면 그대로 

	return 0;
}

