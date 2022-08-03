package com.shoekream.www.domain.filterVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("categoryVO")
public class FilterCategoryVO {
    private int categoryId;
    private String categoryName;
}
