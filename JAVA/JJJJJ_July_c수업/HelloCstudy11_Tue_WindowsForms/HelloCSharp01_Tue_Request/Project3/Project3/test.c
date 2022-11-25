#include<stdio.h>

int Q_5(int num1, int num2) {

	int sum = 0;
	for (int i = num1; i <= num2; i++) {
		sum += i;
	}
	return sum;
}

int mul(int x, int z)
{
	int mulmul = 1;
	for (int i = x; x <= z; i++)
	{
		mulmul *= i;
	}
	return mulmul;
}

int main() {

	printf("a b 값 입력 : ");
	int num1, num2;
	scanf_s("%d %d", &num1, &num2);


	printf("-------------------------------------\n");
	int result = Q_5(num1, num2);
	printf("%d\n", result);


	printf("x z 값 :");
	int x, z;

	scanf_s("%d %d", &x, &z);

	mul(x, z);
	int mulresult = mul(x, z);
	printf("%d", mulresult);
	return 0;
}

