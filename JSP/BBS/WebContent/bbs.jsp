<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!-- 필요한 정보를 쓸 수 있도록 페이지 설정란에서 import 코드를 추가함. 그리고 아래에서 기본 페이지를 1로 설정. -->
<%@ page import="java.io.PrintWriter" %>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="java.util.ArrayList" %>    
    
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 메인이 세션관리를 통해 구축 -->
<!-- 세션관리: 세션: 기본적으로 현재 접속한 회원에 할당해주는 고유의 아이디. 웹서버에 한명의 세션아이디로 구현해 줄 수 있는데, 로그인에 성공했을때 세션아이디를 부여해줌으로써  세션관리시작.-->
<!-- 게시판 메인 디자인  -->
<meta name="viewport" content="width=device-width", initial-scale="1">
<!-- 루트폴더에 부트스트랩을 참조하는 링크
 css폴더 안의 bootstrap.css를 참조해서 이 홈페이지의 디자인을 사용하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<title>8강 JSP 게시판 메인페이지 디자인</title>
</head>
<body>
	<%
		// 메인 페이지로 이동했을 때 세션에 값이 담겨있는지 체크............
		String userID = null;
		if (session.getAttribute("userID")!=null){ //현재 세션이 존재하는 사람이 그 아이디값을 받아서 관리하도록 만듬.
			userID = (String) session.getAttribute("userID");//스트링현번환>세션을 그대로 가져와성>로
			//로그인한 사람이라면 userID란 변수에 해당 ID가 담기고, 그러지 않은 사람은 null 값이 담긴다. 
		}
		int pageNumber = 1; //기본은 1페이지를 할당.
		// 만약 파라미터로 넘어온 오브젝트 타입 'pageNumber'가 존재한다면
		// 'int'타입으로 캐스팅을 해주고 그 값을 'pageNumber'변수에 저장한다.
		if(request.getParameter("pageNumber") != null){
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
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
		<table class="table tabke-striped" style="text-align: center; border: 1px solid #dddddd"><!-- table tabke-striped:게시판의 목록들이 홀짝 변경으로 색 바뀌게 해서 보다더 좋은 형태의 테이블로 벼여지게. 센터로 잡아주고, #dddd약간 회색빛으로 테두리 넣어줌.-->
			<thead>	<!-- 제목부분: 각각의 속성들을 알려줌. -->
				<tr> <!-- tr: 하나의 행, 줄. -->
					<th style="background-color: #eeeeee; text-align: center;">번호</th> <!-- th: 한개의 속성 명시 -->
					<th style="background-color: #eeeeee; text-align: center;">제목</th>
					<th style="background-color: #eeeeee; text-align: center;">작성자</th>
					<th style="background-color: #eeeeee; text-align: center;">작성일</th>
				</tr>
			</thead>
			<tbody><!-- 예시 데이터 넣어줌. ex)예시 데이터로 한개의 데이터들을 넣어줌. -->
				<%
					BbsDAO bbsDAO = new BbsDAO(); //인스턴스 생성
					ArrayList<Bbs> list = bbsDAO.getList(pageNumber);
					for(int i =0; i<list.size();i++){
				%>
				<tr>
					<td><%=list.get(i).getBbsID() %></td>
				<!-- 게시글 제목을 누르면 해당 글을 볼 수 있도록 링크를 걸어둔다. -->
				<td><a href="view.jsp?bbsID=<%= list.get(i).getBbsID() %>">
					<%= list.get(i).getBbsTitle() %></a></td>
				<td><%= list.get(i).getUserID() %></td>
				<td><%= list.get(i).getBbsDate().substring(0,11) + list.get(i).getBbsDate().substring(11,13) + "시" 
				+ list.get(i).getBbsDate().substring(14,16) + "분" %></td>
				</tr>
				<%
					}
				%>
				
				<!-- tr>
					<td>1</td>
					<td>안녕하세요</td>
					<td>홍길동</td>
					<td>2022-10-18</td>
				</tr>  --><
			</tbody>
		</table>
		<!-- 페이지 처리 영역 -->
		<%
			if(pageNumber != 1){
		%>
			<a href="bbs.jsp?pageNumber=<%=pageNumber -1 %>"
			 	class="btn btn-success btn-arraw-left">이전</a>
		<%
			}if(bbsDAO.nextPage(pageNumber +1))	{
		%>
			<a href="bbs.jsp?pageNumber=<%=pageNumber +1 %>" 
				class="btn btn-success btn-arraw-left">다음</a>
		<%
			}
		%>
		
		<!-- 글쓰기 버튼 생성 -->
		<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a> <!-- 하나의 버튼이 오른쪾에 고정되게 만듬. -->
	</div>
</div>


	<!-- 부트스트랩 참조 영역 -->
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>