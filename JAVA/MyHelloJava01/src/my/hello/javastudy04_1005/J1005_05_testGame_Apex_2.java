package my.hello.javastudy04_1005;

import java.util.ArrayList;
import java.util.Scanner;

public class J1005_05_testGame_Apex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + space // + enter �ڵ��ϼ�
		Scanner s = new Scanner(System.in);
		System.out.println("�� ĳ���� �?");
		int count = s.nextInt();
		
		GameCharacter[] players = new GameCharacter[count];
		for(int i = 0; i<players.length; i++) {
			System.out.println(i+1+"��° ĳ���� ������?");
			int lv = s.nextInt();
			if(lv<0) {
				i--; 
				continue; //i�� �پ��ٰ� i++�����鼭 ������� ���ƿ�.
				//������ϰ� �����܁� ��������
				//3�� �Է��ϸ� players.length 3, ������ �ؿ� �ִ� �ڵ� ���� ����.
				//i��Ҵٰ� ���� ���� �ٽ� �� ���ư��°�.
				//
			}
			System.out.println("�� ĳ���� ������?");
			s.nextLine();
			String job = s.nextLine();
			System.out.println("�� ĳ���� ID��?");
			String id = s.nextLine();
			players[i] = new GameCharacter(id, job);
			players[i].setLv(lv); //�Լ� �̸��� �빮�� ��������������������������
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
		
		//count�� �ɶ����� ����Ѵ�.
		while(gamers.size() != count) {
			System.out.println("ĳ���� ����?");
			int level = s.nextInt();
			if(level<0)
				continue;
		System.out.println("ĳ���� ����?");
		s.nextLine();
		String job =s.nextLine();
		System.out.println("ĳ���� ID?");
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
		//�ǽ�3���� ���� GameCharacter Ŭ���� �̿��Ͽ�
		//3ĭ¥�� �迭, 3ĭ¥�� ArrayList�� ĳ���� ä���
		//��, Scanner �̿��Ͽ� ��� �Է¹ޱ�
		//level �Է½� ������ ����ó�� �ϵ� �̹��� main���� �غ���
		//(���� �Է��ϸ� �ٽ� �Է��ϰ� �ϱ�)

	}
}
