package com.shoekream.www.repository.itemsRepository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.domain.filterVO.FilterSizeVO;

public interface ItemsDAO {
	int insertSellItem(ItemsVO itemsVO);
	int insertBuyItem(ItemsVO itemsVO);
	Integer selectSellPrice(@Param("pno") int pno, @Param("shoeSize") int sizeSize, @Param("email") String email);
	Integer selectBuyPrice(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	Integer recentDeal(@Param("pno") int pno, @Param("shoeSize") int shoeSize);
	ItemsVO selectBuyItem(ItemsVO itemsVO);
	ItemsVO selectSellItem(ItemsVO itemsVO, @Param("email") String email);
	int sellUpdate(ItemsVO itemsVO);
	int buyUpdate(ItemsVO itemsVO);
	int deleteItem(int itemNo);
	ProductVO selectProduct(int pno);
	List<FilterSizeVO> selectSizeList();
	String selectBrandName(int brand);
	String selectShoeSize(int shoeSize);
	String selectImg(int pno);
}
