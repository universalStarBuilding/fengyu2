package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderRequestVo;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

/**
 *我支持的项目
 */
@MyBatisDao
public interface OrderDao {

    //统计数量
    long queryById(OrderVo orderVo);
    //查询支持列表
    List<Order> orderPageList(OrderVo orderVo);
    //统计热门支持的数量
    Integer supportNumber(Order order);
    //统计进行中和预热中的数量
    Integer supportState(Order order);
    //查询详情的支持人数
    Integer supportDetails(Order order);


    //查询所有订单列表
    List<OrderVo> getOrderList(OrderRequestVo orderRequestVo);
    //查询订单状态列表
    List<OrderVo> getStateOrderList(OrderRequestVo orderRequestVo);
    //统计订单的总数
    long orderPage(OrderRequestVo orderRequestVo);
}