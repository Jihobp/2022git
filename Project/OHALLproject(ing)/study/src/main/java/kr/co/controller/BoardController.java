package kr.co.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.BoardService;
import kr.co.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public String writeView() throws Exception{
		logger.info("writeView");
		System.out.println("박지호3");
		
		return "/board/writeView";
		
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardVo boardVo) throws Exception{
		
		logger.info("write");
		System.out.println("!");
		System.out.println(boardVo.getBno());
		System.out.println(boardVo.getContent());
		System.out.println(boardVo.getTitle());
		System.out.println(boardVo.getWriter());
		//System.out.println(boardVo.getRegdate());
		//System.out.println(boardVo.getRegdate().toString());
		service.write(boardVo);
		System.out.println("?");
		return "redirect:/";
	}
	
}