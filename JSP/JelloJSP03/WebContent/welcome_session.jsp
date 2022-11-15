<%@page import="java.util.Enumeration"%>
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
//Enumeration : ArrayList랑 유사한 것.
//객체를 순서대로 넣고, 한번에 하나씩 순차적으로 처리할 수 있는 것.

Enumeration enumeration = session.getAttributeNames();
//enumeration 에 있는 모든 걸 다 보여줌
//enumeration 에 있는 것 : session 에 있는 것
while(enumeration.hasMoreElements()){
	//sNmae 키
	String sName = enumeration.nextElement().toString();
	//sValue 실제 값.
	String sValue = (String)session.getAttribute(sName);
	if(sValue.equals("bbb"));
	out.println("bbb 안녕");
}
%>
<a href="logout_session.jsp">로그아웃</a>
<a href="session_test.jsp">세션테스트페이지</a>

<% //세션 삭제 - jsp 코드
	Enumeration enu = session.getAttributeNames();
	while(enu.hasMoreElements()){
		String sName = enu.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		System.out.println(sName);
		System.out.println(sValue);
		if(sValue.equals("bbb"))
			session.removeAttribute(sName); //id지워버림 ㅇㅅㅇ
	}
%>

</body>
</html>