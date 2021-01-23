package kr.co.board.mapper;

import java.util.ArrayList;

import kr.co.board.vo.Board_ServiceVo;

public interface Board_ServiceMapper {

	public String write_ok(Board_ServiceVo bsv);

	public ArrayList<Board_ServiceVo> list();
}
