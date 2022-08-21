package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.ImageVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BlogService {
    BlogVO getBlog(int blogId);
    List<BlogVO> getSearchItems(String keywords);
    List<BlogVO> getBlogPageImage(BlogVO blogVO);
    List<BlogVO> getPopularBlogList(int page);
    List<BlogVO> getCurrentBlogList(int page);
    List<BlogVO> getFollowerBlogList(BlogVO blogVO) throws Exception;
    BlogVO getOwnPostingCount(String ownEmail);

    int postBlog(BlogVO blogVO, MultipartFile[] files) throws Exception;
    int putBlog(BlogVO blogVO, MultipartFile[] files) throws Exception;
    int delBlog(BlogVO blogVO) throws Exception;
}
