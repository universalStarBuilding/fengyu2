package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.CrowdfundCommentService;
import com.fengyu.modules.service.project.msg.OrderService;
import com.fengyu.modules.webservice.project.vo.CrowdfundCommentVo;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.ResultAPI;
import com.fengyu.test.example3.CronTriggerExample;
import org.quartz.impl.StdScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/25.
 */
@Component
@Path("/porject/msg/crowdfundComment")
public class CrowdfundCommentController {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(CrowdfundCommentController.class);
    @Resource
    private StdScheduler scheduler;
    @Autowired
    private CrowdfundCommentService crowdfundCommentService;

    @POST
    @Path("queryById")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(CrowdfundCommentVo crowdfundCommentVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(crowdfundCommentService.queryById(crowdfundCommentVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (RuntimeException e){
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg(e.getMessage());
        }catch (Exception e){
            //e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }

        return resultAPI;
    }

    /*@POST
    @Path("quartzTest")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI quartzTest(CrowdfundCommentVo crowdfundCommentVo){

        ResultAPI resultAPI = new ResultAPI();
            CronTriggerExample example = new CronTriggerExample();
        try {
            example.run(scheduler);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultAPI;
    }*/
}
