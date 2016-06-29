package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;
import com.fengyu.common.persistence.DataEntity;


public class HotRequestVo extends DataEntity<HotRequestVo>{
    private String projectNo;//项目编号

    private Integer orderOwner;//支人数

    private String projectName;//项目名称

    private String projectState;//状态

    private Double fundAmt;//目标金额

    private String fundTotalAmt;//已筹金额

    private String projectImage;//项目图片

    private Integer number;//支持人数

    private String projectListImage;//详情页图片

    private String projectSynopsis;//项目简介

    private Integer followNumber;//关注人数

    public String getProjectListImage() {
        return projectListImage;
    }

    public void setProjectListImage(String projectListImage) {
        this.projectListImage = projectListImage;
    }

    public String getProjectSynopsis() {
        return projectSynopsis;
    }

    public void setProjectSynopsis(String projectSynopsis) {
        this.projectSynopsis = projectSynopsis;
    }

    public Integer getFollowNumber() {
        return followNumber;
    }

    public void setFollowNumber(Integer followNumber) {
        this.followNumber = followNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Integer getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(Integer orderOwner) {
        this.orderOwner = orderOwner;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState == null ? null : projectState.trim();
    }


    public Double getFundAmt() {
        return fundAmt;
    }

    public void setFundAmt(Double fundAmt) {
        this.fundAmt = fundAmt;
    }

    public String getFundTotalAmt() {
        return fundTotalAmt;
    }

    public void setFundTotalAmt(String fundTotalAmt) {
        this.fundTotalAmt = fundTotalAmt == null ? null : fundTotalAmt.trim();
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage == null ? null : projectImage.trim();
    }

}