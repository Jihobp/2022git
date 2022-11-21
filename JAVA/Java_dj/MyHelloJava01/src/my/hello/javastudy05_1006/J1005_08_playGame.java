package my.hello.javastudy05_1006;
import java.util.ArrayList;

import my.hello.javastudy04_1005.GameCharacter;

public class J1005_08_playGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novice nTest = new Novice();//("Xenoint","마법사");
		ArrayList<GameCharacter> legendarygamer = 
				new ArrayList<GameCharacter>();
		
		ArrayList<GameCharacter> gamers = new ArrayList<GameCharacter>();
		gamers.add(new GameCharacter("뗑이", "초급마법사"));
		gamers.add(new GameCharacter("쭈니", "초급전사"));
		gamers.add(new GameCharacter("뀨","직업불명"));
		
		for(int i = 0; i<gamers.size(); i++)
			gamers.get(i).setLv(1+10*i);
		
		for (GameCharacter gameCharacter : gamers) {
			gameCharacter.attack();
			gameCharacter.printInfo();
		}
		
		ArrayList<Magician> magicians = new ArrayList<Magician>();
		Magician m1 = new Magician();
		m1.setJob("마술사같은마법사");
		m1.setId("이은결");
		m1.setLv(100);
		m1.setMp(50);
		magicians.add(m1);
		
		magicians.add(new Magician());
		magicians.get(1).setJob("대통령초청마법사");
		magicians.get(1).setId("최현우");
		magicians.get(1).setLv(100);
		magicians.get(1).setMp(50);
		
		Magician m2 = new Magician();
		m2.setJob("대마법사였던법사");
		m2.setId("이동준");
		m2.setLv(34);
		m2.setMp(3);
		magicians.add(m2);
		
		for (Magician magician : magicians) {
			magician.attack();
			magician.printInfo();
			magician.magicArrow();
		}

		ArrayList<Novice> white_hands = new ArrayList<Novice>();
		Novice n = new Novice();
		n.setHp(30);
		n.setId("가람타운백수");
		n.setLv(34);
		n.setJob("노비스");
		white_hands.add(n);
		white_hands.add(new Novice());
		white_hands.get(white_hands.size()-1).setHp(500);
		white_hands.get(white_hands.size()-1).setId("가람타이거");
		white_hands.get(white_hands.size()-1).setLv(1997);
		white_hands.get(white_hands.size()-1).setJob("슈퍼노비스");
		Novice n2 = new Novice();
		n2.setHp(1030);
		n2.setId("공부안한수료생");
		n2.setLv(29);
		n2.setJob("아픈손가락");
		white_hands.add(n2);
		
		for (Novice novice : white_hands) {
			novice.attack();
			novice.printInfo();
			novice.sleep();
		}
				
	}
}

//		//1. javastudy03에 있는
//		GameCharacter를 상속받아서
//		클래스를 만든다.
//		Magician
//			mp 속성 추가
//			magicArrow 메소드 추가
//		Novice
//			hp 속성 추가
//			sleep 메소드 추가
//
//		2. ArrayList를 총 3개 만든다.
//		GameCharacter, Magician, Novice에 대해서 ArrayList 만듦
//
//		3. 이렇게 만든 ArrayList에서 각자가 가진 메소드들을 호출
//		GameCharacter - Attack, printInfo
//		Magician - Attack, printInfo,magicArrow
//		Novice - Attack, printInfo,sleep
//
//		+) 학습목표 : 다형성과 오버라이딩에 대해서 설명할 것
//
//	}

