package com.fengyu.modules.model;

public class CrowdfundOrganizer {
    private Integer id;

    private Integer userId;

    private String organizerNo;

    private String organizerName;

    private String organizerIntroduction;

    private String weiboUrl;

    private String telephone;

    private String thankYouNote;

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

    public String getOrganizerIntroduction() {
        return organizerIntroduction;
    }

    public void setOrganizerIntroduction(String organizerIntroduction) {
        this.organizerIntroduction = organizerIntroduction == null ? null : organizerIntroduction.trim();
    }

    public String getWeiboUrl() {
        return weiboUrl;
    }

    public void setWeiboUrl(String weiboUrl) {
        this.weiboUrl = weiboUrl == null ? null : weiboUrl.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getThankYouNote() {
        return thankYouNote;
    }

    public void setThankYouNote(String thankYouNote) {
        this.thankYouNote = thankYouNote == null ? null : thankYouNote.trim();
    }
}