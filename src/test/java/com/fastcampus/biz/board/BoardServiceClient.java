package com.fastcampus.biz.board;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        // 1. ������ �����̳ʸ� �����Ѵ�.
        GenericXmlApplicationContext container
                = new GenericXmlApplicationContext("business-layer.xml");

        // 2. �׽�Ʈ ��ü�� Lookup�Ѵ�.
        BoardService boardService = (BoardService) container.getBean("boardService");

        // 3. ��ü�� �׽�Ʈ�Ѵ�.
        BoardVO vo = new BoardVO();
        vo.setTitle("IoC �׽�Ʈ");
        vo.setWriter("�׽���2");
        vo.setContent("�׽�Ʈ���Դϴ�!");
        boardService.insertBoard(vo);

        List<BoardVO> boardList = boardService.getBoardList(vo);
        for (BoardVO board : boardList){
            System.out.println("---> " + board.toString());
        }

        // 4. �����̳ʸ� �����Ѵ�.
        container.close();

    }
}
