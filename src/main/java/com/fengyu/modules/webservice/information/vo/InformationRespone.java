package com.fengyu.modules.webservice.information.vo;

import java.util.Date;

/**
 * Created by admin on 2016/7/4.
 */
public class InformationRespone {

    private Integer id;

    private String title;

    private String author;

    private String quoteAddress;

    private String type;

    private Integer publishUserid;

    private Date publishDate;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuoteAddress() {
        return quoteAddress;
    }

    public void setQuoteAddress(String quoteAddress) {
        this.quoteAddress = quoteAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPublishUserid() {
        return publishUserid;
    }

    public void setPublishUserid(Integer publishUserid) {
        this.publishUserid = publishUserid;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
