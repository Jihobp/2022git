package javastudy09_1007_LOL;

public abstract class Lol {
	//sr.f. Ŭ�������� Lol�� �����Ӱ� ������ �� �ִ� �������� �־�������,
	//������ �ؾ���. ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	private String Name;
	private String Runeterra;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRuneterra() {
		return Runeterra;
	}
	public void setRuneterra(String runeterra) {
		Runeterra = runeterra;
	}
	
	
	//�߻� Ŭ���� �ȿ� �ƹ��͵� ������� �ʾƼ� ���ο��� �ν��Ͻ� ������.
	//�ݵ�� �����ͼ� �Ű����� �־������.
	//Lol ĳ���̶� �߻����� ������ ������ ��üȭ �Ѵ�.
	//-��> �߻��� ���� �� �ȿ�, �ݵ�� �����ؾ� �Ѵ�. !!!!����������!!! �θ�Ŭ���� �� �ڽ�Ŭ��������! 

		//getset�� �����س���, �ٸ� �޼ҵ�� ���� nono.
		//Lol ����� �ֵ��� ��ų QWER �� ����ȭ �ؾ��Ѵ�.
		//QWER ��ü�� �߻�ȭ��,
		//instance��� ��ü���� ��ü�� �� �����. 
	public abstract void Q();
	public abstract void W();
	public abstract void E();
	public abstract void R();
}
