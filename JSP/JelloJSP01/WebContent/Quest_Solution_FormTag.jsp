<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="HiWorld">
	<input type="text" name="hi">
	<input type="submit" value="전송">
</form>
<form action="ByeWorld">
	<input type="text" name="bye">
	<input type="submit" value="전송">
	</form>
<%out.println("안녕안녕 세상 바이바이 세상"); %>
<%-- jsp용 주석, html용 주석이랑은 다르게 클라이언트 단에서 안보임 -->
<!-- method를 생략하거나 method="get"이라고 하면 주소창에 name 값이 보인다. -->
<%--하지만 method="post"라고 적으면 name 값이 안보임. --%>
<form action="HiWorld" method="post">
	<input type="text" name="hi">
	<input type="submit" value="전송">
</form>
<form action="ByeWorld" method="post">
	<input type="text" name="bye">
	<input type="submit" value="전
	송">
</form>
<%out.println("안녕안녕 세상 바이바이 세상"); %>

<!-- 1. 2개의 서블릿을 만든다.
HiWorld - 안녕 출력
ByeWorld - 잘가 출력

2. jsp를 만든다.
2개의 폼 태그를 만든다.
하나는 HiWorld로 이동하고
하나는 ByeWorld로 이동하게 한다.
 -->


</body>
</html>