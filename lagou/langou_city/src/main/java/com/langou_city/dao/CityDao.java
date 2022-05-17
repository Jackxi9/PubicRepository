package com.langou_city.dao;

import com.langou_city.pojo.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City,String>, JpaSpecificationExecutor<City> {

    /**
     * 分页查询
     */
    @Override
    Page<City> findAll(Pageable pageable);
}
