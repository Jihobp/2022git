#include<stdio.h>

/*
변수= 어떤 값이든 저장할 수 있는 장소.
&주소 *안으로  "배열은 포인터다." ->>> "포인터는 주소다."  
int x; 변수는 x가 인트일때 저장.
x=10;  
x->10; 변수 x는 10을 가지고 있다. :: 메모리 네모네모 스펀지밥 안에 10이 저장되어있다.

int *p; *을 넣으면 그때부터 포인터.
p=10(x)이렇게 값을 받는게 아니라,
p=&x 주소를 받는게 포인터. 
Q. p값은 뭘까요?
A. 주소입니당. 몰라요.
*p-> 10은 네모네모 스펀지밥안에 10이 저장되어있는걸 가리킨다. 

int s[3] = {1,2,3}; 연속된 메모리 위치값=3칸의 배열 안에 int s 저장할 수 있게끔 선언 한거. 
s[0],	s[1],	s[2]						값을 가져온다.
1		2		 3		df. 값		*s		값을 가져온다.
s		s+1		s+2		df. 주소		*(s+1)  값을 가져온다.
*/


//student라는 구조체는 여러 자료형 변수를 저장할 수 있는 것.
//홍길동이란 이름안에 여러 점수를 관리하고 불러오기 쉽다.
struct student  //구조체 구조체이름
{
	char name[12]; //자료형 변수명[배열의 수]; // 12개의 배열의수(0~11)를 가진 차형 변수 name 
	int kor, math, sum, total; //자료형 변수명 // 인트형 변수명 4개 선언
};
int main() 
{
	struct student s[3] = { {"홍길동",90,85},{"이순신",88,91},{"아무개",80,75} };
	//구조체 구조체이름 메인의변수명[배열의수]
	//={{s[0]=p !!! 매개변수와 그 안에 들어있는 값}{s[1]=p+1매개변수}{s[2]=p+2매개변수}
	//매개변수 세개를 불러와서 구조체 안에 집어 넣는다. ?????
	//struct 선언하고 세명을 정의한다. 초기값 세팅-점수.
	struct student* p; //구조체 포인터 변수// 구조체 student를 가리키는 포인터 변수 p 선언?
	p = &s[0]; // 변수 = s의 주소[0번째] // 0번째에 있는 s의 주소는 p이다.
	//구조체 student를 가리키는 p에 첫번째 주소를 넣는다.=&s[0]  
	//*포인터, &주소(변수값 받을때) 

	(p + 1)->sum = (p + 1)->kor + (p + 2)->math;  //  163= 88+75 을 p+1의 sum에 넣겠다.
	(p + 1)->total = (p + 1)->sum + p->kor + p->math; //338=163+90+85

	printf("%d\n", (p + 1)->sum + (p + 1)->total); //163+338= 501
}

//선언할때 주소를 가리키고자 하는게 포인터다.
//선언할땐 int* p;
//p값을 이용할땐 p=&변수;
//int a[5]; 로하면 a[0]~a[4]까지. 
//&a[0] || a 라고만 해도 주소다.
//1) p=&a[0] 또는 밑에꺼 쓰면 
//2) p=a; a를 p에 넣을 수 있게됨.
//3) a+1; a의 2번째 주소.
//포인터는 배열의 크기+1 . [4]는 5번째.

