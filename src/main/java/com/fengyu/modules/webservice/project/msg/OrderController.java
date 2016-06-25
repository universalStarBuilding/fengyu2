package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.OrderService;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/22.
 * @OrderController 测试我支持的项目
 */
@Component
@Path("/project/msg")
public class OrderController {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @POST
    @Path("queryById")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(OrderVo orderVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(orderService.getPageList(orderVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            //e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }

        return resultAPI;
    }

}
