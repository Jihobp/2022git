#include<stdio.h>
int main()
{
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
					//한글자라도 다르게 끝나면 조건이 안맞아서 중단.=break.
					//문장이 다 똑같아서 -1이 될일이 없으면 똑같다ㅗㄱ 나온다. 
			isSame = -10;
			//printf("이 문장은 다릅니다.\n");
			break;//return 0;
		}
	}
	//if (i != -1)
	//if(isSame==1)
	if (i >= 0)
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