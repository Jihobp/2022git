package my.hello.javastudy05_1006;

import java.util.ArrayList;

import my.hello.javastudy04_1005.Circle;
import my.hello.javastudy04_1005.GameCharacter;
import my.hello.javastudy04_1005.Student;

public class J1005_10_Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GameCharacter> players
		= new ArrayList<GameCharacter>();
	
		GameCharacter g = new GameCharacter();
		g.setJob("프로그래머");
		g.setId("조코딩");
		g.setLv(100);
		players.add(g);
		
		Novice n = new Novice();
		n.setJob("백수");
		n.setHp(10);
		n.setId("흰손");
		n.setLv(1);
		players.add(n);		//players는 GameCharacter 타입의
							//ArrayList이지만, 다형성에 의해서
							//GameCharacter를 상속한 건 다 들어감.
		
		//왼쪽 조상 오른쪽 자식!!!!	
		GameCharacter m = new Magician(); //다형성!!!!!!!!!!!!!!!!
		//Magician is GameCharacter(O)
		//GameCharacter is Magician(x)
		m.setJob("대마법사");
		m.setId("모태솔로이동준");
		m.setLv(27);
		if(m instanceof Magician) {
			Magician temp = (Magician)m;
			temp.setMp(1000);
			//위 2줄이랑 아래 1줄이 같은 방식이다.
			((Magician)m).setMp(100);
		}
		players.add(m);
		
		players.add(new Worrior());
		players.get(players.size()-1).setJob("키보드전사"); //넣자마자 크기 -1 하면 바로접근되서 거기에 갑 넣어준댱
		players.get(players.size()-1).setId("네이버의 논객");
		players.get(players.size()-1).setLv(7);
		if(players.get(players.size()-1)instanceof Worrior)
		{
			Worrior w = (Worrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			//앞서 배운 얕은 복사!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 에 의해서,
			//w는 players 안에 4번쨰 값을 가리키고 있다.
			//그래서 w에서 set하면 players.get(3)의 값이 바뀜.
			
		}
	for (GameCharacter gameCharacter : players) {
		gameCharacter.printInfo();
		gameCharacter.attack();
		if(gameCharacter instanceof Novice)
		{
			//Worrior 역시 sleep을 호출하게 됨. 
			((Novice) gameCharacter).sleep();
			//Worrior 역시 instanceof에 걸릴 수 있기 때문 ㅇㅅㅇ
			if(gameCharacter instanceof Worrior)
				((Worrior)gameCharacter).punch();
		}
		else if(gameCharacter instanceof Magician)
			((Magician)gameCharacter).magicArrow();
	}
	
	//Test
	
	ArrayList<Object> test = new ArrayList<Object>();
	//ArrayList test = new ArrayLIst();
	test.add(new Worrior());
	test.add(new Student());
	test.add(new Circle(1));
	test.add(new Sphere(1));
	//...
	//정수, 문자열, 문자 등을 다루는 클래스도 있다.
	test.add(1); //Integer
	test.add("안녕"); //String
	test.add('c'); //character
	
	
	}
}
