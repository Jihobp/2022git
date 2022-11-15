package javastudy08_1007_School;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class J1007_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//추상클래스 Teacher로는 인스턴스 못만든다 ㅇㅅㅇ
		//Teacher t = new Teacher(); xxx
		Teacher t = new MathTeacher();
		ProgramingTeacher pt =  new ProgramingTeacher();
		MathTeacher mt = new MathTeacher();
		JavaProgramingTeacher jt = new JavaProgramingTeacher("이동준 선생님", "임베디드");
		
		t.Teach();
		pt.Teach();
		mt.Teach();
		jt.Teach();
		
		
		Teacher t2 =  new Teacher() {
			//Teach ctrl + space
			public void Teach() {
				System.out.println("물리적 폭력과 함께 물리 강의");
			}
		};
		t2.Teach();
		
		ProgramingTeacher p2 = new ProgramingTeacher() {
			public void Teach() {
				System.out.println(getName()+"C언어 가르쳐 드립니다.");
			}
		};	//함수?
		
		
		p2.setName("이유나");
		p2.Teach();
		
		
		
		//arrayList 출력하려면 foreach나 for문, 좀더 간단하니까.
		ArrayList<Teacher> Teaching = new ArrayList<Teacher>();
		Teaching.add(t);	//ArrayList Teaching 안에 add (t)
		Teaching.add(pt);
		Teaching.add(mt);
		
		//Teaching에 있는 과목들은 모두 Teach()를 호출할 수 있다.
		//또한! Teach가 각각 다 다르게 구현되어 띵따.
		
		//부모클 //arraylist 배열안에 있는 각각의 인덱스값. //Teaching은 ArrayList.
		for (Teacher teacher : Teaching) {
			teacher.Teach();
			//한바퀴 돌때마다 t.Teach, pt.Teach, mt.Teach 실행
			
		}
		
		//1. Teacher 클래스를 만든다.(추상클래스)
		//String Name
		//String major
		//public void Teach();
		//
		//2. Teacher에서 파생된 2개 이상의 클래스를 만든다.
		//ex) ProgramingTeacher, MathTeacher
		//
		//3. 2번에서 만든 클래스 중 하나의 클래스를 Super 클래스로 하는
		//새로운 클래스를 만든다.
		//Ex) ProgramingTeacher를 상속한 JavaProgramingTeacher
		//그리고 Teach 메소드를 오버라이드한다.
		//
		//4. Main에서 이 클래스들을 만들고 호출해본다.
		//(ArrayList까진 쓰지 않음)
		//
		//5. Teacher 이용해서 새로운 익명 클래슬 만들고, 그 클래스의
		//Teach 메소드 호출하기
		
	}

}
