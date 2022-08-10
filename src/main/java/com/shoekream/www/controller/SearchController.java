package com.shoekream.www.controller;

import com.shoekream.www.domain.SearchVO.SearchDTO;
import com.shoekream.www.domain.SearchVO.SearchVO;
import com.shoekream.www.service.searchService.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search/*")
public class SearchController {

    @Autowired private SearchService sService;

    @GetMapping("/modal")
    public void searchModalWindow() {}

    @GetMapping(value = "/{keyword}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SearchDTO> getSearchingWithKeyword(@PathVariable("keyword")String keyword) {
        return new ResponseEntity<SearchDTO>(sService.searchToProductAndBrand(keyword), HttpStatus.OK);
    }
}
