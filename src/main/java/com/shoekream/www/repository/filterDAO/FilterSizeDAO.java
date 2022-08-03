package com.shoekream.www.repository.filterDAO;

import com.shoekream.www.domain.filterVO.FilterSizeVO;

import java.util.List;

public interface FilterSizeDAO {
    FilterSizeVO selectSize(int sizeId);
    List<FilterSizeVO> selectSizeList();
}
