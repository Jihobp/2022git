package javastudy15_1012_list_set_map;

import java.util.*;

import javastudy14_1012.KBStudent;

public class J1012_Set_Map {

	public static void main(String[] args) {
		// java 에는 크게 List, set, map 3가지 있다.
		// List 도 ArrayList 말고도 다양한 종류가 있다.
		
		
		//c++에선 벡터가 많이 쓰인당. 아싸리 c스타일로 코딩해서 malloc으로 코디하거나 벡터쓰거나. 
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		
		
		//백준에 풍선터뜨리기??? 

		//map은 면접 문제에 나옴
		//c#의 dictionary, python dict랑 같은ㄱ 것.
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1,"안서준");
		students.put(2, "이동준");
		students.put(1,"박지호"); //키값이 겹치므로 기본값은 없어짐.
		students.put(3,"박지호"); //1번 박지호랑 3번박지호는 다른애.
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		//hash : 각자를 구분하는 고윱값(혹은 고유 코드)
		//전화번호나 주민번호 같은 것들
		//요약
		//Map : 키와 같은 값으로 값을 저장 관리하고, 키값이 중복되면
		//기존 값 삭제됨
		
		
		//Set
		//중복을 허용하지 않는 리스트
		//순서가 없음 ㅇㅅㅇ 먼저 들어간게 나중에  출력 되기도 함!!
		Set<String> workers = new HashSet<String>();
		workers.add("김진규");
		workers.add("김보규");
		workers.add("김진규");
		workers.add("이동준");
		workers.add("이동준");
		System.out.println("--set Test--");
		for (String string : workers) {
			System.out.println(string);
		}
		
		javastudy14_1012.KBStudent k1
		= new KBStudent("이현민", "남성", 30,3);
		javastudy14_1012.KBStudent k2
		= new KBStudent("이현민", "남성", 30,3);
	
		//set 중복된 값 ㄴㄴㄴ
		//equals 로 찍으면 같다고 나옴.밑에 찍어보깅
		System.out.println(k1.equals(k2));//번호를 기준으로 비교하면 같음.
		
		Set<KBStudent> kbStudents = new HashSet<KBStudent>();
		kbStudents.add(k1);	//중복된 값을 집어넣고 있다,
		kbStudents.add(k2); //
		for (KBStudent kbStudent : kbStudents) {
			System.out.println(kbStudent);
		}
	}

}
