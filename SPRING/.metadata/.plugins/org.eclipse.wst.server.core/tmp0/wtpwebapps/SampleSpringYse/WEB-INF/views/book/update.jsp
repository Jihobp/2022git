<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>8.3 책 수정 화면 뷰 작성</title>
<%-- 8.3. 책 수정 화면 뷰 작성
수정 뷰 화면은 생성 화면을 복사한다. create.jsp 파일에 비해서 title, 'h1' 이름이 "책 생성"에서 "책 수정"으로 변경되었다.
또한 각 입력 항목의 value 항목들이 컨트롤러에서 전달받은 값을 보여주도록 수정되었다.
http://localhost:8081/update?bookId=1-->
<%-- el 표기법 : https://atoz-develop.tistory.com/entry/JSP-EL-%ED%91%9C%ED%98%84%EC%8B%9D-%EB%AC%B8%EB%B2%95%EA%B3%BC-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95
${}
- JSP가 실행될 때 즉시 반영된다. (Immediate evaluation) - 객체 프로퍼티 값을 꺼낼때 주로 사용
#{ }
- 시스템에서 필요하다고 판단될 때 그 값을 사용한다. (Deferred evaluation)
- 사용자 입력값을 객체의 프로퍼티에 담는 용도로 주로 사용
${member.no} 또는 ${member["no"]}--%>
<%-- 9.6 책 수정 화면에서 책 수정 기능으로 보내주는 파라미터는 총 4개다.
하나는 GET 파라미터로 전달되는 bookId다. 
나머지 세개는 <form> 태그를 통해 전달되는 title, category, price다.
스프링은 http 메소드가 GET인지 POST인지 상관하지 않고 @RequestMapping 어노테이션이 있으면 무조건 파라미터를 넣어준다. 
따라서 파라미터 map 안에는 4개 데이터가 다 들어있다. 
map 데이터 예시는 아래와 같다.
{  
"bookId": 1,  
"title": "제목 수정",  
"category": "IT",  
"price", "10000"  
}  --%>
</head>
<body>
	<h1>책 수정</h1>
	<form method="POST">
		<p>
			제목 : <input type="text" name="title" value="${data.title }" />
		</p>
		<p>
			카테고리 : <input type="text" name="category" value="${data.category }" />
		</p>
		<p>
			가격 : <input type="text" name="price" value="${data.price }" />
		</p>
		<p>
			<input type="submit" value="저장" />
	</form>
</body>
</html>

