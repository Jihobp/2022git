package javastudy08_1007_School;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class J1007_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�߻�Ŭ���� Teacher�δ� �ν��Ͻ� ������� ������
		//Teacher t = new Teacher(); xxx
		Teacher t = new MathTeacher();
		ProgramingTeacher pt =  new ProgramingTeacher();
		MathTeacher mt = new MathTeacher();
		JavaProgramingTeacher jt = new JavaProgramingTeacher("�̵��� ������", "�Ӻ����");
		
		t.Teach();
		pt.Teach();
		mt.Teach();
		jt.Teach();
		
		
		Teacher t2 =  new Teacher() {
			//Teach ctrl + space
			public void Teach() {
				System.out.println("������ ���°� �Բ� ���� ����");
			}
		};
		t2.Teach();
		
		ProgramingTeacher p2 = new ProgramingTeacher() {
			public void Teach() {
				System.out.println(getName()+"C��� ������ �帳�ϴ�.");
			}
		};	//�Լ�?
		
		
		p2.setName("������");
		p2.Teach();
		
		
		
		//arrayList ����Ϸ��� foreach�� for��, ���� �����ϴϱ�.
		ArrayList<Teacher> Teaching = new ArrayList<Teacher>();
		Teaching.add(t);	//ArrayList Teaching �ȿ� add (t)
		Teaching.add(pt);
		Teaching.add(mt);
		
		//Teaching�� �ִ� ������� ��� Teach()�� ȣ���� �� �ִ�.
		//����! Teach�� ���� �� �ٸ��� �����Ǿ� ���.
		
		//�θ�Ŭ //arraylist �迭�ȿ� �ִ� ������ �ε�����. //Teaching�� ArrayList.
		for (Teacher teacher : Teaching) {
			teacher.Teach();
			//�ѹ��� �������� t.Teach, pt.Teach, mt.Teach ����
			
		}
		
		//1. Teacher Ŭ������ �����.(�߻�Ŭ����)
		//String Name
		//String major
		//public void Teach();
		//
		//2. Teacher���� �Ļ��� 2�� �̻��� Ŭ������ �����.
		//ex) ProgramingTeacher, MathTeacher
		//
		//3. 2������ ���� Ŭ���� �� �ϳ��� Ŭ������ Super Ŭ������ �ϴ�
		//���ο� Ŭ������ �����.
		//Ex) ProgramingTeacher�� ����� JavaProgramingTeacher
		//�׸��� Teach �޼ҵ带 �������̵��Ѵ�.
		//
		//4. Main���� �� Ŭ�������� ����� ȣ���غ���.
		//(ArrayList���� ���� ����)
		//
		//5. Teacher �̿��ؼ� ���ο� �͸� Ŭ���� �����, �� Ŭ������
		//Teach �޼ҵ� ȣ���ϱ�
		
	}

}
