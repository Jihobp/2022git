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
	session.invalidate(); //여기 접속한 회원이 이 세션을 빼앗기도록 만들어서, 로그아웃 시켜줌.
%>
<script>
	location.href = 'main.jsp'; //main.jsp로 이동하게 만들어줌.
</script>
</body>
</html>