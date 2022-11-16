package my.hello.javastudy04_1005;

import java.util.ArrayList;
import java.util.Scanner;

public class J1005_05_testGame_Apex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + space // + enter 자동완성
		Scanner s = new Scanner(System.in);
		System.out.println("총 캐릭터 몇개?");
		int count = s.nextInt();
		
		GameCharacter[] players = new GameCharacter[count];
		for(int i = 0; i<players.length; i++) {
			System.out.println(i+1+"번째 캐릭터 레벨은?");
			int lv = s.nextInt();
			if(lv<0) {
				i--; 
				continue; //i가 줄었다가 i++만나면서 원래대로 돌아옴.
				//실행안하고 다음단곅 ㄱㄱㄱㄱ
				//3을 입력하면 players.length 3, 음수면 밑에 있는 코드 실행 ㄴㄴ.
				//i깎았다가 증가 ㄱㄱ 다시 걍 돌아가는거.
				//
			}
			System.out.println("그 캐릭터 직업은?");
			s.nextLine();
			String job = s.nextLine();
			System.out.println("그 캐릭터 ID는?");
			String id = s.nextLine();
			players[i] = new GameCharacter(id, job);
			players[i].setLv(lv); //함수 이름은 대문쟈 ㅇㅅㅇㅅㅇㅅㅇㅇㅇㅅㅇㅅㅇ
		}
	
		//foreach ctrl space
		for (GameCharacter gameCharacter : players) {
			gameCharacter.printInfo();
		}
		
		//ArrayList
		ArrayList<GameCharacter> gamers = 
				new ArrayList<GameCharacter>();
//		for(; gamers.size() < count;) {
//			
//		}
		
		//count가 될때까지 계속한다.
		while(gamers.size() != count) {
			System.out.println("캐릭터 레벨?");
			int level = s.nextInt();
			if(level<0)
				continue;
		System.out.println("캐릭터 직업?");
		s.nextLine();
		String job =s.nextLine();
		System.out.println("캐릭터 ID?");
		String ID = s.nextLine();
		GameCharacter g = new GameCharacter(ID,job);
		g.setLv(level);
		gamers.add(g);
		//gamers.add(new GameCharacter(ID, job));
		
		}
		for(GameCharacter gameCharacter : gamers) {
			gameCharacter.printInfo();
		}

		//.....
		//실습3에서 만든 GameCharacter 클래스 이용하여
		//3칸짜리 배열, 3칸짜리 ArrayList에 캐릭터 채우기
		//단, Scanner 이용하여 모두 입력받기
		//level 입력시 음수면 예외처리 하되 이번엔 main에서 해보기
		//(음수 입력하면 다시 입력하게 하기)

	}
}
