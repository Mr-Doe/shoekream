package com.shoekream.www.domain.itemsDomain;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("itemsVO")
@Getter
@Setter
@ToString
public class ItemsVO {
	private int itemNo;
	private	int pno;
	private int shoeSize;
	private	int price;
	private	String regAt;
	private	String endAt;
	private	int isSold;
	private	String sellerEmail;
	private	String buyerEmail;
	
	public ItemsVO(int pno, int shoeSize, int price, String sellerEmail) {
		super();
		this.pno = pno;
		this.shoeSize = shoeSize;
		this.price = price;
		this.sellerEmail = sellerEmail;
	}
	
}
