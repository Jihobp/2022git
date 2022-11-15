package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.Circle;

public class J1005_02_useRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1=new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		//����
		//Ŭ���� ������ �θ�Ŭ������ �ڽ�Ŭ������ �����ؼ� ����.
		//�� static �� ������ �ڽ� Ŭ������ �θ�Ŭ������
		//��𿡼� �ٲٵ��� ���� ���� ������ �޴´�.
		//PI �� Ŭ���� ���� ������
		Circle.setPI(1);
		System.out.println(sp1.getVolume());	//Sphere ���� ���Ⱘ.
		
		//4/3 = 1(int)
		//4/3�� �Ǽ��� ������ 4.0/3 �̳� 4/3.0 �ƴϸ� 4.0/3.0 �� �ؾ��ϸ�
		//4/3 * 2*2*2 = 32/3 = 
		
		Sphere.setPI(0); //Sphere ���� �ٲ�µ� circle���� ���Ⱘ
		System.out.println(c1.getArea());
	
	}

}
