package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterCategoryVO;

import java.util.List;

public interface FilterCategoryService {
    FilterCategoryVO getCategory(int categoryId);
    List<FilterCategoryVO> getCategoryList();
    int postCategory(String categoryName);
}
