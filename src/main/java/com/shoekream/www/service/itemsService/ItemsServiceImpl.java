package com.shoekream.www.service.itemsService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.shoekream.www.domain.filterVO.FilterSizeVO;
import com.shoekream.www.domain.itemsDomain.BrandDTO;
import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.repository.itemsRepository.ItemsDAO;

import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Inject
	private ItemsDAO itemDAO;
	
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
		List<FilterSizeVO> sizeList = itemDAO.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();
		
		for(FilterSizeVO sizeVO : sizeList) {
			itemDAO.selectBuyPrice(pno, sizeVO.getSizeId());
			itemList.add(new ItemsDTO(itemDAO.selectBuyPrice(pno, sizeVO.getSizeId()), sizeVO));
		}
		return itemList;
	}

	@Override
	public Integer recentDealPrice(int pno, int size) {
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

	@Override
	public BrandDTO selectProduct(int pno) {
		ProductVO pvo = itemDAO.selectProduct(pno);
		pvo.setRegAt(pvo.getRegAt().substring(0, pvo.getRegAt().indexOf(" ")));
		return new BrandDTO(pvo, itemDAO.selectBrandName(pvo.getBrand()));
	}

	@Override
	public Integer sellPrice(int pno) {
		return itemDAO.maxSellPrice(pno);
	}
}
