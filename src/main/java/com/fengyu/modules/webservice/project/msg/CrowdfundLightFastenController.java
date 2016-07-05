package com.fengyu.modules.webservice.project.msg;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.msg.CrowdfundLightFastenService;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightBasicinfoRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightFastenRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/7/5.
 */
@Component
@Path("/porject/msg/crowdfundLightFasten")
public class CrowdfundLightFastenController {

    @Autowired
    private CrowdfundLightFastenService crowdfundLightFastenService;

    /**
     * 插入固定档位
     * @param crowdfundLightFastenRequestVo
     */
    @POST
    @Path("insertFixed")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertFixed(CrowdfundLightFastenRequestVo crowdfundLightFastenRequestVo){

        if(crowdfundLightFastenRequestVo==null){
            throw new WebActionException(WebExceptionType.INSERTINVALIDDYNAMIC,crowdfundLightFastenRequestVo);
        }
        crowdfundLightFastenService.insertFixed(crowdfundLightFastenRequestVo);

    }
}
