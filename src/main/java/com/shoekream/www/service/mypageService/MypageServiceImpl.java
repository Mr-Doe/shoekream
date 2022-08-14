package com.shoekream.www.service.mypageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoekream.www.domain.memberVO.HistoryDTO;
import com.shoekream.www.domain.memberVO.MypageVO;
import com.shoekream.www.repository.mypageDAO.MypageDAO;

@Service
public class MypageServiceImpl implements MypageService {
	
	@Autowired private MypageDAO mypageDAO;

	@Override
	public HistoryDTO selectItemBuyHistory(String email) {
		HistoryDTO hdto = new HistoryDTO(mypageDAO.getItemBuyList(email));
		hdto.setTotalCount(mypageDAO.getBuyTotalCount(email));
		hdto.setBidCount(mypageDAO.getBuyBidCount(email));
		hdto.setEndCount(mypageDAO.getBuyEndCount(email));
		return hdto;
	}

	@Override
	public HistoryDTO selectItemSelHistory(String email) {
		HistoryDTO hdto = new HistoryDTO(mypageDAO.getItemSelList(email));
		hdto.setTotalCount(mypageDAO.getSelTotalCount(email));
		hdto.setBidCount(mypageDAO.getSelBidCount(email));
		hdto.setEndCount(mypageDAO.getSelEndCount(email));
		return hdto;
	}

	@Override
	public MypageVO selectHistoryDetail(int itemNo) {
		MypageVO mpvo = mypageDAO.gethistoryDetail(itemNo);
		return mpvo;
	}
	
}
