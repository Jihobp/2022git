<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 하나의 서블릿으로 연결될 것. 5개나 있지만 서블릿 한개만 만든 것 ㅇㅅㅇ-->
<!-- a*4 -->
<a href="insert.do">insert</a><br />
<a href="update.do">update</a><br />
<a href="delete.do">delete</a><br />
<a href="select.do">select</a><br />
<%=request.getContextPath() %>
<hr />
<a href="http://localhost:8181
<%=request.getContextPath()%>"/test.do">
test.do</a>
<hr />
<a href="<%=request.getContextPath()%>/test.do">test2</a> <%--request.getContextPath()??? ::: context는 문맥이란 뜻, 고로 프로젝트 명임 ㅇㅅㅇ --%>
<hr />
<a href="http://localhost:8181/JelloJSP09/aaa.do">aaa</a>

</body>
</html>