package com.fengyu.modules.webservice.project.vo;

public class CrowdfundLightBasicinfoRequestVo {
    private Integer id;

    private Integer userId;

    private String projectNo;

    private String img;

    private Long amt;

    private Integer limitDate;

    private String type;

    private String phone;

    private Double limitAmt;

    private String info;

    private String moreInfo;

    private Boolean postAddressFlag;

    private Boolean hiddenRaiseFlag;

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