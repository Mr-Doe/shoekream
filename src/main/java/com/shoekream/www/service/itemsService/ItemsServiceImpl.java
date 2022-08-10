package com.shoekream.www.service.itemsService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.repository.itemsRepository.ItemsDAO;

import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Inject
	private ItemsDAO itemDAO;
	
//	@Inject
//	private FilterSizeDAO sizeDAO;
	
	@Override
	public int registerSellItem(ItemsVO itemsVO) {
		return itemDAO.insertSellItem(itemsVO);
	}

	@Override
	public int registerBuyItem(ItemsVO itemsVO) {
		return itemDAO.insertBuyItem(itemsVO);
	}

	@Override
	public List<ItemsDTO> getSellItemPriceList(int pno) {
//		List<FilterSizeVO> sizeList = sizeDAO.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();

//		for(FilterSizeVO sizeVO : sizeList) {
//			itemList.add(itemDAO.selectSellPrice(pno, sizeVO.getSizeId), sizeVO);
//		}
		return itemList;
	}

	@Override
	public List<ItemsDTO> getBuyItemPriceList(int pno) {
//		List<FilterSizeVO> sizeList = sizeDAO.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();
		
//		for(FilterSizeVO sizeVO : sizeList) {
//			itemList.add(itemDAO.selectBuyPrice(pno, sizeVO.getSizeId), sizeVO);
//		}
		return itemList;
	}

	@Override
	public int recentDealPrice(int pno, int size) {
		return itemDAO.recentDeal(pno, size);
	}

	@Override
	public ItemsVO selectbuyItem(int pno, int shoeSize) {
		return itemDAO.selectBuyItem(pno, shoeSize);
	}

	@Override
	public int sellEnd(ItemsVO itemsVO) {
		return itemDAO.sellUpdate(itemsVO);
	}

	@Override
	public int buyEnd(ItemsVO itemsVO) {
		return itemDAO.buyUpdate(itemsVO);
	}

	@Override
	public int removeItem(int itemNo) {
		return itemDAO.deleteItem(itemNo);
	}
}
