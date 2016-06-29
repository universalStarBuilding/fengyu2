package com.fengyu.modules.service.project.publish;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.dao.project.msg.CrowdfundBasicinfoDao;
import com.fengyu.modules.dao.project.publish.CrowdfundOrganizerDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.model.CrowdfundOrganizer;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "crowdfundOrganizerService")
@Transactional
public class CrowdfundOrganizerService {

    @Autowired
    private CrowdfundOrganizerDao crowdfundOrganizerDao;

    @Autowired
    private CrowdfundBasicinfoDao crowdfundBasicinfoDao;

    public CrowdfundOrganizerReponseVo getLaunch(CrowdfundOrganizerRequestVo crowdfundOrganizerRequestVo){
        CrowdfundOrganizerReponseVo corv=crowdfundOrganizerDao.getLaunch(crowdfundOrganizerRequestVo);
        return corv;
    }

}