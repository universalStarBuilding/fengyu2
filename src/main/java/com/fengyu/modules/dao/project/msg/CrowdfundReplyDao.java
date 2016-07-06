package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundReply;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyRequsetVo;

import java.util.List;

@MyBatisDao
public interface CrowdfundReplyDao {
    /**
     * 添加回复
     * @param crowdfundReply
     */
    void insertReply(CrowdfundReply crowdfundReply);
    //查询回复数量
    Integer getTotal(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo);
    //查询回复列表
    List<CrowdfundReplyReponseVo> selectReply(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo);
}