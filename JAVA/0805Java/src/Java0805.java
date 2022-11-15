import java.util.Scanner;

public class Java0805 {
	public static void main(String[] args) {
		//저번 수업 review
		
		//출력문: print(), println(), printf()
		//printf() 언급X
		System.out.print("print(): 나는 줄바꿈을 하지 못해요.");
		System.out.println(); //줄바꿈만 함
		System.out.println("println(): 나는 줄바꿈을 자동으로 할 수 있어요");
		
		int year=2022;
		// C언어 출력문
		// printf("지금은 %d년입니다.\n", year);
		// 지금은 2022년입니다. (줄바꿈)
		System.out.println("지금은 "+year+"년입니다.");
		// 출력문에서 +는 문장 붙이기 용도
		
		System.out.println();
		
		// 입력문
		// Scanner 변수 선언
		// System.in :: 사용자에게 입력을 요청
		// Scanner :: 입력받은 값을 읽어서 시스템에게 전달
		Scanner s=new Scanner(System.in);
		
		// 주요 입력문
		// 정보를 입력받아서 프로필을 출력하기
		String name=s.next();
		int age=s.nextInt();
		boolean gender=s.nextBoolean();	//true:남자, false:여자
		double height=s.nextDouble();
		char blood=s.next().charAt(0);
		s.nextLine();
		String mood=s.nextLine();
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		if(gender==true) {System.out.println("성별: 남자");}
		else {System.out.println("성별: 여자");}
		System.out.println("키: "+height);
		System.out.println("혈액형: "+blood);
		System.out.println("지금 내 상태: "+mood);
		
		//bool형 소개
		boolean result=(1+2!=3);	//true와 false
				// result==false
		if(result==true) {System.out.println("옳은 식입니다.");}
		
		System.out.println();
		
		// 배열 :: 정적할당, 동적할당
		// C언어는 문법이 따로였지만, Java는 문법이 비슷
		int arr1[]=new int [5];	// 크기가 5인 배열 선언 (정적 할당)
		int num=5;
		int arr2[]=new int [num];	// 동적 배열
		
		
		// 문자열 String 소개
		// 두 사람 이름 입력: 내 이름이랑 옆 사람 이름
		String mine="Lee_유나";
		String yours="Lee_유나";
		System.out.println("나의 이름: "+mine);
		System.out.println("너의 이름: "+mine);
		// 첫 글자 비교 :: charAt() 사용
		if(mine.charAt(0)==yours.charAt(0)) {
			//mine.charAt(0)='L'
			//yours.charAt(0)='L'
			System.out.println("첫 글자가 똑같습니다.");
		}
		else {
			System.out.println("첫 글자가 다릅니다.");
		}
		// charAt() 함수 통해서 값 참조는 가능하지만 값 변경은 안됌
		
		// toCharArray() : String 타입을 char형 배열로 변환
		// 첫번째 문자 대문자->소문자로, 소문자->대문자로
		char m[]=mine.toCharArray();
		char y[]=yours.toCharArray();
		if(m[0]>='A'&&m[0]<='Z') {
			m[0]=(char)(m[0]+32);
		}else {
			m[0]=(char)(m[0]-32);
		}
		if(y[0]>='A'&&y[0]<='Z') {
			y[0]=(char)(y[0]+32);
		}else {
			y[0]=(char)(y[0]-32);
		}
		
		// length() : String형의 길이를 반환
		System.out.println("나의 이름의 길이는 "+mine.length());
		System.out.println("너의 이름의 길이는 "+yours.length());
		
		// equals()
		// "LeeYuna" == "LeeYuna" 참값
		// "LeeYuna" == "LeeYuna" (한쪽은 입력받은 값) 거짓값
		// "LeeYuna".equals("LeeYuna") (왼쪽은 입력받은 값) 참값
		String mine1="Lee_유나";
		System.out.println("<mine과 mine1은 동일하다.>는 "+(mine==mine1));
		System.out.println("내 이름을 다시 입력해보세요.");
		String mine2=s.next();
		System.out.println("<mine과 mine2는 동일하다.>는 "+(mine==mine2));
		System.out.println("equals() 함수 사용하면?");
		System.out.println("<mine과 mine2는 동일하다.>는 "+(mine.equals(mine2)));
		
		System.out.println();
		
		// do-while()문
		// for문, while문 -> 특정 조건문을 만족해야만 실행 가능
		// do-while문 -> 우선 한번은 실행한 뒤 조건이 만족하는지 확인
		int test=0;
		while(test<=5 && test!=0) {
			System.out.println(test);
			test++;
		}	// 실행 자체가 안됌
		do {
			System.out.println(test);
			test++;
		}while(test<=5 && test!=0);
		// 0 1 2 3 4 5 결과가 뜬다.
		
		System.out.println();
		
		// switch문 : 학점 계산
		char score=s.next().charAt(0);	// A B C D ...
		double number;
		switch(score) {
		case 'A':	number=4;	break;
		case 'B':	number=3;	break;
		case 'C':	number=2;	break;
		case 'D':	number=1;	break;
		default:	number=0;	break;	// 위 조건을 모두 만족하지 못하는 F
		}
		System.out.println(number);
		
		System.out.println();
		
		
		// 2중 반복문
		// 별 찍기: 입력받는 수에 따라 규칙적으로 별 출력하기
		int in=s.nextInt();
		for(int i=0;i<in;i++) {		// 행 출력
			for(int j=0;j<=i;j++) {		// 열 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// swap -> 두 개의 변수값을 바꿈
		int a=3;	int b=5;
		System.out.println("swap 하기 전: "+a+" "+b);  //3 5
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("swap 하고 난 후: "+a+" "+b);	//5 3
	}
}
