package com.fengyu.modules.dao.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundDetail;


@MyBatisDao
public interface CrowdfundDetailDao {

    int insert(CrowdfundDetail record);

    CrowdfundDetail getDetailbyProjectNo(String projectNo);
}