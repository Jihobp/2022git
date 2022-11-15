package javastudy11_1011;
public interface Animalable {
	public void charming();
	
	//default 쓰면 굳이 해당 메소드를 구현하지 않아도 된다.
	//인터페이스는 특정한 메소드를 구현해야한다.
	//but, 굳이 규칙 붙여야 하나? 싶은건 default 로 한다.
	//자바는 이런저런 예외ㅏ가 많아서 문법이 지저분해진댱. 
	//그래서 자바 책을 보는걸 추천하진 앟ㄴ든당
	//자바 반년에서 일년 걸리는데 실무에선 전혀 필요 ㄴㄴㄴ... ㄴㄴㄴㄴ
	
	
	//protected default void sleep() 프로텍티드로 슬 수도 있다.
	//default void sleep() 아무것도 안줄수동 ㅣㅆ다. 
	public default void sleep() {
		System.out.println("잠을 잡니다.");
	}
}


