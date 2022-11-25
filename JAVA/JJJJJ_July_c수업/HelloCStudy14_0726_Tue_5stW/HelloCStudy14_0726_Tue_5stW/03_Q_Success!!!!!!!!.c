#include<stdio.h>
void numswap(int *a, int *b, int *c)
{
	int temp = *a;
	*a = *b;
	*b = *c;
	*c = temp;
}

//void swap(int *aaa, int *bbb, int *ccc)
//{
//	int temp
//}

int main()
{
	int aa, bb, cc;
	int aa2, bb2, cc2;
	printf("값을 입력하세요.\n");
	scanf_s("%d %d %d", &aa, &bb, &cc);
	aa2 = aa;
	bb2 = bb;
	cc2 = cc;
	numswap(&aa, &bb, &cc);
	printf("%d %d %d\n", aa, bb, cc);

	//1. 
	// 변수 a,b,c에 있는 값을 서로 바꾸는 함수 만들기
	//단, 변수 a,b,c는 메인에 있다.
	//(a->b, b->c, c->a로 바꾸면 됨.)
	//--------------------------------------------------------------
	//2.
	//함수를 만들었다면 main에서 swap 호출해서 값을 바꿔보장.
	//단, 처음에 scanf로 입력된 값으로 돌아올 때까지 바꾸기.
	//ex)a=1, b=2, c=3이고
	//swap 계속 호출해서 a = 1, b = 2, c = 3이 다시 나올 때까지 돌리기
	//(수동으로도 해보고 반복문으로도 해보기)

	//수동
	numswap(&aa, &bb, &cc); //일일히 변경해보기.
	numswap(&aa, &bb, &cc);
	printf("%d %d %d\n", aa, bb, cc);
	//int *ap = &aa;
	//int *bp = &bb;
	//int *cp = &cc;

	//numswap(ap, bp, cp);
	//printf("%d %d %d", aa, bb, cc);

	//-----------------------------------------------------------------------------------------
	//반복문 - do while 임의값에 넣는다. 그냥 while은 aa bb cc가 다같으면 거짓이 된다.
	//그 다음에 반복문으로 원래 값이
	//do while을 안 쓸 경우엔 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	//한 번 수동으로 변경하고 나서그 다음에 반복문으로 원래값으로 돌아온 여부를 체크 가능
	//do while을 쓴 이유
	//처음엔 당연히 aa,bb,cc가 aa2,bb2,cc2랑 값이 똑같다.
	//그래서 그냥 while쓰면 바로 끝남
	//하지만 do-while을 쓰면 while 조건이 어떻든
	//무조건 한 번은 실행함
	//그리고 그 다음에는 조건에 따라서 반복문을 돈다.

	do
	{
		numswap(&aa, &bb, &cc);
		printf("aa=%d bb=%d cc=%d\n", aa, bb, cc); //입력한 직후엔 값이 똑같이 나와서 거짓이 나온다. 거짓이지만 무조건 한번 실행함!!! 그러면 바꾸고 나서 참이 된다.
	} while (aa2 != aa && bb2 != bb && cc2 != cc); //aa2가 aa랑 다를시, bb cc도 다를시. 
	printf("%d %d %d\n", aa, bb, cc);


	//----------------------------------
	//	3.
	// 구구단 함수 짜기
	//	1. 기본 구구단을 main에서 짜보기
	//	2. 기본 구구단 출력해주는 걸 함수로 만들고
	//	main에서 호출해보기

	//	3. 몇 단부터 몇 단까지 그리고
	//	곱하기 몇 부터 곱하기 몇 까지를 구할지
	//	입력해서 구구단 수행하게 하기
	//	매개변수와 반환형은 없음

	//main.ver
	int gugudan,z;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("%d단\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
		printf("\n답은 %d\n");
	}


	return 0;
}