package com.fengyu.modules.service.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundOrganizer;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerRequestVo;

import java.util.List;

@MyBatisDao
public interface CrowdfundOrganizerService {
    int deleteByPrimaryKey(Integer id);

    int insert(CrowdfundOrganizer record);

    int insertSelective(CrowdfundOrganizer record);

    CrowdfundOrganizer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrowdfundOrganizer record);

    int updateByPrimaryKey(CrowdfundOrganizer record);

    //查询发起人信息
    List<CrowdfundOrganizerReponseVo> getLaunch(CrowdfundOrganizerRequestVo crowdfundOrganizerRequestVo);
}