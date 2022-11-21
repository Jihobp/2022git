package my.hello.javastudy04_1005;

public class KBStudent extends Student {
//2. Student 클래스를 상속받아서 KBStudent를 만들기
//	- gender
//	- education 추가
//	- attend 메소드 추가(출석하기) 
//		{ 이름 나이 성별 학력 출력 하고 입실퇴실 출력 }
	
	private String gender;
	private String education;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public void attend() {
		System.out.println(this.getName()+this.getAge()+gender+education);
		
	
	}
}
