package com.fengyu.modules.dao.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundOrganizer;

@MyBatisDao
public interface CrowdfundOrganizerDao {

    int insert(CrowdfundOrganizer record);

    CrowdfundOrganizer getDetailByOrganizerNo(String organizerNo);
    int insertSelective(CrowdfundOrganizer record);

    CrowdfundOrganizer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrowdfundOrganizer record);

    int updateByPrimaryKey(CrowdfundOrganizer record);

    //查询发起人信息
    CrowdfundOrganizerReponseVo getLaunch(CrowdfundOrganizerRequestVo crowdfundOrganizerRequestVo);
}