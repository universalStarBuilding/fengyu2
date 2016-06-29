package com.fengyu.modules.model;

import com.fengyu.common.persistence.DataEntity;

import java.util.Date;

/**
 * @FollowProject 我关注项目的实体类
 */
public class CrowdfundAttention extends DataEntity<CrowdfundAttention>{

    private Integer userId;

    private String attentionNo;

    private String attentionType;

    private Date attentionTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAttentionNo() {
        return attentionNo;
    }

    public void setAttentionNo(String attentionNo) {
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