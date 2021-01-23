package kr.co.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.co.board.mapper.Board_Mapper;
import kr.co.board.vo.Board_Vo;

@Service
@Qualifier("bs") 
public class Board_Impl implements Board {

	@Autowired
	private Board_Mapper mapper;

	@Override
	public String write_ok(Board_Vo bsv) {
		
		return mapper.write_ok(bsv);		
	}

	@Override
	public ArrayList<Board_Vo> list() {
		
		return  mapper.list();
	}
	
	
}
