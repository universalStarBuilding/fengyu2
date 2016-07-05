package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

/**
 * Created by admin on 2016/7/5.
 */
public class CrowdfundEvaluateRequestVo extends Pagetables {
    //根据用户ID发送请求
    private Integer userId;
    //根据项目编号查询
    private Integer projectNo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(Integer projectNo) {
        this.projectNo = projectNo;
    }
}
