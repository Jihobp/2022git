#include<stdio.h>
int main()
{
	//1.	대소문자 변환
		//1. 입력한 문자열 중 영어가 보이면 무조건 대문자로 바꾸기
		//2. 입력한 문자열 중 영어가 보이면 무조건 소문자로 바꾸기
		//3. 입력한 문자열 중 영어가 보이면 무조건 대소문자를 반대로 바꾸기
		//4. 입력한 문자열을 거꾸로 바꿔서 출력하기
	if (1)
	{
		char en[32];

		//char a = getchar();
		//scanf_s("%c", a, 1);
		printf("input english : ");
		gets(en);
		//scanf_s("%s", en,sizeof(en));
		for (int i = 0; en[i] != NULL; i++)
		{
			if (en[i] >= 'A' && en[i] <= 'Z')
			{
				printf("%c => %c", en[i], en[i] + 32);
				en[i] += 32;
			}
			else if (en[i] >= 'a' && en[i] <= 'z')
			{
				printf("%c => %c", en[i], en[i] - 32);
				en[i] -= 32;
			}
		}
		//문자는 for문안에서 en[i] 위치를 지정해줘야한다. 글자 하나하나 읽어드려서 체크해야해서 .
		//문장은 %s, 하나하나 체크할건 문자라 %c

		//3번
		if (en >= 'A' && en <= 'Z')
		{

		}

		//4번 거꾸로 바꿔서 출력하기.
		rewind(stdin);

	}

	printf("첫번째 문장 입력해요.");
	char s1[1024];
	char s2[1024];
	gets(s1);
	//printf("두번째 문장 입력해요.");
	//gets(s2);
	int diff = 'a' - 'A';//대소문자간의 차이 구해놓기.//아스키코드 상에서 차이가 있다는건 알고 있다. 소문자 a가 더 큰것도.
	for (int i = 0; s1[i] != NULL; i++) //NULL 값이 나올때까지 읽어드림............. s1에 문자를 입력했을때 소문자 a랑 대문자 A만큼 diff-빼준다.
	{
		//a~z까지의 값인 경우
		if (s1[i] >= 'a' && s1[i] <= 'z')
		{
			int diff = 'a' - 'A'; //소문자 a에서 대문자a까지를 빼주면 a가 나옴...// !!!!!!!!!!!!!!!!!!!!!!!!!!!@!@!@!@!@!@!
			s1[i] -= diff;
		}
	}
	printf("1. %s\n", s1);
	for (int i = 0; s1[i] != NULL; i++) //NULL 값이 나올때까지 읽어드림.............
	{
		//a~z까지의 값인 경우
		if (s1[i] >= 'A' && s1[i] <= 'Z')
		{
			s1[i] += diff;
		}
	}
	printf("2. %s\n", s1);

	printf("문장 다시 입력해보세요.");
	gets(s2);
	for (int i = 0; s2[i] != '\0'; i++) // 중간에 있는 null값이 아닐때 for문안에 있는걸 수행한다는 뜻!!!!!!!!!!!!!!!!!!!!!!!!!
										// null 이 올때까지 수행하니까 c는 널값 꼭 지정해줘야한다...!! 아니면 쓰레기값들어간당.
	{
		if (s2[i] >= 'A' && s2[i] <= 'Z')
			s2[i] += diff; //소문자로 변환
		else if (s2[i] >= 'a' && s2[i] <= 'z') //else 빼면 안된다. 원복 되기 때문에.?? if 다실행해서 도로아미타불 되기 때문에.
			s2[i] -= diff;//대문자로 변환 
	}
	printf("%s\n", s2);



	//Q. 뒤집는 매커니즘??
	char r[1024]; //뒤집힌 거 저장하기 //임의로 설정한 1024 넉넉하게. 2의 10진수.
	int index = 0; //원본의 크기=/= 문자의 길이가 더 나은 별명.	
	int count = 0; //복사본의 index //count가 r 값의 인덱스-위치가 된다.
	while (s2[index] != NULL) //index++하나하나 더하다가 null 값이 되면 끝.
		index++;
	//index가 s2(s2[index]=s2의 길이)의 문장 끝(=null)을 가리키면 끝남.
	//하나하나 세봐야지 알 수 있다 널값까지~~~ 

	//INDEX-1: NULL 바로 앞. 즉 문장의 긑.
	//abc 입력하면 abc'\0' 이렇게 되는 데..
	//index-1이면 c를 가리킴.

	//i-- 하면서 첫번쨰 글자까지 읽어들임.
	//count는 r 배열의 인덱스
	//s2에 있는 글자를 뒷부분부터 가져와야 하는데
	//r배열의 앞부분부터 채워야함.

	for (int i = index - 1; i >= 0; i--, count++) //-1한건 null 값 빼는거.
	//i가 2부터 시작해서 2,1,0->3번 돈다.
	{
		printf("%c", s2[i]); //거꾸로된거 출력 ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
		r[count] = s2[i]; //거꾸로 된 거 쌓기 ????????????????????????????????????????????????????????????????????? count 번째에다가 r 값 대입.
	}
	r[count] = NULL; //카운트가 계속 증가 했으니까, 최종적으로 마지막에 NULL = 출력. end.
	printf("\n%s\n", r);


	//2. 알파벳 등장 횟수
		//1. 입력된 알파벳 문자열(단 소문자로만 입력할 것)의 각 글자들이 해당 문자열에서 몇 번씩 나왔는지 출력하시오.
		// 알파벳은 소문자를 기준으로 하고, 대문자 입력시 소문자로 변환 후 처리하기
		//문자열 입력받는 배열은 1024로 할 것
		//예) leedongjoon
		//'d'는 1글자 입니다.
		//'e'는 2글자 입니다.
		//'g'는 1글자 입니다.
		//'j'는 1글자 입니다.
		//'l'는 1글자 입니다.
		//'n'는 2글자 입니다.
		//'o'는 3글자 입니다.

	//input에 NULL값으로 모두 채움
	char input[1024] = { NULL, };
	//그렇다고 char input[1024]={1,};
	//이렇게 적었을 떄 모두 1이 들어가지 않ㅇ름.
	//첫번째 칸만 1 들어감.
	printf("문자열을 입력해주세요.");
	gets(input);
	int charAlpha[26] = { 0 }; //전부 0으로 채운다.
	//안적으면 쓰레기값 들어가 있음.
	//각 스펠링의 개수는 의미. [0]에 10 있으면 a가 10개.
	//[3]에 5가 있으면 d가 5개 있는 것.

	for (int i = 0; input[i] != NULL; i++)
	{
		if (input[i] >= 'A' && input[i] <= 'Z') //소문자로 전부 통일 작업
		{
			input[i] += ('a' - 'A');
		}
		//소문자 a보다 작거나 소문자 z보다 큰 경우
		//a~z 사이의 범위 벗어남.(대문자는 이미 변환 작업 함)
		if (input[i] > 'a' || input[i] > 'z')
		{
			printf("종료\n");
			return 0; //프로그램 종료시켜 버림.
			//break를 해도 상관은 없다.
			//그럴 경우엔 또 다른 변수를 만든다.
		}
		else //a~z인 경우 //그 다음에 개수를 센다.
		{
			charAlpha[input[i] - 'a']++; //??????????????????????????????????????????????????대괄호에 끝에 ++ ?????????????????????????
		}
		for (int i = 0; i < 26; i++)
		{
			if (charAlpha[i] != 0)
				printf(" '%c'는 %d글자입니다. \n",
					'a' + i, charAlpha[i]);
			//i = 0
			//'a'+0='a'
			//i=1
			//'a'+1='b'
		}
	}



	//3. 알파벳 최초 등장 위치
		//1. 입력된 알파벳에서 각각의 알파벳 글자가 최초로 등장하는 위치를 적으시오. => pointer???
		//문자열 입력받는 배열은 1024로 할 것
		//알파벳은 소문자를 기준으로 하고, 대문자 입력시 소문자로 변환 후 처리하기
		//예) aabbcc
		//a는 1번째에서 처음 등장합니다.
		//b는 3번째에서 처음 등장합니다.
		//c는 5번째에서 처음 등장합니다.




	//4. 벌집
		//위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
		//그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 
		//이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
		//숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 
		//몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
		//예를 들면, 13까지는 3개, 58까지는 5개를 지난다


	return 0;
}