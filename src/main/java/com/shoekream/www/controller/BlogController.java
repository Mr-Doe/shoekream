package com.shoekream.www.controller;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.repository.blogDAO.ImageDAO;
import com.shoekream.www.service.blogService.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/blog/*")
public class BlogController {

    @Autowired private BlogService bService;
    @GetMapping("/home")
    public void getBlogHome() {}

    @GetMapping("/page")
    public String getMyBlog() {
        return "/member/blog";
    }

    @GetMapping(value = "search/{keywords}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BlogVO>> getSearchedItems(@PathVariable String keywords) {
        return new ResponseEntity<List<BlogVO>>(bService.getSearchItems(keywords), HttpStatus.OK);
    }

    @PostMapping(value = "/page/post-img", consumes = "application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BlogVO>> getBlogPageImage(@RequestBody BlogVO blogVO) {
        return new ResponseEntity<List<BlogVO>>(bService.getBlogPageImage(blogVO), HttpStatus.OK);
    }

    @GetMapping(value = "/ext/{blogId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BlogVO> getBlogExtension(@PathVariable int blogId) {
        return new ResponseEntity<BlogVO>(bService.getBlog(blogId), HttpStatus.OK);
    }

    @GetMapping(value = "/pop_blog/{page}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BlogVO>> getPopularBlogList(@PathVariable int page) {
        return new ResponseEntity<List<BlogVO>>(bService.getPopularBlogList(page), HttpStatus.OK);
    }

    @GetMapping(value = "/curr_blog/{page}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BlogVO>> getCurrentBlogList(@PathVariable int page) {
        return new ResponseEntity<List<BlogVO>>(bService.getCurrentBlogList(page), HttpStatus.OK);
    }

    @GetMapping(value = "/follow_blog", consumes = "application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<BlogVO>> getFollowerBlogList(@RequestBody BlogVO blogVO) {
        try{
            return new ResponseEntity<List<BlogVO>>(bService.getFollowerBlogList(blogVO), HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new ResponseEntity<List<BlogVO>>(HttpStatus.OK);
        }
    }

    @GetMapping(value = "/posting-count/{ownEmail}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BlogVO> getOwnPostingCount(@PathVariable String ownEmail) {
        return new ResponseEntity<BlogVO>(bService.getOwnPostingCount(ownEmail), HttpStatus.OK);
    }

    @PostMapping(value = "/post")
    public String postBlog(BlogVO blogVO, MultipartFile[] files) {
        try {
            int result = bService.postBlog(blogVO, files);
            return result > 0 ? "/member/blog" : "";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "블로그 등록 실패";
        }
    }

    @DeleteMapping(value = "del", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> deleteBlog(@RequestBody BlogVO blogVO) {
        try {
            if(bService.delBlog(blogVO) > 0) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                throw new Exception("블로그 삭제 실패");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @Autowired ImageDAO test;

    @GetMapping(value = "/blog_modal", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String test(Model model, BlogVO blogVO) {
        model.addAttribute("bvo", bService.getBlog(blogVO.getBlogId()));
        return "/member/blog_modal";
    }
}
