package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.CrowdfundBasicinfoService;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoVo;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Component
@Path("/project/msg/launchProject")
public class LaunchController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(LaunchController.class);



    @Autowired
    private CrowdfundBasicinfoService launchProjectService;

    /**
     * 我发起的项目列表
     * @param launchProjectVo
     * @return
     */
    @POST
    @Path("queryBy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(CrowdfundBasicinfoVo launchProjectVo){

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

    /**
     * 查询热门项目列表
     * @param launchVo
     * @return
     */
    @POST
    @Path("selectHot")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI selectHot(CrowdfundBasicinfoVo launchVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(launchProjectService.selectHot(launchVo));
            resultAPI.setAccess_result("SUCCESS");

        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }
        return resultAPI;
    }


}
