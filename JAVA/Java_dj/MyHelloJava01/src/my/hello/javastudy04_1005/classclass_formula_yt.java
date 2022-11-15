package my.hello.javastudy04_1005;

public class classclass_formula_yt {

	private final double pi =3.14; //코드를 고치지 않는한 변경 불가.
	private static int num; //클래스 변수, 모든 객체에서 공유하여 사용 가능
	//public static int getnums() {} //클래스 메소드, 클래스 변수를 객체를 거치지 않고 
	//출력할 수 있음, 클래스 메소드 안에는 객체화 된 인스턴스 또는 static이 붙어 있는것들만 있을 수 있음. 
	
	//생성자 :  함수와 형태가 비슷함 거의 똑같다. 
	//함수 : 원할때마다 불러오기 가능.
	//생성자: 객체 object 생성될때 한번만가능. 이미 생성된거 다시 xxx. 재활용 x.
	//객체 생성과 동시에 함수실행하기 좋다.
	//ex) Circle c2= new Circle(2);
	
	//private 은  get 무조건 많이씀. 생성자 초기화면★ 안씀 !!!! 약간 반강제? 
	//set 보단 new Circle 로 복제해서 인스턴스에 넣어준다. 
	
//	PrintWriter p2 = new PrintWriter("result2.txt");
//	p2.write("Hello 1");	
//	p2.close();		
	//클래스를 만든사람이 인스턴스로 활용하길 원한다면, 생성자를 가져있고, 
	//new 뒤에 PrintWriter("result2.text")함수가 생성자가 된다 .
	//new를 생성자 앞에 붙이면 걔가 복제되서 instacne 가되고,
	//그 instance에 어떤값이 올수있느냐를 규제하기위해서,
	//앞에 classWriter라는 클래스 이름을 적는다.
	
	//	1. PrintWritter("result1.txt"); 저장하고 싶은 PrintWitter의 파일이름이 result1.text
	//	2. new PrintWritter("result1.txt") PrintWritter의 복제본, 아바타를 만들고 싶은거, 
	//	p1 = new PrintWritter("result1.txt"); 복제본을 p1이라는 변수에 담았고, 
	// 변수에 담겨있는 무엇을 PrintWritter의 클래스의 instance.
	//	3. PrintWritter p1 = new PrintWritter("result1.txt"); p1에 아무거나 들어가면 안되서, 
	//	p1에는 반드시 printWritter의 클래스의 instance만 들어가야해서, 데이터타입으로 PrintWritter를 지정, p1앞에 붙여줌
	
//	1
//	static을 변수에 붙이면 모든 인스턴스가 공유한다.
//	id는 스타틱이 없으니깐 인스턴스들이 각자의 id를 가지고 있다.
//	카운트는 모두가 공유하고 있기 때문에 카운트 값은 모두 동일하다.
//	결국 한쪽에서 카운트 값을 변경시키면 모두 변화한다.
//	결론: 고정하기 때문에 공유한다
//
//
//	2
//	GameCharacter.g1.sayHello
//	static을 메소드(함수)에 붙이면 메인에서 인스턴스를 거치지 않고 호출할 수 있다.
//	public void sayHello() { System.out.println("안녕~~"); }
//	g1.sayHello(); // 무조건 g1 등의 인스턴스를 거쳐야만 한다.
//
//	public static void sayHello() { System.out.println("안녕~~"); }
//	GameCharacter.sayHello(); // g1 등의 인스턴스를 거치지 않고, 클래스 단위에서 호출할 수 있다.
//
//	이유: 스타틱을 적으면 클래스에 고정되서 인스턴스 안 거쳐도 됨
//
//	//GameCharacter.cc(); //위에서 스태틱을 지우면 못쓰낟. 그 이유는 위에서 스태틱을 지웠기 때문에
	//이거는 스태틱도 아니고 인스턴스 (new)도 아니라서 못쓰는것이다. 
	

//class 학생 : 부모
//ex) 초딩 중딩 고딩 대딩 etc....
//
//
//class 대학생 extends 학생 : 자식
//:학생꺼 전부 내장?? 얍얍. 모든걸 다 받아서 씀 전부 학생인거 맞으니까. 
//ㄴ>ex) only 대학생.
//ㄴ> 모든 대학생은 학생이지만 모든 학생은 대학생이 아.님.
//
//상속 : 부모클래스에서 가져와서 좀 더 좁은 범위 의 개념 같은 손나 칸쥐 데쓰요~~~~
//
//쥬분다요쥬분 모쥬뷴다요'ㅅ'> 아뤼가또우'ㅂ'>
//


	
	
//1. Student 클래스에 study 메소드 추가하기
//	{"학생이면 공부를 해야지~ 등의 내용 추가"}
//2. Student 클래스를 상속받아서 KBStudent를 만들기
//	- gender
//	- education 추가
//	- attend 메소드 추가(출석하기) 
//		{ 이름 나이 성별 학력 출력 하고 입실퇴실 출력 }
//3. Main에서 테스트해보기 
//
//4. javastudy02에 있는 Circle 클래스를 상속받아서 sphere 클래스 만들기
//5. sphere 클래스에서 getvolume 메소드 추가(부피구하기)
//(4/3)*pi*r^3
//6. Main에서 테스트해보기 
//
//7 javastudy01에 있는 Rectangle 클래스를 상속 받아서 cuboid(직육면체) 클래스 만들기
//	- z 속성 추가
//	- getCuvoidVolumn 추가(w*h*z)
//8. Main에서 테스트해보기
	
}
