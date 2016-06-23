package com.fengyu.modules.model;

import com.fengyu.common.page.Pagetables;

import java.util.Date;

/**
 * @FollowProject 我关注项目的实体类
 */
public class FollowProject extends Pagetables{
    private Integer id;

    private Integer userId;

    private Integer attentionNo;

    private String attentionType;

    private Date attentionTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAttentionNo() {
        return attentionNo;
    }

    public void setAttentionNo(Integer attentionNo) {
        this.attentionNo = attentionNo;
    }

    public String getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(String attentionType) {
        this.attentionType = attentionType == null ? null : attentionType.trim();
    }

    public Date getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(Date attentionTime) {
        this.attentionTime = attentionTime;
    }
}