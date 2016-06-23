package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.LaunchProject;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.LaunchProjectVo;

import java.util.List;

/**
 * 我发起的项目
 */
@MyBatisDao
public interface LaunchProjectMapper {

    //统计数量
    long queryBy(LaunchProjectVo launchProjectVo);
    //查询发起列表
    List<LaunchProject> getListLaunch(LaunchProjectVo launchProjectVo);

}