package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.FollowProject;
import com.fengyu.modules.model.LaunchProject;
import com.fengyu.modules.webservice.project.vo.FollowProjectVo;
import com.fengyu.modules.webservice.project.vo.LaunchProjectVo;

import java.util.List;

/**
 * 我关注的项目
 */
@MyBatisDao
public interface FollowProjectMapper {
    //统计数量
    long queryById(FollowProjectVo followProjectVo);
    //查询关注列表
    List<FollowProject> getListFollow(FollowProjectVo followProjectVo);
}