package javastudy14_1012;

public class J1012_useEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "�̵���";
		String b="�̵���";
		String c= new String("�躸��");
		String d = new String("�躸��");
		//c�� d�� �����ʹ� ������ �ٸ� ��ġ�� ����Ŵ. �� ���������̶�� ���� ��
		//c�� �뱸�� �躸��, d�� �λ��� �躸�Զ�� ���� �ȴ�.
		//equals�� �̸��� �� ������
		
		Student s1 = new Student("�̵���",340);
		Student s2 = new Student("�̵���", 340);
		
		System.out.println(a==b);//t
		System.out.println(c==d);//f	-> c�� d�� �ٸ� '����' ������. 
		System.out.println(s1==s2);//f
		// == ���� �����ؼ� ����, String equals �� ���ϼ� ������
		
		System.out.println(a.equals(b));	//t
		System.out.println(c.equals(d)); 	//t
		
		//�ٸ��� ������ ������ 
		//s1�� s2�� �ٸ� ���� �����ϱ� �����̱� �����̰�
		//Object Ŭ������ 
		System.out.println(s1.equals(s2)); 	//f
		
		Worker w1 = new Worker("����ȣ", "001");
		Worker w2 = new Worker("����ȣ", "001");
		Worker w3 = new Worker("����ȣ", "002");
		System.out.println(w1.equals(w2));//true
		System.out.println(w2.equals(w3));//false
		
	
	}

}
