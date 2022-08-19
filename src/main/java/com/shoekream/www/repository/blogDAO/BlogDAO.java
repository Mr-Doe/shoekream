package com.shoekream.www.repository.blogDAO;

import com.shoekream.www.domain.blogVO.BlogVO;

import java.util.List;

public interface BlogDAO {

    BlogVO selectBlog(int blogId);
    List<BlogVO> selectPopList(int page);
    List<BlogVO> selectCurrList(int page);
    List<BlogVO> selectFollowList(BlogVO blogVO);

    int selectBlogOwner(BlogVO blogVO);
    int insertBlog(BlogVO blogVO);
}
