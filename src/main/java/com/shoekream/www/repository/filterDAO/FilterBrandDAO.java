package com.shoekream.www.repository.filterDAO;

import com.shoekream.www.domain.filterVO.FilterBrandVO;

import java.util.List;

public interface FilterBrandDAO {
    FilterBrandVO selectBrand(int brandId);
    List<FilterBrandVO> selectBrandList();
    int insertBrand(String brandName);
    int updateBrand(FilterBrandVO brandVO);
    int deleteBrand(int brandId);
}
