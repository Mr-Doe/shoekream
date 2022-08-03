package com.shoekream.www.repository.itemsRepository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsDAO {
	int insertSellItem(ItemsVO itemsVO);
	int insertBuyItem(ItemsVO itemsVO);
	List<ItemsVO> selectSellItemList(@Param("pno") int pno, @Param("i") int i);
	List<ItemsVO> selectBuyItemList(@Param("pno") int pno, @Param("i") int i);
	int currentDeal(@Param("pno") int pno, @Param("size") int size);
	int sellUpdate(ItemsVO itemsVO);
	int buyUpdate(ItemsVO itemsVO);
	int deleteItem(int itemNo);
}
