package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.ImageVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
    List<ImageVO> getImageeList(String imageId);
    List<ImageVO> postImages(MultipartFile[] files) throws Exception;
    boolean putImages(BlogVO blogVO, MultipartFile[] files) throws Exception;
    boolean delImages(BlogVO blogVO);
}
