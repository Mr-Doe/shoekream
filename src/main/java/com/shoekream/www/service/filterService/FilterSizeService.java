package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterSizeVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FilterSizeService {
    FilterSizeVO getSize(int sizeId);
    List<FilterSizeVO> getSizeList();
    int postSize(String sizeValue);
    int putSize(FilterSizeVO sizeVO);
    int delSize(int sizeId);
}
