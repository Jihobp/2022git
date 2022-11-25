#include<stdio.h>
int main()
{
	//숫자 체계 => 숫자는 ""없이.
	//%d => decimal(10진수) => 정수
	//정수 : 소수점이 없는 숫자
	//-3 -2 -1 0 1 2 3...
	//%f : float = 실수 (소수점까지 붙여야함)
	//%c : 문자(1글자)
	//%s : 문자열(= 여러 개의 문자)
	//ASCII table : 아스키 코드표 
	//UNI CODE : 
	//""는 문자에서 쓴다.
	//숫자는 ""xxxxx"" 감싸면 안된다. 감싸야하면 %s로 해야함.
	//자바는 구분하지 않는다.
	//%s = "숫자"
	printf("%d ", 1 + 1); 
	printf("%f ", 1.0 / 3);
	printf("%f ", 1 / 3);
	printf("%d ", 1 / 3);
	printf("%c ", 'A');
	printf("%d ", 'A');
	printf("%s", "박지호");
	printf("%c%c", "가"[0],"가"[1]);
	return 0;
}