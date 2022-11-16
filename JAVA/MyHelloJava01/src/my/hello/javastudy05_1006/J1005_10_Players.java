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
		g.setJob("���α׷���");
		g.setId("���ڵ�");
		g.setLv(100);
		players.add(g);
		
		Novice n = new Novice();
		n.setJob("���");
		n.setHp(10);
		n.setId("���");
		n.setLv(1);
		players.add(n);		//players�� GameCharacter Ÿ����
							//ArrayList������, �������� ���ؼ�
							//GameCharacter�� ����� �� �� ��.
		
		//���� ���� ������ �ڽ�!!!!	
		GameCharacter m = new Magician(); //������!!!!!!!!!!!!!!!!
		//Magician is GameCharacter(O)
		//GameCharacter is Magician(x)
		m.setJob("�븶����");
		m.setId("���¼ַ��̵���");
		m.setLv(27);
		if(m instanceof Magician) {
			Magician temp = (Magician)m;
			temp.setMp(1000);
			//�� 2���̶� �Ʒ� 1���� ���� ����̴�.
			((Magician)m).setMp(100);
		}
		players.add(m);
		
		players.add(new Worrior());
		players.get(players.size()-1).setJob("Ű��������"); //���ڸ��� ũ�� -1 �ϸ� �ٷ����ٵǼ� �ű⿡ �� �־��؈�
		players.get(players.size()-1).setId("���̹��� ��");
		players.get(players.size()-1).setLv(7);
		if(players.get(players.size()-1)instanceof Worrior)
		{
			Worrior w = (Worrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			//�ռ� ��� ���� ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! �� ���ؼ�,
			//w�� players �ȿ� 4���� ���� ����Ű�� �ִ�.
			//�׷��� w���� set�ϸ� players.get(3)�� ���� �ٲ�.
			
		}
	for (GameCharacter gameCharacter : players) {
		gameCharacter.printInfo();
		gameCharacter.attack();
		if(gameCharacter instanceof Novice)
		{
			//Worrior ���� sleep�� ȣ���ϰ� ��. 
			((Novice) gameCharacter).sleep();
			//Worrior ���� instanceof�� �ɸ� �� �ֱ� ���� ������
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
	//����, ���ڿ�, ���� ���� �ٷ�� Ŭ������ �ִ�.
	test.add(1); //Integer
	test.add("�ȳ�"); //String
	test.add('c'); //character
	
	
	}
}
