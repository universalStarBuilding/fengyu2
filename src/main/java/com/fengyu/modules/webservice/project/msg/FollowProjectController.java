package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.FollowProjectService;
import com.fengyu.modules.webservice.project.vo.FollowProjectVo;
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
public class FollowProjectController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(FollowProjectController.class);

    @Autowired
    private FollowProjectService followProjectService;


    @POST
    @Path("queryByIdFollow")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(FollowProjectVo followProjectVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(followProjectService.queryById(followProjectVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (SystemException e){
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
