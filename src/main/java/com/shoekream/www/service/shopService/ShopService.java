package com.shoekream.www.service.shopService;

import com.shoekream.www.domain.shopVO.ShopVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ShopService {
    List<ShopVO> getItems();
    int postItem(ShopVO shopVO, MultipartFile[] files) throws Exception;
    int removeItem(int pno) throws Exception;
}
