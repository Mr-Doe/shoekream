package com.shoekream.www.domain.filterVO;

import lombok.*;
import org.apache.ibatis.type.Alias;

@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("sizeVO")
public class FilterSizeVO {
    private int sizeId;
    private String sizeValue;

    public FilterSizeVO(int sizeId) {
        this.sizeId = sizeId;
    }

    public FilterSizeVO(String sizeValue) {
        this.sizeValue = sizeValue;
    }
}
