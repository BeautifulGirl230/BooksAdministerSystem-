package com.southwind.springboottext.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    //使Book通过类名绑定数据库
@Data   //自动生成各种各样的get方法
//创建一个实体类
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //设置自动获取id
    private Integer id;
    private String name;        /*名字*/
    private String author;      /*作者*/
    private String publish;     /*出版社*/
    private Integer pages;      /*页数*/
    private Double price;       /*价格*/
    private Integer bookcaseid; /*分类*/
    private Integer abled;      /*数量*/

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    public Integer getPages() {
        return pages;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getBookcaseid() {
        return bookcaseid;
    }

    public Integer getAbled() {
        return abled;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBookcaseid(Integer bookcaseid) {
        this.bookcaseid = bookcaseid;
    }

    public void setAbled(Integer abled) {
        this.abled = abled;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", bookcaseid=" + bookcaseid +
                ", abled=" + abled +
                '}';
    }
}
