package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.LaunchProjectService;
import com.fengyu.modules.webservice.project.vo.LaunchProjectVo;
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
public class LaunchProjectController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(LaunchProjectController.class);



    @Autowired
    private LaunchProjectService launchProjectService;

    @POST
    @Path("queryBy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(LaunchProjectVo launchProjectVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(launchProjectService.queryBy(launchProjectVo));
            resultAPI.setAccess_result("SUCCESS");

        }catch (Exception e){
            //e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }


        return resultAPI;
    }

}
