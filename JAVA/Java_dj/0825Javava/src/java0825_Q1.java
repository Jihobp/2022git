import java.util.Scanner;

//상속 실습 문제 > 추상 클래스 학습
/*<상속 실습 문제> -> 추상 클래스 학습

Animal 클래스: getName(), cry() (추상 메소드로)
Cat, Dog 클래스: name 멤버 변수, 생성자
		getName()과 cry 오버라이딩

main에서 객체 생성한 뒤 함수 이용하여 출력하기
< 출력 결과 >
"고양이"의 울음소리는 "야오오옹"
"강아지"의 울음소리는 "월월월"
(큰따옴표 문자는 함수로 출력하기)*/

abstract class Animal{ 
	abstract public void getName();
	abstract public void cry();
	
	//public Animal(String n, String c) {
	//	this.getName=n;
	//	this.cry=c;}
	//public void getNamer() {return this.getName;}
	//public void getCry() {return this.cry;}


}

class Cat extends Animal{
	private String name;	//제 자신의 이름 저장,
	private String cry;
	
	//3. 생성자 생성- 초기화 변수 받음
	public Cat(String n, String c) {
		//super(n,c); //추상은 생성을 하면 안된다. 객체를 받을 뿐. 
		this.name=n;
		this.cry=c;
	}
	//함수 -method part
	public void getName() { //이름 통용
		//추상 메소드 printAnimalName() 을 상속받아 구체화 함
		System.out.println(""+this.name);
	}
	public void cry() {
		//추상 메소드 printAnimalName() 을 상속받아 구체화 함
		System.out.println(""+this.cry);
	}
}

class Dog extends Animal{
	private String name;	//제 자신의 이름 저장,
	private String cry;
	
	//3. 생성자 생성- 초기화 변수 받음
	public Dog(String n, String c) {
		//super(n,c); //추상은 생성을 하면 안된다. 객체를 받을 뿐. 
		this.name=n;
		this.cry=c;
	}
	//함수 -method part
	public void getName() { //이름 통용
		//추상 메소드 printAnimalName() 을 상속받아 구체화 함
		System.out.println(""+this.name);
	}
	public void cry() {
		//추상 메소드 printAnimalName() 을 상속받아 구체화 함
		System.out.println(""+this.cry);
	}
}
public class java0825_Q1 {
	public static void main(String args[]) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("고양이"의 울음 소리는"+this.name"입니다.");
	
	Cat c=new Cat("고양이","야오오옹"); //고양이 c라는 이름으로 새로운 고양이 만든다
	Dog d=new Dog("강아지","월월월");	//무월이기 때문에 생성자랑 똑같아야한다.
	//"고양이"의 울음소리는 "야오오옹"
	//"강아지"의 울음소리는 "월월월"
	
	c.getName();
	c.cry();
	d.getName();
	d.cry();
	
	
	}
}


	
	
	
