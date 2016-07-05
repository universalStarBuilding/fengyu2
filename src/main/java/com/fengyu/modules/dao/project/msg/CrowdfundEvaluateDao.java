package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundEvaluate;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateRequestVo;

import java.util.List;

@MyBatisDao
public interface CrowdfundEvaluateDao extends CrudDao<CrowdfundEvaluate>{

    //添加评价信息
    int insert(CrowdfundEvaluate crowdfundEvaluate);

    //查询用户对项目的评价信息
    CrowdfundEvaluate getUserEvaluate(CrowdfundEvaluateReponseVo crowdfundEvaluateReponseVo);
    //查询项目的评价邮箱
    List<CrowdfundEvaluate> getProjectEvaluate(CrowdfundEvaluateRequestVo CrowdfundEvaluateRequestVo);

    long getEvaluatePage(CrowdfundEvaluateRequestVo CrowdfundEvaluateRequestVo);
}