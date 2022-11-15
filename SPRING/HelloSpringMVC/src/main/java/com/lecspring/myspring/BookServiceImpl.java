package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/*6.7. 책 서비스 인터페이스 생성
책 서비스 클래스에서 선언한 BookService 인터페이스를 생성한다. 서비스 인터페이스는 직접 탐색기에서 생성하지 않고 클래스에서 생성하는 방법을 취한다.
서비스 클래스 BookServiceImpl.java 의 BookService 부분에 빨간 줄이 가 있을 것이다. 빨간 줄 위에 마우스를 올린다. 이후 팝업 메뉴가 나오면 create interface 'BookService' 항목을 클릭한다.
 * */
import org.springframework.web.servlet.ModelAndView;

@Service
public class BookServiceImpl implements BookService { //BookService interface > f2눌러서 자동생성. 

	@Autowired
	BookDao bookDao;//객체 자동 생성 및 관리
	
	@Override
	public String create(Map<String, Object> map) {
		int affectRowCount = this.bookDao.insert(map);
		if(affectRowCount==1)
			return map.get("book_id").toString();
		return null;
	}
	
	@Override
	public Map<String,Object> detail
		(Map<String,Object> map) {
		return this.bookDao.selectDetail(map);
	}

	@Override
	public boolean edit(Map<String, Object> map) {
		int afftectRowCount = 
				this.bookDao.update(map);
		//afftectRowCount가 1일 때 true리턴
		//즉 update 성공시 true리턴
		return afftectRowCount==1;
	}
	
	@Override  //remove f2 bookserivce create ㄱㄱㄱ
	public boolean remove(Map<String,Object> map) {
		int affectRowCount
		= this.bookDao.delete(map);
		return affectRowCount==1;
	}
	
	@Override //1. List import 시 주의 사항 : java.awt 아니고
				//2. create list ~~ 
	public List<Map<String,Object>> list
	(Map<String,Object> map){
		return this.bookDao.selectList(map);
				
	}

	@Override
	public int countBookBoard(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}




/*6.6. 책 서비스 클래스 생성
서비스 클래스는 비즈니스 클래스가 위치하는 곳이다. 스프링MVC 구조에서 서비스 클래스는 컨트롤러와 DAO를 연결하는 역할을 한다.
src/main/java 하위 항목 sample.spring.yse 패키지를 우클릭해서 BookServiceImpl 클래스를 만든다.
 * */
 
