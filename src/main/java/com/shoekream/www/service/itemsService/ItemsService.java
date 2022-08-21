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
	List<ItemsDTO> getBuyItemPriceList(int pno, String email);
	Map<String, Integer> recentandSellPrice(int pno, int size);
	int sellEnd(ItemsVO itemsVO);
	int buyEnd(ItemsVO itemsVO);
	int removeItem(int itemNo);
	IDTO selectProduct(int pno);
	IDTO selectPdto(int pno);
	IDTO selectBuyIdto(ItemsVO itemsVO, String email);
	IDTO selectSellIdto(ItemsVO itemsVO, String email);
}
