#include<stdio.h>
int main()
{
	//scanf�� printf�� �Լ�
	//scanf : �Է¹޴� �Լ�, printf : ����Ʈ�ϴ� �Լ�.
	//�Լ��� �ѹ��� �ּ�ó�� �س����� �ϰ� ���� �ǹǷ� �밡�� ���ص� �ȴ� '��'/

	int result = printf("Hello");
	printf("\n%d\n", result);
	int n, m;
	int a = scanf_s("%d", &n);
	int b = scanf_s("%d %d", &n, &m);
	result = printf("%d %d", n, m);
	printf("\nresult=%d, a=%d, b=%d\n",
		result, a, b);


	return 0;
}