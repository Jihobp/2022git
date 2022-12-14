package kr.co.vo;
import java.util.Date;

public class BoardVo {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	
	//알쉽s 
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
}

/*
 * kr.co.controller
kr.co.dao 

kr.co.service 

kr.co.vo

여기서 controller의 역할은 웹에서 처리해야할 데이터를 받고, 

이 데이터를 담당할 service를 선택하여 호출합니다.

그리고 처리한 데이터를 다음 페이지에서 볼 수 있게 셋팅하며 이동할 페이지를 리턴합니다.

service는 데이터를 dao를 통해 넘겨주거나 받으면서 비즈니스 로직을 수행하는 역할을 합니다.

dao는 DB를 통해 데이터를 조회하거나 수정 삭제 하는 역할을 합니다.

vo는 DB에 있는 테이블 컬럼 값을 java에서 객체로 다루기 위해 사용합니다.*/
