package com.lagou.lagou_common.entity;


import java.util.List;

/**
 * 封装分页数据的类
 * @param <E> pojo中的实体类
 */
public class ResultDto<E> {
    private Integer pageNo;//第几页    1
    private Integer pageSize;//一页几条数据   7
    private Long totalRecord;//一共有多少条记录
    private Integer totalPage;//总页数
    private List<E> results;//数据

    public ResultDto(){
        super();
    }

    public ResultDto(Integer pageNo, Integer pageSize, Long totalRecord, Integer totalPage, List<E> results){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.results = results;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<E> getResults() {
        return results;
    }

    public void setResults(List<E> results) {
        this.results = results;
    }
}
