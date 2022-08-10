package com.shoekream.www.repository.itemsRepository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.domain.filterVO.FilterSizeVO;

public interface ItemsDAO {
	int insertSellItem(ItemsVO itemsVO);
	int insertBuyItem(ItemsVO itemsVO);
	int selectSellPrice(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	Integer selectBuyPrice(@Param("pno") int pno, @Param("sizeId") int sizeId);
	int recentDeal(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	ItemsVO selectBuyItem(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	ItemsVO selectSellItem(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	int sellUpdate(ItemsVO itemsVO);
	int buyUpdate(ItemsVO itemsVO);
	int deleteItem(int itemNo);
	ProductVO selectProduct(int pno);
	List<FilterSizeVO> selectSizeList();
	String selectBrandName(int brand);
	Integer maxSellPrice(int pno);
}
