package com.fengyu.modules.webservice.project.vo;

/**
 * Created by admin on 2016/6/28.
 */
public class CrowdfundPublishReponseVo {

    private String projectNo;               //项目编号
    private Integer userId;                  //用户编号
    private String projectName;             //项目名称
    private String projectSummary;         //项目一句话描述
    private String projectType;             //项目类型
    private String projectCategory;        //项目种类   （标签）
    private Double fundAmt;                 //筹资金额
    private Double fundLimitAmt;            //筹资上限
    private Integer fundPeriod;              //筹资天数
    private Boolean lastingFundFlag;       //是否为永久众筹
    private String projectVideo;            //视频介绍
    private String projectListImage;        //列表图片
    private String projectImage;            //项目图片
    private String projectSynopsis;         //项目简介
    private String projectDetail;           //项目详情

    //发起方信息
    private String organizerNo;             //发起人编号
    private String organizerName;            //发起方姓名
    private String organizerIntroduction;   //发起人介绍
    private String weiboUrl;                 //微博地址
    private String telephone;                //联系电话
    private String thankYouNote;             //感谢信


    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
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
        this.organizerName = organizerName;
    }

    public String getOrganizerIntroduction() {
        return organizerIntroduction;
    }

    public void setOrganizerIntroduction(String organizerIntroduction) {
        this.organizerIntroduction = organizerIntroduction;
    }

    public String getWeiboUrl() {
        return weiboUrl;
    }

    public void setWeiboUrl(String weiboUrl) {
        this.weiboUrl = weiboUrl;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getThankYouNote() {
        return thankYouNote;
    }

    public void setThankYouNote(String thankYouNote) {
        this.thankYouNote = thankYouNote;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public Double getFundAmt() {
        return fundAmt;
    }

    public void setFundAmt(Double fundAmt) {
        this.fundAmt = fundAmt;
    }

    public Double getFundLimitAmt() {
        return fundLimitAmt;
    }

    public void setFundLimitAmt(Double fundLimitAmt) {
        this.fundLimitAmt = fundLimitAmt;
    }

    public Integer getFundPeriod() {
        return fundPeriod;
    }

    public void setFundPeriod(Integer fundPeriod) {
        this.fundPeriod = fundPeriod;
    }

    public Boolean getLastingFundFlag() {
        return lastingFundFlag;
    }

    public void setLastingFundFlag(Boolean lastingFundFlag) {
        this.lastingFundFlag = lastingFundFlag;
    }

    public String getProjectVideo() {
        return projectVideo;
    }

    public void setProjectVideo(String projectVideo) {
        this.projectVideo = projectVideo;
    }

    public String getProjectListImage() {
        return projectListImage;
    }

    public void setProjectListImage(String projectListImage) {
        this.projectListImage = projectListImage;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public String getProjectSynopsis() {
        return projectSynopsis;
    }

    public void setProjectSynopsis(String projectSynopsis) {
        this.projectSynopsis = projectSynopsis;
    }
}
