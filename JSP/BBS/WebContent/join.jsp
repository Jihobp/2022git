<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 >>>> 컴퓨터  폰 어느곳에서도 해상도에 맞게 알아서 디자인이 변경되는 반응형 웹 메타태그-->

<meta name="viewport" content="width=device-width", initial-scale="1">
<!-- 루트폴더에 부트스트랩을 참조하는 링크
 css폴더 안의 bootstrap.css를 참조해서 이 홈페이지의 디자인을 사용하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
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
		<li><a href="main.jsp">메인</a></li>
		<li><a href="bbs.jsp">게시판</a></li>
		</ul>
		<!-- 헤더 우측에 나타나는 드랍다운 영역 -->
		<ul class="nav navbar-nav navbar-right">
		<li class="dropdown">
		<a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" 
							aria-haspopup="true"
							aria-expanded="false">접속하기<span class="caret"></span>
							</a>
							<!-- 드랍다운 아이템 영역 -->
							<ul class="dropdown-menu">
							<li><a href="login.jsp">로그인</a></li>
							<li class="active"><a href="join.jsp">회원가입</a></li> <!-- 회원가입에 불빛들어가게 -->
							</ul>
							</li>
		</ul>
	</div>
</nav>
<!-- 로그인 야익 -->
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="joinAction.jsp"><!-- 회원가입이나 로그인할떄 포스트를 숨기는 메소드-""post , loginaction 으로 로그인 정보를 보내준다.-->
					<h3 style="text-align:center;">회원가입 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20"> <!-- 아이디 길이 20자 제한, --> 
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="userPassword" maxlength="20"> <!--유저 u,ID,Password대문자소문자 구불 --> 
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="이름" name="userName" maxlength="20"> <!--유저 u,ID,Password대문자소문자 구불 --> 
					</div>
					<div class="form-group" style="text-align: center;">
						<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-primary active"> <!-- active는 기본적으로 선택된것.(남자) -->
								<input type="radio" name="userGender" autocompelete="off" value="남자" checekd>남자
							</label>
							<label class="btn btn-primary active"> <!-- active는 기본적으로 선택된것.(남자) -->
								<input type="radio" name="userGender" autocompelete="off" value="여자" checekd>여자
							</label>
						</div>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="이메일" name="userEmail" maxlength="20"> <!--유저 u,ID,Password대문자소문자 구불 --> 
					</div>
					<input type="submit" class="btn btn-primary form-control" value="회원가입">
					
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

	<!-- 부트스트랩 참조 영역 -->
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>