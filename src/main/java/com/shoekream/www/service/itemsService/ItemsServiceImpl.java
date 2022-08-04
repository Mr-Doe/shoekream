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
	public List<ItemsDTO> getSellItemPriceList(int pno) {
//		List<ShoeSizeVO> sizeList = sdao.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();
//		for(ShoeSizeVO svo : sizeList) {
//			itemList.add(idao.selectSellItem(pno, svo.getSizeId()), svo);
//		}
		return itemList;
	}

	@Override
	public List<ItemsDTO> getBuyItemPriceList(int pno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int recentDealPrice(int pno, int size) {
		return idao.recentDeal(pno, size);
	}

	@Override
	public ItemsVO selectbuyItem(int pno, int shoeSize) {
		return idao.selectBuyItem(pno, shoeSize);
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
