package com.shoekream.www.domain.itemsDomain;

import com.shoekream.www.domain.productVO.ProductVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BrandDTO {
	private ProductVO productVO;
	private String brandName;
}
