package com.shoekream.www.domain.productVO;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


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

    private String thImg;

    public int getThImg() {
        return pno;
    }
    public void setThImg(String thImg) {
        this.thImg = thImg;
    }

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
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
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
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", model=" + model + ", eName=" + eName + ", kName=" + kName + ", readCount="
				+ readCount + ", regAt=" + regAt + ", retailPrice=" + retailPrice + ", category=" + category
				+ ", brand=" + brand + "]";
	}

}
