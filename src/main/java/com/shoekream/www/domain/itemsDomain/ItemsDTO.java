package com.shoekream.www.domain.itemsDomain;

import com.shoekream.www.domain.filterVO.FilterSizeVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ItemsDTO {
	private Integer price;
	private FilterSizeVO sizeVO;
}