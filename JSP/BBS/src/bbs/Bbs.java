package bbs; 
/*9 강. : 게시판 DB구축.
 *sql에 db담을 수 있게 테이블 만듬.
 *하나의 게시글에 대한 정보를 관리하는 db에 접근할 수 있는 클래스를 만듦.
 *bbs란이름으로 패키지 만듬.
 *Bbs라는 자바 빈즈 만듬. 빈즈?????????? > 하나의 게시글정보를 담을 수 있는 인스턴스를 만들 수 있는 틀. 
 *ㄴ>> 사실상 데이터베이스의 테이블과 아주 흡사한 구조. 전반적인 게시글 하나를 관리 할 수있는 하나의 자바 프로그램.
*/
public class Bbs { //Bbs라는 이름으로 하나의 beans 클래스가 만들어짐.
	private int bbsID;
	private String bbsTitle;
	private String userID;
	private String bbsDate; //다른걸로 관리하는데 일단 여기서 문자열로 ㅇㅇ
	private String bbsContent;
	private int bbsAvailable;
	
	
	public int getBbsID() {
		return bbsID;
	}
	public void setBbsID(int bbsID) {
		this.bbsID = bbsID;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getBbsDate() {
		return bbsDate;
	}
	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}
	public int getBbsAvailable() {
		return bbsAvailable;
	}
	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}
	
	
}
