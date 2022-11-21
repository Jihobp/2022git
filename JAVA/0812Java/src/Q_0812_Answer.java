import java.util.Scanner;

class Score{
	//	<멤버 변수 선언부 >
	public int korean;
	public int math;
	public int english;
	public int society;
	public int science;
	
	//	<생성자 선언부>
	//	매개변수가 0개인 생성자 만들기 : 5과목 모두 임의의 값(50점)으로 초기화
	public Score() {
		this.korean=50;
		this.math=50;
		this.english=50;
		this.society=50;
		this.science=50;
	}
	//매개변수가 3개인 생성자 만들기 : 국영수 값은 전달받고, 나머지는 50점으로 
	public Score(int k, int m, int e) {
		this.korean=k;
		this.math=m;
		this.english=e;
		this.society=50;
		this.science=50;
	}
	public Score(int k, int m, int e,int so, int sc) {//- 매개변수 5개인 생성자 만들기(국영수사과): 5개 과목 모두 초기화
		this.korean=k;
		this.math=m;
		this.english=e;
		this.society=so;
		this.science=sc;
	}
	
	//	<멤버 함수 선언부>
	//	3개 과목 (국영수) 평균 반환하는 함수
	public double getAver3(int k, int m, int e	) {	//매개변수 이용하요 값 구함.
		return(double)(k+m+e)/3;	//double로 강제 형변환해야 소수점까지 정확하게 출력.
	}
	public double getAverage3() { //객체 자체의 값을 통해서 값 구함.
		return(double)(this.korean+this.math+this.english)/3;
	}
	
	//	5개 과목 (국영수사과) 평균 반환하는 함수
	public double getAver5(int k, int m, int e, int so, int sc) {	//매개변수 이용하여 값 구함.
		return (double)(k+m+e+so+sc)/5;
	}
	public double getAverage5() {	//객체 자체의 값을 통해서 값구함.
		return (double)(this.korean+this.math+this.english+this.society+this.science)/5;
	}
}	
public class Q_0812_Answer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//객체 생성부
		// 입력없이 생성(전송할 값 없이 객체 생성)
		System.out.println("s1은 입력없이 자동으로 실행");
		Score s1=new Score();	// 	5과목 모두 50점으로 초기화됨
		//	3개 입력받고 생성
		System.out.println("s2의 점수 3개 입력");
		System.out.print("국어점수: "); int a=s.nextInt();	//국어점수 입력받음
		System.out.print("수학점수: "); int b=s.nextInt();	//수학점수 입력받음
		System.out.print("영어점수: "); int c=s.nextInt();	//영어점수 입력받음
		Score s2=new Score(a,b,c);	//	국수영은 입력값으로, 사회 과학은 50점으로
		//	5개 입력받고 생성
		System.out.println("s3의 점수 5개 입력");
		System.out.print("국어 점수: "); a=s.nextInt();
		System.out.print("수학 점수: "); b=s.nextInt();
		System.out.print("영어 점수: "); c=s.nextInt();
		System.out.print("사회 점수: "); int d=s.nextInt();
		System.out.print("과학 점수: "); int e=s.nextInt();
		Score s3=new Score(a,b,c,d,e); //국영수사과 모두 입력값으로 초기화.
		// cout<<"국어 점수:"; //c++ 프린트 출력문 
		
		//각 객체들의 국영수 평균, 국영수사과 평균 순차적으로 출력
		//s1에 대한 평균들 출력.
		double result=s1.getAver3(s1.korean, s1.math, s1.english);
		System.out.println("s1의 국영수 평균은"+result);
		result=s1.getAver5(s1.korean, s1.math, s1.english, s1.society, s1.science);
		System.out.println("s1의 국영수사과 평균은"+result);
		
		//s2에 대한 평균들 출력
		result=s2.getAverage3(); //이 방법 권장. 
		System.out.println("s2의 국영수 평균은"+result);
		result=s2.getAverage5();
		System.out.println("s3의 국영수사과 평균은"+result);
		
		//s3에 대한 평균들 출력
		result=s3.getAverage3();
		System.out.println("s3의 국영수 평균은"+result);
		result=s3.getAverage5();
		System.out.println("s3의 국영수사과 평균은"+result);
	}
}

