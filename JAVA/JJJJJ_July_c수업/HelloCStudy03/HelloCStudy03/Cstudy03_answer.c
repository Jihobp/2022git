#include<stdio.h>
int main()
{//if (0) // 이거 절대 실행 안함.
	if (0) // 이거 절대 실행 안함.
	{	//1st 문제
		int x, y;
		printf("숫자 2개 입력해보세요.");
		scanf_s("%d %d", &x, &y);

		if (x > 0 && y > 0)
			printf("1");
		else if (x < 0 && y>0)
			printf("2");
		else if (x < 0 && y < 0)
			printf("3");
		else if (x > 0 && y < 0)
			printf("4");
		else //elseif(x==0 || y==0)로 해줘도 OK!!!!!!~~~~~
			printf("0");
	}

	if (0) //region + tab, tab || double click.
	{
#pragma region 두번째문제
		//2st 문제
		printf("나이 입력");
		int age;
		scanf_s("%d", &age);
		if (age < 0 || age>200)
			printf("\n타노스\n"); //조건문 먼저 써도 되는데 예외 처리 먼저하고 음수 타노스로 걸러주고 해도 OK. 그래서 IF 아닌 경우 else 나머지 부터 시작.
		else
		{
			if (age < 20)//age는 0이상이라는 게 전제됨.
				printf("\n미성년자\n");
			else if (age >= 20 && age <= 50)//age<=50만 적어도 됨 ㅇㅇ 20>=age>=50 xxx따로 &&써서 적어야함.
				printf("\n사회의 주구성원\n");
			else if (age <= 70) //51~70세까지
				printf("\n관리자\n");
			else if (age >= 71)
				printf("\n진리의 도서관\n");
			//else if 로 끝내도 된다. 억지로 else 안 써도 됨.
			//if 나머지 아닌 else > 그 안에서 if와 나머지 else if. 
			//else문은 if문의 조건이 거짓일 경우이다. 
			//else if문은 새로운 조건을 추가할 수 있다. 
			//else if는 여러 조건을 중첩할 수 있다. 
			//else문의 조건에 해당하지 않을 경우 마지막에 조건을 지정할 수 있다
#pragma endregion
		}
	}

	//3st 문제 알람시계
	//-45분은 정각에서 0-45가 되니까, +60을 해주고 빼준다. 그리고 h=h-1
	int h, m;

	INPUT_TIME:
	printf("시간 입력하기");

	scanf_s("%d", &h);

	if (h >= 24)
	{
		printf("\n값이 너무 크니까 다시 입력하세요.\n");
		goto INPUT_TIME;	//	GOTO는 되~~~~~~도록이면 쓰지말자. 쓰면 혼남!! 
	}
							// 근데 잘하는 사람은 진짜 잘 쓰고, 그래픽쪽에선 이걸 어쩔 수 없이
							// 쓰는 경우가 있다.
							// java엔 없댜. c계열에 있다.
							// INPUT TIME;은 정해진거 아님 지호쨩쨩맨 적어도OK
							//그 위치로 가는거임
	scanf_s("%d", &h);

	h = h % 24; //시간은 0시부터 23시까지이므로
				//너무 큰 시간을 입력해도 24로 나눈 나머지로 
				//값을 바꾸게 되면
				//h값은 무조건 0부터 23이 나온다.
	h %= 24; //위의 코드랑 똑같음.

	printf("분 입력해보세요.");
	scanf_s("%d", &m);

	m %= 60; //혹시 60 넘으면 60으로 나눈 나머지로 바꿔버린다. Q. m= m %60 ???????????????????????????????????????????????
	printf("이제 45분전 시간을 세팅해드리겠습니다. \n");

	m = m - 45; // m-=45;
	if (m < 0)
	{
		m += 60;//m=m+60;
		h -= 1; //h=h-1;
		if (h < 0)
			h += 24;
	}
	printf("알람 시간 : %d시 %d분\n", h, m);
	return 0;
}