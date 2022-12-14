package sample.spring.yse;

import java.util.List;
import java.util.Map;


//인터페이스에 있는 메소드 반드시추가해줌.  /이ㅣㄴ터페이스 메서드를 반드시 구현해야하는 제약이 생긴다. 
//인터페이스 https://interconnection.tistory.com/129

public interface BookService {

	String create(Map<String, Object> map);

	//7.5. 책 상세 서비스 인터페이스 메소드 시그니쳐 생성
	Map<String, Object> detail(Map<String, Object> map);

	//9.5 책 수정 기능 서비스 인터페이스 메소드 시그니처 생성 : 서비스 인터페이스 메소드는 기계적으로 만들면 된다???
	boolean edit(Map<String, Object> map);

	//10.5. 책 삭제 기능 서비스 인터페이스 메소드 시그니쳐 생성 : 서비스 인터페이스 메소드 시그니쳐는 서비스 클래스와 동일하게 맞춘다.
	boolean remove(Map<String, Object> map);

	//11.5. 책 목록 서비스 인터페이스 메소드 시그니쳐 생성
	List<Map<String, Object>> list(Map<String, Object> map);
	
	
}
