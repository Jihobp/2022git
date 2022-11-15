package javastudy07_1007_Food;

import java.util.ArrayList;

public class J1007_FoodTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스  and 익명 클래스!!!!!!!!!!!!!@#!@#!#!@#!@#!@#!#!@#!@#!#!@
		
//		Food f = new Food();	//추상클래스 가지고는 인스턴스 못만듬...
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
		//foods에 있는 음식들은 모두 eat을 호출할 수 있다.
		//또한 !!! eat 이 각각 다 다르게 구현되어 있 ㄸ  ㅏ. 
		
		//arrayList 출력하려면 foreach나 for문, 좀더 간단하니까.
		//부모클 //arraylist 배열안에 있는 각각의 인덱스값. //foods 은 ArrayList.
		for(Food food : foods) {
			food.eat();
			//한바퀴 돌때마다 f.eat, r.eat, b.eat 실행
		}
		
		
		//Ramen 등과 다르게 이름이 아예 없는 클래스
		//temp에서만 쓰이는 클래스임...........

		//???????????????????????????룔ㅇ룡ㄹ요룡룡 헬프
		//익명 클래스 !!!!!!!!!!!  왜 갑자기 함수 안에 public 이 나올까?
		//ㄴ > 익명 클래스 : 이름이 없는 객체.한번만 쓰고 말거.@#@#@#@!!!!@!@클래스로 만들기 애매한거? 
		//괄호??
		
		//부모에 temp 인스턴스 만들어서 new Food() 클래스를 넣는당. 
		//Food클래스를 상속받은 이름없는 클래스 가{ }중괄호 그자체.
		//eat()메소드.은 food()클래스 안에서 왔지만, 쓰이는건 익명클래스{}안에서 쓰인다. 
		
		
		//ㄱ > 인스턴스 뒤에 중괄호 나오면 {}익명 크래스!!!!!!!!!!
		//익명클래스1
		//Food 클래스 타입, temp는 객체명, 인스턴스는 new Food() . 
		//생성자는 Food(). new+생성자는 인스턴스.  
		Food temp =  new Food() {
			//eat ctrl + space
			public void eat() {
				System.out.println("기도하고 먹는다.");
			}
		};
		temp.setName("교회식당 밥");
		foods.add(temp);
		
		
		//익명클래스2
		//new Food() 생성자
		foods.add(new Food(){
			
			@Override
			public void eat() {
				System.out.println("묵상하고 먹는다.");
			}
		});
		
	}

}
