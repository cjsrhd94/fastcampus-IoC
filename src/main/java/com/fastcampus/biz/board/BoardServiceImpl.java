package com.fastcampus.biz.board;

import java.util.List;

public class BoardServiceImpl implements BoardService{

    private BoardDAO boardDAO;

//    public BoardServiceImpl() {
//        System.out.println("===> BoardServiceImpl 持失");
//    }

    public BoardServiceImpl(BoardDAO boardDAO) {
        System.out.println("===> BoardServiceImpl 持失");
        this.boardDAO = boardDAO;
    }

    @Override
    public void insertBoard(BoardVO vo) {
        boardDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {
        boardDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
        boardDAO.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        return boardDAO.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO vo) {
        return boardDAO.getBoardList(vo);
    }
}
