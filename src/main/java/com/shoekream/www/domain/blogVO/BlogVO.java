package com.shoekream.www.domain.blogVO;

import com.shoekream.www.domain.memberVO.MemberVO;
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
@Alias("blogVO")
public class BlogVO {
    private int blogId;             // 블로그 ID
    private String ownEmail;       // 데이터 검증용
    private String followers;       // 1,2,3,... 형태의 e-mail이 나열된 문자열
    private String blogImageId;     // 1,2,3,... 형태의 블로그 이미지 ID가 나열된 문자열
    private String blogImagePath;   // http://~, http://~, ... 이미지 경로가 나열된 문자열
    private int likesCount;           // 좋아요 갯수
    private int commentsCount;      // 1,2,3,... 형태의 댓글 ID가 나열된 문자열
    private String regAt;           // 블로그 생성 날짜
    private String delImage;        // 수정에서 삭제된 이미지 ID가 나열된 문자열

    private int itemId;
    private String itemImage;
    private String itemName;
    private int minPrice;

    private List<ImageVO> blogImagesList;

    private int page;
}
