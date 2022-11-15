<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {
	color: red;
	background: black
}
</style>
</head>
<body>
<%! String Id; %>
<%
Id = (String)session.getAttribute("id");
if(Id!=null)
	out.println(Id+"의 비밀번호가 틀렸습니다.:(");
	else
		out.println("존재하지 않는 아이디" + 
		(String)session.getAttribute("tryid"));


%>
	<%--
		String str = (String)session.getAttribute("id");
		out.println("<h1>" + str + "로그인에 실패했습니다..</h1>");
	--%>
</body>
</html>