package com.shoekream.www.repository.shopDAO;

import com.shoekream.www.domain.shopVO.ShopVO;

import java.util.List;

public interface ShopDAO {
    List<ShopVO> selectItems();
    int insertProduct(ShopVO shopVO);
    int insertImage(ShopVO toImageTable);
    int checkModelNumberDuple(String modelNumber);
    String selectModelNumber(int pno);
    int selectItemsCount(int pno);
    List<ShopVO> selectImageIdAndUrl(String modelNumber);
    List<ShopVO> selectImageUrlWithId(long ItemId);

    int deleteImageWithModelNumber(List<ShopVO> list);
    int deleteImageWithImageId(ShopVO shopVO);
    int deleteItem(int pno);
}
