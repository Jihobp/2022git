#include<stdio.h>
int main()
{
	//1. 나이를 입력한다.
	//if문으로 음수에 대한 예외처리를 한다. //switch문으로는 할수 없기 때문엥.
	//switch문은 정수만.!!! 경우의 수는 갯수를 세야하기 때문에.
	//그리고 이 아래 메세지는 switch문으로 해본다. (못하면 if로라도 해보기)
		//유아기 -> 응애응애
		//10대->급식먹는 친구들
		//20대->청춘
		//30대->일잘러
		//40대->관리자
		//그 외->멋쟁이

	printf("1번 나이가 몇살이니?");
	int age;
	scanf_s("%d", &age);
	if (age < 0) 
	{
		printf("음수\n");
	}
	else
	{
		age /= 10; //10으로 나눈 몫을 쓰면 된다. //34->3

		switch (age)
		{
		case 0: //0~9
			printf("응애응애\n");
			break;
		case 1: //10~19
			printf("급식먹는 친구들\n");
			break;
		case 2: //20~29
			printf("청춘\n");
			break;
		case 3: //30~39
			printf("일잘러\n");
			break;
		case 4: //40~49
			printf("관리자\n");
			break;
		default://50~무한대.
			printf("멋쟁이\n");
			break;
		}
	}



//2. 학점을 입력받고 그에 따라서 결과 출력하기 //실수기 때문에 if 써야한다. //삼항연산자로 가능은 하지만 if문이 더 편할거다.
	//음수->퇴학
	//1.0 미만->F
	//2.0 미만->D
	//3.0 미만->C
	//4.0 미만->B
	//4.5 미만->A
	//4.5->A +
	//4.5 초과->교수


	printf("2번 학점 입력");
	double score;
	scanf_s("%lf", &score);
	if (score < 0)
		printf("퇴학");
	else if (score < 1.0)
		printf("F");
	else if (score >= 1.0 && score < 2.0) // && 생략가능
		printf("D");
	else if (score < 3.0)
		printf("C");
	else if (score < 4.0)
		printf("B");
	else if (score < 4.5)
		printf("A");
	else if (score == 4.5)
		printf("A+");
	else
		printf("교수");



return 0;
}