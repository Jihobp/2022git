#include<stdio.h>

//1.
void printnumber(int a, int b)
{
	if (a < b)
	{
		printf("%d가 %d보다 크다.", b,a);
	}
	else
	{
		printf("%d가 %d보다 크다.", a,b);
	}
}



//2.
void returnnumber(int a, int b)
{
	if (a < b)
	{
		return b;
	}
	else
	{
		return a;
	}
}

//3. swap 함수? https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=doksg&logNo=221567106026 
void changenumber(int a, int b)
{
	int temp = a;
	a = b;
	b = temp;
}

//함수안에서 a,b 값은 바뀌지 않는다. 단지 위치가 바껴질 뿐.
//실제 "값:"을 바꾸고 싶다면 포인터*배열을 바꿔줘서 
//전달 받은 a와 b의 값이 함수 안에서만 서로 교체 된다. 사실상 교체가 되지 않는 것이다.
//실제 값을 변경하고 싶다면 함수에게 바꾸고자 하는 변수의 주소 값을 전달해주면 된다.
//이 주소에 있는 값을 서로 바꿔달라 라고 하면 그때는 주소에 접근하여 그 값을 서로 바꿔 주게 된다.
//void swap(int* a, int* b)
//{
//	int temp = *a; //a 위치의 값.
//	*a = *b;
//	*b = temp;
//}