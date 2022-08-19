package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.CommentVO;

import java.util.List;

public interface CommentService {
    List<CommentVO> commentList(BlogVO blogVO);
    int postComment(CommentVO commentVO);
    int putComment(CommentVO commentVO);
    int delComment(CommentVO commentVO);
}
