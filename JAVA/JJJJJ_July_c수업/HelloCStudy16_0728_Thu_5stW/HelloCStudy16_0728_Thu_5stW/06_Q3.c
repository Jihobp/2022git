//1. 2D 게임 캐릭터 죄표 저장하는 구조체 만들기
struct game {
	int xx;
	int yy;
};typedef 

//2. 3D 게임 캐릭터 죄표 저장하는 구조체 만들기
struct gamee {
	int x;
	int y;
	int z;
}; typedef

//int* numbers 
//int numbers[]
//둘 다 포인터=배열, *안으로 &위치//배열은 포인터다, 포인터는 주소=첫시작값; 여기서부터 시작한다.

//3. 동물병원의 동물을 저장하는 구조체 만들기
//4. 본인이 만들어 보고 싶은 거 아무거나 구조체 만들기
//5. 위에서 만든 구조체 가지고 변수 최소 2개 이상씩 선언해보기
//6. 코드상으로도 입력해보고(stu.num = 1 이런식으로...) 
//키보드로도 입력해보기(scanf, gets등)
//참고로 문자열은 경우에 따라선 strcpy 써야할 수도 있다.
//7. 이렇게 만든 것들 쭉 출력해보기
//-------------------------------------------------------------------(main에서 해보기)
//8. 구조체를 매개변수로 하여 내용들 출력하는 함수 만들어보기
//9. 구조체를 리턴한 뒤 메인에서 출력도 해보기



#include<stdio.h>
//4. CCP coding stamp
struct Phone {					//폰 구조체
	int areacode;				//국가번호
	unsigned long long number;	//폰번호
};

struct Person {					//사람 구조체
	char name[1024];			//이름
	int age;					//나이
	struct Phone phone;			//휴대전화. 구조체를 멤버로 가짐
};

int main()
{
	struct Person p1;

	p1.phone.areacode = 82;	//변수.멤버.멤버 순으로 접근하여 값 할당
	p1.phone.areacode = 3045671234;	//변수.멤버.멤버 순으로 접근하여 값 할당
	
	printf("%d %llu\n", p1.phone.areacode, p1.phone.number); //82 3045671234
	return 0;
}
