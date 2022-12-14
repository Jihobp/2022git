#include<stdio.h>
int main()
{
	/*배열 문제
		모두 main에서 수행하면 됩니다.
		1. 경북산업직업전문학교 층별 강의실 각각에 저장된 학생의 수 저장해보기
		층수, 강의실 훈련생 수는 임의로 정할 것
		2. 위의 내용을 반복문 통해서 출력해보기
		3. 경북산업직업전문학교 층별 강의실 개수 입력하고 출력해보기
		층, 강의실 개수는 임의대로 할 것*/
	//	1. 경북산업직업전문학교 층별 강의실 각각에 저장된 
	//  학생의 수 저장해보기
	//	층수, 강의실 훈련생 수는 임의로 정할 것
	//1층 제외 - 행정실
	//4층 없음
	//2 -> 1개
	//3 -> 5개
	//5 -> 4개
	//6 -> 3개
	//7 -> 6개
	//총 층수는 5개
	//훈련생의 수는 scanf로 입력받는다고 가정을 하자.

	//int counts[5][7]; //7로 잡은 이유는 최댓값이 6이라서 넉넉하게...
	//총 5개층이고
	//각 층마다 7개의 강의실이 있다고 가정
	//참고로 java같은 경우엔 배열 크기를 좀 더 유동적으로 적을 수 있음
	//첫번째 배열은 3칸, 두번쨰껀 5칸 이런식으로 적는 게 가능함

	//그러나 테스트하기 힘드니까 3개층 3개 강의실이라고 하자
	int counts[3][3]; //9개 강의실?????????????????????? 3x3이 정답인가.....................................
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("강의실 안에 학생 수 입력");
			scanf_s("%d", &counts[i][j]);
		}
	}
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("%d\t", counts[i][j]); //?????????????? 포문 두개......왜징.........................
		}//%d\t : 역슬래쉬 탭키 = 4칸 정도씩 넘어감........................
		printf("\n");
	}

	// 	3. 경북산업직업전문학교 층별 강의실 개수 
// 입력하고 출력해보기
//	층, 강의실 개수는 임의대로 할 것
//페이크문제
//해석1) counts[0]~counts[i-1]번째 값을 가져와서 쓴다.
//해석2) 그냥 1차원 배열 만들고 그 안에 값넣는다(=저의 의도)

	int rooms[3];//총 3개의 층짜리 배열
	//각 인덱스에 값을 넣으면 그게 바로 
	//각 층의 강의실 개수

	scanf_s("%d %d %d", &rooms[0], &rooms[1], &rooms[2]);
	printf("%d %d %d\n", rooms[0], rooms[1], rooms[2]);


	return 0;
}