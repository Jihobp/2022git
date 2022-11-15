<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.man {color:blue}
.woman{color:hotpink}
</style>
</head>
<body>
<%! String Name, Id, Gender; %>
<%
	Name = (String)session.getAttribute("name"); //세션으로 받옴.
	Id = (String)session.getAttribute("id");
	Gender = (String)session.getAttribute("gender");
%>

<h1 class=<%=Gender %>><%=Name %></h1>
<h1 class=<%=Gender %>><%=Id %></h1>
<h1 class=<%=Gender %>><%=Gender %></h1>
<!-- ------------------------------------------------- -->

</body>
</html>