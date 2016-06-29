package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerRequestVo;
import com.fengyu.modules.webservice.project.vo.HotResponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoVo;

import java.util.List;

/**
 * 我发起的项目
 */
@MyBatisDao
public interface CrowdfundBasicinfoDao extends CrudDao<CrowdfundBasicinfo>{

    //统计数量
    long queryBy(CrowdfundBasicinfoVo launchProjectVo);
    //查询发起列表
    List<CrowdfundBasicinfo> getListLaunch(CrowdfundBasicinfoVo launchProjectVo);
    //查询热门项目
    List<HotResponseVo> selectHot(CrowdfundBasicinfoVo launchVo);
    //统计热门项目的数量
    Integer getTotal(CrowdfundBasicinfoVo launchVo);
    //查询进行中或者预热中的项目
    List<HotResponseVo> selectConduct(CrowdfundBasicinfoVo launchVo);
    //统计进行中或者预热中的项目数量
    Integer getPreheat(CrowdfundBasicinfoVo launchVo);
    //查询项目详情
    List<HotResponseVo> selectDetails(CrowdfundBasicinfoVo launchVo);

}