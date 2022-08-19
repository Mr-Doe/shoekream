package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.ImageVO;
import com.shoekream.www.repository.blogDAO.BlogDAO;
import com.shoekream.www.service.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired BlogDAO blogDAO;
    @Autowired ImageService iService;
    @Autowired MemberService mService;

    @Override
    public BlogVO getBlog(int blogId) {
        return blogDAO.selectBlog(blogId);
    }

    @Override
    public List<BlogVO> getPopularBlogList(int page) {
        return blogDAO.selectPopList(page);
    }

    @Override
    public List<BlogVO> getCurrentBlogList(int page) {
        return blogDAO.selectCurrList(page);
    }

    @Override
    public List<BlogVO> getFlowerBlogList(BlogVO blogVO) throws Exception {
        String followers = mService.getFollowersList(blogVO.getOwnEmail());
        if(followers == null) {
            throw new Exception("followers IS NULL");
        }
        blogVO.setFollowers(followers);
        return blogDAO.selectFollowList(blogVO);
    }

    @Override
    public int postBlog(BlogVO blogVO, MultipartFile[] files) throws Exception {

        if(this.checkObjectNull(blogVO) == false) { throw new Exception("OBJECT = NULL"); }
        if(this.checkImageFile(files) == false) { throw new Exception("이미지 파일이 아님"); }

        // todo blog 이미지 imageService로 넘겨서 ftp 처리
        List<ImageVO> convert2String = iService.postImages(files);

        String imageId = "";
        String imagePath = "";
        for (ImageVO idx : convert2String) {
            if(imageId.length() == 0 && imagePath.length() == 0) {
                imageId = String.valueOf(idx.getImageId());
                imagePath = idx.getImageUrl();
            } else {
                imageId += "," + String.valueOf(idx.getImageId());
                imagePath += "," + idx.getImageUrl();
            }
        }
        blogVO.setBlogImageId(imageId);
        blogVO.setBlogImagePath(imagePath);
        blogDAO.insertBlog(blogVO);
        return blogVO.getBlogId();
    }

    @Override
    public int putBlog(BlogVO blogVO, MultipartFile[] files) {
        return 0;
    }

    /**
     * @param blogVO ( int blogId, String ownEmail )
     * @return Success = 1, Failed = 0
     */
    @Override
    public int delBlog(BlogVO blogVO) throws Exception {

        if(this.checkObjectNull(blogVO) == false) { throw new Exception("OBJECT = NULL"); }
        if(this.checkBlogOwner(blogVO) == false) { throw new Exception("게시된 블로그와 작성자가 일치 하지 않음"); }

        BlogVO deleteBlog = blogDAO.selectBlog(blogVO.getBlogId());
        return 0;
    }

    boolean checkImageFile(MultipartFile[] files) {
        for (MultipartFile file : files) {
            if(!file.getContentType().contains("image/")) { return false; }
        }
        return true;
    }

    boolean checkBlogOwner(BlogVO blogVO) {
        if(blogDAO.selectBlogOwner(blogVO) == 0) { return false; }
        return true;
    }

    boolean checkObjectNull(Object object) {
        if(object == null) { return false; }
        return true;
    }
}
