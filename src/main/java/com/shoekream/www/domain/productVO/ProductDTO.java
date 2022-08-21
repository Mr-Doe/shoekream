package com.shoekream.www.domain.productVO;

import java.util.List;

import com.shoekream.www.handler.PagingHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	private PagingHandler totalCountPageHandler;
	private PagingHandler activateCountPageHandler;
	private PagingHandler nonActivateCountPageHandler;
	private List<ProductVO> productList;
	private ProductVO productVO;
	
	// 고객용 리스트 dto 
	public ProductDTO(PagingHandler activateCountPageHandler, List<ProductVO> productList) {
		this.activateCountPageHandler = activateCountPageHandler;
		this.productList = productList;
	}

	// modify 페이지 dto
	public ProductDTO(List<ProductVO> productList, ProductVO productVO) {
		this.productList = productList;
		this.productVO = productVO;
	}

	public ProductDTO(PagingHandler totalCountPageHandler, PagingHandler activateCountPageHandler,
			PagingHandler nonActivateCountPageHandler, List<ProductVO> productList) {
		this.totalCountPageHandler = totalCountPageHandler;
		this.activateCountPageHandler = activateCountPageHandler;
		this.nonActivateCountPageHandler = nonActivateCountPageHandler;
		this.productList = productList;
	}
	
	
}
