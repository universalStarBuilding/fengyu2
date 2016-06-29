package com.fengyu.modules.webservice.project.vo;

public class CrowdfundOrganizerReponseVo {

    private String organizerIntroduction;       //发起方介绍
    private String projectSynopsis;             //发起方详细介绍
    private String weiboUrl;                    //微博地址
    private String thankYouNote;                //感谢信
    private String telephone;                   //联系电话
    private String organizerNo;                 //发起人编号

    public String getOrganizerNo() {
        return organizerNo;
    }

    public void setOrganizerNo(String organizerNo) {
        this.organizerNo = organizerNo;
    }

    public String getOrganizerIntroduction() {
        return organizerIntroduction;
    }

    public void setOrganizerIntroduction(String organizerIntroduction) {
        this.organizerIntroduction = organizerIntroduction;
    }

    public String getProjectSynopsis() {
        return projectSynopsis;
    }

    public void setProjectSynopsis(String projectSynopsis) {
        this.projectSynopsis = projectSynopsis;
    }

    public String getWeiboUrl() {
        return weiboUrl;
    }

    public void setWeiboUrl(String weiboUrl) {
        this.weiboUrl = weiboUrl;
    }

    public String getThankYouNote() {
        return thankYouNote;
    }

    public void setThankYouNote(String thankYouNote) {
        this.thankYouNote = thankYouNote;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}