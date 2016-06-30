package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import java.util.Date;

public class CrowdfundBasicinfoVo extends Pagetables{
    private Integer id;

    private String projectNo;

    private Integer userId;

    private String projectName;

    private String projectType;

    private String projectCategory;

    private String projectLocationProvince;

    private String projectLocationCity;

    private String projectLocationDistrict;

    private String projectLocationDetail;

    private String projectSynopsis;

    private String projectSummary;

    private String projectState;

    private Integer organizerNo;

    private Double fundAmt;

    private Double fundLimitAmt;

    private String fundTotalAmt;

    private Integer fundPeriod;

    private Boolean lastingFundFlag;

    private Integer preparePeriod;

    private String projectVideo;

    private String projectListImage;

    private String projectImage;

    private Date createTime;

    private Date releasesTime;

    private Date shelvesTime;

    private Boolean hot;

    private Integer hotNum;

    private String orderOwner;

    public String getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(String orderOwner) {
        this.orderOwner = orderOwner;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Integer getHotNum() {
        return hotNum;
    }

    public void setHotNum(Integer hotNum) {
        this.hotNum = hotNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory == null ? null : projectCategory.trim();
    }

    public String getProjectLocationProvince() {
        return projectLocationProvince;
    }

    public void setProjectLocationProvince(String projectLocationProvince) {
        this.projectLocationProvince = projectLocationProvince == null ? null : projectLocationProvince.trim();
    }

    public String getProjectLocationCity() {
        return projectLocationCity;
    }

    public void setProjectLocationCity(String projectLocationCity) {
        this.projectLocationCity = projectLocationCity == null ? null : projectLocationCity.trim();
    }

    public String getProjectLocationDistrict() {
        return projectLocationDistrict;
    }

    public void setProjectLocationDistrict(String projectLocationDistrict) {
        this.projectLocationDistrict = projectLocationDistrict == null ? null : projectLocationDistrict.trim();
    }

    public String getProjectLocationDetail() {
        return projectLocationDetail;
    }

    public void setProjectLocationDetail(String projectLocationDetail) {
        this.projectLocationDetail = projectLocationDetail == null ? null : projectLocationDetail.trim();
    }

    public String getProjectSynopsis() {
        return projectSynopsis;
    }

    public void setProjectSynopsis(String projectSynopsis) {
        this.projectSynopsis = projectSynopsis == null ? null : projectSynopsis.trim();
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary == null ? null : projectSummary.trim();
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState == null ? null : projectState.trim();
    }

    public Integer getOrganizerNo() {
        return organizerNo;
    }

    public void setOrganizerNo(Integer organizerNo) {
        this.organizerNo = organizerNo;
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

    public String getFundTotalAmt() {
        return fundTotalAmt;
    }

    public void setFundTotalAmt(String fundTotalAmt) {
        this.fundTotalAmt = fundTotalAmt == null ? null : fundTotalAmt.trim();
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

    public Integer getPreparePeriod() {
        return preparePeriod;
    }

    public void setPreparePeriod(Integer preparePeriod) {
        this.preparePeriod = preparePeriod;
    }

    public String getProjectVideo() {
        return projectVideo;
    }

    public void setProjectVideo(String projectVideo) {
        this.projectVideo = projectVideo == null ? null : projectVideo.trim();
    }

    public String getProjectListImage() {
        return projectListImage;
    }

    public void setProjectListImage(String projectListImage) {
        this.projectListImage = projectListImage == null ? null : projectListImage.trim();
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage == null ? null : projectImage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getReleasesTime() {
        return releasesTime;
    }

    public void setReleasesTime(Date releasesTime) {
        this.releasesTime = releasesTime;
    }

    public Date getShelvesTime() {
        return shelvesTime;
    }

    public void setShelvesTime(Date shelvesTime) {
        this.shelvesTime = shelvesTime;
    }
}