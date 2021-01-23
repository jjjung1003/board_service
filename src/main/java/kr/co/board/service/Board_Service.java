package kr.co.board.service;

import java.util.ArrayList;

import kr.co.board.vo.Board_ServiceVo;

public interface Board_Service {

	public String write_ok(Board_ServiceVo bsv);

	public ArrayList<Board_ServiceVo> list();

}
