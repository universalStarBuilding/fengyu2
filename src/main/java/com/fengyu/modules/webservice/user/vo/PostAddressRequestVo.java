package com.fengyu.modules.webservice.user.vo;

import com.fengyu.common.page.Pagetables;

/**
 * Created by admin on 2016/7/1.
 */
public class PostAddressRequestVo extends Pagetables{

    private Integer userId;//用户编号

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
