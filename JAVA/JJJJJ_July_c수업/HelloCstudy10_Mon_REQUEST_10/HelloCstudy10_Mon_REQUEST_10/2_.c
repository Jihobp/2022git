#include<stdio.h>
//2. Sec(초) 값을 입력받아서 시간이 h분 m초라는 걸 출력하되, 
// 3600이상의 값을 받으면 //오류 메시지를 출력한다.
//그리고 m 값은 반환한다.
int main(void)
{
	int h, m, s;
	printf("초 입력하세요.");
	scanf_s("\n%d초를 입력하세요.\n", &s);

	/*if (m > 60)
	{
		s= m/60; //대입연산자 공식 !
		m -= 60;
		h++;
		printf("%d", h);
	}
	if (s > 60)
	{
		s = s%60;
		s -= 60;
		m++;
		printf("%d", s);
	}
	if (m < 60)
	{
		printf("%d", m);
	}
	else if (s > 3600)
	{
		printf("오류입니다.");
		return m;
	}*/
	return 0;


	//1000/60=m,몫은 분
	//1000%60=s,나머지는 초
	if (0)
	{
		int h, m, s;
		scanf_s("%d %d %d", &h, &m, &s);

		if (m > 60)
		{
			m -= 60;
			h++;
		}
		if (s > 60)
		{
			s -= 60;
			m++;
		}
		if (m < 60)
		{
			printf("%d", m);
		}
		else if (m >= 60)
		{
			m -= 60;
			printf("%d", m);
		}
	}
}





