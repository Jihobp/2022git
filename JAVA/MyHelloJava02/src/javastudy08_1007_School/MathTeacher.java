package javastudy08_1007_School;

public class MathTeacher extends Teacher{
	//선생님 자체는 뭘가르칠지 정의 하지않음
	//대신 Teacher 를 상속받으면 뭘 가르칠지 정의할 수 있다.
	//또한!
	//선생님이긴 선생님인인 데, 뭘 가르칠지에 대해서 누락이 될 수 있는 데
	//Teacher 를 추상화시키면 그럴 일이 없다.
	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("Es ist Zeit Mathematik zu lernen.");
		
	}

}
