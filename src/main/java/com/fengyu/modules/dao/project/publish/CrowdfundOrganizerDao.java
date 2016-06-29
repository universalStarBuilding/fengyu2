package com.fengyu.modules.dao.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundOrganizer;

@MyBatisDao
public interface CrowdfundOrganizerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CrowdfundOrganizer record);

    int insertSelective(CrowdfundOrganizer record);

    CrowdfundOrganizer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrowdfundOrganizer record);

    int updateByPrimaryKey(CrowdfundOrganizer record);
}