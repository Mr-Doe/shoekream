package com.shoekream.www.service.filterService;

import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.repository.filterDAO.FilterCategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterCategoryServiceImpl implements FilterCategoryService{

    @Autowired private FilterCategoryDAO categoryDAO;

    @Override
    public FilterCategoryVO getCategory(int categoryId) {
        return categoryDAO.selectCategory(categoryId);
    }

    @Override
    public List<FilterCategoryVO> getCategoryList() {
        return categoryDAO.selectCategoryist();
    }

    @Override
    public int postCategory(String categoryName) {
        return categoryDAO.insertCategory(categoryName);
    }

    @Override
    public int putCategory(FilterCategoryVO categoryVO) {
        return categoryDAO.updateCategory(categoryVO);
    }

    @Override
    public int delCategory(int categoryId) {
        return categoryDAO.deleteCategory(categoryId);
    }
}
