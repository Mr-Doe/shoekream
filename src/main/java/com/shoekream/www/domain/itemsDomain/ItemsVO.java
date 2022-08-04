package com.shoekream.www.domain.itemsDomain;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("itemsVO")
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ItemsVO {
	private int itemNo;
	private int pno;
	private int shoeSize;
	private int price;
	private String regAt;
	private String endAt;
	private int isSold;
	private String sellerEmail;
	private String buyerEmail;

	// sell register
	public ItemsVO(int pno, int shoeSize, int price, String sellerEmail) {
		this.pno = pno;
		this.shoeSize = shoeSize;
		this.price = price;
		this.sellerEmail = sellerEmail;
	}

	// sell complite
	public ItemsVO(String buyerEmail, int itemNo, int price, int isSold) {
		this.buyerEmail = buyerEmail;
		this.itemNo = itemNo;
		this.price = price;
		this.isSold = isSold;
	}
}
