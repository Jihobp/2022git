//2-1. 내가 태어난 연도를 매개변수로 하여
//간지를 리턴하세요

#include<stdio.h>
//#include<string.h> //이 헤더파일 포함시키면
// strcpy랑 strcat에 _s를 붙여야 함
//stdio.h만 있으면 strcpy, strcat(옛날형태)를 그대로 쓸 수 있다.
////strcpy랑 strcat에 _s를 붙인 게 더 최신 문법이긴 함
char* myGanJi(int year)
{
	int ganji = year % 10; //갑을병정무기경신임계
	//서기 0년
	int thee = year % 12;//자축인묘진사오미신유술해
	//서기 0년은 원숭이띠
	//신유술해 자축인묘 진사오미
	//경신임계갑을병정무기

	//3으로 한 이유
	//한글은 1글자 2byte이고, 끝에 널 값 들어갈 것을
	//고려함
	char ganjiResult[3]; //간지 저장
	char theeResult[3]; //띠 저장
	static char result[5]; //두 배열(ganjiResult,theeResult)
	//이 값들을 여기에 합칠 것
	//static쓰기 싫으면 두 가지 방법이 있음
	//크기를 넉넉하게 잡거나(result[1024)
	//동적배열을 쓰면 된다.


	switch (ganji)	//ganji라는 변수로 스위치 문을 돌린다.
	{
	case 0:	strcpy(ganjiResult, "경");	break; //원래 이렇게 적으면 안 됨 //뒤에 있는걸"" 변수에 넣는다.=strcpy
												//변수가 0=switch(ganji)이면 실행한다.
	case 1:	strcpy(ganjiResult, "신");	break; //가독성 떨어짐
	case 2:	strcpy(ganjiResult, "임");	break; //ganji 라는 변수가 2일때, "임"이라는 값을 ganjiresult에 넣는다. = strcpy에 넣는다. 그리고 빠져나옴.
	case 3:	strcpy(ganjiResult, "계");	break; //ganji 라는 변수가 3일떄, "계"라는 값을 ganjiresult에 넣는다. = strcpy에 넣는다. 그리고 빠져나온다.
	case 4:	strcpy(ganjiResult, "갑");	break;
	case 5:	strcpy(ganjiResult, "을");	break;
	case 6:	strcpy(ganjiResult, "병");	break;
	case 7:	strcpy(ganjiResult, "정");	break;
	case 8:	strcpy(ganjiResult, "무");	break;
	case 9:	strcpy(ganjiResult, "기");	break;
	default:
		strcpy(ganjiResult, "-");
		break;
	}
	switch (thee) //thee 변수로 스위치 문을 돌린다.
	{
	case 0:	strcpy(theeResult, "신");	break; //thee라는 변수가 0일때, "신"이라는 값을 theeResult에 넣는다.=즉 strcpy. 그리고 빠져나온다.
	case 1:	strcpy(theeResult, "유");	break; 
	case 2:	strcpy(theeResult, "술");	break;
	case 3:	strcpy(theeResult, "해");	break;
	case 4:	strcpy(theeResult, "자");	break;
	case 5:	strcpy(theeResult, "축");	break;
	case 6:	strcpy(theeResult, "인");	break;
	case 7:	strcpy(theeResult, "묘");	break;
	case 8:	strcpy(theeResult, "진");	break;
	case 9:	strcpy(theeResult, "사");	break;
	case 10: strcpy(theeResult, "오");  break;
	case 11: strcpy(theeResult, "미");  break;
	default:									//thee라는 변수가 0~11 어느것도 아닐시 다음 내용을 실행한다.
		strcpy(theeResult, "-");				// -라는 값을 theeResult에 넣는다.
		break;									//그리고 빠져나온다.
	}
	//strcat, concat등을 써도 되지만...
	//for문 노가다해보겠다.
	for (int i = 0; i < 2; i++) //i=0으로 초기화 하고, i가 2보다 작으면 다음내용을 실행 다하고 i++을 반복한다.
		result[i] = ganjiResult[i]; //ganjiresult의 i번쨰 값을 result의 i번째 값에 넣어준다.
	for (int i = 0; i < 2; i++) //
		result[i + 2] = theeResult[i]; //
	result[4] = NULL; // 문장의 끝을 알림
	return result;
}

//OSR kun's code  ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
char* ganzi(int year) {
	char zi[12][10] = { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미" };
	char gan[10][10] = { "경", "신", "임", "계", "갑", "을", "병", "정", "무", "기" };

	static char res[10] = "";
	//strcat_s : 이어붙이기
	strcat(res, gan[year % 10]);
	strcat(res, zi[year % 12]);
	// 2-1
	printf("%s%s년\n", gan[year % 10], zi[year % 12]);

	return res;
}
int main()
{
	printf("몇년도에 태어났나요?");
	int year;
	scanf_s("%d", &year);
	printf("%s\n", myGanJi(year)); //(괄호 안 먼저 해석) 변수 year 값을 myganji라는 함수에 넣고 실행하고 // 반환값을 문자열 형식(%s), \n와 함께 출력한다.  
	printf("%s\n", ganzi(year));
	return 0;
}