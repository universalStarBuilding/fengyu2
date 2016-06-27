package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderVo;

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
    //统计支持的数量
    Integer supportNumber(Order order);

}