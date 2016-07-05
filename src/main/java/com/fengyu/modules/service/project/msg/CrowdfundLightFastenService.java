package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundLightFastenDao;
import com.fengyu.modules.model.CrowdfundLightFasten;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightFastenReqonseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightFastenRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/7/5.
 */

@Service(value = "crowdfundLightFastenService")
@Transactional
public class CrowdfundLightFastenService {

    @Autowired
    private CrowdfundLightFastenDao crowdfundLightFastenDao;

    /**
     * 添加固定档位
     *
     * @param clfrv
     */
    public void insertFixed(CrowdfundLightFastenRequestVo clfrv){
        CrowdfundLightFasten clf=new CrowdfundLightFasten();
        clf.setProjectNo(clfrv.getProjectNo());
        clf.setReturnContent(clfrv.getReturnContent());
        clf.setLimitCount(clfrv.getLimitCount());
        clf.setFastenAmt(clfrv.getFastenAmt());
        clf.setEveryoneBuyCount(clfrv.getEveryoneBuyCount());
        clf.setCount(clfrv.getCount());
        crowdfundLightFastenDao.insertFixed(clf);
    }
}
