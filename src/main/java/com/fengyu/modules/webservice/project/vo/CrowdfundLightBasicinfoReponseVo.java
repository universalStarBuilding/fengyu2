package com.fengyu.modules.webservice.project.vo;

public class CrowdfundLightBasicinfoReponseVo {
    private Integer id;

    private Integer userId;             //发起人编号

    private String projectNo;           //项目编号

    private String img;                 //图片

    private Long amt;                   //目标金额

    private Integer limitDate;          //筹资期限

    private String type;                //固定档次/任意档位

    private String phone;               //	联系电话

    private Double limitAmt;              //支持上限

    private String info;                //筹资目的

    private String moreInfo;            //更多描述

    private Boolean postAddressFlag;    //支持者是否提供收货地址

    private Boolean hiddenRaiseFlag;    //私密募集

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

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
        this.info = info == null ? null : info.trim();
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo == null ? null : moreInfo.trim();
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
}