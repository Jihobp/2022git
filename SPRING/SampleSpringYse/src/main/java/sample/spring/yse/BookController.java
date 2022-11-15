package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * 4.1. 책 입력 화면 개요
책 정보를 입력하기 위한 화면을 만든다. 브라우저에서 /create 주소에 접속하면 책 정보를 입력할 수 있는 화면을 보여준다.
4.2. 책 컨트롤러 클래스 생성
브라우저를 비롯한 클라이언트(client)의 요청(request)을 받아서 응답(response)을 만들어내는 컨트롤러(controller) 클래스를 만든다.
참고로 @Controller 네임스페이스는 아래와 같다.

*/

//f2누르고 두번째 changeto controller
@Controller
public class BookController{
	
	/*6.10. 책 입력 기능 컨트롤러 서비스 빈 추가
	책 입력 기능 서비스를 호출하기 위해 서비스 빈을 추가한다. 클래스 선언 public class BookController { 바로 아래에 추가하면 된다.src/main/java/sample/spring/yse/BookController.java
	@Autowired
	BookService bookService;
	서비스를 호출하기 위해 BookService를 의존성을 주입한다. 이 때 BookService 인터페이스가 사용되었음을 주의하자.
	*/
	@Autowired
	BookService bookService;
	
//	4.3. 책 생성 화면 컨트롤러 메소드 작성
//	브라우저 주소가 /create일 때 실행되는 자바 컨트롤러 메소드를 작성한다. 
//	아래 코드를 BookController 클래스에 추가한다.
//	create 메소드는 브라우저에서 /create 주소가 GET방식으로 입력되었을 때 book/create 경로의 뷰를 보여준다.
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
	    return new ModelAndView("book/create");
	}
	
	//6.11. 책 입력 기능 컨트롤러 메소드 추가 :서비스를 이용해 책을 입력하는 컨트롤러 메소드를 만든다.
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    String bookId = this.bookService.create(map);
	    if (bookId == null) {
	        mav.setViewName("redirect:/create");
	    }else {
	        mav.setViewName("redirect:/detail?bookId=" + bookId);	
	    }		

	    return mav;
	}
	//브라우저에서 http://localhost:8081/create 에 접속해 실제로 데이터를 입력해 본다. 생성화면 확인 1
	//아직 상세 페이지는 만들지 않았기 때문에 데이터가 입력되더라도 브라우저에서는 http 404 not found 오류가 난다. 정상이다.
	//데이터 입력이 성공했는지 DBMS에서 확인해 본다. HeidiSQL에서 book 테이블을 열고 데이터 탭을 클릭해 입력한 데이터를 확인한다.
	
	//	7.7. 책 상세 컨트롤러 메소드 추가
	//	책 상세 URL이 입력되면 실행되는 메소드를 작성하자.
	//@RequestParam 어노테이션에 의해 쿼리 스트링 파라미터를 읽을 수 있다. 스프링은 http 메소드를 구분하지 않고 파라미터를 GET, POST 동일한 방법으로 읽을 수 있게 한다.
	// !!!!!!!!!!!!!!!!@#@!#!@#!!#!#@!bookId 통일 하세요!!!!!!!!!!!!!!!!!!!@#!@!#@#!@#!@!#
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap); //Add an attribute to the model.Parameters:attributeName name of the object to add to the model (never null)attributeValue object to add to the model (can be null)
//		System.out.println(detailMap);
//		System.out.println(map);
//		System.out.println(mav);
		String bookId = map.get("bookId").toString(); //공식..
		mav.addObject("bookId", bookId);
		mav.setViewName("/book/detail"); //Set a view name for this ModelAndView, to be resolved by theDispatcherServlet via a ViewResolver. Will override anypre-existing view name or View.Parameters:viewName 
		return mav;
	}
	
	//8.2. 책 수정 화면 컨트롤러 메소드 추가
	//책 수정 화면은 책 입력 화면 + 책 상세 화면이다. 책 입력 화면의 화면 형식을 그대로 따라가지만 데이터베이스에 저장된 데이터만 그려주면 된다.
	//따라서 책 데이터는 상세 화면 서비스에서 가지고 오고, 뷰는 책 임력 화면을 복사한다.

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String, Object> map) {
		Map<String, Object> detailMap = this.bookService.detail(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap); //parameter, object
		mav.setViewName("/book/update");
		return mav;
	}
	
	//9.6. 책 수정 기능 컨트롤러 메소드 추가 //책 수정 화면에서 책 수정 기능으로 보내주는 파라미터는 총 4개다.하나는 GET 파라미터로 전달되는 bookId다.
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    boolean isUpdateSuccess = this.bookService.edit(map);		
	    if (isUpdateSuccess) { //정상적으로 데이터가 갱신되었을 경우 확인을 위해 상세 페이지로 이동하면 된다.	
	        String bookId = map.get("bookId").toString();
	        mav.setViewName("redirect:/detail?bookId=" + bookId);
	    }else {					//만약 갱신이 안 되었을 경우 GET 메소드로 리다이렉트하는 방법도 있겠지만, 갱신 화면을 바로 다시 보여줄 수도 있다.
	        mav = this.update(map);
	    }		

	    return mav;
	}
	
	
	//10.6. 책 삭제 기능 컨트롤러 메소드 추가
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView deletePost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    boolean isDeleteSuccess = this.bookService.remove(map);	 //삭제가 성공했는지 확인한다.	
	    if (isDeleteSuccess) {	 //삭제가 성공했으면 상세 페이지가 없으므로 목록으로 리다이렉트한다.
	        mav.setViewName("redirect:/list");
	    }else {					//삭제가 실패했으면 다시 상세 페이지로 이동한다.
	        String bookId = map.get("bookId").toString();
	        mav.setViewName("redirect:/detail?bookId=" + bookId);
	    }
	    return mav;
	}
	/*목록 페이지로 전환되는 것을 확인한다. 아직 책 목록 페이지를 만들지 않았으므로 404 오류가 나는 것이 정상이다.
삭제 후 목록으로 전환
주소창을 보면 http://localhost:8080/list로 바뀌었음을 확인할 수 있다.
개발자 도구 network 탭에서 delete 항목을 선택해 보자. 상세보기 가장 아래에 보면 Form data 섹션이 보이고 bookId: 1이 보인다. 바로 http POST 파라미터다.
POST 파라미터 확인
이처럼 브라우저에서 서버로 전달한 파라미터는 브라우저를 통해 확인할 수 있다.
	 * */
	
	//11.6 책 목록 컨트롤러 메소드 추가
	//@RequestMapping(value = "list")
//	public ModelAndView list(@RequestParam Map<String, Object> map) {
//		//책 목록을 데이터베이스에서 가지고 온다.
//		List<Map<String, Object>> list = this.bookService.list(map);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("data", list);	//데이터를 뷰에 전달할 수 있게 mav 객체에 넣는다.
//		mav.setViewName("/book/list"); ///book/list 뷰를 리턴한다.
//		return mav;
//	}
	
	
	//11.6 책 목록 컨트롤러 메소드 추가
	//	12.4 책 검색 컨트롤러 메소드 추가
	//컨트롤러에 검색 파라미터를 처리하는 부분을 추가한다. 키워드 파라미터가 있다면 뷰의 검색 상자에 보여지게 할 것이다. 
	//list 메소드에서 뷰로 키워드 데이터를 전달하는 부분을 수정한다.

	@RequestMapping(value = "list")
	public ModelAndView list(@RequestParam Map<String, Object> map) {
		//책 목록을 데이터베이스에서 가지고 온다.
	    List<Map<String, Object>> list = this.bookService.list(map);
	    
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("data", list);	//데이터를 뷰에 전달할 수 있게 mav 객체에 넣는다.	
	    
	    if (map.containsKey("keyword")) {//목록 페이지에는 keyword HTTP 파라미터가 있을 수도 있고,
	        mav.addObject("keyword", map.get("keyword"));//파라미터가 있다면 뷰에 keyword를 전달한다.
	    }
	    
	    mav.setViewName("/book/list"); ///book/list 뷰를 리턴한다.
	    return mav;
	}
	
}
