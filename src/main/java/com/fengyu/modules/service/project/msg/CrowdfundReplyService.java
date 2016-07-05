package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundReplyDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.model.CrowdfundReply;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyRequsetVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2016/7/4.
 */

@Service(value = "crowdfundReplyService")
@Transactional
public class CrowdfundReplyService {

    @Autowired
    private CrowdfundReplyDao crowdfundReplyDao;


    /**
     * 添加回复
     * @param crowdfundReplyRequsetVo
     */
    public void insertReply(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo){
        CrowdfundReply crowdfundReply=new CrowdfundReply();

        crowdfundReply.setAuditId(crowdfundReplyRequsetVo.getAuditId());
        crowdfundReply.setCommentId(crowdfundReplyRequsetVo.getCommentId());
        crowdfundReply.setContent(crowdfundReplyRequsetVo.getContent());
        crowdfundReply.setToUid(crowdfundReplyRequsetVo.getToUid());
        crowdfundReply.setStatus(crowdfundReplyRequsetVo.getStatus());
        crowdfundReply.setReplyType(crowdfundReplyRequsetVo.getReplyType());
        crowdfundReply.setReplyId(crowdfundReplyRequsetVo.getReplyId());
        crowdfundReply.setFromUid(crowdfundReplyRequsetVo.getFromUid());
        crowdfundReply.setReplyDate(new Date());
        crowdfundReply.setAuditDate(new Date());
        crowdfundReplyDao.insertReply(crowdfundReply);
    }

    public SearchResult selectReply(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo){

        SearchResult<CrowdfundReplyReponseVo> result = new SearchResult<>();
        result.setTotalRows(crowdfundReplyDao.getTotal(crowdfundReplyRequsetVo));
        result.setRows(crowdfundReplyDao.selectReply(crowdfundReplyRequsetVo));
        return result;
    }
}
