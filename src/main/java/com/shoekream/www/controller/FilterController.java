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
import java.util.Map;

@Controller
@RequestMapping("/filter/*")
public class FilterController {

    @Autowired private FilterCategoryService cService;
    @Autowired private FilterBrandService bService;
    @Autowired private FilterSizeService sService;

    // ====================================================================================================
    @GetMapping(value = "/ctgr/{categoryId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FilterCategoryVO> getCategory(@PathVariable("categoryId")int categoryId) {
        return new ResponseEntity<FilterCategoryVO>(cService.getCategory(categoryId), HttpStatus.OK);
    }
    @GetMapping(value = "/ctgr", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FilterCategoryVO>> getCategoryList() {
        return new ResponseEntity<>(cService.getCategoryList(), HttpStatus.OK);
    }

    @GetMapping(value = "/brand/{brandId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<FilterBrandVO> getBrand(@PathVariable("brandId")int brandId) {
        return new ResponseEntity<>(bService.getBrand(brandId), HttpStatus.OK);
    }
    @GetMapping(value = "/brand", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<FilterBrandVO>> getBrandList() {
        return new ResponseEntity<List<FilterBrandVO>>(bService.getBrandList(),HttpStatus.OK);
    }

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
    @PostMapping(value = "/ctgr", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> postCategory(@RequestBody FilterCategoryVO categoryVO) {
        return cService.postCategory(categoryVO.getCategoryName()) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping(value = "/ctgr", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> putCategory(@RequestBody FilterCategoryVO categoryVO) {
        return cService.putCategory(categoryVO) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping(value = "/ctgr", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> delCategory(@RequestBody FilterCategoryVO categoryVO) {
        return cService.delCategory(categoryVO.getCategoryId()) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    // ====================================================================================================


    // ====================================================================================================
    @PostMapping(value = "/brand", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> postBrand(@RequestBody FilterBrandVO brandVO ) {
        return bService.postBrand(brandVO.getBrandName()) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping(value = "/brand", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> putBrand(@RequestBody FilterBrandVO brandVO) {
        return bService.putBrand(brandVO) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping(value = "/brand", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> delBrand(@RequestBody FilterBrandVO brandVO) {
        return bService.delBrand(brandVO.getBrandId()) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    // ====================================================================================================

    // ====================================================================================================
    @PostMapping(value = "/size", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> postBrand(@RequestBody Map<String, String> test) {
        return sService.postSize(test.get("sizeValue")) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping(value = "/size", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> putBrand(@RequestBody FilterSizeVO sizeVO) {
        return sService.putSize(sizeVO) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping(value = "/size", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> delBrand(@RequestBody FilterSizeVO sizeVO) {
        return sService.delSize(sizeVO.getSizeId()) > 0 ?
                new ResponseEntity<String>("1", HttpStatus.OK)
                : new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    // ====================================================================================================
    
}
