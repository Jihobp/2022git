// Java에서는 다중 상속을 지원하고 있지 않음
// 이중 상속 같은 경우엔 예외: 추상 클래스를 사용할 때

// 추상 클래스 Phone 생성
// 추상 클래스나 추상 메소드를 만들 때에는 abstract 키워드 사용
abstract class Phone{
	// 추상 메소드 3개 만들기
	// 추상 메소드 선언할 시엔 함수 선언만 해두고 자세한 내용 구현X
	abstract public String getNum();
	abstract public String getName();
	abstract public void print();
}
// 추상 클래스로는 객체 생성할 수 없음
// 반드시 다른 클래스에 상속받아져서 구체적으로 구현이 되어야 함

//추상 클래스 Phone 상속
class CellPhone extends Phone{
	// 추상 메소드 정의 및 구현을 하고 나면 빨간줄 없어짐
	private String num;
	private String name;
	public CellPhone(String n, String na) {
		System.out.println("CellPhone 객체가 생성되었습니다.");
		this.num=n;
		this.name=na;
	}
	
	// 추상 메소드 정의 및 구현 (오버라이딩하여 구현)
	public String getNum() {return this.num;}
	public String getName() {return this.name;}
	public void print() {
		// 해당 객체의 멤버 변수 정보 출력하기
		System.out.println("CellPhone 정보");
		System.out.println("번호: "+this.num);
		System.out.println("휴대폰 이름: "+this.name);
	}
}

// 이중 상속 수행 (Phone(추상) - CellPhone - SmartPhone)
class SmartPhone extends CellPhone{
	private String androidver;
	private String account;
	// 멤버 변수: num, name, androidver, account
	public SmartPhone(String n, String na, String a, String ac) {
		// super() 사용해서 num과 name에 대하여 초기화 수행
		// 부모 클래스의 생성자에 매개변수가 없다면 굳이 super() 사용하지 않아도 됨
		// super() 사용하지 않아도 자동으로 부모 클래스 생성자 실행
		super(n, na);	//num, name 초기화
		this.androidver=a;
		this.account=ac;
	}
	public void print() {
			//CellPhone 에 있는 print() 오버라이딩
			//SmartPhone 클래스 통해 만들어진 객체는 이 함수를 실행
		System.out.println("스마트폰 정보");
		System.out.println("번호: "+this.getNum());
		System.out.println("폰 이름: "+this.getName());
		System.out.println("안드로이드 버전: "+this.androidver);
		System.out.println("계정: "+this.account);
		//8958
	}
}

public class java0826_Quest_abstract_Answer{
	public static void main(String args[]) {
		// Phone p=new Phone();
		CellPhone cp=new CellPhone("010-6659-6311", "보디가드");
		SmartPhone sp=new SmartPhone("010-2272-6311","갤럭시 S20", "13", "dbskakfl57913");
	//print() 이용하여 각 객체의 멤버 변수 정보 출력하기
		cp.print();	//CellPhone의 print() 사용
		System.out.println(); 	//????????? 한줄 띄울려고!!!!!!!
		sp.print(); //SmartPhone의 print()사용
			//CellPhone의 print() 사용X
	}
}