package my.hello.javastudy05_1006;
import java.util.ArrayList;

import my.hello.javastudy04_1005.GameCharacter;

public class J1005_08_playGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Novice nTest = new Novice();//("Xenoint","������");
		ArrayList<GameCharacter> legendarygamer = 
				new ArrayList<GameCharacter>();
		
		ArrayList<GameCharacter> gamers = new ArrayList<GameCharacter>();
		gamers.add(new GameCharacter("����", "�ʱ޸�����"));
		gamers.add(new GameCharacter("�޴�", "�ʱ�����"));
		gamers.add(new GameCharacter("��","�����Ҹ�"));
		
		for(int i = 0; i<gamers.size(); i++)
			gamers.get(i).setLv(1+10*i);
		
		for (GameCharacter gameCharacter : gamers) {
			gameCharacter.attack();
			gameCharacter.printInfo();
		}
		
		ArrayList<Magician> magicians = new ArrayList<Magician>();
		Magician m1 = new Magician();
		m1.setJob("�����簰��������");
		m1.setId("������");
		m1.setLv(100);
		m1.setMp(50);
		magicians.add(m1);
		
		magicians.add(new Magician());
		magicians.get(1).setJob("�������û������");
		magicians.get(1).setId("������");
		magicians.get(1).setLv(100);
		magicians.get(1).setMp(50);
		
		Magician m2 = new Magician();
		m2.setJob("�븶���翴������");
		m2.setId("�̵���");
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
		n.setId("����Ÿ����");
		n.setLv(34);
		n.setJob("���");
		white_hands.add(n);
		white_hands.add(new Novice());
		white_hands.get(white_hands.size()-1).setHp(500);
		white_hands.get(white_hands.size()-1).setId("����Ÿ�̰�");
		white_hands.get(white_hands.size()-1).setLv(1997);
		white_hands.get(white_hands.size()-1).setJob("���۳��");
		Novice n2 = new Novice();
		n2.setHp(1030);
		n2.setId("���ξ��Ѽ����");
		n2.setLv(29);
		n2.setJob("���¼հ���");
		white_hands.add(n2);
		
		for (Novice novice : white_hands) {
			novice.attack();
			novice.printInfo();
			novice.sleep();
		}
				
	}
}

//		//1. javastudy03�� �ִ�
//		GameCharacter�� ��ӹ޾Ƽ�
//		Ŭ������ �����.
//		Magician
//			mp �Ӽ� �߰�
//			magicArrow �޼ҵ� �߰�
//		Novice
//			hp �Ӽ� �߰�
//			sleep �޼ҵ� �߰�
//
//		2. ArrayList�� �� 3�� �����.
//		GameCharacter, Magician, Novice�� ���ؼ� ArrayList ����
//
//		3. �̷��� ���� ArrayList���� ���ڰ� ���� �޼ҵ���� ȣ��
//		GameCharacter - Attack, printInfo
//		Magician - Attack, printInfo,magicArrow
//		Novice - Attack, printInfo,sleep
//
//		+) �н���ǥ : �������� �������̵��� ���ؼ� ������ ��
//
//	}

