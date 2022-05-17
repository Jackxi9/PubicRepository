package com.langou_city.service;

import com.lagou.lagou_common.entity.Result;
import com.lagou.lagou_common.entity.ResultDto;
import com.langou_city.pojo.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService<T> {
    //查询所有
    public List<T> findAll();
    T findById(String id);
    Result add(T t);
    Result deleteById(String id);
    Result update(T t);
    Page pageFindAll(Pageable pageable);
}
