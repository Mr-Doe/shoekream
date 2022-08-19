package com.shoekream.www.domain.filterVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("modelVO")
public class FilterModelVO {
    private int modelId;
    private String modelName;
}
