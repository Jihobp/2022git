package user;

public class User {	//3. ȸ�� �����ͺ��̽� �����ϱ�. User ���̺� ����.
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	//�޼ҵ带 ������ش�, �����͸� ������ �ִ��ڹ� bin�� ������ش�. 
	//�̷��� �Ѹ��� ȸ�������͸� �ٸ� �� �ִ� db �� �ڹ� binge�� �ϼ��� �Ǿ���.
	//�̷������� �ϳ��� �����͸� �����ϰ� ó���� �� �ִ� ����� jsp���� �����ϴ� ���� �ڹ� ���� ��� �մϴ�.
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
}
