package com.shoekream.www.domain.blogVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("imageVO")
public class ImageVO {
    private int imageId;
    private String imageUrl;
}
