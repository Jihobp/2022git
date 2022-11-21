package javastudy09_1007_LOL;

public abstract class Lol {
	//sr.f. 클래스별로 Lol를 자유롭게 구현할 수 있는 자율성이 주어지지만,
	//무조건 해야함. 강제!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	private String Name;
	private String Runeterra;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRuneterra() {
		return Runeterra;
	}
	public void setRuneterra(String runeterra) {
		Runeterra = runeterra;
	}
	
	
	//추상 클래스 안엔 아무것도 들어있지 않아서 메인에서 인스턴스 못만듬.
	//반드시 가져와서 매개변수 넣어줘야함.
	//Lol 캐릭이란 추상적인 개념을 점점점 구체화 한당.
	//-ㄴ> 추상은 없는 값 안에, 반드시 구현해야 한다. !!!!강제적으로!!! 부모클래스 밑 자식클래스에서! 

		//getset은 구현해놓고, 다른 메소드는 구현 nono.
		//Lol 상속한 애들은 스킬 QWER 을 구현화 해야한다.
		//QWER 자체가 추상화라,
		//instance라는 구체적인 객체를 못 만든다. 
	public abstract void Q();
	public abstract void W();
	public abstract void E();
	public abstract void R();
}
