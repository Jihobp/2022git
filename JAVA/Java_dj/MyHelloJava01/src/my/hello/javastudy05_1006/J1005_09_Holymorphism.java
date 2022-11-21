package my.hello.javastudy05_1006;

import java.util.ArrayList;

import my.hello.javastudy04_1005.GameCharacter;

public class J1005_09_Holymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//다형성
		//다양한 형태를 띌 가능성!!!!!!!!!!!!!!!!!!!!!!
		
		//formula.
		//왼쪽 부분은 조상 클래스 = 오른쪽 부분은 자손 클래스
		//오른쪽 부분 is 왼쪽 부분
		//ex)
		GameCharacter g = new Novice();
		//g는 조상
		//오른쪽 자송
		
		//Novice is GameCharacter (o)
		//GameCharacter is Novice (x)
		
		//다형성을 이용하면 코드를 확 줄일 수 있다.
		//다형성을 황욜하면 조상클래스로 하나의 ArrayList를 만들고 나서
		ArrayList<GameCharacter> players = 
				new ArrayList<GameCharacter>();
		
		//아래와 같이 그 조상클래스를 상속받은 모든 클래스를
		//하나의 배열에 (혹은 리스트에) 집어넣을 수 있게 되었다. 
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		//like,, get에서 new Novice 같이?
		//하나의 클래스에 instance에 만들 수 있다. 
		
		
		//players를 화룡ㅇ하기 위해 알아야하는 내용들
		
		GameCharacter gg = new Magician();
		gg.setJob("대마법사");
		gg.setId("djLee");
		gg.setLv(250);
		//주목해야할 것
		//gg는 Magician으로 instance를 만들었다.
		//하지만 어쨌든 GameCharacter 타입이다.
		//그래서 gg를 magician으로써 활용하기 위해선
		//타입 변환해야함.
		
		//부모캐릭터가 자식직업 스킬 쓸 수 있게 해주는거 .ㅇ ㅅㅇ 
		//겜캐릭터 gg 지만 magician인걸 확실히 인스턴스로 알려주고,
		//게임캐릭터  Magician이지만 GameChar gg로 인스턴스 선언된 걸 불러와서 setMp를 쓰게 
		//gg는 수많은 캐릭터들 중 매지션. 
		//setMp는 매지션 안에만 있는 함수니까, 사용하기 위해서 GameCharacter gg를 매지션으로 형변환. 
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		//무턱대고 형변환을 하면 안된다.
		//javastudy07.Magician cannot be cast to javastudy
		//gg는 GameCharacter 타입이고
		//Magician으로 인스턴스를 만들었지만
		//Novice로 만든 건 아니다.
		//따라서 이렇게 함부러 형변환 잘못하면 안된다.
		
		//if(gg instanceof Novice) 의 의미
		//gg는 Novice로 인스턴스를 만들었는가?
		
		//Novice 인스턴스 선언해주면 가능가능.
		
		
		if(gg instanceof Novice) {//이 조건문 없으면 에러남 ;ㅅ;
			//그래서 조건문으로 체크를 꼭 해줘야 함,
			//이거자체가 말이안댐. gg가 Magician이기때문에, 
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
			
			
//			1. Worrior 클래스를 추가함(Novice를 상속받음)
//			int power;
//			public void punch() { 적당히 메시지 적기 }
//
//			2. players에 Worrior 추가
//
//			3. players에 GameCharacter 1개
//			Magician 1개 Novice 1개 Worrior 1개씩 추가하고
//			각 클래스 안의 메소드들 돌리기
//
//			GameCharacter - Attack, printInfo
//			Magician - Attack, printInfo,magicArrow
//			Novice - Attack, printInfo,sleep
//			Worrior - Attack, printInfo,sleep,punch

		}
		
	}

}
