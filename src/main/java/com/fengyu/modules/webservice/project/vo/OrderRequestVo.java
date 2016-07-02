package com.fengyu.modules.webservice.project.vo;

/**
 * Created by admin on 2016/7/2.
 */
public class OrderRequestVo {
    private Integer orderOwner;
    private String orderState;

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(Integer orderOwner) {
        this.orderOwner = orderOwner;
    }
}
