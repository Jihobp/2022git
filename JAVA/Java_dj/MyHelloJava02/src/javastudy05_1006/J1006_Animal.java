package javastudy05_1006;

import java.util.ArrayList;

public class J1006_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일반적인 객체 선언
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();

		Animal a1 = new Dog();
		Animal c2 = new Cat();

		// 다형성을 으용한 것.
		// 조상클래스 타입으로 된 배열이나 ArrayList에
		// 자손 클래스 타입의 객체들이 들어간다.
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
		animalHospital.add(new Animal()); // arrayList 에 0~2번째까지 순서대로더해줌.
		animalHospital.add(new Dog());
		animalHospital.add(new Cat());
		animalHospital.get(0).setName("강아지");
		animalHospital.get(0).setAge(7);
		animalHospital.get(1).setName("영탁오빠");
		animalHospital.get(1).setAge(30);
		// (Dog)animalHospital.get(1).setHairColor()
		if (animalHospital.get(1) instanceof Dog) {
			Dog dog = (Dog) animalHospital.get(1);
			dog.setHairColor("검정색");
		}
		animalHospital.get(2).setName("말랑뇽이");
		animalHospital.get(2).setAge(2);
		if (animalHospital.get(2) instanceof Cat) { // 인스턴스 = 객체 비슷! Cat이라는 클래스의 객체.
			Cat cat = (Cat) animalHospital.get(2);
			cat.setEyeColor("노란색+파란색");
		}
		//객체는 class에 오고 변수는 int, string, double. emd
		// 객체명 함수
		//	Animal animal :  animalHospital 배열.
		for (Animal animal : animalHospital) {
			animal.Sleep(); // 객체명에 sleep()함수가 들어가있다.
			if (animal instanceof Dog) {
				((Dog) animal).bark();
			} else if (animal instanceof Cat) {
				((Cat) animal).meow();
		
			}
		}
	}
}
