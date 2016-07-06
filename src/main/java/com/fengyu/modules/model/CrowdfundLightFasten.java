package com.fengyu.modules.model;

public class CrowdfundLightFasten {
    private String projectNo;

    private Long fastenAmt;

    private Integer count;

    private Integer limitCount;

    private Integer everyoneBuyCount;

    private String returnContent;

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Long getFastenAmt() {
        return fastenAmt;
    }

    public void setFastenAmt(Long fastenAmt) {
        this.fastenAmt = fastenAmt;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getEveryoneBuyCount() {
        return everyoneBuyCount;
    }

    public void setEveryoneBuyCount(Integer everyoneBuyCount) {
        this.everyoneBuyCount = everyoneBuyCount;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }
}