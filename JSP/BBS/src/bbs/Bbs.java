package bbs; 
/*9 ��. : �Խ��� DB����.
 *sql�� db���� �� �ְ� ���̺� ����.
 *�ϳ��� �Խñۿ� ���� ������ �����ϴ� db�� ������ �� �ִ� Ŭ������ ����.
 *bbs���̸����� ��Ű�� ����.
 *Bbs��� �ڹ� ���� ����. ����?????????? > �ϳ��� �Խñ������� ���� �� �ִ� �ν��Ͻ��� ���� �� �ִ� Ʋ. 
 *��>> ��ǻ� �����ͺ��̽��� ���̺�� ���� ����� ����. �������� �Խñ� �ϳ��� ���� �� ���ִ� �ϳ��� �ڹ� ���α׷�.
*/
public class Bbs { //Bbs��� �̸����� �ϳ��� beans Ŭ������ �������.
	private int bbsID;
	private String bbsTitle;
	private String userID;
	private String bbsDate; //�ٸ��ɷ� �����ϴµ� �ϴ� ���⼭ ���ڿ��� ����
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
