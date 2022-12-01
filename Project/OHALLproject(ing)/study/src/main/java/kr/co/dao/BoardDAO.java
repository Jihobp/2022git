package kr.co.dao;

import kr.co.vo.BoardVo;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVo boardVO) throws Exception;
}