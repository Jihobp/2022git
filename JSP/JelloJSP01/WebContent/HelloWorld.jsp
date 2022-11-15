<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%out.println("<h1>Hello</h1>");
System.out.println("세룡이 메롱"); %>
<script type="text/javascript">
	let h1tag = document.createElement("h1")
	h1tag.textContent = "안녕"
	document.body.appendChild(h1tag)
	//jsp랑 js랑 다른점 ㅇㅅㅇ 퍼센트 안에 쓰면 가려져서 안보인다. 
	
	
	
</script>
</body>
</html>