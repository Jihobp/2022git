<%@page import="mytest.myjava.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="mytest.myjava.Customer"%>
<%@ page import="java.util.Arrays"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%--
1. 취미가 한글로 나오게 하기 (html 파일 수정 하면 안 됨)+ 전공도 한글로 나오게 하기
2. Student 클래스 만들고 그 클래스에 값 담아서 출력(getter setter 만들어야 함) (생성자는 만들지 않기)
3. 2번 이용하되 1번처럼 취미들이 모두 한글로 잘 출력되게 하기
 --%>
	<!-- 변수선언쓰는거 -->
	<%-- <%Timestamp%> 컨트롤 스페이스 하면 위에 import 자동완성 ㅇㅅㅇㅇ --%>
	<%!String name, pw, major, protocol;
	String[] hobbys;%>

	<!-- 저장을 해야..오류....사라짐 -->

	<!-- 1. 함수 돌리기     -->
	<%!public String korMajor(String major) { 	//major
		if(major.equals("eng")){
			return "영어";
		}
		else if(major.equals("math")){
			return "수학";
		}
		else if(major.equals("kor")){
			return "국어";
		}
		else{
			return major;
		}
	}
	
	%>

	<%!public String korHobby(String[] hobbys) {
		String hobby = "";
		for (int i = 0; i < hobbys.length; i++) {
			switch (hobbys[i]) {
			case "":
				hobby += "요리";
				break;
			case "run":
				hobby += "달리기";
				break;
			case "swim":
				hobby += "수영";
				break;
			case "sleep":
				hobby += "잠자기";
				break;
			}
			if (i != hobbys.length - 1) { //마지막 인덱스 아닐떄
				hobby += ",";
			}
		}
		return hobby;
	}%>
	<!-- information.html 에서 값 받은거 입력,  -->
	<%
		request.setCharacterEncoding("UTF-8");
	name = request.getParameter("name");
	pw = request.getParameter("pw");
	major = request.getParameter("major");
	protocol = request.getParameter("protocol");
	hobbys = request.getParameterValues("hobby"); //배열형태로 값줌.
	%>

	<!-- 1-2) 포문 돌리기. html 에서 받은값 입력하는곳 안에서.
	   for(int i=0;i<hobbys.length;i++){
		      if(hobbys[i].equals("swim")){
		         hobbys[i]="수영";
		      }
		      else if(hobbys[i].equals("run")){
		         hobbys[i]="달리기";
		      }
		      else if(hobbys[i].equals("cook")){
		         hobbys[i]="요리";
		      }
		      else {
		         hobbys[i]="잠자기";
		      }
		       -->



	<!-- timestamp 써서 하면  -->

	<!-- 값 받는거 출력 -->
	이름 : <%=name%><br> 
	비번 : <%=pw%><br> 
	전공 : <%=korMajor(major)%><br> 
	규약 : <%=protocol%><br> 
	취미 : <%=korHobby(hobbys)%>

	<hr>
	<!-- new Stu 치고 (f2번, or ctrl space) 하면 import, 문자 자동완성 ㄱㄱ -->
	<%! Student s = new Student(); %>
	<% 
		s.setName(name);
		s.setPw(pw);
		s.setMajor(major);
		s.setProtocol(protocol);
		s.setHobbys(hobbys);
	%>
	이름:<%=s.getName() %><br>
	비번:<%=s.getPw() %><br>
	전공:<%=s.getMajor() %><br>
	프로토콜:<%=s.getProtocol() %><br>
	취미:<%=s.getHobbys() %><br>


</body>
</html>
