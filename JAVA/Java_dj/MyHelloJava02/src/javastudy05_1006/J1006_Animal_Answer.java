package javastudy05_1006;

import java.util.ArrayList;

public class J1006_Animal_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animalHospital
		= new ArrayList<Animal>();
		
		Animal a1= new Animal();
		Animal a2 = new Dog(); //Dog a2=new Dog(); <-�̰ŵ� ��.
		Cat a3 = new Cat();
		
		if(a2 instanceof Dog)
			((Dog) a2).setHairColor("���");
		
		a3.setEyeColor("ȣ�ڻ�");
		animalHospital.add(a1);
		animalHospital.add(a2);
		animalHospital.add(a3);
		
		for(Animal animal : animalHospital) {
			animal.Sleep();
			if(animal instanceof Dog)
				((Dog)animal).bark();
			else if(animal instanceof Cat)
				((Cat)animal).meow();
			System.out.println("------------");
		}
	//	
//		Cat�̶� Dog Ŭ������ �ϼ��Ѵ�.
//		1. Animal Ŭ������ ���
//		2. Dog���� String hairColor���
//		���� �߰��ϰ�
//		void bark() ��� �޼ҵ� �߰�
//		(���� : hairColor�� �𳯸��� �۸۸�)
//		3. Cat���� String eyeColor��� ����
//		�߰��ϰ� void meow() ��� �޼ҵ��߰�
//		(���� : eyeColor������ ������ �߿˾߿�)
//		1. animalHospital�̶�� Animal Ÿ���� ArrayList�� �����.//
//		2. 1���� �̻��� Animal, Dog, Cat�� �����,
//		�� �������� �����鵵 �߰��Ѵ�. 
//		�� �ּ� ���̴� 3�̻��� ArrayList�� �����.
//		3. �� �������� ���� �޼ҵ带 ȣ���Ѵ�.
//		Animal - sleep
//		Dog - sleep, bark
//		Cat - sleep, meow

	}
}