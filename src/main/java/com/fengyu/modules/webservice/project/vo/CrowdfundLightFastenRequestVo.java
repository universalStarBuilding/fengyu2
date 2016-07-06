package com.fengyu.modules.webservice.project.vo;

public class CrowdfundLightFastenRequestVo {
    private String projectNo;

    private Long fastenAmt;             //单次支持多少钱

    private Integer count;              //支持次数

    private Integer limitCount;         //支持上限

    private Integer everyoneBuyCount;   //每人限购次数

    private String returnContent;       //回报内容

    private Integer userId;             //发起人编号

    private String img;                 //图片

    private Long amt;                   //目标金额

    private Integer limitDate;          //筹资期限

    private String phone;               //	联系电话

    private Double limitAmt;              //支持上限

    private String info;                //筹资目的

    private String moreInfo;            //更多描述

    private Boolean postAddressFlag;    //支持者是否提供收货地址

    private Boolean hiddenRaiseFlag;    //私密募集


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
    }

    public Integer getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Integer limitDate) {
        this.limitDate = limitDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getLimitAmt() {
        return limitAmt;
    }

    public void setLimitAmt(Double limitAmt) {
        this.limitAmt = limitAmt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Boolean getPostAddressFlag() {
        return postAddressFlag;
    }

    public void setPostAddressFlag(Boolean postAddressFlag) {
        this.postAddressFlag = postAddressFlag;
    }

    public Boolean getHiddenRaiseFlag() {
        return hiddenRaiseFlag;
    }

    public void setHiddenRaiseFlag(Boolean hiddenRaiseFlag) {
        this.hiddenRaiseFlag = hiddenRaiseFlag;
    }

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