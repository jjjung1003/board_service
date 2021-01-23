package kr.co.board.service;

import java.util.ArrayList;

import kr.co.board.vo.Board_Vo;

public interface Board {

	public String write_ok(Board_Vo bsv);

	public ArrayList<Board_Vo> list();

}
