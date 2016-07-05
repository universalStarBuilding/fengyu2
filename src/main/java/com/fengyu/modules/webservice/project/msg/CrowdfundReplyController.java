package com.fengyu.modules.webservice.project.msg;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.msg.CrowdfundReplyService;
import com.fengyu.modules.webservice.project.vo.CrowdfundCommentRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyRequsetVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/7/4.
 */
@Component
@Path("/porject/msg/crowdfundReply")
public class CrowdfundReplyController {

    @Autowired
    private CrowdfundReplyService crowdfundReplyService;


    @POST
    @Path("insertReply")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertReply(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo){

        if(crowdfundReplyRequsetVo==null){
            throw new WebActionException(WebExceptionType.INSERTINVALIDDYNAMIC,crowdfundReplyRequsetVo);
        }
        crowdfundReplyService.insertReply(crowdfundReplyRequsetVo);

    }

    @POST
    @Path("selectReply")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String selectReply(CrowdfundReplyRequsetVo crowdfundReplyRequsetVo){

        if(crowdfundReplyRequsetVo==null){
            throw new WebActionException(WebExceptionType.SELECTINVALIDREPLY,crowdfundReplyRequsetVo);
        }
        SearchResult searchResult=crowdfundReplyService.selectReply(crowdfundReplyRequsetVo);
            return JSON.toJSONString(searchResult);
    }
}
