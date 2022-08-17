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
	private PagingHandler pagehdlr;
	private List<ProductVO> productList;
}
