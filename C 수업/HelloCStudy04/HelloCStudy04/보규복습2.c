#include<stdio.h>
int main()
{
	//3. 알파벳 A부터 Z까지 순차로 출력하게 하시오.(대소문자 모두)
	
	char a[10];
	for (int a = 65; a <= 90; a++)
	{
		printf("%c%c", a, a + 32);

	}


	return 0;
}
