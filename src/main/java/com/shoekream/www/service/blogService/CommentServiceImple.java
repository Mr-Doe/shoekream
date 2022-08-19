package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImple implements CommentService {

    @Autowired CommentService cService;

    @Override
    public List<CommentVO> commentList(BlogVO blogVO) {
        return null;
    }

    @Override
    public int postComment(CommentVO commentVO) {
        return 0;
    }

    @Override
    public int putComment(CommentVO commentVO) {
        return 0;
    }

    @Override
    public int delComment(CommentVO commentVO) {
        return 0;
    }
}
