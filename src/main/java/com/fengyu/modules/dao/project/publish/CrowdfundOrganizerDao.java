package com.fengyu.modules.dao.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundOrganizer;

@MyBatisDao
public interface CrowdfundOrganizerDao {

    int insert(CrowdfundOrganizer record);

    CrowdfundOrganizer getDetailByOrganizerNo(String organizerNo);
}