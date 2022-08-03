package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterSizeVO;

import java.util.List;

public interface FilterSizeService {
    FilterSizeVO getSize(int sizeId);
    List<FilterSizeVO> getSizeList();
}
