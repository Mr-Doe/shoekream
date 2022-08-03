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
}
