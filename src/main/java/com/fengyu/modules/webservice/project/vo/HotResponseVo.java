package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import java.math.BigDecimal;
import java.util.Date;

public class HotResponseVo extends Pagetables{
    private String projectNo;//项目编号
public class HotResponseVo{

    private Integer userId;//用户编号

    private String projectNo;//项目编号

    private String projectName;//项目名称

    private String projectState;//状态

    private Double fundAmt;//目标金额

    private String fundTotalAmt;//已筹金额

    private String projectImage;//项目图片

    public String getProjectNo() {
    private Integer number;//支持人数

    private String projectListImage;//详情页图片

    private String projectSynopsis;//项目简介

    private Integer followNumber;//关注人数

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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


    public BigDecimal getFundAmt() {
        return fundAmt;
    }

    public void setFundAmt(BigDecimal fundAmt) {
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