<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
		response.sendRedirect("login.html");
	%>
	<!--
	<script>
	location.href = 'login.html'; //main.jsp로 이동하게 만들어줌.
	</script>
	-->
	
</body>
</html>