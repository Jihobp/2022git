package javastudy06_1007;

public class J1007_HwaianPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f =new Food("민트초코케익", 15000);
		Food f2 = new Pizza("고든램지표 피자",50000);
		Pizza f3 = new Pizza("고수 하와이안 피스타치오 민트초코 브로콜리 불닭 피자", 100000);
		
		f.eat();
		f2.eat();
		f3.eat();
	}

}
