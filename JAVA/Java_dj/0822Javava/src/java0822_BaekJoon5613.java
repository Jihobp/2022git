import java.util.*; //5613
//do-while문 및 switch문 사용
//(ex)(10)(-21)(*5)(=)
//문제
//덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램을 만드시오.
//입력의 각 줄에는 숫자와 +, -, *, /, =중 하나가 교대로 주어진다. 첫 번째 줄은 수이다. 
//연산자의 우선 순위는 생각하지 않으며, 입력 순서대로 계산을 하고, =가 주어지면, 그때까지의 결과를 출력한다. 
//주어지는 수는 108 이하의 양의 정수이다. 계산 중 결과는 0 또는 음수가 될 수 있지만, -108 ~ 108 범위를 넘지는 않는다. 또, 나눗셈에서 소수점은 버린다. 따라서, 100/3*3 = 99이다.
//피제수가 음수일 때 나눗셈을 하는 경우는 입력으로 주어지지 않는다.
public class java0822_BaekJoon5613 {
	public static void mian(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //첫번째 숫자 입력받기
		//a=1
		do {
			//변수 a를 중심으로 하여 연산이 진행됨
			char c=s.next().charAt(0); //연산자
			//c='+'
			if(c=='=') {break;} //=을 칠때 끝낸다
			int b=s.nextInt();	//두번째 숫자 입력받기
			//b=1
			switch(c) {
			case '+': a+=b; break;
			//a+b=->1+1->a에 저장됨.
			case '-': a-=b; break;
			case '*': a*=b; break;
			case '/': a/=b; break;
			case '%': a%=b; break;
			}
		}while(true);
		System.out.println(a);
		
		
	/*int sum=s.nextInt();
	while(true) {
		String calcul{s.nextLine(); //??
		if(calcul.equals("=")) //무한루프 끝
			break;
		switch(calcul)
		if()
		calcul +=("+");*/
	}	
}
