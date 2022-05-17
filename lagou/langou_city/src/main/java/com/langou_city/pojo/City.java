package com.langou_city.pojo;

import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//CREATE TABLE `tb_city` (
//        `id`  varchar(20)  NOT NULL COMMENT '城市id',
//        `labelname`  varchar(100)  DEFAULT NULL COMMENT '城市名称',
//        `labeldesc`  varchar(100)  DEFAULT NULL COMMENT '城市描述',
//        `state`  varchar(1) DEFAULT NULL COMMENT '状态0禁用 1启用 2热门',
//        `remark`  varchar(100)  DEFAULT NULL COMMENT '备注 ',
//        `sort`    int(11) DEFAULT NULL COMMENT '备注 ',
//        PRIMARY KEY (`id`)
//        )
@Entity
@Table(name="tb_city")
public class City {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "labelname")
    private String labelname;
    @Column(name = "labeldesc")
    private String labeldesc;
    @Column(name = "state")
    private String state;
    @Column(name = "remark")
    private String remark;
    @Column(name = "sort")
    private Integer sort;

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", labelname='" + labelname + '\'' +
                ", labeldesc='" + labeldesc + '\'' +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                ", sort=" + sort +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getLabeldesc() {
        return labeldesc;
    }

    public void setLabeldesc(String labeldesc) {
        this.labeldesc = labeldesc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public City() {
    }



    public City(String id, String labelname, String labeldesc, String state, String remark, Integer sort) {
        this.id = id;
        this.labelname = labelname;
        this.labeldesc = labeldesc;
        this.state = state;
        this.remark = remark;
        this.sort = sort;
    }
}
