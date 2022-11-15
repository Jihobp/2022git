package user;
//ctrl shift o 로 4번쨰 java/squl.connection 을 추가해서 외부 라이브러리를 순삭 추가해준다. 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO { //3번에서 만든 회원데이터베이스에 접근할 수 있게 만들어준다.
	//JSP 게시판에서 로그인 기능을 구현하려면 JSP에서 회원 데이터베이스에 접근할 수 있도록 하는 Data Access Object(DAO)를 만들어야합니다. DAO는 데이터베이스 접근 객체의 약자입니다. 하나의 회원정보를 불러오거나 입력할 때 사용합니다.
	//DAO : 데이터베이스 접근 객체의 약자. 실질적으로 데이터 베이스에서 회원 정보를 불러오거나, 데이터베이스에 회원정보를 넣고자할떄 사용한다.
	private Connection conn; //자바와 데이터베이스를 연결 //connection: 데이터베이스에 접근하게 해주는 하나의 객체.
	private PreparedStatement pstmt; //쿼리문 대기 및 설정
	private ResultSet rs; //결과값 받아오기 //어떠한 정보를 담을 수 있는 하나의 객체.
	
	//기본 생성자
	//UserDAO가 실행되면 자동으로 생성되는 부분
	//메소드마다 반복되는 코드를 이곳에 넣으면 코드가 간소화된다
	//실제로 mySQL에 접속할 수 있게 해주는 함수,
	public UserDAO() {//하나의 객체로 만들었을떄, 자동으로 db커넥션이 이뤄지게 해줌.
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
	//★☆4:30초★☆★https://youtu.be/RYo3OGlRoJw?list=PLRx0vPvlEmdAZv_okJzox5wj2gG_fNh_6
	//실제로 로그인을 시도하는 하나의 함수 //이걸 이용해서 로그인 페이지에 접속해야한다,
	public int login(String userID, String userPassword) {//userID랑 userPS를 입력받아서 처리함.
		String SQL = "select userPassword from user where userID = ?"; //실제로 입력할 SQL문장 입력. USER테이블에서 해당사용자의 비번을 가져오게함.
		try {									//4:30초
			pstmt = conn.prepareStatement(SQL); //sql쿼리문을 대기 시킨다 //어떠한 정해진 SQL문장을 데이터베이스에 삽입하는형식으로 인스턴스를 가져옴.
			pstmt.setString(1, userID); //첫번째 '?'에 매개변수로 받아온 'userID'를 대입 //setString에 1, userID를 넣어준다.  하나의 문장을 미리 넣었다가, 
			rs = pstmt.executeQuery(); //쿼리를 실행한 결과를 rs에 저장	//결과 샐행
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)){ //결과가 나온 유저패스위드 배열1에 저장된건 받아서, 비교해서 로그인 성공. 
					return 1; //로그인 성공	//1반환, 종료,
				}
				else 
					return 0; //비밀번호 불일치.
			}
			return -1; //아이디가 없음.
		} catch (Exception e) {
			e.printStackTrace();//예외처리 출력.
		}
		return -2; //데이터베이스 오류를 의미하는 것. 그냥 숫자임.
	}
	public int join(User user) {
		 String sql = "insert into user values(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);//prepared statement=connection.prepareStatement함수에(sql)인스턴스넣음  
			pstmt.setString(1, user.getUserID()); //각각 위 물음표에 해당하는 내용이 뭐가 들어갈지 넣어주도록 한다. 첫번쨰로 매개변수로 넘어온 유저 인스턴스에,getUserID();
		    pstmt.setString(2, user.getUserPassword());
		    pstmt.setString(3, user.getUserName());
		    pstmt.setString(4, user.getUserGender());
		    pstmt.setString(5, user.getUserEmail());
		    return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1; //데이터베이스 오류
	
	
	}		 
}
