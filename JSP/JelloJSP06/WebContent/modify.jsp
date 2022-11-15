<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인 한 상태에서 해당정보띄움. -->
<!-- db에서 값을 읽어올 것. id를 통해서 조회할 것. -->
<!-- modifyOk에서 update를 할것 -->
<!-- modifyResult.jsp에서 결과 확인할 것. -->

<%! String strName, strID, strGender; %><!-- 변수선언 ..ㄷ -->
<% strName = (String)session.getAttribute("name");
	strID = (String)session.getAttribute("id");
	strGender = (String)session.getAttribute("gender");
%>

<form action="ModifyOk" method="post">

<%-- readonly : input태그 수정 불가능 --%>			
<%-- 참고사항 : disabled를 추가하면 비활성화됨. 근데 파라메터로 전송이 안 됨
이 경우엔 readonly만 추가해주면 됨 --%>	
	이름 : <input type="text" name="name"  
				value=<%=strName %> /> <br />
		ID : <%=strID %> <br />
		<br />
		성별구분 : 
		<%if(strGender.equals("man")) { %>
			<input type="radio" name="gender" value="man" checked/>남
			<input type="radio" name="gender"value="woman" />여
		<%} else { %>
			<input type="radio" name="gender" value="man" />남
			<input type="radio" name="gender"value="woman" checked/>여
		<%} %>
		
		<input type="submit" value="정보수정" /><br />
		<input type="reset" value="취소"/>

<%-- --%>
		<form action="" method="post" name="myForm">
			<table align="center" cellpadding="0" cellspacing="0">
				<tr height="2">
					<td colspan="2" bgcolor="#cccccc"></td>
				</tr>
				<tr height="30">
					<td colspan="2" align="center"><b>비밀번호를 변경하려면<br>아이디와 이름을 입력하세요.</b></td>
				</tr>
				<tr height="2">
					<td colspan="2" bgcolor="#cccccc"></td>
				</tr>

				<tr height="25">
					<td width="80" bgcolor="#e6e4e6" align="center">아이디</td>
					<td width="120" style="padding-left: 5px;"><input type="text"
						name="userId" style="width: 150px; height: 20px;" maxlength="10"
						size="15"></td>
				</tr>
				<tr height="25">

					<td width="80" bgcolor="#e6e4e6" align="center">이름</td>

					<td width="120" style="padding-left: 5px;"><input type="text"
						name="userTel" placeholder="XXX"
						style="width: 150px; height: 20px;" maxlength="13" size="15">

					</td>

				</tr>
				<tr height="2">
					<td colspan="2" bgcolor="#cccccc"></td>
				</tr>

				<tr height="30">

					<td colspan="2" align="center"><input type="button" value="확인"
						class="btn2" onclick="search();"> <input type="button" value="취소"
						class="btn2"
						onclick="javascript:location.href='<%=strID%>/join/login.html';">
					</td>
				</tr>
				<tr height="30">

					<td colspan="2" align="center"><font color="red"><b>${message }</b></font>

					</td>

				</tr>

			</table>

		</form>

	</form>
</body>
</html>