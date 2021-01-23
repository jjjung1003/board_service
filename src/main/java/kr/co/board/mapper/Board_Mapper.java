package kr.co.board.mapper;

import java.util.ArrayList;

import kr.co.board.vo.Board_Vo;

public interface Board_Mapper {

	public String write_ok(Board_Vo bsv);

	public ArrayList<Board_Vo> list();
}
