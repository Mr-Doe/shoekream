package com.shoekream.www.domain.productVO;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Alias("productVO")
public class ProductVO {
    private int pno;
    private String model;
    private String eName;
    private String kName;
    private int readCount;
    private String regAt;
    private int retailPrice;
    private int category;
    private int brand;
	private String th_img;

}
