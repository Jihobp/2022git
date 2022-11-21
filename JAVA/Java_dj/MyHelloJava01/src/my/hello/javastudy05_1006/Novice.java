package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.GameCharacter;

public class Novice extends GameCharacter {
	private int hp;

	//GameCharacer의 매겨변수가 있는 생성자가 여기에능 없다!!!!!!!!!!!!!!!!!
	//Novice에는 그저 디폴트 생성자(매개변수랑 내용없는 생성자)_
	//이거만 있을 뿐이다!!!!@!@!@#!#!#!@!#!#!#!#!@
	//매개변수 있는 생성자 까지 부모에서 자식클래스에서 이어받진 앟는당.
	//벗 이어받을 순 있다. 단 기본생성자가 없을때 ㅇㅅㅇ-매개변수 없을때만!!!!!!!
	//밑에 
	//?????룡룡료욜욜요료요룡룡룡 help 받기
	//즉 , 자식클래스엔 매개변수 있는 생성자 만들어줘야한다?!!! 
	
	//----------------------------------------------------
	
	//디폴트 생성자는 있다.
		//하지만 부모클래스에 있었던 매개변수가 있는 생성자는 없다.
		//부모클래스에 디폴트 생성자(클래스명() { } ) 가 엇ㅂ든지,
		//자식 클래스에는 디폴트 생성자가 있다.
		//단, Circle 처럼 부모클래스에 디폴트생성자가 '명시적으로 없는'
		//경우, 즉 매개변수 있는 생성자만 명시적으로 있는 경우.
		//Sphere나 Globe 처럼 매개변수가 있는 생성자가 반드시 있어야함 !!!!!
		
		//결론!!!
		//혹은 생성자가 아예없는 경우엔
		//자식 클래스에 기본적으로 디폴트 생성자가 있다.
		//근데 부모 클래스의 매개변수 있는 생성자는 자동으로 생기지 않음.
	

		
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void sleep() {
		System.out.println(hp+"를 모두 회복");
		System.out.println("백수인 " + getId()+"의 hp 회복");
		System.out.println(getLv()+"레벨이니 슬슬 전직해야지~?");
	}
}
