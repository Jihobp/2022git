package my.hello.javastudy05_1006;

import java.util.ArrayList;

import my.hello.javastudy04_1005.GameCharacter;

public class J1005_09_Holymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//������
		//�پ��� ���¸� �� ���ɼ�!!!!!!!!!!!!!!!!!!!!!!
		
		//formula.
		//���� �κ��� ���� Ŭ���� = ������ �κ��� �ڼ� Ŭ����
		//������ �κ� is ���� �κ�
		//ex)
		GameCharacter g = new Novice();
		//g�� ����
		//������ �ڼ�
		
		//Novice is GameCharacter (o)
		//GameCharacter is Novice (x)
		
		//�������� �̿��ϸ� �ڵ带 Ȯ ���� �� �ִ�.
		//�������� Ȳ���ϸ� ����Ŭ������ �ϳ��� ArrayList�� ����� ����
		ArrayList<GameCharacter> players = 
				new ArrayList<GameCharacter>();
		
		//�Ʒ��� ���� �� ����Ŭ������ ��ӹ��� ��� Ŭ������
		//�ϳ��� �迭�� (Ȥ�� ����Ʈ��) ������� �� �ְ� �Ǿ���. 
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		//like,, get���� new Novice ����?
		//�ϳ��� Ŭ������ instance�� ���� �� �ִ�. 
		
		
		//players�� ȭ�椷�ϱ� ���� �˾ƾ��ϴ� �����
		
		GameCharacter gg = new Magician();
		gg.setJob("�븶����");
		gg.setId("djLee");
		gg.setLv(250);
		//�ָ��ؾ��� ��
		//gg�� Magician���� instance�� �������.
		//������ ��·�� GameCharacter Ÿ���̴�.
		//�׷��� gg�� magician���ν� Ȱ���ϱ� ���ؼ�
		//Ÿ�� ��ȯ�ؾ���.
		
		//�θ�ĳ���Ͱ� �ڽ����� ��ų �� �� �ְ� ���ִ°� .�� ���� 
		//��ĳ���� gg ���� magician�ΰ� Ȯ���� �ν��Ͻ��� �˷��ְ�,
		//����ĳ����  Magician������ GameChar gg�� �ν��Ͻ� ����� �� �ҷ��ͼ� setMp�� ���� 
		//gg�� ������ ĳ���͵� �� ������. 
		//setMp�� ������ �ȿ��� �ִ� �Լ��ϱ�, ����ϱ� ���ؼ� GameCharacter gg�� ���������� ����ȯ. 
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		//���δ�� ����ȯ�� �ϸ� �ȵȴ�.
		//javastudy07.Magician cannot be cast to javastudy
		//gg�� GameCharacter Ÿ���̰�
		//Magician���� �ν��Ͻ��� ���������
		//Novice�� ���� �� �ƴϴ�.
		//���� �̷��� �Ժη� ����ȯ �߸��ϸ� �ȵȴ�.
		
		//if(gg instanceof Novice) �� �ǹ�
		//gg�� Novice�� �ν��Ͻ��� ������°�?
		
		//Novice �ν��Ͻ� �������ָ� ���ɰ���.
		
		
		if(gg instanceof Novice) {//�� ���ǹ� ������ ������ ;��;
			//�׷��� ���ǹ����� üũ�� �� ����� ��,
			//�̰���ü�� ���̾ȴ�. gg�� Magician�̱⶧����, 
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
			
			
//			1. Worrior Ŭ������ �߰���(Novice�� ��ӹ���)
//			int power;
//			public void punch() { ������ �޽��� ���� }
//
//			2. players�� Worrior �߰�
//
//			3. players�� GameCharacter 1��
//			Magician 1�� Novice 1�� Worrior 1���� �߰��ϰ�
//			�� Ŭ���� ���� �޼ҵ�� ������
//
//			GameCharacter - Attack, printInfo
//			Magician - Attack, printInfo,magicArrow
//			Novice - Attack, printInfo,sleep
//			Worrior - Attack, printInfo,sleep,punch

		}
		
	}

}
