package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterBrandVO;

import java.util.List;

public interface FilterBrandService {
    FilterBrandVO getBrand(int brandId);
    List<FilterBrandVO> getBrandList();
    int postBrand(String brandName);
    int putBrand(FilterBrandVO brandVO);
    int delBrand(int brandId);
}
