package user;

public class User {	//3. 회원 데이터베이스 구축하기. User 테이블 구축.
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	//메소드를 만들어준다, 데이터를 넣을수 있는자바 bin이 만들어준다. 
	//이렇게 한명의 회원데이터를 다를 수 있는 db 및 자바 binge가 완성이 되었다.
	//이런식으로 하나의 데이터를 관리하고 처리할 수 있는 기법을 jsp에서 구현하는 것을 자바 빈져 라고 합니당.
	
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
