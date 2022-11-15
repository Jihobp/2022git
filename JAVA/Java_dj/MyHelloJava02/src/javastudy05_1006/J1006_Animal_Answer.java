package javastudy05_1006;

import java.util.ArrayList;

public class J1006_Animal_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animalHospital
		= new ArrayList<Animal>();
		
		Animal a1= new Animal();
		Animal a2 = new Dog(); //Dog a2=new Dog(); <-이거도 됨.
		Cat a3 = new Cat();
		
		if(a2 instanceof Dog)
			((Dog) a2).setHairColor("흰색");
		
		a3.setEyeColor("호박색");
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
//		Cat이랑 Dog 클래스를 완성한다.
//		1. Animal 클래스를 상속
//		2. Dog에는 String hairColor라는
//		변수 추가하고
//		void bark() 라는 메소드 추가
//		(내용 : hairColor를 흩날리며 멍멍멍)
//		3. Cat에는 String eyeColor라는 변수
//		추가하고 void meow() 라는 메소드추가
//		(내용 : eyeColor눈빛을 빛내며 야옹야옹)
//		1. animalHospital이라는 Animal 타입의 ArrayList를 만든다.//
//		2. 1마리 이상의 Animal, Dog, Cat을 만들고,
//		각 동물들의 정보들도 추가한다. 
//		즉 최소 길이는 3이상의 ArrayList를 만든다.
//		3. 각 동물들이 가진 메소드를 호출한다.
//		Animal - sleep
//		Dog - sleep, bark
//		Cat - sleep, meow

	}
}