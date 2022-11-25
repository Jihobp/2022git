#include<stdio.h>
int main()
{
	//출력
	int number;
	//입력
	printf("숫자 입력하세요.");
	scanf_s("%d", &number);
	//number 변수의 주소(위치)에 접근
	//그리고 그 안에 들어갈 값을 집어 넣음.
	printf("number=%d\n", number);

	//조건문
	if (number > 0)
	{
		printf("number는 양수에요.\n");
	}
	else if (number == 0) // else if 나 else 없이 if 만 있는 경우도 있다. //==같다, =대입
	{
		printf("number는 0이에요.");
	}

	//반복문
	//for while do while이 있는데
	//가장 대표적인 건 for

	//이동준 선생님이라는 문장을 10번 출력시키고 싶다면..?

	//세미콜론;을 기준으로 가운데 있는게 핵심.

	for (int i = 0; i < 10; i++) //i라는 변수에 0을 집어넣고 i가 10보다 적은지 체크하고 +1증감시켜준다.
		printf("이동준 선생님\n");

	int count = 0;
	//count 값을 10번 찍음
	while (count < 10)
	{
		printf("count=%d\n", count);
		count++;
	}

	//while 안에 있는 조건이 거짓이더라도 
	// 무조건 1번은 수행함. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! just do it
	//참고로 현재 count는 10이라서 저 괄호조건은
	//거짓
	do
	{
		printf("count=%d", count);
	} while (count < 10);


	return 0;
}