package com.fengyu.modules.service.project.msg;

import com.fengyu.common.utils.PKGenarator;
import com.fengyu.modules.dao.project.msg.CrowdfundLightBasicinfoDao;
import com.fengyu.modules.dao.project.msg.CrowdfundLightFastenDao;
import com.fengyu.modules.model.CrowdfundLightBasicinfo;
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

    @Autowired
    private CrowdfundLightBasicinfoDao crowdfundLightBasicinfoDao;

    /**
     * 添加固定档位
     *
     * @param clfrv
     */
    public void insertFixed(CrowdfundLightFastenRequestVo clfrv){
        String projectNO = PKGenarator.getLightProjectNo();
        CrowdfundLightBasicinfo clb=new CrowdfundLightBasicinfo();
        clb.setProjectNo(projectNO);
        clb.setUserId(clfrv.getUserId());
        clb.setImg(clfrv.getImg());
        clb.setInfo(clfrv.getInfo());
        clb.setMoreInfo(clfrv.getMoreInfo());
        clb.setAmt(clfrv.getAmt());
        clb.setLimitDate(clfrv.getLimitDate());
        clb.setPhone(clfrv.getPhone());
        clb.setLimitAmt(clfrv.getLimitAmt());
        clb.setPostAddressFlag(clfrv.getPostAddressFlag());
        clb.setHiddenRaiseFlag(clfrv.getHiddenRaiseFlag());
        crowdfundLightBasicinfoDao.insertSelective(clb);

        CrowdfundLightFasten clf=new CrowdfundLightFasten();
        clf.setProjectNo(projectNO);
        clf.setReturnContent(clfrv.getReturnContent());
        clf.setLimitCount(clfrv.getLimitCount());
        clf.setFastenAmt(clfrv.getFastenAmt());
        clf.setEveryoneBuyCount(clfrv.getEveryoneBuyCount());
        clf.setCount(clfrv.getCount());
        crowdfundLightFastenDao.insertFixed(clf);
    }
}
