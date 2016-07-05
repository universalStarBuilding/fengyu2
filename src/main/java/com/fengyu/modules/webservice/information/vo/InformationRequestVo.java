package com.fengyu.modules.webservice.information.vo;

import com.fengyu.common.page.Pagetables;

/**
 * Created by admin on 2016/7/4.
 */
public class InformationRequestVo extends Pagetables{

    private Integer id;

    private Integer publishUserid;

    public Integer getPublishUserid() {
        return publishUserid;
    }

    public void setPublishUserid(Integer publishUserid) {
        this.publishUserid = publishUserid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
