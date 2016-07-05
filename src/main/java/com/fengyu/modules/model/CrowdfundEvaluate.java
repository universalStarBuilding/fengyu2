package com.fengyu.modules.model;

import com.fengyu.common.persistence.DataEntity;

public class CrowdfundEvaluate extends DataEntity<CrowdfundEvaluate>{

    private String projectNo;

    private Integer userId;

    private Integer satisfation;

    private String label;

    private String content;

    private String img;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSatisfation() {
        return satisfation;
    }

    public void setSatisfation(Integer satisfation) {
        this.satisfation = satisfation;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}