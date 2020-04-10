package com.xuxueli.xxljobexecutorlewy95.controller;

import com.xuxueli.xxljobexecutorlewy95.service.CountryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rest/country")
public class CountryController {

    @Resource
    private CountryService countryService;

    @RequestMapping("detail/{id}")
    public String getCountry(@PathVariable int id) {
        return countryService.getCountry(id).toString();
    }
}