#include<stdio.h>
//	3.구구단 함수 짜기
//	1) 기본 구구단을 main에서 짜보기
//	2) 기본 구구단 출력해주는 걸 함수로 만들고 main에서 호출해보기
void gugu()
{
	int gugudan, z;
	for (gugudan = 2; gugudan <= 9; gugudan++)
	{
		printf("%d단\n", gugudan);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
	}
}

//	4. 몇 단부터 몇 단까지 그리고
//	곱하기 몇 부터 곱하기 몇 까지를 구할지 입력해서 구구단 수행하게 하기
//	매개변수와 반환형은 없음
void gugudan()
{

}

int main()
{

	gugu();


	int x,y,n,m;
	for (x = 2; x <= 9; x++)
	{
		printf("%d단부터 %d단까지?\n", x,y);
		scanf_s("%d x %d", &x, &y);
		for (z = 1; z <= 9; z++)
		{
			printf("%d x %d = %d\n", gugudan, z, gugudan * z);
		}
	}
	
	return 0;

}