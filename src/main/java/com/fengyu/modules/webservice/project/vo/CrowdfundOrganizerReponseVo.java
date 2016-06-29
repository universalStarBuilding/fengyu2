package com.fengyu.modules.webservice.project.vo;

public class CrowdfundOrganizerReponseVo {

    private String organizerNo;

    private String organizerName; //发起人姓名

    private String realName;  //用户姓名

    private String headImg;//用户头像

    private  Integer launchTotal;//用户发起项目的总数

    private Integer supportTotal;//用户支持的总数

    public Integer getLaunchTotal() {
        return launchTotal;
    }

    public void setLaunchTotal(Integer launchTotal) {
        this.launchTotal = launchTotal;
    }

    public Integer getSupportTotal() {
        return supportTotal;
    }

    public void setSupportTotal(Integer supportTotal) {
        this.supportTotal = supportTotal;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getOrganizerNo() {
        return organizerNo;
    }

    public void setOrganizerNo(String organizerNo) {
        this.organizerNo = organizerNo;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName == null ? null : organizerName.trim();
    }

}