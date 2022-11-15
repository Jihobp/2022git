<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.daodto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.javalec.daodto.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! MemberDAO memberDAO = new MemberDAO(); %>

<table border=1>
<tr>
<th>이름</th>
<th>아이디</th> 
<th>비밀번호</th>
<th>성별</th>
</tr>

<%
	//dto - 테이블 리스트, dao-쿼리문,db.
List<MemberDTO> mList = memberDAO.printMember(); //멤버 셀렉트를 통ㅎㅐ 멤버dto 테이블 리스트를 가져온당.  그래서 memberdao에있는 데이터를 출력해줌.
for(int i = 0; i < mList.size(); i++) { 
MemberDTO m = mList.get(i);
//out.println("이름 : "+ mlist.get(i).getName() + "<br>");
//out.println("아이디 : "+ mlist.get(i).getId() + "<br>");
//out.println("성별 : "+ mlist.get(i).getGender() + "<br>");

%>
<tr>
<td><%=m.getName() %></td>
<td><%=m.getId() %></td>
<td><%=m.getPw() %></td>
<td><%=m.getGender() %></td>
</tr>
<%}%>

<%--talbe은 각각 셀로 만드는데, header cell과  standard cell로 나누어집니당.
 <th> 를 header cell, 나머지를 standard cell로 부름다.
 <th>내용</th> table head의 약자로, 표의 제목을 쓰는 역할.(기본값은 굵은 글씨체에 중앙정렬)
 <tr>내용</tr> table row의 약자로, 가로줄을 만드는 역할. (기본값은 보통 글씨체에, 왼쪽 정렬)
 <td>내용</td> talbe data의 약자로, 셀을 만드는 역할.(기본값은 보통 글씨체에, 왼쪽 정렬)
 --%>
 
<!-- 선생님꺼 -->
<%
	MemberDAO memberDAO = new MemberDAO();
	ArrayList<MemberDTO> list = memberDAO.memberSelect();
	for(int i =0; i<list.size(); i++) {
		out.println("이름 : " + list.get(i).getName() + "<br>");
		out.println("아이디 : " + list.get(i).getId() + "<br>");
		out.println("성별 : " + list.get(i).getGender() + "<br>");
		
	}

%>

<table border="1">
	<tr>
		<th>이름</th>
		<th>아이디</th>
		<th>성별</th>
	</tr>
	<%for(int i =0; i<list.size(); i++) { %>
		<tr>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getGender() %></td>
		</tr>
	<% } %>
</table>
</body>
</html>

<%--  
<%@page import="com.javalec.daodto.MemberDTO"%>
<%@page import="com.javalec.daodto.MemberDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% MemberDAO member = new MemberDAO();  %>
	
<table border=1>
<tr>
	<td>이름</td>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>성별</td>
</tr>
<%
	List<MemberDTO> mList = member.printMember();
	for(int i=0; i< mList.size(); i++){
	MemberDTO m = mList.get(i);
%>
<tr>
		<td><%=m.getName() %></td>
		<td><%=m.getId() %></td>
		<td><%=m.getPw() %></td>
		<td><%=m.getGender() %></td>
</tr>
<%}%>
</table>
</body>
</html>


 --%>
