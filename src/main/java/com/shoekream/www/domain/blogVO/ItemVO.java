package com.shoekream.www.domain.blogVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("itemVO")
public class ItemVO {
    private int itemId;
    private String item_image;
    private String item_name;
    private int minPrice;

    private List<ImageVO> itemImagesList;
}
