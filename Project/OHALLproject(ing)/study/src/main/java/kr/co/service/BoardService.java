package kr.co.service;

import kr.co.vo.BoardVo;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVo boardVO) throws Exception;
	
}