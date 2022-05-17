package com.langou_city.controller;

import com.lagou.lagou_common.entity.Result;
import com.lagou.lagou_common.entity.ResultDto;
import com.lagou.lagou_common.entity.StatusCode;
import com.langou_city.pojo.City;
import com.langou_city.service.CityService;
import com.langou_city.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

//    @Autowired
//    private CityServiceImpl cityServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public Result getAll(){
        List<City> cityAll = cityService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",cityAll);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result getCityById(@PathVariable String id){
        City city = (City)cityService.findById(id);
        return new Result(true,StatusCode.OK,"查找成功",city);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result addCity(@RequestBody  City city){
        return cityService.add(city);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteCityById(@PathVariable String id){
        return cityService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Result update(@RequestBody City city){
//        return cityService.update(city);
        System.out.println(city);
        city.setId(city.getId());
        return cityService.update(city);
    }
    @GetMapping("/page")
    public ResultDto pageGetAll(@RequestParam("pageNo") Integer pageNo,@RequestParam("pageSize") Integer pageSize){
//        int a = 0;
//        int b = 1/a;
        Page page = cityService.pageFindAll(PageRequest.of(pageNo-1, pageSize));
        return new ResultDto(page.getNumber(),page.getSize(),page.getTotalElements(),page.getTotalPages(),page.getContent());

    }
}
