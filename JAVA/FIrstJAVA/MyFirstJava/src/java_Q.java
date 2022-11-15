import java.util.Scanner; //d.f. scanner를 쓰기 위한 사전작업이다. 
public class java_Q {
	public static void main(String args[]) {
		String name="ParkJiHo";
		int year =2022;
		
		System.out.printf("Hello World. <%s> !\n",name);
		System.out.printf("You are learning Java with <%s>\n",year);
		System.out.println("당신의 각오를 말해보세요.");
		System.out.println("Baby Shark DURUDDUDDUDDU hit you with that DUDU-DUDU-DUDU ㅇㅅㅇ/");
		
		
		//Q. 이름, 이번년도, 각오, 입력받고 아래 양식처럼 출력받기.
		//Hello World, <본인이름> !
		//You are learning Java with <2022>
		//당신의 각오를 말해보세요.
		//<각오(아무말)>
		
		
		Scanner s=new Scanner(System.in); 	//?????? d.f. scanner를 쓰기 위한 사전작업이다. 
		String say=s.nextLine();			//각오 입력 선언함과 동시에 입력하겠따.//자료형 변수명=s.nextline();/s.nextline이 함수.
		String name2=s.next(); 				//이름 입력
		int year2=s.nextInt(); 				//이번해 년도 입력
		//s.nextLine(); //enter 입력받고 버린다.	//?????? //char 쓸때 rewind는 enter를 지우는거.//버퍼를 미리 먹인다.
		//String say=s.nextLine();   		//각오입력
		
		System.out.println("Hello World, "+name2);
		System.out.println("You are learning Java "+year2);
		System.out.println("당신의 각오를 말해주세요.");
		System.out.println(say);			//???????

		
	}

}
