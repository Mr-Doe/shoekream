package com.shoekream.www.controller;

import com.shoekream.www.domain.shopVO.ShopVO;
import com.shoekream.www.repository.shopDAO.ShopDAO;
import com.shoekream.www.service.shopService.ShopService;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/shop/*")
public class ShopController {

    @Autowired private ShopService sService;
    @Autowired private ShopDAO test;

    @GetMapping("/list")
    public void getStart() {
    }

    @GetMapping(value = "/get_items", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ShopVO>> getItemList() {
        return new ResponseEntity<List<ShopVO>>(sService.getItems(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public String postItem(ShopVO shopVO, @RequestParam MultipartFile[] files) {
        try {
            return String.valueOf(sService.postItem(shopVO, files)); // retrun = INSERT한 쿼리 ID
        }catch (Exception e) {
            System.err.println(e.getMessage());
            return "0";
        }
    }

    @PutMapping("/put")
    public String updateItem(ShopVO shopVO, @RequestParam MultipartFile[] files) {
        try {
            return "";
        }catch (Exception e) {
            System.err.println(e.getMessage());
            return "0";
        }
    }

    @DeleteMapping("del/{pno}")
    public String deleteItem(@PathVariable("pno")int pno) {
        try {
            return String.valueOf(sService.removeItem(pno));
        }catch (Exception e) {
            System.err.println(e.getMessage());
            return "0";
        }
    }

    @GetMapping("/test")
    public void test() {}


}
