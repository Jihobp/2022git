package sample.spring.yse;

import java.util.List;
import java.util.Map;


//�������̽��� �ִ� �޼ҵ� �ݵ���߰�����.  /�̤Ӥ������̽� �޼��带 �ݵ�� �����ؾ��ϴ� ������ �����. 
//�������̽� https://interconnection.tistory.com/129

public interface BookService {

	String create(Map<String, Object> map);

	//7.5. å �� ���� �������̽� �޼ҵ� �ñ״��� ����
	Map<String, Object> detail(Map<String, Object> map);

	//9.5 å ���� ��� ���� �������̽� �޼ҵ� �ñ״�ó ���� : ���� �������̽� �޼ҵ�� ��������� ����� �ȴ�???
	boolean edit(Map<String, Object> map);

	//10.5. å ���� ��� ���� �������̽� �޼ҵ� �ñ״��� ���� : ���� �������̽� �޼ҵ� �ñ״��Ĵ� ���� Ŭ������ �����ϰ� �����.
	boolean remove(Map<String, Object> map);

	//11.5. å ��� ���� �������̽� �޼ҵ� �ñ״��� ����
	List<Map<String, Object>> list(Map<String, Object> map);
	
	
}
