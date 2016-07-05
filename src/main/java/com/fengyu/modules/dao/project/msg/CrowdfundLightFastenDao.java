package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundLightFasten;


@MyBatisDao
public interface CrowdfundLightFastenDao {
    //固定档位插入
    int insertFixed(CrowdfundLightFasten record);

}