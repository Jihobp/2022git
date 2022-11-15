import java.util.Scanner;

//계산기 클래스 만들기
class Cal{
	//멤버 변수 선언부
	private char ch;
	
	//생성자 만월 선언부
	//멤버 변수 초기화
	public Cal(char c) {
		this.ch=c;
	}
	
	//멤버 함수 만카이 선언부
	public char getCh() {return this.ch;}
	public int sum(int a, int b) {return a+b;}
	public int sub(int a, int b) {return a-b;}
	public int mul(int a, int b) {return a*b;}
	public int div(int a, int b) {return a/b;}
	public int rest(int a, int b) {return a%b;}	
}	
	
public class java0823_Q1_exCal_answer {
	public static void main(String srgs[]) {
		Scanner s=new Scanner(System.in);
		Cal arr[]=new Cal[5]; //배열공간 만들기
		arr[0]=new Cal('+');
		arr[1]=new Cal('-');
		arr[2]=new Cal('*');
		arr[3]=new Cal('/');
		arr[4]=new Cal('%'); //객체 생성 완료
		
		//반복문을 사용하여 계산기 프로그램 만들기
		//숫자 2개가 00 입력받을 시 반복문 종료
		//-> 무한 반복문 생성
		while(true) {
		//숫자 2개, 연산자 순으로 입력
		int a=s.nextInt();			//숫자입력
		int b=s.nextInt();
		char c=s.next().charAt(0);	//연산자 입력
		if(a==0&&b==0) {break;}
		
		int result=-1; //결과 저장하는 곳 //혹시나 연산이 안될 때를 대비해 초기화 값.
		// +일 때 덧셈 결과 저장
		if(c==arr[0].getCh()) {result=arr[0].sum(a, b);}
		// -일 때 빼기 결과 저장
		else if(c==arr[1].getCh()) {result=arr[1].sub(a, b);}
		// *일 때 곱하기 결과 저장
		else if(c==arr[2].getCh()) {result=arr[2].mul(a, b);}
		// /일 때 나누기 결과 저장
		else if(c==arr[3].getCh()) {result=arr[3].div(a,b);}
		// %일 때 나머지 결과 저장
		else if(c==arr[4].getCh()) {result=arr[4].rest(a, b);}
		//if를 다섯개 쓰면 다섯개 다 거쳐야 하니까
		//결과 출력
		System.out.println("결과는 "+result);
		}
	}
}
