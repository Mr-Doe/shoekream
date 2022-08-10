package com.shoekream.www.domain.PagingVO;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Alias("pageVO")
public class PagingVO {
    private int pageNo; // 현재 화면에 출력된 페이지네이션의 인덱스번호
    private int qty; // 한 페이지당 보여줄 페이지네이션 인덱스 개수, 보여줄 게시글 수

    private String shoe_brand;
    private String shoe_size;
    private String shoe_category;
    private String keyword;

    public PagingVO() {
        this(1, 12); // 최초 값은 1 page, 12개
    }

    public PagingVO(int pageNo, int qty) {
        this.pageNo = pageNo;
        this.qty = qty;
    }
    
    public int getPageStart() {
        return (this.pageNo - 1) * qty;
    }
    
    public String[] getBrandToArray() {
    	return this.shoe_brand == null ? null : this.shoe_brand.split(",");
        
    }
    
    public String[] getCategoryToArray() {
    	return this.shoe_category == null ? null : this.shoe_category.split(",");
    	
    }
    public String[] getSizeToArray() {
    	return this.shoe_size == null ? null : this.shoe_size.split(",");
    	
    }
    
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getShoe_brand() {
		return shoe_brand;
	}

	public void setShoe_brand(String shoe_brand) {
		this.shoe_brand = shoe_brand;
	}

	public String getShoe_size() {
		return shoe_size;
	}

	public void setShoe_size(String shoe_size) {
		this.shoe_size = shoe_size;
	}

	public String getShoe_category() {
		return shoe_category;
	}

	public void setShoe_category(String shoe_category) {
		this.shoe_category = shoe_category;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "PagingVO [pageNo=" + pageNo + ", qty=" + qty + ", shoe_brand=" + shoe_brand + ", shoe_size=" + shoe_size
				+ ", shoe_category=" + shoe_category + ", keyword=" + keyword + "]";
	}
//	if(this.shoe_brand == "") {
//	brand2Array = this.shoe_brand == "" ? null : this.shoe_brand.split(",");    		
//}
}