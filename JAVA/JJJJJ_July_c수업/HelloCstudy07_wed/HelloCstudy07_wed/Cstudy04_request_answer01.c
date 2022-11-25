#include<stdio.h>
int main()
{
	//1. 5개의 숫자를 입력받고 그 중에서 가장 큰 숫자와 작은 숫자를 찾으세요.
	//최솟값 최댓값 
	//http://ehpub.co.kr/tag/10%EA%B0%9C%EC%9D%98-%EC%A0%95%EC%88%98%EB%A5%BC-%EC%9E%85%EB%A0%A5%EB%B0%9B%EC%95%84-%EC%B5%9C%EC%86%8C%EA%B0%92%EA%B3%BC-%EC%B5%9C%EB%8C%80%EA%B0%92%EC%9D%84-%EC%B6%9C%EB%A0%A5%ED%95%98%EB%8A%94/
	if (0)
	{
		int a, b, c, d, e;
		printf("5개의 숫자를 입력하시오.");
		scanf_s("%d %d %d %d %d", &a, &b, &c, &d, &e);

		if (a > b && a > c && a > d && a > e)
			printf("가장 큰 숫자 %d", a);

		else if (b > a && b > c && b > d && b > e)
			printf("가장 큰 숫자 %d", b);

		else if (c > a && c > b && c > d && c > e)
			printf("가장 큰 숫자 %d", c);

		else if (d > a && d > b && d > c && d > e)
			printf("가장 큰 숫자 %d", d);

		else if (e > a && e > b && e > c && e > d)
			printf("가장 큰 숫자 %d", e);

		int num[5]; //배열의 크기 0~4
		int max;
		int min;

		for (int i = 0; i < 5; i++)
			max = num[0];
	}
	
	int numbers[5]; //숫자 5개를 관리함 //5개를 한꺼번에 저장해서 관리함 ㅇㅅㅇ
	//참고로 여기에는 기본값으로 '쓰레기값'이 들어감.(무슨 값이 있는지 아직 모름)
	
	//첫번째거를 최댓값이자 최소값으로 가정할거다. => 다 똑같은 숫자일 수 있으니까.

	for (int i = 0; i < 5; i++)
	{

	}

		//배열의 길이를 구하는 방법
		int size = sizeof(numbers) / sizeof(int);
		size = 50; //이렇게 중복선언은 안 됨 //int size =50;xxxxxxxxx
		size = 5; // 위에서 "선언" 했다면 그 뒤엔 변수명 적기.

		//sizeof -> byte 값 구하는 것.
		//numbers는 5칸 짜리 배열이니까 20
		//왜냐면 int 5개 저장하는 거고
		//int 는 1개당 4 byte 니까~~~~~~~~~~~~~~~~~~~~~~
		//size 냨 = 20/4 = 5
	for (int i = 0; i < size; i++) //0,1,2,3,4, 다섯번 수행한다.
	{
		int num;
		scanf_s("%d", &num); // num에 값 대입.
		numbers[i] = num; //i번째 칸에다가 대입함.(시작점칸에다가 값을 쏙~~ 넣는 거당! 'ㅅ'/! 
	}

	//위에거랑 아래거 같다.

	for (int i = 0; i < size; i++)
	{
		printf("%d번째 숫자 입력\n", i);
		//int num;
		//scanf_s("%d", &num); //num에 값 대입.
		//numbers[i] = num; //i번째 칸에다가 대입함.
		scanf_s("%d", &numbers[i]);
	}

	// int max, min = 0;(x) 이렇게 선언하지마라. 음수에서 최댓값 찾으면 max 에서 0이 나온당.
	//가장 첫번째를 최대 최소로 가정을 한다.
	//다섯개 숫자가 다 똑같을 수가 있다.  //숫저 다섯개가 똑같을 수 있기때문에 최댓값으로 가정하는 거.
	int max = numbers[0];
	int min = numbers[0];

	for (int i = 1; i < size; i++)
	{
		if (max < numbers[i])
		{
			max = numbers[i]; //max보다 큰게 있으면 max를 i번째로 바꿔준다,//max보다 큰게 있으면 max를 i번째로 바꿔준다,
		}
		if (min > numbers[i])
			min = numbers[i]; //min보다 작은게 있으면 min을 i번째로 바꿔준다,
	}
	printf("최댓값 :%d, 최솟값 :%d\n", max, min);






	//2. 문자열 2개를 입력받고, 이 2개가 같은지 다른지 여부를 출력해주세요.
	/*문자열 2개를 입력받고,
	이 2개가 같은지 다른지 여부를 출력해주세요.*/
	char sentense1[1024]; //임의로 설정.
	char sentense2[1024];
	printf("문자열1 입력해주세요.");
	gets(sentense1); //rewind 필요x, scanf rewind 필요o
	printf("문자열2 입력해주세요.");
	gets(sentense2);
	//for(초기변수세팅 ; 실행조건 ; 증감연산)
	//초기변수 세팅 : int i = 0;
	//실행조건 : i <10;
	//증감연산 : i++이나 i--를 넣는다.

	int i = 0; //for 바깥으로 뺌 //다 설정해주는 것. 
	int isSame = 10;
	for (i = 0; sentense1[i] != '\0' && sentense2[i] != '\0'; i++) //둘중에 하나라도 널값이면 끝나고 아니면 안끝난당 //널값이 아니면 for문 안 실행!
	{
		if (sentense1[i] != sentense2[i]) //다른경우니까 센텐스 모든 문자열 비교 했을때 다 똑같으면 {}안 수행안된다. 
		{
			i = -1; // ?????????????????????????? -> 값자체는 의미가 없고 표식. 이문장이 같거나  다르다고 하기 위한?빠져나가게 하기위한.
					//중단하게 하기위한. -는 나오지 않으니까. 밑에거 수행하지 않으려고,.
			isSame = -10;
			//printf("이 문장은 다릅니다.\n");
			break;//return 0;
		}
	}
	//if (i != -1)
	//if(isSame==1)
	if(i>=0)
		printf("둘은 똑같다. %s %s\n", sentense1, sentense2);
	else
		printf("이 문장은 다릅니다.\n");

	if (0)
	{
		//원본
		int i = 0; //for 바깥으로 뺌
		for (i = 0; sentense1[i] != '\0' && sentense2[i] != '\0'; i++)
		{
			if (sentense1[i] != sentense2[i])
			{
				//i = -1;
				printf("이 문장은 다릅니다.\n");
				break;
			}
		}
		if (i != -1)
			printf("둘은 똑같다. %s %s\n", sentense1, sentense2);

	}

	return 0;
}