package com.shoekream.www.service.mypageService;

import com.shoekream.www.domain.memberVO.HistoryDTO;
import com.shoekream.www.domain.memberVO.MypageVO;

public interface MypageService {
	HistoryDTO selectItemSelHistory(String email);
	HistoryDTO selectItemBuyHistory(String email);
	MypageVO selectHistoryDetail(int itemNo);
}
