package com.fastcampus.biz.board;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// 1. VO(Value Object) Ŭ����
@Data
public class BoardVO {
	// BOARD ���̺��� �÷��� ������ ������� ����
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
}











