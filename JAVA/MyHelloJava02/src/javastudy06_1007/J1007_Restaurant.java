package javastudy06_1007;

import java.util.ArrayList;
import java.util.Scanner;

public class J1007_Restaurant {

	public static void main(String[] args) {
		
		Food f = new Food("�����");
		Sushi s = new Sushi("�����ʹ�",10000,"����ͻ��");
		//e�� Food ��� Emokase��� �ص�
		//FoodŸ�� ArrayList�� �迭�� ��
		//�̰� ���� �� ������ ������ �����ٷ���...
		Food e = new Emokase("��â����", 20000);
			
		
		//Food()�� Sushi()�� Emokase() �̷��� ����ִ�
		//�����ڸ� �� ����� ������ Food�� �Ű������� ���� �����ڴ�
		//���� �����̴�.
		
		ArrayList<Food> foods = new ArrayList<Food>();
		f.setPrice(1000);
		foods.add(f);
		foods.add(s);
		foods.add(e);
		
		//Scanner�� ���ôٽ��� Ŭ����
		//�����ڰ� ������ �Ű������� �ִ�.
		//System Ŭ���� �ȿ� �ִ� in�� Ŭ���� ����
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("� ���� �߰��ҷ�?");
			String name = scan.nextLine();
			Food temp;
			if(name.equals("����") || name.equals("Sushi")) {
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine(); //hasNextLine �ƴ�
				System.out.println("���� �ʹ�?");
				String Sushiname = scan.nextLine();
				System.out.println("���� �ͻ���?");
				String wasabi = scan.nextLine();
				temp = new Sushi(Sushiname, price, wasabi);
				foods.add(temp);
			} else if(name.equals("�̸�ī��") || name.equals("Emokase")) {
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine(); //hasNextLine �ƴ�
				System.out.println("�޴����� ����?");
				String menu = scan.nextLine();
				temp = new Emokase(menu, price);
				foods.add(temp);
			} else {
				if(name.equals("exit")) {
					System.out.println("�߰� ����");
					break;
				} else {
					System.out.println("�󸶾�?");
					int price = scan.nextInt();
					scan.nextLine(); //hasNextLine �ƴ�
					System.out.println("�޴����� ����?");
					String menu = scan.nextLine();
					temp = new Food(menu, price);
					foods.add(temp);
				}
			}
				
		}
		
		for (Food food : foods) {
			food.eat();
			if(food instanceof Emokase)
			{
				((Emokase) food).sayEmo();
				System.out.println("�޴�����?");
				String menu = scan.nextLine();
				System.out.println
				(((Emokase) food).choiceMenu(menu));
			}
		}
		
//	1. Food Ŭ������ �����.
//		- name, price
//		- void eat()
//
//	2. Food�� ��ӹ޴� ���� Ŭ���� 2���� �����.	
//	ex) Sushi, EmoKase
//	Sushi => wasabiBrand
//	EmoKase => void sayEmo(), String choiceMenu(String)
//
//	3. Food 1���� �����Ͽ� �� Ŭ������ �̿���
//	���� 1���� �����.
//
//	4. �� �͵��� �ϳ��� ArrayList�� �߰� 
//
//	5. �ݺ����� ���ǹ� �̿��Ͽ�
//	Food or ù��° or �ι�° Ŭ���� �̿��� ���� ����
//	ArrayList�� add�ϱ�
//
//	6. �� �͵��� ���� �޼ҵ��(Getter Setter ����) ���
//
//	7. Food Ŭ������ ���ؼ� �����غ���(���� �̻��� ���� �����غ��� ���� 
//	���⼭ �Ļ��� �ٸ� Ŭ�������� �������� �����غ��� ����... �������� �����Ӱ�)


	}
}
