package my.hello.javastudy04_1005;
//4. javastudy02에 있는 Circle 클래스를 상속받아서 sphere 클래스 만들기
//5. sphere 클래스에서 getvolume 메소드 추가(부피구하기)
//(4/3)*pi*r^3
//6. Main에서 테스트해보기 
public class Sphere extends Circle {	
	//sr. Sphere에서 오류떴었는데, 여기서 sphere에 마우스 올리고 클릭하면, ㅈ절로 생성자 생성해준다. 
	//private int r; // circle 껄 상속받아서 이미 sphere에도 있다. 
	//셍상지
	public Sphere(int r) {
		super(r);	// sr. Sphere의  입력받은  r값을 가져와서 circle=super의 (r)에다 넣어준당.
					//==Circle(r){
					//this.r=r}
	}

	public double getVolume() {
		return (4.0/3.0)*Sphere.getPI()*this.getR()*this.getR()*this.getR();
		//pi,r은 circle 안에 있는 내용이니까, sphere 안에 이미 갑이 있으나, 
		//접근은 불가능. 간접적으로 가능. ! 그래서 get, set을 쓰는거다. 
		//r의 3제곱 : r= 도 상속받아서 this.getR(); 직접적으로 접근이 안되니까. 
		//double형으로 제대로 하려면 4.0으로 입력받아야함! 
		
		//Math.pow(this.getR(), 3); =>  앞에 있는 값을 뒤에 있는 값만큼 제곱한다. 
	//ㄴ>PI
	}
}
