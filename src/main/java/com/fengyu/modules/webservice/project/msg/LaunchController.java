package com.fengyu.modules.webservice.project.msg;

import com.fengyu.common.exception.ProjectException;
import com.fengyu.modules.service.project.msg.LaunchService;
import com.fengyu.modules.webservice.project.vo.LaunchVo;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/22.
 * @LaunchProjectController 测试我发起的项目
 */
@Component
@Path("/project/msg/launchProject")
public class LaunchController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(LaunchController.class);



    @Autowired
    private LaunchService launchProjectService;

    @POST
    @Path("queryBy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(LaunchVo launchProjectVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(launchProjectService.queryBy(launchProjectVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (ProjectException e){
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg(e.getMessage());
        }catch (Exception e){
            //e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }


        return resultAPI;
    }

}
