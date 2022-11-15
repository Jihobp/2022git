
import java.util.Scanner;
public class HelloWorld_java2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		//int n;
		//scanf("%d", &n);
		
		//입력문 종류 - 한 문장에 하나씩 입력받기.
		int n=s.nextInt();//int를 갖고와서??  		//int형 입력문	
		short sh_short=s.nextShort(); 			//short형 입력문
		float f_float=s.nextFloat();			//float형 입력문
		double d_double=s.nextDouble();		//double형 입력문\\\
		
		//입력문 종류(문자)
		char c_char=s.next().charAt(0); 		//char형 입력문 //charAt(0)=하나만 받는걸 명시하기 위한 것.
		String s_st=s.next();					//string형 입력문 (공백 포함x 입력문)
		String s_str=s.nextLine(); 				//string형 입력문 (공백 포함o 입력문)
		
		//()Seed. What is java?  '0'
		//()Root. java tutorial & java pdf -_-
		//()Branch. java shortcut 'ㅁ'
		//(). 
	}
}
