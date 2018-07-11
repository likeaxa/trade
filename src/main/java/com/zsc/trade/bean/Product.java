package com.zsc.trade.bean;

public class Product {
    private Integer id;
    private String name;
    private String price;
    private String gmt_create;
    private String description;
    private Integer cate_id;
    private Integer is_sold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public Integer getIs_sold() {
        return is_sold;
    }

    public void setIs_sold(Integer is_sold) {
        this.is_sold = is_sold;
    }
}