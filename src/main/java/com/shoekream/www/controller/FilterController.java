package com.shoekream.www.controller;

import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.filterVO.FilterSizeVO;
import com.shoekream.www.service.filterService.FilterBrandService;
import com.shoekream.www.service.filterService.FilterCategoryService;
import com.shoekream.www.service.filterService.FilterSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/filter/*")
public class FilterController {

    @Autowired private FilterCategoryService cService;
    @Autowired private FilterBrandService bService;
    @Autowired private FilterSizeService sService;

    // ====================================================================================================
    // GET category
    @GetMapping(value = "/ctgr/{categoryId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FilterCategoryVO> getCategory(@PathVariable("categoryId")int categoryId) {
        return new ResponseEntity<FilterCategoryVO>(cService.getCategory(categoryId), HttpStatus.OK);
    }
    @GetMapping(value = "/ctgr", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FilterCategoryVO>> getCategoryList() {
        return new ResponseEntity<>(cService.getCategoryList(), HttpStatus.OK);
    }

    // GET brand
    @GetMapping(value = "/brand/{brandId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FilterBrandVO> getBrand(@PathVariable("brandId")int brandId) {
        return new ResponseEntity<>(bService.getBrand(brandId), HttpStatus.OK);
    }
    @GetMapping(value = "/brad", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FilterBrandVO>> getBrandList() {
        return new ResponseEntity<List<FilterBrandVO>>(bService.getBrandList(),HttpStatus.OK);
    }

    // GET size
    @GetMapping(value = "/size/{sizeId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FilterSizeVO> getSize(@PathVariable("sizeId")int sizeId) {
        return new ResponseEntity<FilterSizeVO>(sService.getSize(sizeId), HttpStatus.OK);
    }
    @GetMapping(value = "/size", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FilterSizeVO>> getSizeList() {
        return new ResponseEntity<List<FilterSizeVO>>(sService.getSizeList(), HttpStatus.OK);
    }
    // ====================================================================================================


    // ====================================================================================================
    // POST category
    @PostMapping(value = "/ctgr")
    public ResponseEntity<String> postCategory(@RequestParam("categoryName")String categoryName) {
        return cService.postCategory(categoryName) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
