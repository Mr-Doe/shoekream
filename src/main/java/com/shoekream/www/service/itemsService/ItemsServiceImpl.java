package com.shoekream.www.service.itemsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<FilterSizeVO> sizeList = itemDAO.selectSizeList();
		List<ItemsDTO> itemList = new ArrayList<>();
		
		for(FilterSizeVO sizeVO : sizeList) {
			itemDAO.selectSellPrice(pno, sizeVO.getSizeId());
			itemList.add(new ItemsDTO(itemDAO.selectSellPrice(pno, sizeVO.getSizeId()), sizeVO));
		}
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
	public Map<String, Integer> recentandSellPrice(int pno, int size) {
		Map<String, Integer> map = new HashMap<>();
		map.put("recentPrice", itemDAO.recentDeal(pno, size));
		map.put("maxSellPrice", itemDAO.selectSellPrice(pno, size));
		return map;
	}

	@Override
	public ItemsVO selectBuyItem(ItemsVO itemsVO) {
		return itemDAO.selectBuyItem(itemsVO);
	}
	
	@Override
	public ItemsVO selectSellItem(ItemsVO itemsVO) {
		return itemDAO.selectSellItem(itemsVO);
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
	public ProductVO selectProductVO(int pno) {
		return itemDAO.selectProduct(pno);
	}

	@Override
	public String selectSize(int shoeSize) {
		return itemDAO.selectShoeSize(shoeSize);
	}

	@Override
	public Map<String, Integer> selectBuySell(ItemsVO itemsVO) {
		Map<String, Integer> map = new HashMap<>();
		map.put("buy", itemDAO.selectBuyPrice(itemsVO.getPno(), itemsVO.getShoeSize()));
		map.put("sell", itemDAO.selectSellPrice(itemsVO.getPno(), itemsVO.getShoeSize()));
		return map;
	}

}
