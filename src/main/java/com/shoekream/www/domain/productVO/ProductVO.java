package com.shoekream.www.domain.productVO;

import org.apache.ibatis.type.Alias;

@Alias("productVO")
public class ProductVO {
    private int pno;
    private String model;
    private String eName;
    private String kName;
    private String regAt;
    private int retailPrice;
    private int category;
    private String categoryName;
    private int brand;
    private String brandName;
    private String fileName;
    private long imageId;
    private String imageUrl;
    private int minPrice;
    
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	public String getkName() {
		return kName;
	}
	public void setkName(String kName) {
		this.kName = kName;
	}
	public String getRegAt() {
		return regAt;
	}
	public void setRegAt(String regAt) {
		this.regAt = regAt;
	}
	public int getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getImageId() {
		return imageId;
	}
	public void setImageId(long imageId) {
		this.imageId = imageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", model=" + model + ", eName=" + eName + ", kName=" + kName + ", regAt="
				+ regAt + ", retailPrice=" + retailPrice + ", category=" + category + ", categoryName=" + categoryName
				+ ", brand=" + brand + ", brandName=" + brandName + ", fileName=" + fileName + ", imageId=" + imageId
				+ ", imageUrl=" + imageUrl + ", minPrice=" + minPrice + "]";
	}
    
}
