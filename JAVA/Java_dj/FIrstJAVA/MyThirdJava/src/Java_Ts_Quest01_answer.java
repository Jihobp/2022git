//1. class 선언
class Student{
	//멤버 변수 선언부
	private String name;
	private int number;
	private String gender;
	
	//생성자 선언부 :: 3개의 값을 초기화하도록 함.
	//선언부에 메인에 있는 값이 들어간다.
	public Student(String n,int num, String g) {//이름 학번 성별 입력받음
		this.name=n;
		this.number=num;
		this.gender=g;
	}
	
	// 멤버 함수 선언부//직관적으로 알수있게 초록색 함수 이름 부분 선언함~~
	public String getName()	{return this.name;}
	public int getNum() {return this.number;}
	public String getGender() {return this.gender;}
	public void setName(String n) {this.name=n;}  //아직 저장안받아서 void??
	public void setNum(int num) {this.number=num;} //return 값이 없어서 void.
	public void setGender(String g) {this.gender=g;}
}

public class Java_Ts_Quest01_answer {
	public static void main(String args[]) {
		// 2. 객체 배열 선언
		Student stu[]=new Student[3];
		// 각 배열에 관한 Student 객체를 생성
		stu[0]=new Student("이동준", 2009038033, "남");
		stu[1]=new Student("이제영", 2007012034, "여");
		stu[2]=new Student("박준현", 2002012034, "남");
	
		//4. 이름이 이동준인 학생의 학번을 2019038033으로 변경하시오.
		for(int i=0;i<3;i++) {
		if((stu[i].getName()).equals("이동준")) { //값이 동일한지 확인.
			stu[i].setNum(2019038033);
			}
		}
	
		//5. 2명의 학생 정보 각각 변경
		stu[2].setName("이유나");
		stu[2].setNum(18130956);
		stu[2].setGender("여");
		
		//6. 객체 배열 출력
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 학생");
			System.out.println("이름: "+stu[i].getName());
			System.out.println("학번: "+stu[i].getNum());
			System.out.println("성별: "+stu[i].getGender());
			System.out.println();
		}
	}
}
