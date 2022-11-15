<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String id,pw; %>
<% 
id=request.getParameter("id");
pw=request.getParameter("pw");
//id는 aaa pw는 1234라고 가정
if(id.equals("aaa")&& pw.equals("1234")){	//RS. 쿠키값이 없으니까 NULL값은 없습니다.라고 뜸. 안댐.
	//														
	Cookie cookie = new Cookie("id",id); //"id"키, id는 value
	cookie.setMaxAge(60);//쿠키 보관시간 1분이라고 지정
	response.addCookie(cookie); //addCookie는 쿠키에 실어서 보낸다. 
	response.sendRedirect("welcome.jsp");	//welcome.jsp에 보낸다!! 
}
else{
	//로그인실패시
	response.sendRedirect("Login.html");
}
//쿠키는 클라이언트단에 저장, 세션은 서버단에 저장.(서버에서만 접근 가능, 보안굿,저장용량굿,)
%>
</body>
</html>