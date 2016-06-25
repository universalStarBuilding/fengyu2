package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Launch;
import com.fengyu.modules.webservice.project.vo.LaunchVo;

import java.util.List;

/**
 * 我发起的项目
 */
@MyBatisDao
public interface LaunchDao {

    //统计数量
    long queryBy(LaunchVo launchProjectVo);
    //查询发起列表
    List<Launch> getListLaunch(LaunchVo launchProjectVo);

}