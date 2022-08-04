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

	// buy register
	public ItemsVO(String buyerEmail, int pno, int shoeSize, int price) {
		this.buyerEmail = buyerEmail;
		this.pno = pno;
		this.shoeSize = shoeSize;
		this.price = price;
	}
	
	// sell end
	public ItemsVO(String buyerEmail, int itemNo) {
		this.buyerEmail = buyerEmail;
		this.itemNo = itemNo;
	}

	// buy end
	public ItemsVO(int itemNo, String buyerEmail) {
		this.itemNo = itemNo;
		this.buyerEmail = buyerEmail;
	}

	// item detail
	public ItemsVO(int itemNo, int pno, int shoeSize, int price) {
		this.itemNo = itemNo;
		this.pno = pno;
		this.shoeSize = shoeSize;
		this.price = price;
	}

}
