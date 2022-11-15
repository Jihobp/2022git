<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %> <!-- 우리가 만든 클래스 사용해야해서 페이지 임포트, user페키지에 userdao를 불러오게함, -->
<%@ page import="java.io.PrintWriter" %> <!-- 자바스크립트 문장 작성하기 위해 사용. -->
<% request.setCharacterEncoding("utf-8"); %> <!-- 건너오는 데이터를 utf-8로 -->
<!-- 자바빈즈활용, 한명의 회원정보 담는 유저 클래스를 자바빈즈로 사용, -->
<jsp:useBean id="user" class="user.User" scope="page"/> <!--jsp에서 자바빈즈를 사용한다, user라는 아이디만들고, class에 user.User클래스 넣고, 스코프하고 page넣음으로 현재 페이지 안에서만 빈즈가 사용될 수 있게 함 -->
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" /><!-- 이페이지안에 넘어온 userID랑 Password가 그대로 담김. -->
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userGender" />
<jsp:setProperty name="user" property="userEmail" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--<meta name="viewport" content="width=device-width", initial-scale="1">-->
<title>6강. 회원가입 기능구현</title>
</head>
<body>
	<%
	//로그인한 유저는 회원가입 못하게- session 이용
	String userID = null;
	if(session.getAttribute("userID") !=null){ //세션을 확인해서 userID 이름으로 세션이 존재하는 회원은.
		userID = (String) session.getAttribute("userID"); //해당세션 값을 넣어준다. 스트링 형태로 바꾸고, userID 변수가  자신에게 할당된 session.getA."userID"를 넣어주는거. 
	}
	if(userID != null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 로그인이 되어있습니다.')");
		script.println("location.href='main.jsp'");
		script.println("</script>");
	}
	
	//스크립틀릿 안에서script.print("alert('비밀번호가 틀립니다.')");   이 코드를
	//script.print("alert('비밀번호가 틀립니다.');");  이렇게 수정했더니 alert창 잘 뜨네요 ㅎㅎ
		
		if(user.getUserID()== null || user.getUserPassword() ==null || user.getUserName() ==null
		|| user.getUserGender() ==null || user.getUserEmail()==null ){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안 된 사항이 있습니다.')");
			script.println("history.back()"); //이전페이지로 돌아감. 
			script.println("</script>");
		}else{ //입력받은 데이터로 회원가입 실행하도록
			UserDAO userDAO = new UserDAO(); //하나의 instance만듬 //db에 접근할 수 있느 ㄴ객체 만듬,
			int result = userDAO.join(user); //->위에 각각의 변수들-<jsp:setProperty name="user" property="userID" />을 입력받아서 만들어진 하나의 user라는 인스턴스가 join이라는 함수의 매개변수로 넣어줌. 
			//int result = userDAO.login(user.getUserID(), user.getUserPassword());//로그인.jsp에서 입력이 된 값으로 loginAction.jsp로 넘어와서 그 값을 login 함수에 넣어서 실행을 하는 것!!!!
			//-1부터 2까지 각각의 결과에 대한 값들이 result에 담김.
			if(result == -1){ //primary user id는 하나만존재. 동일한 데이터입력은?
				PrintWriter script = response.getWriter(); //pritnWriter 하나으 ㅣ스크립트 문장을 넣어주게 함.
				script.println("<script>");	//스크립트 문장 유동적으로 실행.
				script.println("alert('이미 존재하는 아이디 입니다. ')");
				script.println("history.back()"); //이전페이지로 사용자를 돌려보냄. 다시 로그인 페이지로 돌려보냄.  
				script.println("</script>"); //스크립트 닫아줌.
			}
			else{	//회원가입 이뤄졌을떄전부다
				session.setAttribute("userID", user.getUserID()); //회원가입 성공하면 이동. 
				PrintWriter script = response.getWriter(); //pritnWriter 하나으 ㅣ스크립트 문장을 넣어주게 함.
				script.println("<script>");	//스크립트 문장 유동적으로 실행.
				script.println("alert('회원가입 성공')");
				script.println("location.href='main.jsp'"); // 로그인 성공했을때 이페이지-main로 이동하게 만듬.
				script.println("</script>"); //스크립트 닫아줌.

			}
			//mysql에 접속하기위한(mysql-jsp연결) 드라이버파일을 프로그램에 추가해야함. 
		}
		
/*
UserDAO userDAO = new UserDAO();
		int result = userDAO.login(user.getUserID(), user.getUserPassword());
		if(result == 1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('로그인 성공')");
			script.println("location.href='main.jsp'");
			script.println("</script>");
		}else if(result == 0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀립니다')");
			script.println("history.back()");
			script.println("</script>");
		}else if(result == -1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다')");
			script.println("history.back()");
			script.println("</script>");
		}else if(result == -2){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류입니다')");
			script.println("history.back()");
			script.println("</script>");
		}

*/
	%>
</body>
</html>