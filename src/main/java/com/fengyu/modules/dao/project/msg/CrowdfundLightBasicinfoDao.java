package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundLightBasicinfo;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightBasicinfoRequestVo;

@MyBatisDao
public interface CrowdfundLightBasicinfoDao {

    //添加任意档位
    void insertSelective(CrowdfundLightBasicinfo crowdfundLightBasicinfo);

}