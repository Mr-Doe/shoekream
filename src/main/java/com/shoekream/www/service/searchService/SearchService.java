package com.shoekream.www.service.searchService;

import com.shoekream.www.domain.SearchVO.SearchDTO;

public interface SearchService {
    SearchDTO searchToProductAndBrand(String keyword);
}
