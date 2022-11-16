import java.util.Scanner;
public class java_theory01 {
	public static void main(String args[]) {
	// C언어 입력문 ㅇㅅㅇ!!!!!!!!!!!!!!!!!!!!!!
		// Scanner 변수 선언
		// System.in :: 사용자에게 입력을 요청
		// Scanner :: 입력받은 값을 읽어서 시스템에게 전달
		// Class 구조체
		Scanner s=new Scanner(System.in); 
		//최상단에 적는게 좋다. scanner가 선언된 이후에 입력값을 넣을 수 있다. 뒤에 입력값 넣으면 에러가 난다.
		
		//	주요 입력문
		//	정보를 입력받아서 프로필을 출력하기.
		String name=s.next(); //c.f. 문자여려개 입력받음. 곻ㅇ백없는 문자열 X!!!!!!!!!!!!!!!!!!
		int age=s.nextInt();
		boolean gender=s.nextBoolean(); // Y.d.f ????????? //treu:남자, false:여자//불리언(boolean)은 논리학에서 참(true)과 거짓(false)을 나타내는 데 사용됩니다.
		//https://wikidocs.net/220 불리언 링크 
		double height=s.nextDouble();
		char blood=s.next().charAt(0); //문자 제한 받음. 하나만 입력받을 수 있게.
		s.nextLine(); //Y.d.f ? 결과) 입력앞에 뭔가 있으면 입력받고 버리랏고????????????????????????????????
		String mood=s.nextLine(); //c.f. 공백있는 ㅁ누자열 입력O !!!!!!!!!!
		
		System.out.println("이름: "+name); 
		System.out.println("나이: "+age);
		if(gender==true ) {System.out.println("성별: 남자");}
		else {System.out.println("성별: 여자");}
		System.out.println("키: height"+height);
		System.out.println("혈액형: B"+blood);
		System.out.println("지금 내 상태: "+mood);
		
		//	bool형 소개 
		boolean result=(1+2!=3);	//true와 false
		//result==false
		if(result==true) {System.out.println("옳은 식입니다.");}
		
		//	배열 :: 정적할당, 동적할당 !!!!!!!!!!
		// C언어는 문법이 따로였지만, Java는 문법이 비슷.
		int arr1[]=new int[5]; // 크기가 5인 배열 선언(정적 배열)
		int num=s.nextInt(); 
		int arr2[]=new int[num]; // 동적배열
		
		//	문자열 String 소개 !!!!!!
		//	두 사람 이름 입력: 내 이름이랑 옆 사람 이름.
		String mine="ParkJiho";
		String yours="DoKwanghyun";
		//	첫 글자 비교 :: charAt() 사용
		if(mine.charAt(0)==yours.charAt(0)) //이름의 0번쨰 참고
			{	//mine.charAt(0)='L'
				//yours.charAt(0)='L'
				System.out.println("첫 글자가 똑같습니다.");
			}
		else {
				System.out.println("첫 글자가 다릅니다.");
			 }	
		//	charAt() 함수 통해서 값 참조는 가능하지만 값 변경은 안됌
		
		// 	toChararray() : String 타입을 char형 배열로 변환.
		char m[]=mine.toCharArray();
		char y[]=yours.toCharArray();
		if(m[0]>='A'&&m[0]<='Z') 
			{ // 대문자 A는 
			m[0]=(char)(m[0]+32); //강제 형변환// (char)가 없으면 int 형으로 저장 될것. (char)로 명시해서 문자형으로 바꿔줘야한다. 
			}
		else
		{
			m[0]=(char)(m[0]-32);
		}
		if(y[0]>='A'&&y[0]<='Z')
		{
			y[0]=(char)(y[0]+32);
		}	
		else
		{
			y[0]=(char)(y[0]-32);
		}	
		
		//lenght() : String 형의 길이를 반환
		System.out.println("나의 이름의 길이는 "+mine.length()); //string에 관련한것만 반환??
		System.out.println("너의 이름의 길이는 "+yours.length());
		
		//equals()
		// "LeeYuna" == "LeeYuna" 참값
		// "LeeYuna" == "LeeYuna" (한쪽은 입력받은 값) 거짓값
		// "LeeYuna".equals("LeeYuna") (왼쪽은 입력받은 값) 참값
		String mine1="Lee_유나";
		System.out.println("<mine과 mine1이 동일하다.>는"+(mine==mine1));
		System.out.println("내 이름을 다시 입력해보세요.");
		String mine2=s.next();
		System.out.println("<mine과 mine2는 동일하다.>는 "+(mine==mine2));
		System.out.println("equals() 함수 사용하면?");
		System.out.println("<mine과 mine2는 동일하다.>는 "+(mine.equals(mine2)));
		
		//	do-while()문
		//	for문, while문 -> 특정 조건문을 만족해야만 실행 가능
		//	do-while문 -> 우선 한번은 실행한 뒤 조건이 만족하는지 
		
		int test=0;
		while(test<=5 && test!=0) {
			test++;
			System.out.println(test);
		} //만족하지 못해서실행 자체가 안됨
		do {
			System.out.println(test);
			test++;
		}while(test<=5 && test!=0);
			// 0 1 2 3 4 5 결과가 뜬다.
		
			//switch문 : 학점 계산
		char score=s.next().charAt(0); // A B C D ...
		double number;
		switch(score) {
		case 'A': 	number=4;	break;
		case 'B': 	number=3;	break;
		case 'C': 	number=2;	break;
		case 'D': 	number=1;	break;
		default :	number=0;	break; //위 조건을 모두 만족하지 못하는 F
		}
		System.out.println(test);
		
		
		//2중 반복문
		//별 찍기 : 입력받는 수에 ㄷ따라 규칙적으로 별 출력하기.
		int in=s.nextInt();
		for(int i=0;i<in;i++) { //행출력
			for(int j=0;j<=i;j++) { //열출력 >> 계속 출력
		System.out.print("*");
			}
		System.out.println();
		}
		
		//swap -> 두 개의 변수값을 바꿈.
		int a=3; int b=5;
		System.out.println("swap 하기 전:"+a+" "+b); //3 5
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("swap 하고 난 후: "+a+" "+b); //5 3
	}
}
