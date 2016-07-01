package com.fengyu.modules.webservice.user.vo;

import com.fengyu.common.page.Pagetables;

/**
 * Created by admin on 2016/7/1.
 */
public class PostAddressResponseVo{
    private Integer id;
    private Integer userId;//用户编号
    private Integer postCode;//邮政编码
    private String postUser;//收货人
    private Integer mobile;//手机
    private Integer provinceId;//省
    private Integer cityId;//市
    private Integer countyId;//县
    private String addressDetail;//详细地址
    private Boolean isDefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getPostUser() {
        return postUser;
    }

    public void setPostUser(String postUser) {
        this.postUser = postUser;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
}
