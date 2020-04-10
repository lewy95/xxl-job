package com.xuxueli.xxljobexecutorlewy95.dao;

import com.xuxueli.xxljobexecutorlewy95.pojo.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lewy
 */
@Transactional
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
