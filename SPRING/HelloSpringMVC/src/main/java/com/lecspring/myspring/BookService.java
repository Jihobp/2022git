package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

//인터페이스에 있는 메소드 반드시추가해줌.  
//implements bookService 북서비스를 구현하겠다, 메소드를 구체황.
//public class BookServiceImpl implements BookService , 2번째 add unimplemented method.
public interface BookService {
	String create(Map<String, Object> map);

	Map<String, Object> detail(Map<String, Object> map);

	boolean edit(Map<String, Object> map);

	boolean remove(Map<String, Object> map);

	List<Map<String, Object>> list(Map<String, Object> map);
	
	//반환형이 int고 매개변수가 map
	int countBookBoard(Map<String, Object>map);
}
