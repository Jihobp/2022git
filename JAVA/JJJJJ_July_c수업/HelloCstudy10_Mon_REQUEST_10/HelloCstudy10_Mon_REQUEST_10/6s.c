//6. a부터 b까지 곱하는 함수를 만들고
//1x2x......xb = 결과 출력하고 반환값 주는 함수 만들기
//예시
//1x2x3x4x5
//total = 120
#include<stdio.h>
int mulmul(int a ,int b)
{
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;
		if (i == b)
			printf("%d = %d", i, mul);
		else
			printf("%d x ", i);

	}
	return mul;
}

int main()
{
	int a, b;
	scanf_s("%d %d", &a, &b);
	printf("a부터 b까지 곱한 값은 = %d\n", mulmul(a,b));
	return 0;
}