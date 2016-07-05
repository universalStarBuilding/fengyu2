package com.fengyu.modules.service.project.msg;

import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.project.msg.CrowdfundEvaluateDao;
import com.fengyu.modules.model.CrowdfundEvaluate;
import com.fengyu.modules.model.Information;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateRequestVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/7/4.
 */
@Service(value = "crowdfundEvaluateService")
@Transactional
public class CrowdfundEvaluateService extends CrudService<CrowdfundEvaluateDao,CrowdfundEvaluate> {

    @Autowired
    private CrowdfundEvaluateDao crowdfundEvaluateDao;

    /**
     * 添加评价
     * @param crowdfundEvaluate
     * @return
     */
    public Integer insert(CrowdfundEvaluate crowdfundEvaluate){
        if (crowdfundEvaluate==null){
            throw new RuntimeException("评价添加失败");
        }
        return crowdfundEvaluateDao.insert(crowdfundEvaluate);
    }

    /**
     * 根据用户查询对项目的评价
     * @param crowdfundEvaluateReponseVo
     * @return
     */
    public CrowdfundEvaluate getUserEvaluate(CrowdfundEvaluateReponseVo crowdfundEvaluateReponseVo){
        if (crowdfundEvaluateReponseVo.getUserId()==null){
            throw new RuntimeException("查询失败");
        }
        return crowdfundEvaluateDao.getUserEvaluate(crowdfundEvaluateReponseVo);
    }
    /**
     * 根据项目查询评价,分页
     * @param crowdfundEvaluateRequestVo
     * @return
     */
    public SearchResult getProjectEvaluate(CrowdfundEvaluateRequestVo crowdfundEvaluateRequestVo){
        SearchResult<CrowdfundEvaluate>result=new SearchResult<>();
        result.setTotalRows(crowdfundEvaluateDao.getEvaluatePage(crowdfundEvaluateRequestVo));
        result.setRows(crowdfundEvaluateDao.getProjectEvaluate(crowdfundEvaluateRequestVo));
        return result;
    }
}
