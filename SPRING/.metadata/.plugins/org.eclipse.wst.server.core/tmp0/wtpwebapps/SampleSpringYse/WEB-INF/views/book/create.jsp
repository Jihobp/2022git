<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4.4 책 생성 화면 뷰 생성</title>
<!-- 04.02. 책 입력 화면 만들기 - 2
4.4. 책 생성 화면 뷰 생성
책 생성 컨트롤러에서 book/create 경로를 반환했으므로, 실제 화면을 담당하는 뷰 코드를 작성한다. 
최종 경로는 src/main/webapp/WEB-INF/views/book/create.jsp 이다. -->
<%-- el 표기법 : ${https://atoz-develop.tistory.com/entry/JSP-EL-%ED%91%9C%ED%98%84%EC%8B%9D-%EB%AC%B8%EB%B2%95%EA%B3%BC-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95}

- JSP가 실행될 때 즉시 반영된다. (Immediate evaluation)
- 객체 프로퍼티 값을 꺼낼때 주로 사용
#{ }
- 시스템에서 필요하다고 판단될 때 그 값을 사용한다. (Deferred evaluation)
- 사용자 입력값을 객체의 프로퍼티에 담는 용도로 주로 사용
${member.no} 또는 ${member["no"])  --%>
</head>
<body>
	<h1>책 생성하기</h1>
	<form method="POST">
		<p>
			제목 : <input type="text" name="title" />
		</p>
		<p>
			카테고리 : <input type="text" name="category" />
		</p>
		<p>
			가격 : <input type="text" name="price" />
		</p>
		<p>
			<input type="submit" value="저장" />
		</p>
	</form>
	<!-- 뷰는 화면을 담당한다. 웹 어플리케이션에서 화면은 웹 브라우저가 렌더링하므로 브라우저가 읽어서 해석할 수 있는 HTML로 최종 변환될 수 있도록 작성한다.
		 create.jsp 뷰는 제목, 카테고리, 가격을 입력받을 수 있는 형식(form - 폼)을 가진 HTML이다. -->
	<!-- 서버를 클릭하고 ctrl + alt + d를 눌러 디버깅 모드로 시작하거나 ctrl + alt + r을 눌러 서버 모드로 시작한다. 
		 물론 우클릭 후 Debug나 Start를 눌러도 관계없다.
		 http://localhost:8081/create -->
</body>
</html>