package javastudy14_1012;

public class J1012_Finally {

	public static void main(String[] args) {
		//Finally:��ħ��
		//try catch ��������
		//catch ���� ���� ���� �ϵ� ���� finally �κ��� 
		//!!!��!!!!!!!@#@!#@!#�����Ѵ�.
		int a=0, b=0, c=0, d=0;
		try {
			a=10;
			c=a/b;	//���ڴ� 0���� ���� �� �����Ƿ� ���⼭ ƨ��.
		} catch (Exception e) {
			System.out.println("�߸���");
			return;	//���α׷� ����
		}finally {	//������ �����ÿ� ���� ����
			//DB �����ϴ� ���������� ������ ���� �� ���ܻ����
			//finally �����ϴ� ���������� ������ ������ ���� �����
			//�׷��� ���� ����� �ٷ� DB���� ������ ���� �� �ֵ��� �Ѵ�.
			//catch�� �ɷ��� �� �κ��� ������!! ������.
			System.out.println("�� �κ� ���� �ȵ� ���� �յ�.");
		}
		System.out.println("���� �ȵʤ� ������ ����社��������");
		
	}

}
