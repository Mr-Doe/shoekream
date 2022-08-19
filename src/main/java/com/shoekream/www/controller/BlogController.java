package com.shoekream.www.controller;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.repository.blogDAO.ImageDAO;
import com.shoekream.www.service.blogService.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/blog/*")
public class BlogController {

    @Autowired private BlogService bService;
    @GetMapping("/home")
    public void getBlogHome() {}

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
            return new ResponseEntity<List<BlogVO>>(bService.getFlowerBlogList(blogVO), HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new ResponseEntity<List<BlogVO>>(HttpStatus.OK);
        }
    }

    @PostMapping(value = "/post")
    public String postBlog(BlogVO blogVO, MultipartFile[] files) {
        try {
            return String.valueOf(bService.postBlog(blogVO, files));
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

    @PostMapping("/test")
    public void test() {

    }
}
