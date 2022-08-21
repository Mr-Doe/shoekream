package com.shoekream.www.handler;

import com.shoekream.www.domain.PagingVO.PagingVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagingHandler {
	private int startPage; // 현재 화면에서 보여줄 페이지네이션의 시작 인덱스 번호
	private int endPage; // 현재 화면에서 보여줄 페이지네이션의 끝 인덱스 번호
	private int viewHowPages; // 이전과 다음 사이 몇개의 페이지를 보여줄지
	private boolean prev, next; // 이전, 다음 버튼 존재 여부
	private int totalCount; // 총 게시글의 수
	private int activateCount; // 총 게시글의 수
	private int nonActivateCount; // 총 게시글의 수
	private PagingVO pgvo; // 사용자가 입력하거나 전달되는 페이징 정보값을 갖고 있는 객체

	// product list
	public PagingHandler(PagingVO pgvo, int activateCount, int viewHowPages) {
		this.activateCount = activateCount;
		constructor(pgvo, viewHowPages, activateCount);
		
	}

	// nonActivate list
	public PagingHandler(int nonActivateCount, int viewHowPages, PagingVO pgvo) {
		this.nonActivateCount = nonActivateCount;
		constructor(pgvo, viewHowPages, nonActivateCount);
		
	}

	// activate + nonActivate List
	public PagingHandler(int totalCount, PagingVO pgvo, int viewHowPages) {
		this.totalCount = totalCount;
		constructor(pgvo, viewHowPages, totalCount);
		
	}
	private void constructor(PagingVO pgvo, int viewHowPages, int count) {
		this.viewHowPages = viewHowPages;
		this.pgvo = pgvo;
		//	this.endPage = (int)(Math.ceil(pgvo.getPageNo() / (pgvo.getQty()*1.0))) * pgvo.getQty();
		this.endPage = (( (pgvo.getPageNo()- 1) / viewHowPages) + 1 ) * viewHowPages;
		this.startPage = endPage - (viewHowPages-1);
		// next버튼을 눌렀을때 end 페이지가 진짜 end페이지 보다 클경우
		int realEndPage = (int)(Math.ceil((count * 1.0) / pgvo.getQty()));
		if(realEndPage < this.endPage) {
			this.endPage = realEndPage;
		}
		this.prev = startPage > 1;
		this.next = endPage < realEndPage;
	}
}
