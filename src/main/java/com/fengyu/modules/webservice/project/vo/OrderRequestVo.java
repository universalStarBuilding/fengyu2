package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import java.util.Date;

/**
 * Created by admin on 2016/7/2.
 */
public class OrderRequestVo extends Pagetables{
    private Integer orderOwner;//编号
    private String orderState;//状态
    private Date submitTime;//创建时间
    private double orderAmt;//订单金额
    private Integer userid;//用户编号
    private String projectListImg;//项目头像
    private String projectName;//项目名称

    public Integer getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(Integer orderOwner) {
        this.orderOwner = orderOwner;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public double getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(double orderAmt) {
        this.orderAmt = orderAmt;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getProjectListImg() {
        return projectListImg;
    }

    public void setProjectListImg(String projectListImg) {
        this.projectListImg = projectListImg;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}