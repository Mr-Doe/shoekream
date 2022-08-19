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
@Alias("commentVO")
public class CommentVO {
    private int cmtId;
    private int blogId;
    private String ownComment;
    private String content;
    private String regAt;
    private int commentCount;

    private int page;
}
