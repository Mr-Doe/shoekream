package com.shoekream.www.domain.filterVO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@Alias("filterDTO")
public class FilterDTO {
    private FilterCategoryVO categoryVO;
    private FilterSizeVO sizeVO;
    private FilterBrandVO brandVO;

    private List<Object> objectList1;
    private List<Object> objectList2;
    private List<Object> objectList3;

    // category + size
    public FilterDTO(FilterCategoryVO categoryVO, FilterSizeVO sizeVO) {
        this.categoryVO = categoryVO;
        this.sizeVO = sizeVO;
    }

    // catgegory + brand
    public FilterDTO(FilterCategoryVO categoryVO, FilterBrandVO brandVO) {
        this.categoryVO = categoryVO;
        this.brandVO = brandVO;
    }

    // size + brand
    public FilterDTO(FilterSizeVO sizeVO, FilterBrandVO brandVO) {
        this.sizeVO = sizeVO;
        this.brandVO = brandVO;
    }

    // category + any one TYPE filterList
    public FilterDTO(FilterCategoryVO categoryVO, List<Object> objectList1) {
        this.categoryVO = categoryVO;
        this.objectList1 = objectList1;
    }

    // category + any two TYPEs filterList
    public FilterDTO(FilterCategoryVO categoryVO, List<Object> objectList1, List<Object> objectList2) {
        this.categoryVO = categoryVO;
        this.objectList1 = objectList1;
        this.objectList2 = objectList2;
    }

    // size + any one TYPE filterList
    public FilterDTO(FilterSizeVO sizeVO, List<Object> objectList1) {
        this.sizeVO = sizeVO;
        this.objectList1 = objectList1;
    }

    // size + any two TYPEs filterList
    public FilterDTO(FilterSizeVO sizeVO, List<Object> objectList1, List<Object> objectList2) {
        this.sizeVO = sizeVO;
        this.objectList1 = objectList1;
        this.objectList2 = objectList2;
    }

    // brand + any one TYPE filterList
    public FilterDTO(FilterBrandVO brandVO, List<Object> objectList1) {
        this.brandVO = brandVO;
        this.objectList1 = objectList1;
    }

    // brand + any two TYPEs filterList
    public FilterDTO(FilterBrandVO brandVO, List<Object> objectList1, List<Object> objectList2) {
        this.brandVO = brandVO;
        this.objectList1 = objectList1;
        this.objectList2 = objectList2;
    }

    // any three TYPEs filtetList
    public FilterDTO(List<Object> objectList1, List<Object> objectList2, List<Object> objectList3) {
        this.objectList1 = objectList1;
        this.objectList2 = objectList2;
        this.objectList3 = objectList3;
    }

}
