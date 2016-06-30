package com.fengyu.modules.webservice.project.msg;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.service.project.msg.OrderService;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    public String pageList(OrderVo orderVo){
        if (orderVo==null){
            throw new WebActionException(WebExceptionType.GETINVALIDPROJECTSUPPORT,orderVo);
        }
        SearchResult<Order> result=orderService.getPageList(orderVo);

        return JSON.toJSONString(result);
    }

    /**
     * 查询订单列表
     * @param orderVo
     * @return
     */
    @POST
    @Path("order")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getOrderList(OrderVo orderVo){
        SearchResult searchResult=orderService.getOrderList(orderVo);
        if (searchResult==null){
            throw new WebActionException(WebExceptionType.GETINVALIDORDERLIST,orderVo);
        }
        return JSON.toJSONString(searchResult);
    }

    /**
     * 查询待付款列表
     * @param orderVo
     * @return
     */
    @POST
    @Path("payment")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getPaymentList(OrderVo orderVo){
        SearchResult searchResult=orderService.getPayment(orderVo);
        if (searchResult==null){
            throw new WebActionException(WebExceptionType.GETINVALIDORDERLIST,orderVo);
        }
        return JSON.toJSONString(searchResult);
    }

    /**
     * 查询待评价列表
     * @param orderVo
     * @return
     */
    @POST
    @Path("evaluate")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getEvaluate(OrderVo orderVo){
        SearchResult searchResult=orderService.getEvaluate(orderVo);
        if (searchResult==null){
            throw new WebActionException(WebExceptionType.GETINVALIDORDERLIST,orderVo);
        }
        return JSON.toJSONString(searchResult);
    }

}
