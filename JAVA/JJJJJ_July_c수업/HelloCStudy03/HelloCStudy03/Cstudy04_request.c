#include<stdio.h>
int main()
{ 
	//1. 자신이 태어난 월을 입력하고 그에 따라서 계절을 출력한다.
	//12,1,2->겨울
	//3,4,5->봄
	//6,7,8->여름
	//9,10,11->가을
	//그 외->오류메시지 출력

	int month;
	printf("태어난 월을 입력하시오.");
	scanf_s("%d", &month);
		month = month % 12;
		
		if ((month > 0 && month <= 2 ) || month == 12) //12월달 or
			printf("\n겨울\n");
		else if (month >= 3 && month <= 5)
			printf("\n봄\n");
		else if (month >= 6 && month <= 8)
			printf("\n여름\n");
		else if (month >= 9 && month <= 11)
			printf("\n가을\n");
		else 
			printf("\n오류입니다.\n");

	//2.숫자 가위바위보를 한다.(%3 이용)
	//player1과 player2가 있고, player1을 기준으로 승패를 가른다.
	//경우의 수는 9개이니 switch문을 이용하자.

		int rcp;


	//3.자신이 태어난 연도를 입력하고 그에 따라서 띠를 출력한다.
	//참고로 띠의 순서는
	//쥐->소->호랑이->토끼->용->뱀->말->양->원숭이->닭->개->돼지 이다.
	//Q. 어떻게 순서대로 띠를 입력해서 적용할까?? > /12
		int y;
		printf("태어난 연도를 입력하시오.");
		scanf_s("%d", &y);
		
		
		



	return 0;
}