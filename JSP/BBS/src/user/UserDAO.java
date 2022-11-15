package user;
//ctrl shift o �� 4���� java/squl.connection �� �߰��ؼ� �ܺ� ���̺귯���� ���� �߰����ش�. 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO { //3������ ���� ȸ�������ͺ��̽��� ������ �� �ְ� ������ش�.
	//JSP �Խ��ǿ��� �α��� ����� �����Ϸ��� JSP���� ȸ�� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� Data Access Object(DAO)�� �������մϴ�. DAO�� �����ͺ��̽� ���� ��ü�� �����Դϴ�. �ϳ��� ȸ�������� �ҷ����ų� �Է��� �� ����մϴ�.
	//DAO : �����ͺ��̽� ���� ��ü�� ����. ���������� ������ ���̽����� ȸ�� ������ �ҷ����ų�, �����ͺ��̽��� ȸ�������� �ְ����ҋ� ����Ѵ�.
	private Connection conn; //�ڹٿ� �����ͺ��̽��� ���� //connection: �����ͺ��̽��� �����ϰ� ���ִ� �ϳ��� ��ü.
	private PreparedStatement pstmt; //������ ��� �� ����
	private ResultSet rs; //����� �޾ƿ��� //��� ������ ���� �� �ִ� �ϳ��� ��ü.
	
	//�⺻ ������
	//UserDAO�� ����Ǹ� �ڵ����� �����Ǵ� �κ�
	//�޼ҵ帶�� �ݺ��Ǵ� �ڵ带 �̰��� ������ �ڵ尡 ����ȭ�ȴ�
	//������ mySQL�� ������ �� �ְ� ���ִ� �Լ�,
	public UserDAO() {//�ϳ��� ��ü�� ���������, �ڵ����� dbĿ�ؼ��� �̷����� ����.
		try {//Ʈ����ĳġ�� ���� ó�����ش�.
			String jdbcURL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=Asia/Seoul"; //localhost:3306;�츮 ��ǻ���� �ּҸ� �ǹ��ϴ� ������, 3306��Ʈ�� bbs�� �����ϵ��� �մϴ�.
			String jdbcID = "root"; //��Ʈ������ ����,
			String jdbcPassword = "1234"; //��Ʈ������ ��� �Է�.
			Class.forName("com.mysql.jdbc.Driver");//����̹��� ã�� ����. driver; mysql�� ������ �� �ֵ���, �Ű�ü ������ ���ִ� �ϳ��� ���̺귯��.//"com.mysql.jdbc.Driver"��������(�����ڵ忡�� cj)�߰��Ȱ�.
			conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);
			//conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);//�� �̿��ؼ� conn��ü�ȿ� ���� �� ���ְ�. 
		} catch (Exception e) {
			e.printStackTrace();//->������ ���� ��µǰ� ����.
		}
		
	}
	//�ڡ�4:30�ʡڡ١�https://youtu.be/RYo3OGlRoJw?list=PLRx0vPvlEmdAZv_okJzox5wj2gG_fNh_6
	//������ �α����� �õ��ϴ� �ϳ��� �Լ� //�̰� �̿��ؼ� �α��� �������� �����ؾ��Ѵ�,
	public int login(String userID, String userPassword) {//userID�� userPS�� �Է¹޾Ƽ� ó����.
		String SQL = "select userPassword from user where userID = ?"; //������ �Է��� SQL���� �Է�. USER���̺��� �ش������� ����� ����������.
		try {									//4:30��
			pstmt = conn.prepareStatement(SQL); //sql�������� ��� ��Ų�� //��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, userID); //ù��° '?'�� �Ű������� �޾ƿ� 'userID'�� ���� //setString�� 1, userID�� �־��ش�.  �ϳ��� ������ �̸� �־��ٰ�, 
			rs = pstmt.executeQuery(); //������ ������ ����� rs�� ����	//��� ����
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)){ //����� ���� �����н����� �迭1�� ����Ȱ� �޾Ƽ�, ���ؼ� �α��� ����. 
					return 1; //�α��� ����	//1��ȯ, ����,
				}
				else 
					return 0; //��й�ȣ ����ġ.
			}
			return -1; //���̵� ����.
		} catch (Exception e) {
			e.printStackTrace();//����ó�� ���.
		}
		return -2; //�����ͺ��̽� ������ �ǹ��ϴ� ��. �׳� ������.
	}
	public int join(User user) {
		 String sql = "insert into user values(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);//prepared statement=connection.prepareStatement�Լ���(sql)�ν��Ͻ�����  
			pstmt.setString(1, user.getUserID()); //���� �� ����ǥ�� �ش��ϴ� ������ ���� ���� �־��ֵ��� �Ѵ�. ù������ �Ű������� �Ѿ�� ���� �ν��Ͻ���,getUserID();
		    pstmt.setString(2, user.getUserPassword());
		    pstmt.setString(3, user.getUserName());
		    pstmt.setString(4, user.getUserGender());
		    pstmt.setString(5, user.getUserEmail());
		    return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1; //�����ͺ��̽� ����
	
	
	}		 
}
