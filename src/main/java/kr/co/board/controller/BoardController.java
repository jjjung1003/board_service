package kr.co.board.controller;

import java.util.ArrayList;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.board.service.Board_Service;
import kr.co.board.vo.Board_ServiceVo;

@Controller
public class BoardController {

	@Autowired
	private Board_Service service;
	
	@RequestMapping("/write")
	public String write()
	{
		return "/write";
	}
	
	@RequestMapping("/write_ok")
	public String write_ok(Board_ServiceVo bsv)
	{
		service.write_ok(bsv);
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		ArrayList<Board_ServiceVo> list=service.list();
		model.addAttribute("list",list);
		return "/list";
	}
	
	
	
	
	
	
	
	
	
	
}
