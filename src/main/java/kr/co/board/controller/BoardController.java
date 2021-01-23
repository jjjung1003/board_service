package kr.co.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.board.service.Board;
import kr.co.board.vo.Board_Vo;

@Controller
public class BoardController {

	@Autowired
	@Qualifier("bs")
	private Board service;
	
	@RequestMapping("/write")
	public String write()
	{
		return "/write";
	}
	
	@RequestMapping("/write_ok")
	public String write_ok(Board_Vo bsv)
	{
		service.write_ok(bsv);
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		ArrayList<Board_Vo> list=service.list();
		model.addAttribute("list",list);
		return "/list";
	}
	
	
	
	
	
	
	
	
	
	
}
