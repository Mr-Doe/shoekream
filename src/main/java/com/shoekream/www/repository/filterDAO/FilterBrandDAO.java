package com.shoekream.www.repository.filterDAO;

import com.shoekream.www.domain.filterVO.FilterBrandVO;

import java.util.List;

public interface FilterBrandDAO {
    FilterBrandVO selectBrand(int brandId);
    List<FilterBrandVO> selectBrandList();
}
