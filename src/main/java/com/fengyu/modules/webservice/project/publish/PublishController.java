package com.fengyu.modules.webservice.project.publish;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.publish.CrowdfundPublishService;
import com.fengyu.modules.service.project.returnset.CrowdfundReturnsetService;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by admin on 2016/6/27.
 */
@Component
@Path("/project/publish")
public class PublishController {


    @Autowired
    private CrowdfundPublishService crowdfundPublishService;

    /**
     * 发起项目
     * @return
     */
    @POST
    @Path("save")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(CrowdfundPublishRequestVo crowdfundPublishRequestVo){

        Integer rows = crowdfundPublishService.saveCrowdfundPublish(crowdfundPublishRequestVo);
        if(rows == 0){
            throw  new WebActionException(WebExceptionType.PUBLISHINVALIDPROJECT,crowdfundPublishRequestVo);
        }
    }

    /**
     * 获取发起项目详情
     * @return
     */
    @POST
    @Path("get/{projectNo}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public void get(@PathParam("projectNo")String projectNo){

        CrowdfundPublishReponseVo vo =  crowdfundPublishService.getCrowdfundPublishInfo(projectNo);
        if(vo == null){
            throw  new WebActionException(WebExceptionType.PUBLISHINVALIDPROJECT,vo);
        }
    }
}
