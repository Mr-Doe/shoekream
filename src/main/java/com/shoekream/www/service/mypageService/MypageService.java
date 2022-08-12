package com.shoekream.www.service.mypageService;

import com.shoekream.www.domain.memberVO.HistoryDTO;

public interface MypageService {
	HistoryDTO selectItemSelHistory(String email);
	HistoryDTO selectItemBuyHistory(String email);
}
