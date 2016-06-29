package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class CrowdfundAttentionRequestVo extends Pagetables{
    private Integer id;

    private Integer userId;

    private String attentionNo;

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