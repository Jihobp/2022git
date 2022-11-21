package javastudy05_1006;

import java.util.ArrayList;

public class J1006_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ϲ����� ��ü ����
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();

		Animal a1 = new Dog();
		Animal c2 = new Cat();

		// �������� ������ ��.
		// ����Ŭ���� Ÿ������ �� �迭�̳� ArrayList��
		// �ڼ� Ŭ���� Ÿ���� ��ü���� ����.
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(a);
		zoo.add(d);
		zoo.add(c);
		zoo.add(a1);
		zoo.add(c2);
		zoo.add(new Animal());
		zoo.add(new Dog());
		zoo.add(new Cat());

		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		animalHospital.add(new Animal()); // arrayList �� 0~2��°���� ������δ�����.
		animalHospital.add(new Dog());
		animalHospital.add(new Cat());
		animalHospital.get(0).setName("������");
		animalHospital.get(0).setAge(7);
		animalHospital.get(1).setName("��Ź����");
		animalHospital.get(1).setAge(30);
		// (Dog)animalHospital.get(1).setHairColor()
		if (animalHospital.get(1) instanceof Dog) {
			Dog dog = (Dog) animalHospital.get(1);
			dog.setHairColor("������");
		}
		animalHospital.get(2).setName("��������");
		animalHospital.get(2).setAge(2);
		if (animalHospital.get(2) instanceof Cat) { // �ν��Ͻ� = ��ü ���! Cat�̶�� Ŭ������ ��ü.
			Cat cat = (Cat) animalHospital.get(2);
			cat.setEyeColor("�����+�Ķ���");
		}
		//��ü�� class�� ���� ������ int, string, double. emd
		// ��ü�� �Լ�
		//	Animal animal :  animalHospital �迭.
		for (Animal animal : animalHospital) {
			animal.Sleep(); // ��ü�� sleep()�Լ��� ���ִ�.
			if (animal instanceof Dog) {
				((Dog) animal).bark();
			} else if (animal instanceof Cat) {
				((Cat) animal).meow();
		
			}
		}
	}
}
