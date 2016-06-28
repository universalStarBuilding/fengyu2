package com.fengyu.modules.service.project.publish;

import com.fengyu.common.utils.PKGenarator;
import com.fengyu.modules.dao.project.msg.CrowdfundBasicinfoDao;
import com.fengyu.modules.dao.project.publish.CrowdfundDetailDao;
import com.fengyu.modules.dao.project.publish.CrowdfundOrganizerDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.model.CrowdfundDetail;
import com.fengyu.modules.model.CrowdfundOrganizer;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishRequestVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by guozheng on 2016/6/28.
 */
@Service(value = "crowdfundPublishService")
@Transactional
public class CrowdfundPublishService {

    @Autowired
    private CrowdfundOrganizerDao crowdfundOrganizerDao;

    @Autowired
    private CrowdfundDetailDao crowdfundDetailDao;

    @Autowired
    private CrowdfundBasicinfoDao crowdfundBasicinfoDao;

    public Integer saveCrowdfundPublish(CrowdfundPublishRequestVo crowdfundPublishRequestVo) {

        CrowdfundOrganizer crowdfundOrganizer = new CrowdfundOrganizer();
        BeanUtils.copyProperties(crowdfundPublishRequestVo,crowdfundOrganizer);
        crowdfundOrganizer.setOrganizerNo(PKGenarator.getId());

        crowdfundOrganizerDao.insert(crowdfundOrganizer);

        CrowdfundBasicinfo crowdfundBasicinfo = new CrowdfundBasicinfo();
        BeanUtils.copyProperties(crowdfundPublishRequestVo,crowdfundBasicinfo);
        crowdfundBasicinfo.setProjectNo(PKGenarator.getId());
        crowdfundBasicinfo.setProjectState("funding");
        crowdfundBasicinfo.setOrganizerNo(crowdfundOrganizer.getOrganizerNo());
        crowdfundBasicinfo.setCreateTime(new Date());
        crowdfundBasicinfoDao.insert(crowdfundBasicinfo);

        CrowdfundDetail crowdfundDetail = new CrowdfundDetail();
        crowdfundDetail.setProjectNo(crowdfundBasicinfo.getProjectNo());
        crowdfundDetail.setProjectDetail(crowdfundPublishRequestVo.getProjectDetail());
        crowdfundDetailDao.insert(crowdfundDetail);

        return 1;
    }

    public CrowdfundPublishReponseVo get(Integer id) {

        return null;
    }
}