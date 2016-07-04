package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoReponseVo;
import com.fengyu.modules.webservice.project.vo.HotResponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoRequestVo;

import java.util.List;

/**
 * 我发起的项目
 */
@MyBatisDao
public interface CrowdfundBasicinfoDao extends CrudDao<CrowdfundBasicinfo>{

    //统计数量
    long queryBy(CrowdfundBasicinfoRequestVo launchProjectVo);
    //查询发起列表
    List<CrowdfundBasicinfoReponseVo> getListLaunch(CrowdfundBasicinfoRequestVo launchProjectVo);
    //查询热门项目
    List<HotResponseVo> selectHot(CrowdfundBasicinfoRequestVo launchVo);
    //统计热门项目的数量
    Integer getTotal(CrowdfundBasicinfoRequestVo launchVo);
    //查询进行中或者预热中的项目
    List<HotResponseVo> selectConduct(CrowdfundBasicinfoRequestVo launchVo);
    //统计进行中或者预热中的项目数量
    Integer getPreheat(CrowdfundBasicinfoRequestVo launchVo);
    //查询项目详情
    List<HotResponseVo> selectDetails(CrowdfundBasicinfoRequestVo launchVo);

    CrowdfundBasicinfo getDetailbyProjectNo(String projectNo);
}