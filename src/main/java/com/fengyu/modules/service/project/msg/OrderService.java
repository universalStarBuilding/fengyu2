package com.fengyu.modules.service.project.msg;

import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.project.msg.OrderMapper;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.dao.LogAccessDao;
import com.fengyu.system.entity.LogAccess;
import com.fengyu.system.entity.SearchResult;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;


@Service(value = "orderService")
@Transactional
public class OrderService extends CrudService<OrderMapper,Order>{


    @Autowired
    private OrderMapper orderMapper;

    /**
     * 分页：我支持的项目列表
     * @param orderVo
     * @return
     */
    public SearchResult getPageList(OrderVo orderVo) {
        if (orderVo==null){
            throw new RuntimeException ("获取支持失败");
        }
        SearchResult<Order> result = new SearchResult<>();
        result.setTotalRows(orderMapper.queryById(orderVo));
        result.setRows(orderMapper.orderPageList(orderVo));
        return result ;
    }

    /**
     * 获取订单列表
     * @param order
     * @return
     */
    public SearchResult getOrderList(Order order){
        if (order==null){
            throw new RuntimeException ("获取订单列表失败");
        }
        SearchResult<Order> result = new SearchResult<>();
        result.setTotalRows(orderMapper.orderPage(order));
        result.setRows(orderMapper.getOrderList(order));
        return result;
    }
}
