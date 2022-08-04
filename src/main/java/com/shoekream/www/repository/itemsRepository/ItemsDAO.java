package com.shoekream.www.repository.itemsRepository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsDAO {
	int insertSellItem(ItemsVO itemsVO);
	int insertBuyItem(ItemsVO itemsVO);
	List<ItemsVO> selectSellPrice(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	List<ItemsVO> selectBuyPrice(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	int recentDeal(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	ItemsVO selectBuyItem(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	ItemsVO selectSellItem(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	int sellUpdate(ItemsVO itemsVO);
	int buyUpdate(ItemsVO itemsVO);
	int deleteItem(int itemNo);
}
