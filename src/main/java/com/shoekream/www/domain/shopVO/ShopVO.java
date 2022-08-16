package com.shoekream.www.domain.shopVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("shopVO")
public class ShopVO {

    private int itemNo;
    private int brandName;
    private String englishName;
    private String koreanName;
    private int sellerPrice;
    private String modelNumber;
    private String fileName;
    private long imageId;
    private String imageUrl;

}
