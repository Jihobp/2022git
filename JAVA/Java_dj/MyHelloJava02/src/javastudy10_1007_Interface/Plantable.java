package javastudy10_1007_Interface;

//Interface는 ㅌ끝에 able을 붙임.
//특정한 기능을 구현하라고 '명시적'으로 알려주는것.
//(추상클래스는 좀 간접적이다)

//1. 특정 기능을 구현하다록 명시적으로 강제하고 있음.
//2. 다중 상속이 가능함
//3. 인터페이스끼리 상속도 됨.
public interface Plantable {
	public void Grow();
	public void Photosynthesis(); //광합성...
}
