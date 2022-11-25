#include<stdio.h> 
// 많이 많이 많이 보면 늘수도 있당~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//1. 변수 a와 b와 c의 값을 입력받고, a부터 b까지의 합을 구하되, 
//c의 배수 부분은 제외하고 합을 구할 것.
//이 값을 main에 반환하는 함수 작성하기(못하겠다면 그냥 main에 먼저 짜보기)

int sum_a_to_b(int a, int b, int c)//매개변수는 main에서 불러올 수 있다. // << 이 함수에 main의 int a, b, c  를 임시로 넣는 것.
{
	int sum = 0; //mul->1, 

	for (int i = 0; i <= b; i++)
	{
		if (i % c != 0) //c의 배수 제외
			sum += i; //sum=sum+i // mul->* 
	}
	return sum; // 반환은 =>> 다시 입력해주는 것. int sum_a_to_b
}


int main()
{
	int x, y, z; //선언
	printf("a,b,c 값을 입력하세요.");
	scanf_s("%d %d %d", &x, &y, &z); //%d란 데이터를 &x 위치에 저장한다
	printf("%d부터 %d까지의 합(%d의 배수 제외)\n", x, y, z);
	int result = sum_a_to_b(x, y, z);
	printf("결과 : %d\n", result);
	return 0;
}



//함수는 뭔가를 받으면 뭔가를 주는 것 fxfxfxfx
//scanf_s 싫으면 = 함수를 만들어 놓으면 필요 없을 수 있당. 값을 넣어버리면 끝나니까 'ㅅ' //입력받은 함수
//printf("1부터 100까지의 합인데 3의 배수 제외한 결과 : %d\n", sum_a_to_b(1, 100, 3)); 
//a,b,c 값을 정해줘 버리는것.



