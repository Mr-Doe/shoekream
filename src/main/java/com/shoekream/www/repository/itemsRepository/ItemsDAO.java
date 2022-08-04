package com.shoekream.www.repository.itemsRepository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsDAO {
	int insertSellItem(ItemsVO itemsVO);
	int insertBuyItem(ItemsVO itemsVO);
	List<ItemsVO> selectSellPrice(@Param("pno") int pno, @Param("i") int i);
	List<ItemsVO> selectBuyPrice(@Param("pno") int pno, @Param("i") int i);
	int recentDeal(@Param("pno") int pno, @Param("size") int size);
	ItemsVO selectBuyItem(@Param("pno") int pno, @Param("i") int i);
	int sellUpdate(ItemsVO itemsVO);
	int buyUpdate(ItemsVO itemsVO);
	int deleteItem(int itemNo);
}
