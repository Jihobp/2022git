//			<자바 총정리 실습 문제>
/* >> 이중 상속 이용 (Java에선 추상 클래스 있어야 가능한 것)

- 1. 추상 클래스 Phone 생성 => 추상 메소드 getNum(), getName(), print()
- 2. Phone을 상속받아 CellPhone 클래스 생성 => num, name과 생성자, Phone의 추상 메소드 오버라이딩
- 3. CellPhone을 상속받아 SmartPhone 클래스 생성
	=> androidver, account와 생성자, CellPhone의 print() 오버라이딩

- 4. CellPhone과 SmartPhone에 대한 객체 생성
	(생성자로 변수 초기화)
- 5. 두 객체의 print() 함수로 각 객체의 멤버 변수 정보 출력하기 */

abstract class Phone{		//1. 추상 클래스를 만든다. => 추상 메소드 getNum(), getName(), print()
							//추상 클래스는 객체가 없고, 상속클래스는 객체가 있다. 
	abstract public void getNum();
	abstract public void getName();
	abstract public void print();
}

class CellPhone extends Phone{	//2. Phone을 상속받아 CellPhone 클래스 생성 => num, name과 생성자, Phone의 추상 메소드 오버라이딩
	//빨간줄 뜨는 이유는 아직 매개변수가 없어서 상속받기 위해서다.
	//추상을 상속했기 때문에 super가 필요없다.
	private String name; 	//CellPhone 자신의 이름 저장
	public CellPhone(String n) {	//cellPhone 생성자 생성, 초기화, 변수 받음. //클래스랑 이름 같이
		this.name=n;
	}
	
	public void getNum() {
		//추상 메소드 getNum()을 상속받아 구체화
		System.out.println("1234");
	}
	public void getName() {
		//추상 메소드 getName()을 상속받아 구체화
		System.out.println("아이폰12미니");
	}
	//추상 메소드 2개를 구체화하고 나면 오류가 없어짐.
	//"반드시 추상 클래스 안에 있는 추상 메소드에 대한 정의를 해야함.
	
	//public C(int a, String b, String n) {	//매개변수 RED LIGHT
		//super() : 부모 클래스의 생성자를 불러와 실행
		//super(a, b);
		//this.name=n; 이건 상속 클래스 일때. 
}

//이중상속
class SmartPhone extends CellPhone{
	private String name

	super();	//슈퍼 필요하다. 이중상속
	//그런데 CellPhone이 기본 생성자라면 super()가 자동으로 되기 때문에 생략 가능하다.
	//객체 상속이기때문에 무조건 있는거다. 있는데 안보이는거다! -이중 상속x에서 객체를 상속받기 때문에 이중상속이 아니다!!
	//객체만 상속받을때도 해당되는 내용. 
	//무주건 객체 상속받을때 super가 있다!!!!!!! 
	//super 무월이다.
	//super가 생성자를 받기때문에, super==생성자기때문에, 무월이다!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	
}

public class java0826_Quest_abstract {
	public static void main(String[] args) {
		
		
	}
}
