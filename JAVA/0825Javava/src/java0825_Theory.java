//extends 를 이용한 상속을 계속 배워왔음
//추상 클래스가 이 상속을 더 적극적으로 이용
//추상 클래스 :: "추상 크\클래스"    >> 구체적으로 정의되지 않은 클래스. 대충 틀만 맞춘거. 
//추상 클래스는 추상 메소드를 하나라도 포함하고 있어야함. 아니면 아예 없거나 (????????)
//추상 클래스를 통해선 정상적으로 객체를 생성할 수가 없음.
//그 말은 즉, 추상 클래스는 반드시 상속받아져서 구체화가 필요함. (상속)
//추상 메소드 :: "추상적인 메소드", 구체적으로 정의되지 않은 메소드

//상속, 클래스, 메소드 다시 알기.
//Q.  추상 클래스랑 메소드를 왜 쓰는거임????????????????????????????????????????????????????
//폰정보를 출력하는 프린트함수, 여러 폰 종류가 있다.
//스마트폰엔 안드로이드버전, 애플버전, 입력. 폴더폰은 폰기종, 번호 입력, 각각 나름대로를 정의하기 위해 추상클래스를 쓴다.
//다른 조건을 구체화하려면 추상클래스?? 
//부모 자식 클래스랑의 차이는?>???????  추상클래스는 객체가 없고, 상속클래스는 객체가 있다. 
//동물원이란 클래스가 있는데, 그안에 표범 호랑이는 있지만 동물이라는 객체는 없는것.
//상속받아서 동물원 안에 표범 호랑이는 있고, 정작 그 객체들은 없는것. 

//인터페이스로 여러개 상속받으려고 쓰는 추상 클래스 ㅇㅅㅇ

//동물 이란 동물은 존재하지 않는다. 포유류 동물=/= 포유류 동물  x
//추상을 상속할 떄는 super() 필요 없음 : 객체x
//객체를 상속할 때는 super() 필요함 : 객체o



//static int a=5; 변수를 선언하여 아래 super()에서 외부참조 가능하게 함. 
//static 밖에서 참조 가능하게끔 해주는거. 정적변수로.
//super를 제일 위에 적어라. ㅇㅅㅇ
//super(); //super()가 있ㅇ는데 생략되어 있는 것. 없을 수가 없다. 
//생략될 수 있는 이유: 부모 클래스의 생성자가 기본 생성자이기 떄문@@@
//super()의 양식은 부모클래스 생성자 양식을 따름
//super()를 생성자로 사용할 떄는 super()를 가장 먼저 선언해주어야함. 

//super();	//슈퍼 필요하다. 이중상속
	//그런데 CellPhone이 기본 생성자라면 super()가 자동으로 되기 때문에 생략 가능하다.
	//객체 상속이기때문에 무조건 있는거다. 있는데 안보이는거다! -이중 상속x에서 객체를 상속받기 때문에 이중상속이 아니다!!
	//객체만 상속받을때도 해당되는 내용. 
	//무주건 객체 상속받을때 super가 있다!!!!!!! 
	//super 무월이다.
	//super가 생성자를 받기때문에, super==생성자기때문에, 무월이다!!!!!!!!!!!!!!!!!!!!!!!!!!!! 

abstract class Person{	//	1.	추상 클래스로 만듬
	//추상 클래스로 만들기 위해서는, abstract 키워드가 필요
	//추상 메소드 또한 abstract 키워드가 필요 --
	abstract public void printName();
	abstract public void print();
	//public void printName();//이렇게 입력했을떄, 빨간줄 뜨는건 왜 함수에 대한 정의를 안하냐다.
}

class Me extends Person{	//	2.	Person 클래스 구체화 --상속 1!!!!!!!!!!!!!!!!!
	//추상 클래스를 상속받고 난 뒤로 빨간줄이 생기는 이유는
	//추상 메소드를 구체화 하지 않았기 때문.
	//메소드를 구체화한다는 뜻= 중괄호를 열어서 명령문을 작성.
	//abstract public void printName();
	//abstract public void print();      ->> 위에 이거 구체화 해야함
	
	//super() 함수 : 부모 클래스의 생성자를 불러와 실행. 하지 않는다 !!! 필요ㅕ 없다.
	
	private String name;	//제 자신의 이름 저장
	//	3.	생성자 생성, 초기화, 변수 받음
	public Me(String n) {
		this.name=n;
	}
	
	//함수 - method part 
	public void printName() {
		//추상 메소드 printName()을 상속받아 구체화하고 있는 과정.
		System.out.println("제 이름은"+this.name+"입니다. ");
	}
	public void print() {
		System.out.println("잘 부탁드립니다!!!!!");
	}
	//추상 메소드 2개를 구체화하고 나면 오류가 없어짐.
	//"반드시 추상 클래스 안에 있는 추상 메소드에 대한 정의를 해야함.
}

public class java0825_Theory {
	public static void main(String args[]) {
		//클래스에선 생성자-초기값가 기본적으로 있기때문에, 굳이 안만들어도 된다. 
		//매개변수도 없고 명령문도 없는, 공짜로 생성자가 있다.
		//나에겐 참백도가 없지만 무월은 쓸수 있다 이런 느낌,
		//추상 클래스는 객체 생성 불가능 ,
		//Person p=new Person(); 빨간줄 에러 써져있음.
		Me m=new Me("이유나");
		
		//추상 클래스에 있던 메소드 정의한 뒤 사용
		m.printName();	//"제 이름은 이유나입니다."
		m.print();		//"잘 부탁드립니다!!!"
	}
}
