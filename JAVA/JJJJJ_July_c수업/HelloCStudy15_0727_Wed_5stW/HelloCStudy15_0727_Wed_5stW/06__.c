#include<stdio.h> //그림 참고. //배열=포인터, 포인터=/배열, 포인터는 배열을 구현할수있다구??? 문자열=문자배열
//void printYourName(char n[])
void printYourName(char* n)
{
	printf("%d\n", n);
	printf("당신의 이름은 %s입니다.\n", n);
}
char* printABC()
{
	int a = 10;
	return "abc\n";
}
//매개변수 없이 문자열을 입력받아서 리턴하고 싶을 땐?
char* returnMyInfo()
{	
	//결론 : 문자열을 입력한 뒤 리턴하고 싶다면 앞에 static 붙이기
	static char mbti[10];//static char mbti[5];static을 붙이면 잘 됨... 왜...? //tmi. 값을 넉넉하게 줘도 사라지지 않는당~
	printf("mbti?");
	gets(mbti);
	return mbti;
}
char* returnMyMBTI(char* mbti)
{
	//main에 있는 문자열을 가지고 와서, 다른 걸 하고 싶다면
	//매개변수로 해당 문자열을 받아와야 함
	return mbti; //매개변수로 받은 걸 그대로 리턴해보기
}

char* change(char* mbti)
{
	gets(mbti);
	return mbti; //매개변수로 받은 걸 그대로 리턴해보기
}
int main()
{
	printf("이름 입력");
	char name[100]; //문자배열 = 문자가 여러개 들어감
	gets(name);	    //문자가 여러개 들어감 = 문자열
	printf("%d\n", name);
	printYourName(name); //따라서 문자배열 = 문자열
	printf("%s\n", printABC());
	//배열 = 포인터
	//name 배열은 name 포인터라고 봐도 된다.
	printf("%s\n", returnMyInfo()); //?????????????
	printf("%s\n", returnMyMBTI("ENFP"));
	printf("%s\n", returnMyMBTI(name));
	printf("%s\n", change(name));
	return 0;
}