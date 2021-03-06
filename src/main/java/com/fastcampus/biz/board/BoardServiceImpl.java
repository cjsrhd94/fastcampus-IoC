package com.fastcampus.biz.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardDAO boardDAO;

//    public BoardServiceImpl() {
//        System.out.println("===> BoardServiceImpl 持失");
//    }

//    public BoardServiceImpl(BoardDAO boardDAO) {
//        System.out.println("===> BoardServiceImpl 持失");
//        this.boardDAO = boardDAO;
//    }

//    public void setBoardDAO(BoardDAO boardDAO) {
//        System.out.println("===> BoardServiceImpl 持失");
//        this.boardDAO = boardDAO;
//    }

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
