package com.fastcampus.biz.board;

import java.util.List;

public interface BoardService {
    // �� ���
    void insertBoard(BoardVO vo);

    // �� ����
    void updateBoard(BoardVO vo);

    // �� ����
    void deleteBoard(BoardVO vo);

    // �� �� ��ȸ
    BoardVO getBoard(BoardVO vo);

    // �� ��� �˻�
    List<BoardVO> getBoardList(BoardVO vo);
}