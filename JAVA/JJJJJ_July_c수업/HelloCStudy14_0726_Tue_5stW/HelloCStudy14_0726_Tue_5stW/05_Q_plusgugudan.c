#include<stdio.h>
//1. 구구단 값의 합을 리턴(= 반환)하는 함수 작성
//2. 매개변수 이용해서, 특정 단만 출력
//ex) 매개변수 5 면 5x1 ~5x9 출력
//3. 매개변수 2개 이용하기
//x몇부터 x몇까지 출력할지 결정
//ex) 1, 5 -> 2x1~2x5 ~9x1 ~9x5
//4. 매개변수 2개를 이용해서 결과 출력하고
//그 합을 리턴
//2, 6 -> 2~6단까지 출력하고 그 합을 리턴
int gugudan(int dan, int dandan, int mul, int mulmul) //합을 출력하기 위한 int형 함수
{
	int sum;
	sum = 0;
	for (; dan <= dandan; dan++)
	{
		printf("\n%d단부터 %d까지\n", dan, dandan);
		for (int i= mul; i<= mulmul; i++)
		{
			printf("%3d x %d = %2d", dan, i, dan * i);
			sum += dan * i;
		}
	}
	return sum;
}

int main()
{
	int dan,dandan, mul, mulmul;
	printf("\n몇단부터 몇단까지, 몇부터 몇까지 곱할까요?");
	scanf_s("%d %d %d %d", &dan, &dandan, &mul, &mulmul); //입력은 \n 붙이지 마라.
	//char c;
	//scanf_s("\n%c", &c,1); //그냥 rewind 쓰고 scanf써랏!(문자할떄는!!!!)

	printf("\n%d", gugudan(dan, dandan, mul, mulmul));//\n으로 띄어쓰기 하면 보기 좋다.
	return 0;
}



/*
int gugudan() //합을 출력하기 위한 int형 함수 // 단순 합계
{
	int gugudan,z;
	int sum;
	sum = 0;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("\n%d단\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%3d x %d = %2d", gugudan, z, gugudan * z);
			sum += gugudan * z;
		}
	}
	return sum;
}

int main()
{
	int s = gugudan();
	printf("합계는 %d", s);
	return;
}
*/