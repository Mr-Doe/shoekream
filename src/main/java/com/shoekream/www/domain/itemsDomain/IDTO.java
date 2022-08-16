package com.shoekream.www.domain.itemsDomain;

import java.util.Map;

import com.shoekream.www.domain.productVO.ProductVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IDTO {
	private ProductVO pvo;
	private ItemsVO ivo;
	private String img;
	private String brand;
	private String size;
	private Map<String, Integer> map;
}
