package com.shoekream.www.domain.SearchVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("searchVO")
public class SearchVO {
    private String keyword;
    private String kw2product;
    private String kw2item;

    public SearchVO(String keyword) {
        this.keyword = keyword;

        this.kw2product = keyword;
        this.kw2item = keyword;
    }
}
