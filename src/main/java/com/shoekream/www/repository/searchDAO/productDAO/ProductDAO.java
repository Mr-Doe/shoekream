package com.shoekream.www.repository.searchDAO.productDAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.productVO.ProductVO;

@Repository
public interface ProductDAO {
	
	int insert(ProductVO pvo);
	int insertImage(ProductVO productVO);
	List<ProductVO> selectList(PagingVO pgvo);
	List<ProductVO> selectAdminList(PagingVO pgvo);
	List<ProductVO> selectMinPrice(PagingVO pgvo);
	
	ProductVO selectProductVO(int pno);
	int totalCount(PagingVO pgvo);
	int activeCount(PagingVO pgvo);
	int nonActiveCount(PagingVO pgvo);
	
	int checkModelDuple(String model);
	int selectLastPno();
	int selectItemsCount(int pno);
	String selectModelNumber(int pno);
	List<ProductVO> selectImageIdAndUrl(String model);
	int selectItemCount(int pno);
	
	int updateProduct(ProductVO productVO);
	
	int deleteImageWithModelNumber(List<ProductVO> imageList);
	int deleteProduct(int pno);
	int deleteImageWithImageId(List<Long> imageId);

}