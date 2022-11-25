#include<stdio.h>

int mul(int x, int z) {
	int mulmul = 1;

	for (int i = x; x <= z; i++) {
		mulmul *= i;
	}

	return mulmul;
}


int main() {

	printf("x z °ª :");
	int x, z;
	scanf_s("%d %d", &x, &z);

	int sum2 = mul(x, z);
	printf("%d", sum2);


	return 0;
}
