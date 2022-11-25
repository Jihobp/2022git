#include<stdio.h>
//Fibonacci recursion.ver
////f(n)=f(n-1)+f(n-2) || F(n + 2) = F(n + 1) + F(n) like a tree
int fibonacci(int n)
{
	if (n <= 1)
		return n; 
	return fibonacci(n - 1) + fibonacci(n - 2); 
	
}

int main()
{
	int n = 5;
	printf("%d", fibonacci(n));
	return 0;
}



//피보나치 수열을 재귀함수를 이용해서 풀어보았습니다. 재귀함수는 자기자신을 return하기 때문에, 이 함수는 이 수열을 풀기 적합한 느낌..적인 느낌 이었습니다..? 
//피보나치 수열은 간단히 설명하자면,  전의 수열과 전전의 수열을 합쳐서 만든건데, 마치 나무와 같은 형태로 쭉 이어지게 됩니다.
//재귀함수는 종료조건을 만들어주지 않으면 자기자신을 계속 호출해서 overflow 현상이 일어나기때문에, 리턴 조건을 만들어줬습니다. 
//1보다 작거나 같으면 그 값을 반환하는 의미로 적어줬구요.
//피보 5를 넣으면 피보 4, 피보3이 들어가고 각각 계산이 되고 그밑에도 같은 방식으로 실행하게 됩니다.
