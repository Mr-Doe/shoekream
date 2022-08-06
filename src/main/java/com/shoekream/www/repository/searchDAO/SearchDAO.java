package com.shoekream.www.repository.searchDAO;

import com.shoekream.www.domain.SearchVO.SearchVO;

import java.util.List;

public interface SearchDAO {
    List<SearchVO> selectToProducts(String keyword);
    List<SearchVO> selectToBrands(String keyword);
}
