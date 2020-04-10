package com.xuxueli.xxljobexecutorlewy95.service.impl;

import com.xuxueli.xxljobexecutorlewy95.dao.CountryRepository;
import com.xuxueli.xxljobexecutorlewy95.pojo.Country;
import com.xuxueli.xxljobexecutorlewy95.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryRepository countryDao;


    @Override
    public Country getCountry(int id) {
        return countryDao.getOne(id);
    }
}
