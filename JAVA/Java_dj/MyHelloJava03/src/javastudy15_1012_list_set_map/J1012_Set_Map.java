package javastudy15_1012_list_set_map;

import java.util.*;

import javastudy14_1012.KBStudent;

public class J1012_Set_Map {

	public static void main(String[] args) {
		// java ���� ũ�� List, set, map 3���� �ִ�.
		// List �� ArrayList ���� �پ��� ������ �ִ�.
		
		
		//c++���� ���Ͱ� ���� ���δ�. �ƽθ� c��Ÿ�Ϸ� �ڵ��ؼ� malloc���� �ڵ��ϰų� ���;��ų�. 
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		
		
		//���ؿ� ǳ���Ͷ߸���??? 

		//map�� ���� ������ ����
		//c#�� dictionary, python dict�� ������ ��.
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1,"�ȼ���");
		students.put(2, "�̵���");
		students.put(1,"����ȣ"); //Ű���� ��ġ�Ƿ� �⺻���� ������.
		students.put(3,"����ȣ"); //1�� ����ȣ�� 3������ȣ�� �ٸ���.
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		//hash : ���ڸ� �����ϴ� ������(Ȥ�� ���� �ڵ�)
		//��ȭ��ȣ�� �ֹι�ȣ ���� �͵�
		//���
		//Map : Ű�� ���� ������ ���� ���� �����ϰ�, Ű���� �ߺ��Ǹ�
		//���� �� ������
		
		
		//Set
		//�ߺ��� ������� �ʴ� ����Ʈ
		//������ ���� ������ ���� ���� ���߿�  ��� �Ǳ⵵ ��!!
		Set<String> workers = new HashSet<String>();
		workers.add("������");
		workers.add("�躸��");
		workers.add("������");
		workers.add("�̵���");
		workers.add("�̵���");
		System.out.println("--set Test--");
		for (String string : workers) {
			System.out.println(string);
		}
		
		javastudy14_1012.KBStudent k1
		= new KBStudent("������", "����", 30,3);
		javastudy14_1012.KBStudent k2
		= new KBStudent("������", "����", 30,3);
	
		//set �ߺ��� �� ������
		//equals �� ������ ���ٰ� ����.�ؿ� ����
		System.out.println(k1.equals(k2));//��ȣ�� �������� ���ϸ� ����.
		
		Set<KBStudent> kbStudents = new HashSet<KBStudent>();
		kbStudents.add(k1);	//�ߺ��� ���� ����ְ� �ִ�,
		kbStudents.add(k2); //
		for (KBStudent kbStudent : kbStudents) {
			System.out.println(kbStudent);
		}
	}

}
