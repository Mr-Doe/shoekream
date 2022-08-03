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
	private ItemsDAO idao;
	
	@Override
	public int registerSellItem(ItemsVO itemsVO) {
		return idao.insertSellItem(itemsVO);
	}

	@Override
	public int registerBuyItem(ItemsVO itemsVO) {
		return idao.insertBuyItem(itemsVO);
	}

	@Override
	public List<ItemsDTO> getSellItemList(int pno) {
//		List<ShoeSizeVO> sizeList = sdao.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();
//		for(ShoeSizeVO i : sizeList) {
//			itemList.add(idao.selectSellItemList(pno, i.getSsid()), i);
//		}
		return itemList;
	}

	@Override
	public List<ItemsDTO> getBuyItemList(int pno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int currentDealPrice(int pno, int size) {
		return idao.currentDeal(pno, size);
	}

	@Override
	public int sellEnd(ItemsVO itemsVO) {
		return idao.sellUpdate(itemsVO);
	}

	@Override
	public int buyEnd(ItemsVO itemsVO) {
		return idao.buyUpdate(itemsVO);
	}

	@Override
	public int removeItem(int itemNo) {
		return idao.deleteItem(itemNo);
	}

}
