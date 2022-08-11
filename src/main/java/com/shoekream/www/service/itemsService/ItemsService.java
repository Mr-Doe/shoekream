package com.shoekream.www.service.itemsService;

import java.util.List;
import java.util.Map;

import com.shoekream.www.domain.itemsDomain.BrandDTO;
import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsService {
	int registerSellItem(ItemsVO itemsVO);
	int registerBuyItem(ItemsVO itemsVO);
	List<ItemsDTO> getSellItemPriceList(int pno);
	List<ItemsDTO> getBuyItemPriceList(int pno);
	Map<String, Integer> recentandSellPrice(int pno, int size);
	ItemsVO selectbuyItem(int pno, int shoeSize);
	int sellEnd(ItemsVO itemsVO);
	int buyEnd(ItemsVO itemsVO);
	int removeItem(int itemNo);
	BrandDTO selectProduct(int pno);
	Integer sellPrice(int pno);
}
