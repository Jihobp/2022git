#include<stdio.h>
//1.
struct KBStudent
{
	int cScore;
	int javaScore;
	char name[100];
};
int main()
{
	//2.
	struct KBStudent s1 = { 10,20, "jinx"};
	scanf_s("%d %d %s", &s1.cScore, &s1.javaScore, &s1.name); //구조체g4의 x값(g4.x)에 주소(&)에 넣는다. 
	printf("%d %d %s", s1.cScore, s1.javaScore, s1.name);
	
	

	/*	1. KBStudent 라는 구조체를 만든다.
		안에 들어가는 내용은 아래와 같다.
		int cScore, int javaScore, char name[100]

		2. 학생 1명을 만들어 본다.코드로도 값 대입해보고 scanf로도 값 대입해본다.

		3. 학생을 5명 만든다.

		4. c, java 각각의 총합을 구한다.

		5. c, java의 평균을 구한다.

		6. c, java에서 각각 누가 1등인지 구한다. < ->꼴지도 구한다.

		7. 전체적인 평균으로 봤을 때 누가 1등인지 구한다. < ->꼴지도 구한다.

		8. 4~7까지를 배열을 매개변수로 하여서 값을 리턴한다.

		9. 함수 안에서 StudentScore로 배열 만들고 그 배열 리턴하는 함수 만들어 본다.

		10. StudentScore 배열을 매개변수로 하여 출력하는 함수 만들어 본다.*/
}