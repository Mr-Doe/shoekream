package com.shoekream.www.service.searchService;

import com.shoekream.www.domain.SearchVO.SearchDTO;
import com.shoekream.www.repository.searchDAO.SearchDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired private SearchDAO searchDAO;

    @Override
    public SearchDTO searchToProductAndBrand(String keyword) {
        return new SearchDTO(searchDAO.selectToProducts(keyword), searchDAO.selectToBrands(keyword));
    }
}
