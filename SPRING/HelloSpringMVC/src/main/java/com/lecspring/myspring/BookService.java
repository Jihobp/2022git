package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

//�������̽��� �ִ� �޼ҵ� �ݵ���߰�����.  
//implements bookService �ϼ��񽺸� �����ϰڴ�, �޼ҵ带 ��üȲ.
//public class BookServiceImpl implements BookService , 2��° add unimplemented method.
public interface BookService {
	String create(Map<String, Object> map);

	Map<String, Object> detail(Map<String, Object> map);

	boolean edit(Map<String, Object> map);

	boolean remove(Map<String, Object> map);

	List<Map<String, Object>> list(Map<String, Object> map);
	
	//��ȯ���� int�� �Ű������� map
	int countBookBoard(Map<String, Object>map);
}