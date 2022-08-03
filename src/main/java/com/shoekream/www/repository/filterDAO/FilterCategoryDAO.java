package com.shoekream.www.repository.filterDAO;

import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilterCategoryDAO {
    FilterCategoryVO selectCategory(int categoryId);
    List<FilterCategoryVO> selectCategoryist();
    int insertCategory(@Param("categoryName")String categoryName);

}
