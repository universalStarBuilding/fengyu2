package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.CrowdfundAttentionService;
import com.fengyu.modules.webservice.project.vo.CrowdfundAttentionRequestVo;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/22.
 * @FollowProjectController 测试我关注的项目
 */
@Component
@Path("/project/msg/followProject")
public class FollowController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(FollowController.class);

    @Autowired
    private CrowdfundAttentionService followProjectService;


    @POST
    @Path("queryByIdFollow")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(CrowdfundAttentionRequestVo followProjectVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(followProjectService.queryById(followProjectVo));
            resultAPI.setAccess_result("SUCCESS");

        }catch (Exception e){
            //e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }

        return resultAPI;
    }


    @POST
    @Path("insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI insert(CrowdfundAttentionRequestVo followProjectVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(followProjectService.insert(followProjectVo));
            resultAPI.setAccess_result("SUCCESS");

        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }
        return resultAPI;
    }

}
