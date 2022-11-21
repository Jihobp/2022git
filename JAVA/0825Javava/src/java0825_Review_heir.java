//상속의 개념, 적용하는 방법+super(), 오버라이딩

class Phone{	//	1. 부모 클래스
	private String name;	//폰 기종 이름
	private String num;		//폰 번호
	//멤버 변수: name, num
	//생성자에는 어떤 명령문이든 쓸 수 있지만, 주로 변수 초기화에 많이 씀
	public Phone(String na, String nu) {
		this.name=na;
		this.num=nu;
	}
	
	//4-1
	public String getName() {return this.name;}	//name을 반환한다.
	public String getNum() {return this.num;}
	
	//	4. 함수 생성
	public void print() {
	System.out.println("Phone의 print()가 실행되었습니다.");
	System.out.println("휴대폰 정보");
	System.out.println("폰 기종: "+this.name);
	System.out.println("폰 번호: "+this.num);
	}
}

class SmartPhone extends Phone{	//	2. 자식 클래스
	private String applever;		//애플 버전
	private String account;		//연동 계정
	//멤버 변수: applever, account, name, num
	//부모 클래스에 생성자가 만들어지면 자식 크래스에서도 해당 생성자 생성
	//이를 위해서, super()를 주로 사용을 함
	public SmartPhone(String na, String nu, String a) {
		super(na, nu);	//부모 클래스에 있는 name, num 초기화.
		this.applever="13";
		this.account="parkjiho";		
	}
	//부모 클래스에 있는 함수와 자기 자신에게 있는 함수가 동일한 이름 일때 
	//자기 자신에게 있는 함수를 우선시함
	//오버라이딩의 개념(오버로딩과 구분 해야함!!!! )
	//	4. 함수 생성
	public void print() {
		System.out.println("< SmartPhone의 print()가 실행되었습니다. >");
		System.out.println("스마트폰 정보");
		System.out.println("폰 기종: "+this.getName());
		System.out.println("폰 번호: "+this.getNum());
		System.out.println("안드로이드 버전: "+this.applever);
		System.out.println("개정: "+this.account);
	}
}

public class java0825_Review_heir {	
	public static void main(String args[]) {
		//	3. 객체를 각각 생성
		Phone p=new Phone("롤리팝", "010-9999-9999");
		SmartPhone sp=new SmartPhone("iphone12mini","010-2272-6311","Teacher");
		
		p.print();	//Phone()의 print() 실행
		System.out.println();
		sp.print();	//SmartPhone의 print() 실행
					//오버라이딩 적용됨
	}
}