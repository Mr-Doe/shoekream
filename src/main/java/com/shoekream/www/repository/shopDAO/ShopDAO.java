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

    int deleteImageWithImageId(List<Long> list);
    int deleteImageWithModelNumber(List<ShopVO> list);
    int deleteItem(int pno);

    int updateItem(ShopVO shopVO);
}
