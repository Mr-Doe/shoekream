package com.shoekream.www.repository.shopDAO;

import com.shoekream.www.domain.shopVO.ShopVO;

import java.util.List;

public interface ShopDAO {
    List<ShopVO> selectItems();
    int insertProduct(ShopVO shopVO);
    int insertImage(ShopVO toImageTable);
    int checkModelNumberDuple(String modelNumber);
    String selectModelNumber(int pno);

    List<ShopVO> selectImageId(String modelNumber);
    int deleteAllImage(List<ShopVO> list);
    int deleteItem(int pno);
}
