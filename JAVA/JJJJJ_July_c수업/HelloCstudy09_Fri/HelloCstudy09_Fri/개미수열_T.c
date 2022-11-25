#include<stdio.h>
int main()
{	//diagram https://m.blog.naver.com/ycpiglet/222113989214
	//start : 최초의 숫자이자, 말하기용 숫자	
	char start[2048] = "1";
	//읽고 말하기 수열의 20번째 값을 찾는 것
	//숫자로 생각하면 안 되고 문자로써 생각해야 함.???????????????????????????????????????? 하나씩 짤라서 숫자로 비교하려면/나누기하니까 데이터 엄청 늘어난당.
	//>>문자가 좀더 쉽댱.
	for (int i = 1; i <= 20; i++)
	{
		printf("%d번째 : %s\n", i, start);
		char end[2048] = { NULL };//읽고 말함에 있어서 얼마나 할지 누적시키는 것. end.
		char num = start[0]; //num : 읽는 숫자  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
		int count = 0; // 내가 읽은 문자의 개수
		int k = 0; //end에 문자 채워넣을 때 씀 (누적시킬 때)
		//본격적으로 읽어들이기 시작
		for (int j = 0; start[j] != NULL; j++)
		{
			if (num != start[j]) //읽는 숫자가 변할 때 ex)처음에 읽은 숫자가 1인데 2로 바뀌는 '조건'에
			{
				end[k] = num;
				k++;
				end[k] = count + '0'; //count 값이 2면 글자 2를 넣어줌.
				k++;
				num = start[j]; //num값 바꿔준다.
				count = 1; //카운트ㅜ 초기화
			}
			else
				count++;
		}

		end[k] = num; //k번쨰 num값이 ㄴ2를 넣고 
		k++; //k++ 되서 3을 넣고 
		end[k] = count + '0'; //count+'0'아스키코드 해서 숫자 3 출려ㅛㄱ..........................
		k++;

		//end에 있는 걸 start로 옮김.
		//for문으로 옮겨도 되는데... ★☆strcpy★☆라는 함수 써도 됨. 
		//strcpy(start, end); //end에 있는 걸 start로 옮김. (end의 길이만큼)
		int c = 0;
		for (c = 0; end[c] != NULL; c++)//end의 j번째가 null 값이 아닐때까지 j를 돌린다.
		//for (★int c = 0; end[c] != NULL; c++)
		//이 안에 있는 int c랑 바깥 int c는
		//변수 모양만 같고 전혀 다른 영역에 있는 변수. 쉽게 말하면 동명이인.
		//바깥에 있는 int c는 int main()소속.
		//안에 있는 int c는 for문 끝나면 사라쥠.
		{
			start[c] = end[c];
		}
		start[c] = NULL; //끝부분을 NULL로 봉합해야 한다.

		//'c'는 0부터 end 에 있는걸 start로 일일히 한땀한땀- 집어 넣는댜.
		//start에는 글자 1,1이 들어가고 end 초기화 된댜.

	}
	//일곡 말하기 null값, 일일히 집어넣기.
	return 0;
}