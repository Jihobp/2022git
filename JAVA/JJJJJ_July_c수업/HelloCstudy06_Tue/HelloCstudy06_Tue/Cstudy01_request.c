#include<stdio.h>
int main()
{
	//1. 나이를 입력한다.
	//if문으로 음수에 대한 예외처리를 한다.
	//그리고 이 아래 메세지는 switch문으로 해본다. (못하면 if로라도 해보기)
		//유아기 -> 응애응애
		//10대->급식먹는 친구들
		//20대->청춘
		//30대->일잘러
		//40대->관리자
		//그 외->멋쟁이

	int age;
	scanf_s("%d", &age);
	if (age <= 0)
		printf("응애");
	else if (age > 0);
	{
		if (age >= 10, age < 20)
			printf("급식먹는 친구들");

		else if (age >= 20 && age < 30)
			printf("청춘");

		else if (age >= 30 && age < 40)
			printf("일잘러");

		else if (age >= 40 && age < 50)
			printf("관리자");

		else (age > 50)
			printf("멋쟁이");
	}
	else (age < 0)
		printf("음수는 예외");
	}


	//2. 학점을 입력받고 그에 따라서 결과 출력하기
		//음수->퇴학
		//1.0 미만->F
		//2.0 미만->D
		//3.0 미만->C
		//4.0 미만->B
		//4.5 미만->A
		//4.5->A +
		//4.5 초과->교수



	return 0;
}