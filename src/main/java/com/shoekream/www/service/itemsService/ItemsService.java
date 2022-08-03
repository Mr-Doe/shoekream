package com.shoekream.www.service.itemsService;

import java.util.List;

import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;

public interface ItemsService {
	int registerSellItem(ItemsVO itemsVO);
	int registerBuyItem(ItemsVO itemsVO);
	List<ItemsDTO> getSellItemList(int pno);
	List<ItemsDTO> getBuyItemList(int pno);
	int currentDealPrice(int pno, int size);
	int sellEnd(ItemsVO itemsVO);
	int buyEnd(ItemsVO itemsVO);
	int removeItem(int itemNo);
}
