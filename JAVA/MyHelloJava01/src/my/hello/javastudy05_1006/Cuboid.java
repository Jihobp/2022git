package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.Rectangle;
//
//ctrl ������ Rectangle Ŭ��
public class Cuboid extends Rectangle{
	//������ ȣ���ϰ� �Ǹ�
	//super Ű���� �̿��ؼ� ��������� �θ�Ŭ���� ���� ���ص�...
	//�θ� Ŭ���� ������ ȣ����
	public Cuboid() {	//default ������.

		//super(); �̷������� ��������� ���� �ʾƵ�... 
		
	} // super(); ����Ŭ���� ���ڵ尡 �Ϲ������� ��,. 
	
	public int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//������
	public int getCuvoidVolume() {
		return getW()*getH()*z;
	}
}
