#include<stdio.h>
#define MAX 1024 // 매크로 상수 선언
//이걸로 배열의 크기 정할 수 있다.
//단, 변수로는 크기 지정 안 됨.
//하려면 malloc, calloc 이런거 써야 함.

	//3. 알파벳 최초 등장 위치
		//1. 입력된 알파벳에서 각각의 알파벳 글자가 최초로 등장하는 위치를 적으시오. => pointer???
		//문자열 입력받는 배열은 1024로 할 것
		//알파벳은 소문자를 기준으로 하고, 대문자 입력시 소문자로 변환 후 처리하기
		//예) aabbcc
		//a는 1번째에서 처음 등장합니다.
		//b는 3번째에서 처음 등장합니다.
		//c는 5번째에서 처음 등장합니다.

int main()
{
	char input[MAX] = { NULL };
	printf("문장입력해요");
	gets(input);
	int charAlpha[26] = { 0 };
	for (int i = 0; input[i] != NULL; i++)
	{
		if(input[i]>='A' &&input [i]<='Z')	
			input[i] +=('a'-'A'); //대문자 만나면 소문자로 바꿔줌.
		if (input[i] <'a' || input[i]>'z') //셋 중에 하나만 체크하고 나감. //if if else하면, 대문자는 소문자로 바꾸고, 넘어감. 
			continue; // 영문자만 센다 나머진 스킵
		else
		{
			if (charAlpha[input[i] - 'a'] == 0)		//최초등장시???????????????????? = >>>> 배열이 0부터 시작하게 되면 
				charAlpha[input[i] - 'a'] = i + 1; //배열 //+1해줘서 인풋되게 해준다.
			//첫번쨰 등장시 0이 아닌 1 넣어야 하므로
			//항상 i+1을 넣는다.
		}
	}
		for (int i = 0; i < 26; i++) //for문 바깥으로 빼야한댱.
		{
			if (charAlpha[i] != 0)
				printf("%c는 %d번째 최초 등장\n",
					'a' + i, charAlpha[i]);
		}



	return 0;
}