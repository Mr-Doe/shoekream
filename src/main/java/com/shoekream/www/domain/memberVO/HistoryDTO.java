package com.shoekream.www.domain.memberVO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HistoryDTO {
	
	private int totalCount;
	private int bidCount;
	private int endCount;
	private List<MypageVO> history;
	private MypageVO mpvo;
	
	public HistoryDTO() {}

	public HistoryDTO(List<MypageVO> itemList) {
		this.history = itemList;
	}
}
