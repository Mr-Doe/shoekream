package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterSizeVO;
import com.shoekream.www.repository.filterDAO.FilterSizeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterSizeImpl implements FilterSizeService {

    @Autowired private FilterSizeDAO sizeDAO;

    @Override
    public FilterSizeVO getSize(int sizeId) {
        return sizeDAO.selectSize(sizeId);
    }

    @Override
    public List<FilterSizeVO> getSizeList() {
        return sizeDAO.selectSizeList();
    }
}
