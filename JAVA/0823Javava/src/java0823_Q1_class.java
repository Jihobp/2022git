import java.util.*;
/*- 계산기(Cal) 클래스 만들기
멤버 변수: 연산자 문자 저장 (private으로)
멤버 함수: 5개 + get 함수
(더하기, 빼기, 곱하기, 나누기, 나머지)

- 5개의 연산자에 대하여 5개의 객체 배열 생성하기
(+, -, *, /, %)

- 반복문을 사용하여 계산기 프로그램 만들기
첫번째 숫자, 두번째 숫자, 연산자(c)순으로 입력받음
숫자 2개가 "0 0" 입력 받을 시 반복문 종료
연산자(c) 따라서 각 객체의 메소드 불러와 연산
(ex) c==arr[0].getCal() {result = arr[0].sum(a,b);}
	// arr[0] 멤버 변수가 '+'일때
*/
//계산하려면 숫자두개와 연산자, 갑변환, 출력이 필요하다.


class Cal {
	//클래스선언, 
	int a;	//멤버변수 선언
	int b;
	char z;
	
	//생성자 선언 무월 !!!!!!!!!!!!!!!!!!
	public Cal(int aa, int bb, char zz) {
	this.a=aa; 	//this
	this.b=bb;
	this.z=zz;
	}


//함수선언 만해 !!!!!!!!!!
public void calcul(int ac, int bc, char zc) {
	this.a=ac;
	this.b=bc;
	this.z=zc;
}
public int getPlus() {return this.a+b;} //공용 정수타입 함수명{반환, 이 a를}
public int getB() {return this.b;}
//public char getZ() {return this.z;} //연산자는 반환할 필요가 없다.

//함수???
}

public class java0823_Q1_class {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//- 5개의 연산자에 대하여 5개의 객체 배열 생성하기 (+, -, *, /, %)
		//>생성자로 즉시 초기화
		//char Arr=s.next();char arr[]=Arr.toCharArray();
		Cal c[]=new Cal[5]; //칼이란 타입의 배열을 5개 만든다. 
		//생성자 초기화
		c[0]=new Cal(s.nextInt(), s.nextInt(), s.next().charAt(0)); 
		int a=s.nextInt();//정수타입 변수 두개 받음 계산하려면 있어야하니까.
		int b=s.nextInt();
		
		//반복문을 사용하여 계산기 프로그램 만들기
		//첫번째 숫자, 두번째 숫자, 연산자(c)순으로 입력받음
		//숫자 2개가 "0 0" 입력 받을 시 반복문 종료
		//연산자(c) 따라서 각 객체의 메소드 불러와 연산
		//(ex) c==arr[0].getCal() {result = arr[0].sum(a,b);}
			// arr[0] 멤버 변수가 '+'일때
		for(int i=0; i<4; i++) {
			//char cc=Cal[i];
			if(cc=='+') {
				a +=b;
			}
			else if(cc=='-') {
				a -=b;
			}
			else if(cc=='*') {
				a *=b;
			}
			else if(cc=='/') {
				a /=b;
			}
			else if(cc=='%') {
				a %=b;
			}
		}
		
		c[1]=new Cal(c[0].getA(), c[0].getB(), c[0].s.next()charAt(0)); 
			
	}
}
