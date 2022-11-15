<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 메인이 세션관리를 통해 구축 -->
<!-- 세션관리: 세션: 기본적으로 현재 접속한 회원에 할당해주는 고유의 아이디. 웹서버에 한명의 세션아이디로 구현해 줄 수 있는데, 로그인에 성공했을때 세션아이디를 부여해줌으로써  세션관리시작.-->
<!-- 게시판 메인 디자인  -->
<meta name="viewport" content="width=device-width", initial-scale="1">
<!-- 루트폴더에 부트스트랩을 참조하는 링크 : css폴더 안의 bootstrap.css를 참조해서 이 홈페이지의 디자인을 사용하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<title>10강 글쓰기 기능 구현</title>
</head>
<body>
	<%
		String userID = null;
		if (session.getAttribute("userID")!=null) //현재 세션이 존재하는 사람이 그 아이디값을 받아서 관리하도록 만듬.
			userID = (String) session.getAttribute("userID");//스트링현번환>세션을 그대로 가져와성>로
			//로그인한 사람이라면 userID란 변수에 해당 ID가 담기고, 그러지 않은 사람은 null 값이 담긴다. 
	%>



<!-- 네비게이션 영역 (부트스트랩 참조 메타태그와 스크립트 코드를 상단과 하단에 입력,
네비 영역에 해당하는 코드 입력. 브라우저 화면이 좁아지면 네비 모양이 바뀌는 반응형 콛,-->
<nav class="navbar navbar-default"><!-- 네비게이션 -->
	<!-- 헤더영역(홈페이지 로고 등을 담당) -->
	<!--  ctrl +alt 밑으로  shift enter >밑으로-->
	<div class="navbar-header"><!-- 네비게이션 상단부분 -->
	<!-- 네비게이션 상단 박스 영역 -->
		<button type="button" class="navbar-toggle collapsed"
		data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
		aria-expanded="false">
		<!-- 이 버튼은 화면이 좁아지면 우측에 나타남. -->
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>		
		</button>
		<!-- 상단 바에 제목이 나타나고 클릭하면 main 페이지로 이동한다. -->
	 	<a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
	</div>
	<!-- 게시판 제목 이름 옆에 나타나는 메뉴 영역 -->
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
		<li><a href="main.jsp">메인</a></li> <!-- 메인페이지에 class=active 해서 현재접속한 페이지가 main인걸알려줌. .  -->
		<li class="active"><a href="bbs.jsp">게시판</a></li> <!-- active를 게시판 쪽으로 옮겨줌 ㅇㅅㅇ  -->
		</ul>
		<%//접속하기-로그인이 되어있지 않은 경우에만 나오게. (회원가입+로그인)
			if(userID == null){
		%>
		<!-- 헤더 우측에 나타나는 드랍다운 영역(네비바) -->
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" 
							aria-haspopup="true"
							aria-expanded="false">접속하기<span class="caret"></span></a>
							<!-- 드랍다운 아이템 영역 -->
							<ul class="dropdown-menu">
								<li><a href="login.jsp">로그인</a></li>
								<li><a href="join.jsp">회원가입</a></li>
							</ul>
			</li>
		</ul>
		<% 		
			} else { //로그인된 사람이 볼수 있는 곳! 
		%>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" 
							aria-haspopup="true"
							aria-expanded="false">회원관리<span class="caret"></span></a>
							<!-- 드랍다운 아이템 영역 -->
							<ul class="dropdown-menu">
								<li><a href="logoutAction.jsp">로그아웃</a></li> <!-- 로그아웃을 타고 눌러서 해당 세션 해제하고 main.jsp로이동. -->
							</ul>
			</li>
		</ul>
		<%		
			}
		%>
		
	</div>
</nav>
<!-- 게시판 넣어줌. 순서대로 보여지는 테이블-표 의 형태임. -->
<div class="container"><!-- 특정한 내용을 담을수 있는 컨테이너 지정 -->
	<div class="row"><!--테이블이 들어갈 수 이쓴ㄴ 공간을 만든다.  -->
	<form method="post" action="writeAction.jsp"> <!-- form태그로 실제로 액션페이지로 보내지게 --><!-- method="post":보내지는 내용이 숨겨지게, -->
		<table class="table tabke-striped" style="text-align: center; border: 1px solid #dddddd"><!-- table tabke-striped:게시판의 목록들이 홀짝 변경으로 색 바뀌게 해서 보다더 좋은 형태의 테이블로 벼여지게. 센터로 잡아주고, #dddd약간 회색빛으로 테두리 넣어줌.-->
			<thead>	<!-- 제목부분: 각각의 속성들을 알려줌. -->
				<tr> <!-- tr: 하나의 행, 줄. -->
					<th clospan="2" style="background-color: #eeeeee; text-align: center;">게시판 글쓰기 양식</th> <!-- th: 한개의 속성 명시 -->
					<!-- clospan="2"  : 총 두개 만큼의 열 잡음 -->
				</tr>
			</thead>
			<tbody><!-- 예시 데이터 넣어줌. ex)예시 데이터로 한개의 데이터들을 넣어줌. -->
				<tr><!-- 특정한 정보를 writeAction 페이지로 보내기 위해 사용. >실제로 글이 등록해주기위행. -->
					<td><input type="text" class="form-control" placeholder="글 제목" name="bbsTitle" maxlength="50"/></td>
				</tr> <!-- 각각 한줄씩으로 해주기 위해 ㅇㅇ -->
				<tr>	
					<td><textarea class="form-control" placeholder="글 내용" name="bbsContent" maxlength="2048" style="heigt: 350px;"/></textarea></td> <!-- 높이 크거나 작지 않게 고정, -->
				</tr>
			</tbody>
		</table>
		<input type="submit" class="btn btn-primary pull-right" value="글쓰기"><!-- 하나의 버튼이 오른쪾에 고정되게 만듬.+value=로 글쓰기 버튼 만듬. 누르면 액션데이터를 실제로 보낼 수 있게됨.  -->
	</form>	
	</div>
</div>


	<!-- 부트스트랩 참조 영역 -->
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>