package com.fengyu.modules.webservice.project.vo;

public class CrowdfundLightFastenReqonseVo {
    private String projectNo;               //项目编号

    private Long fastenAmt;                 //单次支持多少钱

    private Integer count;                  //支持次数

    private Integer limitCount;             //支持上限

    private Integer everyoneBuyCount;       //每人限购次数

    private String returnContent;           //回报内容

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