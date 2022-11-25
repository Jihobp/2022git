#include<stdio.h>
int main()
{

	//3. 피타고라스의 법칙 피타고라스의 법칙 결과 출력하기 (a^2 + b^2 = c^2 에서의 c^2 값 출력하면 됨)
	//입력1: 3
	//입력2 : 4
	//출력 : 25

	int a, b;
	printf("a는? b는?\n");
	scanf_s("%d%d", &a, &b);
	printf("피타고라스의 법칙은 a^2(%d) + b^2(%d) = c^2(%d) 입니다. \n", a * a, b * b, a * a + b * b);

	
	//int 4바이트 정수형 변수 a,b 선언해주고
	//a,b질문 입력합니다->출력.
	//scanf_s("%d%d", &a, &b); scanf("입력받을 형태-%d정수", &변수이름); 을 써주시면 입력받을수 있습니다. 
	//(입력받아서 저장하는 함수)
	//char, char[]형태인 문자, 문자열에서는 입력받을 크기를 반드시 뒤에 입력해주어야 합니다.
	//scanf_s("%s", 문자열변수명, sizeof(문자열변수명)); 을 써주시면 입력받을수 있습니다.
	//scanf_s하나만 쓰고 여러변수를 입력받고 싶다면 
	//scanf_s("%d %s %d %c", &a, b, sizeof(b), &c, &d, sizeof(d)); 이런식으로 써주면 되겠죠?

	//teacher's 
	//3. 피타고라스의 법칙 피타고라스의 법칙 결과 출력하기 (a^2 + b^2 = c^2 에서의 c^2 값 출력하면 됨)
	//입력1: 3
	//입력2 : 4
	//출력 : 25

	printf("입력1: ");
	scanf_s("%d", &a);
	printf("입력2: ");
	scanf_s("%d", &b);
	printf("출력 : %d\n", (a * a) + (b * b));

	if (0)
	{
		int a, b;
		printf("a는?b는?\n");

		scanf_s("%d%d", &a, &b);
		printf("피타고라스의 법칙은 a^2(%d) + b^2(%d) = c^2(%d) 입니다. \n", a * a, b * b, a * a + b * b);
	}

	return 0;
}