package kr.co.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.co.board.mapper.Board_ServiceMapper;
import kr.co.board.vo.Board_ServiceVo;

@Service
@Qualifier("bs") 
public class Board_ServiceImpl implements Board_Service {

	@Autowired
	private Board_ServiceMapper mapper;

	@Override
	public String write_ok(Board_ServiceVo bsv) {
		
		return mapper.write_ok(bsv);		
	}

	@Override
	public ArrayList<Board_ServiceVo> list() {
		
		return  mapper.list();
	}
	
	
}
