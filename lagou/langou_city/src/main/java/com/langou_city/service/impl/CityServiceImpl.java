package com.langou_city.service.impl;

import com.lagou.lagou_common.entity.IdWorker;
import com.lagou.lagou_common.entity.Result;
import com.lagou.lagou_common.entity.ResultDto;
import com.lagou.lagou_common.entity.StatusCode;
import com.langou_city.dao.CityDao;
import com.langou_city.pojo.City;
import com.langou_city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService<City> {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public City findById(String id) {
        return cityDao.findById(id).get();
    }

    @Override
    public Result add(City city) {
        city.setId(idWorker.nextId()+"");
        cityDao.save(city);
        return new Result(true,StatusCode.OK,"增加成功");
    }

    @Override
    public Result deleteById(String id) {
        cityDao.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    @Override
    public Result update(City city) {
        city.setId(city.getId());
        cityDao.save(city);
        return new Result(true,StatusCode.OK,"修改");
    }

    @Override
    public Page<City> pageFindAll(Pageable pageable) {
        return cityDao.findAll(pageable);
    }
}
