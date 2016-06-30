package com.fengyu.modules.webservice.project.publish;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.publish.CrowdfundOrganizerService;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishRequestVo;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by admin on 2016/6/29.
 */
@Component
@Path("/project/publish/organizer")
public class OrganizerController {

    @Autowired
    private CrowdfundOrganizerService crowdfundOrganizerService;


    @POST
    @Path("launch")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getLaunch(CrowdfundOrganizerRequestVo crowdfundOrganizerRequestVo){

        if (crowdfundOrganizerRequestVo==null){
            throw new WebActionException(WebExceptionType.GETINVALIDLAUNCHPEOPELINFORMATION,crowdfundOrganizerRequestVo);
        }
        CrowdfundOrganizerReponseVo crowdfundOrganizerReponseVo=crowdfundOrganizerService.getLaunch(crowdfundOrganizerRequestVo);
        return JSON.toJSONString(crowdfundOrganizerReponseVo);
    }
}
