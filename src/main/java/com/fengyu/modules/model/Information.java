package com.fengyu.modules.model;

import com.fengyu.common.persistence.DataEntity;

import java.util.Date;

public class Information extends DataEntity<Information> {

    private String title;

    private String author;

    private String quoteAddress;

    private String type;

    private Integer publishUserid;

    private Date publishDate;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getQuoteAddress() {
        return quoteAddress;
    }

    public void setQuoteAddress(String quoteAddress) {
        this.quoteAddress = quoteAddress == null ? null : quoteAddress.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
        this.content = content == null ? null : content.trim();
    }
}