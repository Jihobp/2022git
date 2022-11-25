#include<stdio.h>

//1. Rectangle 이라는 구조체를 만든다. 에는 width, height 속성이 있다.
	struct Rectangle //2개의 변수를 갖는다.
	{
		int width;
		int height;
	}typedef Rectangle; //strucht 생략가능
	
	

	//2.이 Rectangle을 매개변수로 한 함수를 만들고
	// 이 Rectangle의 넓이값(width * height)을 리턴하게 한다.
	int area(Rectangle r)
	{
		return r.width * r.height;
	}




	//3. main에서 이 것을 호출한다.
		//만약 함수가 어렵다면 main에서 이 모든 작업을 해보기
		//사각형은 2개 정도 만들어보기
		//1개는 코드로 값 넣고
		//1개는 scanf_s로 값 넣어보기

int main()
{
	struct Rectangle r1;
	r1.width = 50;
	r1.height = 10;
	printf("넓이 : %d\n", r1.width * r1.height);
	Rectangle r2; //typedef Rectangle 안 적으면 앞에 항상 strucht가 붙어야 하!!!
	scanf_s("%d %d", &r2.width, &r2.height);
	printf("넓이 : %d\n", r2.width * r2.height);
	printf("넓이 : %d\n", area(r2)); //함수활용


	Rectangle recs[3];
	recs[0] = r1;
	recs[1] = r2;
	recs[2].width = r1.width;
	recs[2].height = r2.height;


	return 0;
}