package com.shoekream.www.repository.blogDAO;

import com.shoekream.www.domain.blogVO.ImageVO;
import com.shoekream.www.domain.blogVO.ItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageDAO {

    List<ImageVO> getImagesListWithIDsList(List<String> imageIDsList);
    List<ImageVO> getImageeList(String imageId);

    int insertBlogImage(ImageVO imageVO);

}
