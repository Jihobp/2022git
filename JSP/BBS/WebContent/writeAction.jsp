<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %> <!-- 우리가 만든 클래스 사용해야해서 페이지 임포트, user페키지에 bbsdao를 불러오게함, >게시글을 작성할 수 있는 db는 BbsDAO 객체를  이용해서 다를 수 있기떄문-->
<%@ page import="java.io.PrintWriter" %> <!-- 자바스크립트 문장 작성하기 위해 사용. -->
<% request.setCharacterEncoding("utf-8"); %> <!-- 건너오는 데이터를 utf-8로 -->
<!-- 자바빈즈활용, 한명의 회원정보 담는 유저 클래스를 자바빈즈로 사용, -->
<!-- bbs.jsp안에 Bbs.java 넣어줌. -->
<jsp:useBean id="bbs" class="bbs.Bbs" scope="page" /> <!--jsp에서 자바빈즈를 사용한다, user라는 아이디만들고, class에 bbs.Bbs클래스 넣고, 스코프하고 page넣음으로 현재 페이지 안에서만 빈즈가 사용될 수 있게 함 -->
<jsp:setProperty name="bbs" property="bbsTitle" /><!-- 하나의 게시글 인스턴스 만듬. -->
<jsp:setProperty name="bbs" property="bbsContent" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--<meta name="viewport" content="width=device-width", initial-scale="1">-->
<title>10강. 게시판 글쓰기 액션구현.</title>
</head>
<body>
	<%
	//로그인한 유저는 회원가입 못하게- session 이용
	// 현재 세션 상태를 체크한다
	String userID = null;
	if(session.getAttribute("userID") != null){ //세션을 확인해서 userID 이름으로 세션이 존재하는 회원은.
		userID = (String)session.getAttribute("userID"); //해당세션 값을 넣어준다. 스트링 형태로 바꾸고, userID 변수가  자신에게 할당된 session.getA."userID"를 넣어주는거. 
	}
	// 로그인을 한 사람만 글을 쓸 수 있도록 코드를 수정한다
	if(userID == null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('로그인을 하세요')");
			script.println("location.href='login.jsp'");
			script.println("</script>");
	} else{ //로그인 되어있는 상황은 else에 다 넣어줌  // 입력이 안 된 부분이 있는지 체크한다
		if(bbs.getBbsTitle() == null || bbs.getBbsContent() == null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안 된 사항이 있습니다')");
			script.println("history.back()");
			script.println("</script>");
			}else{ //db에 등록해서 글쓰게 해줌. 
				// 정상적으로 입력이 되었다면 글쓰기 로직을 수행한다
				BbsDAO bbsDAO = new BbsDAO();//하나의 instance만듬 //db에 접근할 수 있느 ㄴ객체 만듬,
				int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent()); //차례대로 매개변수 넣어줌. 
				//int result = userDAO.login(user.getUserID(), user.getUserPassword());//로그인.jsp에서 입력이 된 값으로 loginAction.jsp로 넘어와서 그 값을 login 함수에 넣어서 실행을 하는 것!!!!
				//-1부터 2까지 각각의 결과에 대한 값들이 result에 담김.
				
				// 데이터베이스 오류인 경우
				if(result == -1){ //primary user id는 하나만존재. 동일한 데이터입력은?
					PrintWriter script = response.getWriter(); //pritnWriter 하나으 ㅣ스크립트 문장을 넣어주게 함.
					script.println("<script>");	//스크립트 문장 유동적으로 실행.
					script.println("alert('글쓰기에 실패했습니다.')");
					script.println("history.back()"); //이전페이지로 사용자를 돌려보냄. 다시 로그인 페이지로 돌려보냄.  
					script.println("</script>"); //스크립트 닫아줌.
				}
				// 글쓰기가 정상적으로 실행되면 알림창을 띄우고 게시판 메인으로 이동한다
				else{	//성공적으로 이뤄졌을때 게시판으로 돌아가서 결과출력. 
					PrintWriter script = response.getWriter(); //pritnWriter 하나으 ㅣ스크립트 문장을 넣어주게 함.
					script.println("<script>");	//스크립트 문장 유동적으로 실행.
					script.println("alert('게시글이 등록되었습니다.')");
					script.println("location.href='bbs.jsp'");
					script.println("</script>"); 

				}
				//mysql에 접속하기위한(mysql-jsp연결) 드라이버파일을 프로그램에 추가해야함. 
			}
		
	}

	%>
</body>
</html>