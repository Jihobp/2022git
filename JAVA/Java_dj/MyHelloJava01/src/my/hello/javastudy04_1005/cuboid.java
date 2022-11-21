package my.hello.javastudy04_1005;
//7 javastudy01에 있는 Rectangle 클래스를 상속 받아서 cuboid(직육면체) 클래스 만들기
//- z 속성 추가
//- getCuvoidVolumn 추가(w*h*z)
//8. Main에서 테스트해보기
public class cuboid extends Rectangle {
	private int z;
	
	public int getCuvioVolumn() {
		return this.getW()*this.getH()*this.z;
	}
}
