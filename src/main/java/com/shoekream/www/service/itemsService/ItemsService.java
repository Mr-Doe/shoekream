package com.shoekream.www.service.itemsService;

import java.util.List;
import java.util.Map;

import com.shoekream.www.domain.itemsDomain.IDTO;
import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsService {
	int registerSellItem(ItemsVO itemsVO);
	int registerBuyItem(ItemsVO itemsVO);
	List<ItemsDTO> getSellItemPriceList(int pno, String email);
	List<ItemsDTO> getBuyItemPriceList(int pno);
	Map<String, Integer> recentandSellPrice(int pno, int size);
//	ItemsVO selectBuyItem(ItemsVO itemsVO);
//	ItemsVO selectSellItem(ItemsVO itemsVO);
	int sellEnd(ItemsVO itemsVO);
	int buyEnd(ItemsVO itemsVO);
	int removeItem(int itemNo);
//	BrandDTO selectProduct(int pno);
	IDTO selectProduct(int pno);
//	String selectSize(int shoeSize);
//	Map<String, Integer> selectBuySell(ItemsVO itemsVO);
//	Integer buyPrice(int pno, int i);
	IDTO selectPdto(int pno);
	IDTO selectBuyIdto(ItemsVO itemsVO);
	IDTO selectSellIdto(ItemsVO itemsVO, String email);
}
