package com.shoekream.www.repository.mypageDAO;

import java.util.List;

import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.domain.memberVO.MypageVO;

public interface MypageDAO {

	List<MypageVO> getItemBuyList(String email);

	int getBuyTotalCount(String email);

	int getBuyBidCount(String email);

	int getBuyEndCount(String email);

	List<MypageVO> getItemSelList(String email);

	int getSelTotalCount(String email);

	int getSelBidCount(String email);

	int getSelEndCount(String email);

}