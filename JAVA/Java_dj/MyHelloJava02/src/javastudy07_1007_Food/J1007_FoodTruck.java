package javastudy07_1007_Food;

import java.util.ArrayList;

public class J1007_FoodTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻� Ŭ����  and �͸� Ŭ����!!!!!!!!!!!!!@#!@#!#!@#!@#!@#!#!@#!@#!#!@
		
//		Food f = new Food();	//�߻�Ŭ���� ������� �ν��Ͻ� ������...
		Food f = new Taco();
		Ramen r = new Ramen();
		Bibimbab b =  new Bibimbab();
		
		f.eat();
		r.eat();
		b.eat();
		
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(f);
		foods.add(r);
		foods.add(b);
		//foods�� �ִ� ���ĵ��� ��� eat�� ȣ���� �� �ִ�.
		//���� !!! eat �� ���� �� �ٸ��� �����Ǿ� �� ��  ��. 
		
		//arrayList ����Ϸ��� foreach�� for��, ���� �����ϴϱ�.
		//�θ�Ŭ //arraylist �迭�ȿ� �ִ� ������ �ε�����. //foods �� ArrayList.
		for(Food food : foods) {
			food.eat();
			//�ѹ��� �������� f.eat, r.eat, b.eat ����
		}
		
		
		//Ramen ��� �ٸ��� �̸��� �ƿ� ���� Ŭ����
		//temp������ ���̴� Ŭ������...........

		//???????????????????????????�㤷�椩���� ����
		//�͸� Ŭ���� !!!!!!!!!!!  �� ���ڱ� �Լ� �ȿ� public �� ���ñ�?
		//�� > �͸� Ŭ���� : �̸��� ���� ��ü.�ѹ��� ���� ����.@#@#@#@!!!!@!@Ŭ������ ����� �ָ��Ѱ�? 
		//��ȣ??
		
		//�θ� temp �ν��Ͻ� ���� new Food() Ŭ������ �ִ´�. 
		//FoodŬ������ ��ӹ��� �̸����� Ŭ���� ��{ }�߰�ȣ ����ü.
		//eat()�޼ҵ�.�� food()Ŭ���� �ȿ��� ������, ���̴°� �͸�Ŭ����{}�ȿ��� ���δ�. 
		
		
		//�� > �ν��Ͻ� �ڿ� �߰�ȣ ������ {}�͸� ũ����!!!!!!!!!!
		//�͸�Ŭ����1
		//Food Ŭ���� Ÿ��, temp�� ��ü��, �ν��Ͻ��� new Food() . 
		//�����ڴ� Food(). new+�����ڴ� �ν��Ͻ�.  
		Food temp =  new Food() {
			//eat ctrl + space
			public void eat() {
				System.out.println("�⵵�ϰ� �Դ´�.");
			}
		};
		temp.setName("��ȸ�Ĵ� ��");
		foods.add(temp);
		
		
		//�͸�Ŭ����2
		//new Food() ������
		foods.add(new Food(){
			
			@Override
			public void eat() {
				System.out.println("�����ϰ� �Դ´�.");
			}
		});
		
	}

}
