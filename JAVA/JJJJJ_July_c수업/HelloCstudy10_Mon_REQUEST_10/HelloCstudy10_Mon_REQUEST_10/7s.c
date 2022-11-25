//7. 5번과 6번 함수 이용하여
//매개변수를 이용해서 a부터 b까지 더하거나 곱해서
//그 결과를 출력만 해주는 함수 만들기
//(매개변수는 + 와 * 혹은 x, X이렇게 4개만 허용함)
//ex) calc(1, 10, '+')  -> 1부터 10까지 더함
//ex) calc(1, 10, '*')  -> 1부터 10까지 곱함
//ex) calc(1, 10, 'x')  -> 1부터 10까지 곱함
//ex) calc(1, 10, '-')->예외메시지

#include<stdio.h>
int mulmul(int a, int b)
{
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;

	}
	return mul;
}
int sumsum(int a, int b)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{	

		sum += i;

	}
	return sum;
}



int calcul(char asd, int a, int b)
{	
	if (asd == 'x' || asd == 'X' || asd == '*')
		return mulmul(a, b);

	else if (asd == '+')
		return sumsum(a, b);
	
}


int main()
{
	char qwe;
	int c, d;
	scanf_s("%c", &qwe, 1); //주소값, 문자는 1개라 SIZEOF 필요없고 1byte만 할당해주면 되서 1.
	scanf_s("%d %d", &c, &d); //어디서부터 어디까지 곱하거나 더할지 받는다.
	printf("%d", calcul(qwe,c,d)); //인자


	return 0;
}



//
void calcul(char asd, int a, int b)
{
	if (asd == 'x' || asd == 'X' || asd == '*')
		printf("%d", mulmul(a, b)); //mul

	else if (asd == '+')
		printf("%d", sumsum(a, b)); //sum

}


int main()
{
	char qwe;
	int c, d;
	scanf_s("%c", &qwe, 1);
	scanf_s("%d %d", &c, &d);
	calcul(qwe, c, d);


	return 0;
}
