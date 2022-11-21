package javastudy11_1011;

import java.util.ArrayList;
import java.util.List;
//interface??
//1. Ư�� ����� �����ϵ��� ���� ��.
//2. ���߻���� ������. �߻�Ŭ������ ���Ѵ�. 
//3. �������̽����� ��ӵ� ��.

public class J1011_Pokemon_w_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ī��� �������ڸ��� �̸��� �־�� ��
		// ����Ʈ �����ڰ� ����
		Pikachu p = new Pikachu("�Ʊ���");

		// ����Ʈ ������ �̿��ؼ� �ٷ� �ν��Ͻ� ��������
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();

		// �嵿�ϼ�
		// Animalable �� �����ϴ� �͸� Ŭ����. ���⼱ �������� �������.
		Animalable d = new Animalable() {

			@Override
			public void charming() {
				// TODO Auto-generated method stub
				System.out.println("�۸� ¢�´�.......");

			}
		};

		// Animalable d - Pikachu ��� �ٸ��� �̸��� �ƿ� ���� Ŭ����
		// d ������ ���̴� Ŭ������...........

		// �͸� Ŭ���� !!!!!!!!!!! �� ���ڱ� �Լ� �ȿ� public �� ���ñ�?
		// �� > �͸� Ŭ���� : �̸��� ���� ��ü.�ѹ��� ���� ����.@#@#@#@!!!!@!@Ŭ������ ����� �ָ��Ѱ�?

		// �θ� d �ν��Ͻ� ���� new Animalable () Ŭ������ �ִ´�.
		// Animalable Ŭ������ ��ӹ��� �̸����� Ŭ���� ��{ }�߰�ȣ ����ü.
		// charming()�޼ҵ�.�� Animalable()Ŭ���� �ȿ��� ������, ���̴°� �͸�Ŭ����{}�ȿ��� ���δ�.

		// �� > �ν��Ͻ� �ڿ� �߰�ȣ ������ {}�͸� ũ����!!!!!!!!!!
		// �͸�Ŭ����1
		// Animalable Ŭ���� Ÿ��, d�� ��ü��, �ν��Ͻ��� new Food() .
		// �����ڴ� Animalable(). new+�����ڴ� �ν��Ͻ�.

		Plantable myp = new Plantable() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("LG Ʒ���迡�� �ڶ�� ����.");
			}
		};

		Pokemonable g = new Pokemonable() {

			@Override
			public void grow() {
				System.out.println("�ٴټӿ��� �ڶ���.");

			}

			@Override
			public void charming() {
				System.out.println("���������");

			}

			@Override
			public void fight() {
				System.out.println("�źϰź� ��Death");

			}
		};

		// ArrayList�� List��� �������̽��� ��ӹ��� Ŭ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ns = new ArrayList<Integer>();

		// try Catch ���� - java, c#���� ���� ����.
		// try �� ������ �κ��� ������ ���� catch �κ����� �Ѿ��
		// ���α׷��� ������� �ʴ´�. - ����.  (try Catch �� �� ���¼� �������� �״�� �����_)
		try {
			// ���� ���� �̽��� �ذ��� �� �� = > Cloneable�̶�� �������̽�
			Pikachu pipi = (Pikachu) p.clone();
			// Pikachu pipi = p;
			pipi.setName("��� �˶���"); // ��ī�� �Ѹ����� ���� pipi�� �̸��� ����׋��̷� �ٲ��.
			// p�� �̸��� �����ε�?!! �� pip�� ����׋��̷� �ٲٴ�,
			// ���� : pipi�� p�� �Ȱ��� ��ġ�� �����ϱ� �����̴�. (
			System.out.println(p.getName());

		} catch (Exception e) {
			// TODO: handle exception
		}

		//LAMBDA ����
		//�޼ҵ尡 �ϳ� �ִ� �������̽��� ���ؼ� ������
		//�͸� Ŭ������ ���ΰ�
		
		//Plantable�� grow�� �������̵��Ѱ�
		//�̰� ȭ��ǥ ���·� �ٿ������� = ����.
		Plantable myFlower = () -> {
			System.out.println("�������� �ڶ󳪿�");
		};
		myFlower.grow();
	
	}

}

//1. Animalable �������̽� ����
//- public void charming();
//2. Plantable �������̽� ����
//- public void grow();
//3. Pokemonable�̶�� �������̽� ����
//��, 1,2�� �������̽��� ��ӹ޾ƾ� �Ѵ�.
//- public void fight();
//4. 1,2,3���� ����ϴ� ���ϸ� Ŭ������
//�ϳ��� �����Ӱ� ��������. (�ּ� 3���� Ŭ���� �����)
//ex) ��ī��, �̻��ؾ�, ������ �� 
//
//5. 1,2,3�� �̿��� �͸�Ŭ������ ������
