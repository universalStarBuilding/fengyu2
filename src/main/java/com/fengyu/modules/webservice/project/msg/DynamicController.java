package com.fengyu.modules.webservice.project.msg;

import com.fengyu.common.exception.ProjectException;
import com.fengyu.modules.service.project.msg.DynamicService;
import com.fengyu.modules.webservice.project.vo.DynamicRequestVo;
import com.fengyu.system.entity.ResultAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/24.
 */
@Component
@Path("/project/msg/dynamic")
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @POST
    @Path("insertDynamic")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI insertDynamic(DynamicRequestVo dynamicRequestVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(dynamicService.insert(dynamicRequestVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (ProjectException e){
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }


        return resultAPI;
    }


}
