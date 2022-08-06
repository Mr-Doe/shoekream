package com.shoekream.www.domain.SearchVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("searchDTO")
public class SearchDTO {
    private List<SearchVO> searchedProductList;
    private List<SearchVO> searchedBrandList;
}
