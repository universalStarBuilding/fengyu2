package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Follow;
import com.fengyu.modules.webservice.project.vo.FollowVo;

import java.util.List;

/**
 * 我关注的项目
 */
@MyBatisDao
public interface FollowDao {
    //统计数量
    long queryById(FollowVo followProjectVo);
    //查询关注列表
    List<Follow> getListFollow(FollowVo followProjectVo);
    //添加关注项目
    Integer insert(Follow followProject);
}