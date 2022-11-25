#include<stdio.h>
int main()
{
	//문자 입력 2가지 방법이 있음
	//scanf_s에서 1 넣어준건, 컴퓨터 메모리 안에 문제가 없게 해주기 위해서.
	//할당해 놓은 변수 말고 넉넉히-> 1byte 만의 공간을 넣어줘서??
	//scanf_s는 정해진 공간만큼만 쓸 수 있어서 오버플로우? 되면 돌아감?? 
	//숫자 넣어줘서 실행하게 해주는 것??
	//char c =  컴퓨터에 공간 할당
	//&c = 주소.

	char c;
	printf("내 기분은 오늘 +? -? 0?\n");
	scanf_s("%c", &c, 1);
	printf("오늘 내 기분은 %c입니다.\n", c);
	rewind(stdin); //버퍼 공간 청소 
	//(숫자입력 했으니 문자 입력 받으려면 rewind!! )
	//두번째 입력부턴 써야함!
	scanf_s("%c", &c, 1);
	printf("c = %c\n", c);

	rewind(stdin); 
	printf("내 이름의 첫글자는?");
	c = getchar(); //1글자만 입력받는 거
	printf("%c\n", c);

	rewind(stdin);
	printf("내 이름의 끝글자는?");
	c = getchar(); 
	printf("%c\n", c);


	//배열을 안 배웠지만
	char name[100]; //name변수는 100byte 저장가능
	//문자열 입력받을 때 넉넉하게 범위 지정하면 됨.
	//만약 딱 맞게 지정하고 싶다면
	//입력하고자 하는 byte+1만큼 지정해줘야 함.
	//ex. 한글 3글자 입력할 경우엔 [7] (null값4개)
	//영어 10글자 입력할 경우엔 [10]
	//java, c#, c++에선 string이라는 자료형이 있지만
	//c는 그런 거 없다 ㅇㅅㅇ xxxxxxx
	//이걸 제대로 이해하려고 하면 배열, 포인터를 모두 배워야 함....
	//일단 우린 간단하게 입-출력만 배우쟈!!!!!!!!!!!!!!!!!!!!!!!!
	
	

	printf("이름은?");
	scanf_s("%s", name, sizeof(name)); //문자열 입력할땐 & 안 붙여도 됨.
	printf("내 이름은 %s입니다.\n", name);
	rewind(stdin); //문자열도 마찬가지로 다음에 또 입력받을 때 rewind해야함!
	char mbti[100];
	printf("mbti?");
	gets(mbti); //scanf_s 써도 되는데 gets 써도 됨. 
	//scanf_s는 스페이스 뒤 짤림. 그래서 gets 쓰는듯?!
	printf("내 mbti는 %s입니다.\n", mbti);

	//rewind scanf_S나 gets 쓰기전에 써주면 된다!
	//Hello\0 = null 값 = > 이게 있어야 문장의 끝이 된당.
	//null = 아무~~~~~~~~ 것도 없는 것!!!!!!!!!!@!@!@!@!@!@!ㅜ,ㅜ
	printf("혈액형?\n");
	char bType[2];
	gets(bType);
	printf("%s", bType);
	return 0;
}