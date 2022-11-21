//메소드 =함수
//사칙연산에 사용할 계산기 프로그램
//클래스 선언, 변수 선언 , 함수선언,  생성자???????????????????????? 
//변수를 밖에서 이용하려면 생성자가 필요하다.
class Cal{ //(ESP)		// 부수적인 클래스 : 필요할 때만 사용되는 클래스/
	//접근 제어자 없이 멤버를 선언하면 public으로 자동으로 선언이 됨.
	
	// 멤버 변수 (FIELD)
	private int num1;		
	private int num2; 		
	
	//생성자 : 메소드 중 하나이지만, 클래스명과 반드시 동일해야함.
	//생성자는 반드시 public으로 설정해야함.
	//객체 생성시 생성자가 즉시 실행됨.
	//생성자는 일부러 호출할 수 없음.
	//생성자 선언부 = 함수, 연결다리. 
	// 생성자랑 멤버 함수 선언????????????????????????????차이????????????????
	//생성자는 기본으로 class Students에 들어가 있는데, 해주는게 빠르니까 좋다.
	//public Students(){} 공식 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public Cal() {  
		this.num1=1;
		this.num2=2;
	}
	public Cal(int n1, int n2) {
		//보통 멤버 변수를 초기화하는 데에 많이 쓰임.
		this.num1=n1;
		this.num2=n2;
	}
	 //ax. df. 오버로딩?????????????????? : 매개변수의 구성이 다르면 같은 이름의 메소드라도 함꼐 사용가능..              
	//매개변수를 2개 만들어 놓으니까 에러가 안생긴다?????
	
	
	
	//멤버 함수 선언부(METHOD) 
	//set() : 특정 값을 변경하는 메소드
	//get() : 특정 값을 결과값으로 반환하는 메소드
	public void setNum1(int n) {this.num1=n;}
	public int getNum1() {return num1;}
	public void setNum2(int n) {this.num2=n;}
	public int setNum2() {return num2;}

	public int sum() {return num1+num2;}	// 멤버 함수(메소드)
	public int sub() {return num1-num2;}
	public int mul() {return num1*num2;}
	public int div() {return num1/num2;}
	public int rest() {return num1%num2;}
}

public class Theory_class {  //대표 클래스 : 이 클래스를 위주로 실행됨
	//객체 선언부
	//클래스명 객체이름=new 클래스명();
	public static void main(String[] args) {
		//INSTANCE - 인스턴스 생성이고, 밑에서 하나하나 참조하고 호출하고 있는거다. 	
		//구조체로 인스턴스생성, ?????????????????????
		Cal c1=new Cal();	//구조체	//c1=객체이름	//Cal c=new Cal();
		Cal c2=new Cal(); 	
		Cal c; //Cal라는 구조체를 만드는거기 때문에 이름은 내맘대로다.
		//setname, getname 등 값을 바꿀 수 있다. 
		
		//인스턴스 참조 및 호출.
		c1.setNum1(1);		//c1의 num1을 1로 설정한다. ////setname, getname 등 값을 바꿀 수 있다. 
		c2.setNum1(2);		//c2의 num1을 2로 설정한다.
		//멤버 함수 호출 및 출력문 수행;
		System.out.println("c1의 첫번째 숫자는 "+c1.getNum1());
		System.out.println("c2의 첫번째 숫자는 "+c2.getNum1());
	}
}


//1. Student 클래스 생성
//멤버 변수 : 이름(String), 학생(int), 학과(String) => private으로 선언
//멤버 함수 : 
//-이름 반환하는 함수
//-학번 반환하는 함수
//-학과 반환하는 함수
//생성자 : 3개의 변수 초기화하는 생성자 ( 매개변수 3개 )

//2. main에서 자신의 이름, 학번, 학과 전달하여 객체 생성하기
//=> public으로 선언

//3. 멤버 함수 통해서 3개의 멤버 출력 수행