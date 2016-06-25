package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundComment;
import com.fengyu.modules.webservice.project.vo.CrowdfundCommentVo;

import java.util.List;

@MyBatisDao
public interface CrowdfundCommentDao {
    //统计数量
    long queryById(CrowdfundCommentVo crowdfundCommentVo);
    //查询项目评论列表
    List<CrowdfundComment> getListCrowdfund(CrowdfundCommentVo crowdfundCommentVo);

}