package com.shoekream.www.repository.filterDAO;

import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FilterCategoryDAO {
    FilterCategoryVO selectCategory(int categoryId);
    List<FilterCategoryVO> selectCategoryList();
    int insertCategory(String categoryName);
    int updateCategory(FilterCategoryVO categoryVO);
    int deleteCategory(int categoryId);
}
