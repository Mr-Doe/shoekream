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

    private int identityNumber;
    private String englishName;
    private String koreanName;
    private String imagePath;

    public SearchVO(String keyword) {
        this.keyword = keyword;
    }

    public SearchVO(int identityNumber, String englishName) {
        this.identityNumber = identityNumber;
        this.englishName = englishName;
    }

    public SearchVO(int identityNumber, String englishName, String koreanName, String imagePath) {
        this.identityNumber = identityNumber;
        this.englishName = englishName;
        this.koreanName = koreanName;
        this.imagePath = imagePath;
    }
}
