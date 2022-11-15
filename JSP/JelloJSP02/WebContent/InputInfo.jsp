<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CheckInfo"><!-- checkinfo 라는 서블릿에 넘겨준당. -->
		<label for="name">이름:</label>
		<input type="text" id="name" name="name"><br> <!-- type으로 스타일 변경을 할 수 있어서 type="text"추가 -->
		<label for="age">나이:</label>
		<input type="text" id="age" name="age"><br>
		<label for="id">ID:</label>
		<input type="text" id="id" name="id"><br>
		<input type="submit" value="정보제출">
	</form>
	
	<!-- 웹페이지 출력창에서 실행 ㅇㅅㅇ 
	1014----------------------------------------------------------
1. Customer 클래스를 만든다. >🤍Customer.java
이름(String), 나이(int), ID(String)

2. 이름, 나이, ID를 입력하는 form 페이지(jsp) 만든다.
	🤍InputInfo jsp에서  
	🤍Checkinfo servlet으로 넘어간다. 
3. 서블릿을 만든다.
이름, 나이, ID에 따라서 다른 출력을 한다.

1) error page 404와 500 에러에 대한 예외처리 추가하기
🤍error jsp 만들고 >>>> web xml 에서 error 코드 
2) id가 admin인 경우 관리자용 jsp 페이지 하나 띄우기(페이지 형식은 자유)
💥RequestDispatcher 써야함
3) 그외의 경우라면 이름/나이/ID를 띄우되, 나이에 따라서 둘 중 하나의 페이지띄움
	1) 나이가 20 미만이라면 귀여운 그림있는 페이지
	2) 나이가 20 넘어가면 술이나 담배 그려진 그림있는 페이지

	
	
	
	 -->
</body>
</html>