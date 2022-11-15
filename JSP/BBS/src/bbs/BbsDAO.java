package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO { //data acess object : 데이터 접근 객체 : 실제로 db에 접근해서 어떤 데이터를 빼올 수 있게 하는 클래스.
	//10번에서 만든 글쓰기db에 접근할 수 있게 만들어준다. >> 연결부분!!! 
		//JSP 게시판에서 로그인 기능을 구현하려면 JSP에서 회원 데이터베이스에 접근할 수 있도록 하는 Data Access Object(DAO)를 만들어야합니다. DAO는 데이터베이스 접근 객체의 약자입니다. 하나의 회원정보를 불러오거나 입력할 때 사용합니다.
		//DAO : 데이터베이스 접근 객체의 약자. 실질적으로 데이터 베이스에서 회원 정보를 불러오거나, 데이터베이스에 회원정보를 넣고자할떄 사용한다.
		private Connection conn; //자바와 데이터베이스를 연결 //connection: 데이터베이스에 접근하게 해주는 하나의 객체.
		//private PreparedStatement pstmt; //쿼리문 대기 및 설정
		private ResultSet rs; //결과값 받아오기 //어떠한 정보를 담을 수 있는 하나의 객체.
		
		//기본 생성자
		//UserDAO가 실행되면 자동으로 생성되는 부분
		//메소드마다 반복되는 코드를 이곳에 넣으면 코드가 간소화된다
		//실제로 mySQL에 접속할 수 있게 해주는 함수,
		public BbsDAO() {//하나의 객체로 만들었을떄, 자동으로 db커넥션이 이뤄지게 해줌.
			try {//트라이캐치로 예외 처리해준다.
				String jdbcURL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=Asia/Seoul"; //localhost:3306;우리 컴퓨터의 주소를 의미하는 것으로, 3306포트에 bbs에 접속하도록 합니다.
				String jdbcID = "root"; //루트계정에 접속,
				String jdbcPassword = "1234"; //루트계정에 비번 입력.
				Class.forName("com.mysql.jdbc.Driver");//드라이버를 찾게 해줌. driver; mysql에 접속할 수 있도록, 매개체 역할을 해주는 하나의 라이브러리.//"com.mysql.jdbc.Driver"에서수정(기존코드에서 cj)추가된것.
				conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);
				//conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);//를 이용해서 conn객체안에 접속 할 수있게. 
			} catch (Exception e) {
				e.printStackTrace();//->오류가 뭔지 출력되게 해줌.
			}
			
		}

		//글쓰기엔 총 3개 함수 필요 ㅇㅅㅇ
		//1. 실제 시간 넣어주는 함수. 여러개 함수쓰면 각각 함수끼리 db접근에 있어서 마찰이 일어나지 ㅇ낳게  pstmt 안에 넣어줌.
		public String getDate() {
			String SQL = "SELECT NOW()"; //현재 시간 가져오는 my sql 문장.
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); //쿼리문 대기 및 설정 //현재 연결되는 객체를 이용해서, 이 SQL문장을  실행준비단계로 만들 어줄 수 있게함.
				rs = pstmt.executeQuery(); //실제 실행결과 가죠옴.
				if (rs.next()) { //if 결과가 있는경우, 다음과 같이 리턴.
					return rs.getString(1); //getString 1현재 날짜 반환 ㅇㅅㅇ
				}
			} catch (Exception e) {
				e.printStackTrace(); //오류가 발생한 경우.
			}
			return ""; //리턴은 빈문자를 반환함으로 써 데이터베이스 오류를 알려준다. 웬만해션 발생안함 ㅇㅅㅇ;
		}	
		
		//
		public int getNext() {
			String SQL = "SELECT bbsID FROM BBS ORDER BY bbsID DESC ()"; //마지막으로 가져온거 위에 다음꺼. //내림차순!! 젤 마지막에 쓰인 글번호 가져오게함.
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); //쿼리문 대기 및 설정 //현재 연결되는 객체를 이용해서, 이 SQL문장을  실행준비단계로 만들 어줄 수 있게함.
				rs = pstmt.executeQuery(); //실제 실행결과 가죠옴.
				if (rs.next()) { //if 결과가 있는경우, 다음과 같이 리턴.
					return rs.getInt(1) + 1; //나온 결과에 +1더해서 게시글 번호 더함.
				}
				return 1; //첫번쨰 게시글이 ㄴ경우하나도 없는 경우는 겨로가 x
			} catch (Exception e) { 
				e.printStackTrace(); //오류가 발생한 경우.
			}
			return -1; //게시글 숫자로 적절하지 않은 -1을 반환함으로써 프로그램 오류를 알려준다,
		}	
		
		//3. db 에 삽입하는 write 함수. 
		//글쓰기 메소드
		public int write(String bbsTitle, String userID, String bbsContent) {
			String SQL = "INSERT INTO BBS VALUES (?,?,?,?,?,?)"; //BBS 테이블안에, 여섯개의 인자 다 가져옴. 
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); 
				pstmt.setInt(1,  getNext()); //1. 다음번에 쓰여야할 게시글번호!! . prepareStatement에서 하나씩 값을 넣어주게 함.
				pstmt.setString(2,  bbsTitle);
				pstmt.setString(3,  userID);
				pstmt.setString(4,  getDate());
				pstmt.setString(5,  bbsContent);
				pstmt.setInt(6,  1); //available > 삭제안된 상태, 1 넣어줌. 삭제 되게끔?
				
				//rs = pstmt.executeQuery(); //실제 실행결과 가죠옴. 
				//ㄴ>>> but!!!! >> insert문구에는 update로 작동하기 때문에 필요 없다. 
				return pstmt.executeUpdate(); //성공할시 0이상 값 반환, 
			} catch (Exception e) { 
				e.printStackTrace(); //오류가 발생한 경우.
			}
			return -1; //게시글 숫자로 적절하지 않은 -1을 반환함으로써 프로그램 오류를 알려준다,
		}
		
		//ctrl shift5 ??????????
		//4. 11강 게시글 리스트 메소드
		public ArrayList<Bbs> getList(int pageNumber) { //총 열개의 게시글을 복 
			String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1 order by bbsID desc limit 10 ";
			//											ㄴ> 삭제가 되지않은 어베일러블 1, 
			ArrayList<Bbs> list = new ArrayList<Bbs>();
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, getNext() - (pageNumber -1) *10);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Bbs bbs = new Bbs(); //인스턴스
					bbs.setBbsID(rs.getInt(1));
					bbs.setBbsTitle(rs.getNString(2));
					bbs.setUserID(rs.getString(3));
					bbs.setBbsDate(rs.getString(4));
					bbs.setBbsContent(rs.getString(5));
					bbs.setBbsAvailable(rs.getInt(6));
					list.add(bbs);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
			
		}
		
		//4-2. 11강 페이징 처리 메소드
		public boolean nextPage(int pageNumber) {
			String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, getNext() - (pageNumber - 1) * 10);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return true;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
		
		
		
}

