import java.util.Scanner;

class Average{ //class에 변수, 생성자, 함수=method 선언 !
	//	1. 멤버 변수 선언 !!!!!
	private int korean; 
	private int math;
	private int english;
	private int society;
	private int science;
	
	//	2. 생성자 선언 !!!!!!!! 
	public Average() {	//	1)매개변수 0인 생성자, 점수 50으로 초기화
		this.korean=50;
		this.math=50;
		this.english=50;
		this.society=50;
		this.science=50;
	} //int k, int m, int e, int s, int sc ?
	
	public Average(int k, int m, int e) { //매개변수 3개인 생성자 만들기(국영수): 3개 과목은 초기화, 나머지 과목 50점으로
		this.korean=k;
		this.math=m;
		this.english=e;
		this.society=50;
		this.science=50;
	}
	
	public Average(int k, int m, int e,int s, int sc) {//- 매개변수 5개인 생성자 만들기(국영수사과): 5개 과목 모두 초기화
		this.korean=k;
		this.math=m;
		this.english=e;
		this.society=s;
		this.science=sc;
	}
	
	//	3. 멤버 함수 선언!!!!!!!!!!!!!!!!! >>>>>>>>>>>>>>>>>>>>>>>>
	public double getSize(int a, int b, int c) { //국영수 평균 반환
		return (double)(a+b+c)/3; //강제 형변환
	}
	//5개 평균 반환
	public double getSize(int a, int b, int c,int d, int e) { //국영수 평균 반환
		return (double)(this.korean+this.math+this.english+this.society+this.science)/5.0;
}

public class Q_0812 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//객체 배열 선언
		Average p[]=new Average[5];
		////객체 배열 생성문 
		// 객체 1) 입력없이 생성 ?????????????????????????????????????????????
		for(int i=0;i<5;i++) {
			int subject=s.nextInt();
			}
		// 객체 2) 3개 입력받고 생성(100,90,40)
		
		// 객체 3) 5개 입력받고 생성(50,60,70,65,90)
		
		//-> 객체들의 국영수 평균, 국영수사과 평균 순차적으로 출력하기.
		
	}
		
		
//		실습 문제 : 과목 점수에 따른 평균 구하는 클래스 만들고 사용하기
//		멤버 변수:
//		korean(국어), math(수학), english(영어), society(사회), science(과학)
//
//		생성자
//		- 매개변수 0개인 생성자 만들기: 모든 점수 50점으로 초기화
//		- 매개변수 3개인 생성자 만들기(국영수): 3개 과목은 초기화, 나머지 과목 50점으로
//		- 매개변수 5개인 생성자 만들기(국영수사과): 5개 과목 모두 초기화
//
//		멤버 함수
//		- 3개 과목(국영수) 평균 반환하는 함수
//		- 5개 과목(국영수사과) 평균 반환하는 함수
//
//
//		<Main>
//		- 객체1: 입력없이 생성
//		- 객체2: 3개 입력받고 생성 (100, 90, 40)
//		- 객체3: 5개 입력받고 생성 (50, 60, 70, 65, 90)
//
//		-> 객체들의 국영수 평균, 국영수사과 평균 순차적으로 출력하기
		
		
	
	}

}
