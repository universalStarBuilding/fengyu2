package com.fengyu.modules.dao.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundDetail;


@MyBatisDao
public interface CrowdfundDetailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CrowdfundDetail record);

    int insertSelective(CrowdfundDetail record);

    CrowdfundDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrowdfundDetail record);

    int updateByPrimaryKeyWithBLOBs(CrowdfundDetail record);

    int updateByPrimaryKey(CrowdfundDetail record);
}