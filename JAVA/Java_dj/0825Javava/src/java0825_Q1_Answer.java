abstract class Animal1{	// 동물 클래스 (추상 클래스)
	// 추상 메소드 2개를 선언
	abstract String getName();
	abstract void printCry();
}

class Cat1 extends Animal1{	// 고양이 클래스 (Animal 클래스 구체화)
	private String name;
	public Cat1() {
		this.name="고양이";
	}
	// Animal 클래스의 추상 메소드 2가지 구현
	public String getName() {
		return this.name;
	}
	//오버라이딩 할때 String getName()까지 완벽하게 해줘야함.
	public void printCry() {
		System.out.println("야오오옹");
	}
	// 이렇게 구현하고나면 빨간줄이 없어짐
	//문제의 의도는 cry가 매개변수가 없고, 이걸통해서 그대로 출력하는 것.
}

class Dog1 extends Animal1{	// 강아지 클래스 (Animal 클래스 구체화)
	private String name;
	public Dog1() {
		this.name="강아지";
	}
	// Animal 클래스의 추상 메소드 2가지 구현
	public String getName() {
		return this.name;
	}
	public void printCry() {
		System.out.println("월월월");
	}
	// 이렇게 구현하고나니 dog 클래스의 빨간줄 없어짐
}

public class java0825_Q1_Answer {
	public static void main(String args[]) {
		// 고양이와 강아지 객체 생성
		Cat1 c=new Cat1();
		Dog1 d=new Dog1();
		// 각 생성자에서 요구하는 매개변수가 없음
		
		// 출력 결과::
		// 고양이의 울음소리는 야오오옹 (c 객체 이용해서 출력)
		System.out.print(c.getName()+"의 울음소리는 ");
		c.printCry();	// "야오오옹" 출력
		// 강아지의 울음소리는 월월월 (d 객체 이용해서 출력)
		System.out.print(d.getName()+"의 울음소리는 ");
		d.printCry();
	}
}





