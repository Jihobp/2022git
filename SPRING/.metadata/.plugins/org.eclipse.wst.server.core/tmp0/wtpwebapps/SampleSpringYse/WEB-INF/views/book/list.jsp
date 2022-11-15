<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%-- JSTL에서 반복문을 사용하기 위해서는 <c:forEach 구문을 사용할 수 있다.
<c: 태그를 사용하기 위해서는 태그 라이브러리를 선언해야 한다. ㄱ 밑에 문장! 
반복문은 아래와 같이 사용한다.
<c:forEach var="row" items="${data}">  
items에는 컨트롤러에서 전달받은 데이터를 넣어준다. 반복 가능한 객체면 어디서 생성한 객체든 무관하다.
items="${data}"  
var는 목록의 한 행(row)을 나타내는 변수명을 넣으면 된다.
var="row" 
반복문 안에서 데이터는 ${row.이름} 으로 사용할 수 있다.
${row.title}   --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>11.7. 책 목록 뷰 작성</title>
</head>
<h1>책 목록</h1>
		<p>
		    <form>
		        <input type="text" placeholder="검색" name="keyword" value="${keyword}" />
		        <input type="submit" value="검색" />
		    </form>			
		</p>
		<table>
			<thead>
				<tr>
					<td>제목</td>
					<td>카테고리</td>
					<td>가격</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="row" items="${data}">
				<tr>
					<td>
						<a href="/detail?bookId=${row.book_id}">
							${row.title}
						</a>
					</td>
					<td>${row.category}</td>
					<td><fmt:formatNumber type="number" maxFractionDigits="3" value="${row.price}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<p>
			<a href="/create">생성</a>
		</p>
</body>
</html>
