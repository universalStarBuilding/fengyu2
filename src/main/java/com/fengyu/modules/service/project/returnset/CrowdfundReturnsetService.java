package com.fengyu.modules.service.project.returnset;

import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.PKGenarator;
import com.fengyu.modules.dao.project.returnset.CrowdfundReturnsetDao;
import com.fengyu.modules.model.CrowdfundReturnset;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;
import org.eclipse.persistence.annotations.Properties;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2016/6/27.
 */
@Service(value = "crowdfundReturnsetService")
@Transactional
public class CrowdfundReturnsetService extends CrudService<CrowdfundReturnsetDao,CrowdfundReturnset>{

    @Autowired
    private CrowdfundReturnsetDao crowdfundReturnsetDao;

    public List<CrowdfundReturnsetReponseVo> getListByProjectNo(String projectNo) {

        return crowdfundReturnsetDao.getListByProjectNo(projectNo);
    }

    public Integer deleteByReturnNo(String returnNo) {

        return crowdfundReturnsetDao.deleteByReturnNo(returnNo);
    }

    public Integer saveCrowdfundReturnset(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo) {

        CrowdfundReturnset  crowdfundReturnset = new  CrowdfundReturnset();

        BeanUtils.copyProperties(crowdfundReturnsetRequestVo,crowdfundReturnset);

        crowdfundReturnset.setReturnNo(PKGenarator.getOrderId());
        crowdfundReturnset.setState("yes");        //回报档状态，是否还有空余  yes 有 no 没有
        crowdfundReturnsetDao.insert(crowdfundReturnset);
        return 1;
    }

    public Integer updateCrowdfundReturnset(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo) {
        CrowdfundReturnset  crowdfundReturnset = new  CrowdfundReturnset();

        BeanUtils.copyProperties(crowdfundReturnsetRequestVo,crowdfundReturnset);
        crowdfundReturnset.setState("yes");        //回报档状态，是否还有空余  yes 有 no 没有
        crowdfundReturnsetDao.update(crowdfundReturnset);
        return 1;
    }

    /**
     * 查询项目回报
     * @param crowdfundReturnsetRequestVo
     * @return
     */
    public CrowdfundReturnset getCrowdfund(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo){

        if (crowdfundReturnsetRequestVo.getReturnNo()==null){
            throw new RuntimeException("查询失败");
        }
        return crowdfundReturnsetDao.getCrowdfund(crowdfundReturnsetRequestVo);
    }
}
