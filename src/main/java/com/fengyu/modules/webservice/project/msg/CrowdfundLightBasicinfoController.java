package com.fengyu.modules.webservice.project.msg;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.msg.CrowdfundLightBasicinfoService;
import com.fengyu.modules.webservice.project.vo.CrowdfundLightBasicinfoRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReplyRequsetVo;
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
@Path("/porject/msg/lightBasicinfo")
public class CrowdfundLightBasicinfoController {

    @Autowired
    private CrowdfundLightBasicinfoService crowdfundLightBasicinfoService;

    /**
     * 添加任意档位
     * @param crowdfundLightBasicinfoRequestVo
     */
    @POST
    @Path("insertSelective")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertSelective(CrowdfundLightBasicinfoRequestVo crowdfundLightBasicinfoRequestVo){

        if(crowdfundLightBasicinfoRequestVo==null){
            throw new WebActionException(WebExceptionType.INSERTINVALIDDYNAMIC,crowdfundLightBasicinfoRequestVo);
        }
        crowdfundLightBasicinfoService.insertSelective(crowdfundLightBasicinfoRequestVo);

    }
}
