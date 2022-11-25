#include<stdio.h>
int main()
{
	//문자(따옴표 안에 있음 '')와 문자열
	//문자열 - 쌍따옴표("") 안에 있음. 문장 혹은 string 이라고 함.

	char c = 'A';
	char mbti[5] = "INFJ"; //문자를 여러개 저장하는 배열. 최대 다섯글자=5byte를 입력할 수 있는데, 
							//infj 끝에 NULL 혹은 '\0'이 자동으로 들어간다.
							//null 값이 안들어가면 문장이 끝났는지 인식을 못한당.
	char* m = mbti; //
	char bType[3];
	bType[0] = 'A';
	bType[1] = 'B'; //bType에 AB라고 쓴 거
	bType[2] = NULL; //혹은 '\0' 넣기
	char bloodType[3] = "AB"; //ab형은 세문자
	char name[7] = "박지호"; //한글은 한글자가 2byte. 2칸. 2x3=6+null값
	char mbti2[100] = "INFJ"; //생각하기 귀찮으면 넉넉하게 잡기.

	//scanf_s("%c", name, 1) //  &name으로 안서도 되고, 1 끝에 붙여줘야한당.
	
	printf("%s", bType);
	//문자열 입력받기
	printf("\nmbti는?\n");
	gets(mbti); 
	//gets 다음엔 rewind 필요 없다.
	//getchar 다음엔 필요하당 !!!!!!!!!!!!!
//주의사항 !!!!! 끝에 NULL이 들어갈 걸 고려해서 배열의 크기를 잡아야 함!!!
//gets로 입력할 땐 문제가 없을 수도 있으나 scanf로 입력시 출력이 안됨
//고려하지 않으면 나중에 오류가 발생할 수 있다.

	printf("%s", mbti);
	//문자 입력받기
	printf("알파벳 하나 입력해보기");
	rewind(stdin);//컴퓨터 메모리(=버퍼라는 공간, 입력된 데이터가 저장되는 곳) 청소 clean up!!!
				//문자나 문자열을 입력받을 때
				//위에서 뭔가 입력받은 게 있으면 반드시 추가해 줘야 하는 코드
				//1. 숫자만 입력할 땐 쓸 필요 없다!!!
				//2. 숫자나 문자, 문자열과 같은 데이터를 입력하고 나서 그 뒤에 문자나 문자열을 또 입력할 경우 쓰임.
				// 1) 숫자 입력하고 나서 엔터를 치고, 문자나 문자열 입력시
				// 2) 문자나 문자열 입력하고 나서, 다시 문자나 문자열 입력시
				// scanf나 getchar를 한번이라도 수행한 상태에서 바로 다음에 뭔가 입력받아야 될 경우에 쓰임.
				// 참고로 직전에 gets로 문장을 입력받았다면 그 땐 안 써도 됨.
				// scanf나 getchar를 썼고 그 뒤에 getchar나 gets로 문자나 문자열을 입력받으려고 할 땐 rewind로 엔터키를 없애줘야 한다. 
				// 그리고 그 전에 뭘 입력했든지 간에 현재 숫자를 도 입력하는 거라면 안 써도 된다.
				// 즉, 내가 문자나 문자열 입력하기 직전에 쓰임. ( 제일 처음에 입력할 때 제외~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ )
				//엔터키\n가 버퍼라는 메모리에 남아 있어서
				//그걸 반드시 삭제해줘야 한다. = > 찌꺼기 제거.
				//rewind 없이 문자나 문자열 입력하면 enter키 남아있던게 쏙 들어간다. infj + enter키 하면 enter키가 c로 들어가서 
				//그냥 종료된당... ;ㅅ ;


	c = getchar();
	printf("%s %c", mbti, c);
	printf("다시 문자 입력");
	//rewind 안 넣으니가 엔터키가 getchar에 들어가버림.
	//단!!! 직전에 입력받을 때 썼던 코드가 gets라면, 필요 없음 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	//대신 scanf거나 getchar일 경우엔 rewind가 필요.
	//숫자만 입력받을거라면 rewind 안 써도 되고, 문자나 
	//문자열을 입력받을 땐 써야 함.
	rewind(stdin);
	c = getchar();
	printf("c=%c\n", c);

	rewind(stdin);
	printf("aaa");
	char ch;
	char ch2;
	char myname[100];
	gets(myname);
	ch = getchar();

	//java, c#, physson, 가면 쉬울거다. 문자열처리 c가 어려ㅓㅂ다... 존버는 성공한댱!!!!




	return 0;
}