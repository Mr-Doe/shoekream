package com.shoekream.www.domain.memberVO;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Alias("mypageVO")
public class MypageVO {
	private int isSold;
	private int itemNo;
	private String model;
	private String eName;
	private int shoeSize;
	private int price;
	private String thImg;
	private String regAt;
	private String endAt;
	private String sellerEmail;
	private String buyerEmail;
	
	public MypageVO() {}

	// MyPage List
	public MypageVO(int isSold, int itemNo, String eName, int shoeSize,
			String thImg) {
		this.isSold = isSold;
		this.itemNo = itemNo;
		this.eName = eName;
		this.shoeSize = shoeSize;
		this.thImg = thImg;
	}

	// MyPage Detail
	public MypageVO(int isSold, int itemNo, String model, String eName, int shoeSize, int price, String thImg, String regAt, String endAt,
			String sellerEmail, String buyerEmail) {
		this(isSold, itemNo, eName, shoeSize, thImg);
		this.model = model;
		this.price = price;
		this.regAt = regAt;
		this.endAt = endAt;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
	}

	public int getIsSold() {
		return isSold;
	}

	public void setIsSold(int isSold) {
		this.isSold = isSold;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getThImg() {
		return thImg;
	}

	public void setThImg(String thImg) {
		this.thImg = thImg;
	}

	public String getRegAt() {
		return regAt;
	}

	public void setRegAt(String regAt) {
		this.regAt = regAt;
	}

	public String getEndAt() {
		return endAt;
	}

	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	
	
}
