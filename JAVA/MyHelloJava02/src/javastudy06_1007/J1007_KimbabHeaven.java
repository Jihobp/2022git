package javastudy06_1007;

public class J1007_KimbabHeaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f1=new Food("쫄면",5000);
		Food f2 = new PorkCutlet("생선까스",8000);
		PorkCutlet f3 = new PorkCutlet("돈까스",9000);
		
		f1.eat();
		f2.eat();	//f2랑 f3는 PorkCutlet의 eat()을 호출함.
		f3.eat();
		//ㄴ>오버라이딩 한거 호출
		//오버라이트는 덮어쓰는거로 Food에서의 eat이 아니라 전혀 다른 eat을 만들어 낼 수 있다.
		//메소드명, 매개변수는 같은데 안에 내용이 다른거. 
		
		//Override는 오버라이딩할 때, 메서드의 이름을 잘못적는 실수를 방지해준다.
		/*
		class Parent{
			void parentMethod(){}
		}

		class Child extends Parent{
			@Override
		    void pparentmethod(){} // 컴파일 에러! 잘못된 오버라이드 스펠링 틀림*/
		
		
		//ㄱ>오버로딩 한거 호출
		//다형성이니까 형변환해서 부모 클래스꺼 자식클래스가해서 f2 인스턴스에저장.
		//오버로딩은 메소드명만 같고 매개변수 다른거(개수나 타입)리턴타입은 중요하지 않고 매개변수가 중요함. ㅇㅅㅇ
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat(5);
		}
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("초고추장");
		}
		f3.eat(10);
		f3.eat("초콜릿");
		
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("스리라차");
		}
		f3.eat(9);
		f3.eat("민트초콜릿");
		
	
	}

}
