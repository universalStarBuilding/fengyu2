package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundLightBasicinfoDao;
import com.fengyu.modules.model.CrowdfundLightBasicinfo;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightBasicinfoRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/7/5.
 */
@Service(value = "crowdfundLightBasicinfoService")
@Transactional
public class CrowdfundLightBasicinfoService {

    @Autowired
    private CrowdfundLightBasicinfoDao crowdfundLightBasicinfoDao;

    /**
     * 添加任意档位
     * @param clbrv
     */
    public void insertSelective(CrowdfundLightBasicinfoRequestVo clbrv){
        CrowdfundLightBasicinfo clb=new CrowdfundLightBasicinfo();
        clb.setImg(clbrv.getImg());
        clb.setInfo(clbrv.getInfo());
        clb.setMoreInfo(clbrv.getMoreInfo());
        clb.setAmt(clbrv.getAmt());
        clb.setLimitAmt(clbrv.getLimitAmt());
        clb.setLimitDate(clbrv.getLimitDate());
        clb.setPhone(clbrv.getPhone());
        clb.setType(clbrv.getType());
        clb.setPostAddressFlag(clbrv.getPostAddressFlag());
        clb.setHiddenRaiseFlag(clbrv.getHiddenRaiseFlag());
        crowdfundLightBasicinfoDao.insertSelective(clb);

    }

}
