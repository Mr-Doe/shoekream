package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.repository.filterDAO.FilterBrandDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterBrandServiceImpl implements FilterBrandService{

    @Autowired private FilterBrandDAO brandDAO;

    @Override
    public FilterBrandVO getBrand(int brandId) {
        return brandDAO.selectBrand(brandId);
    }

    @Override
    public List<FilterBrandVO> getBrandList() {
        return brandDAO.selectBrandList();
    }
}
