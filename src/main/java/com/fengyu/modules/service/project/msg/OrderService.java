package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.OrderMapper;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/22.
 * @OrderService 我支持的项目
 */
@Service(value = "orderService")
@Transactional
public class OrderService {


    @Autowired
    private OrderMapper orderMapper;


    public SearchResult getPageList(OrderVo orderVo) {
        if (orderVo==null){
            throw new RuntimeException ("获取支持项目失败");
        }

        //分页
        SearchResult<Order> result = new SearchResult<>();
        result.setTotalRows(orderMapper.queryById(orderVo));
        result.setRows(orderMapper.orderPageList(orderVo));

        return result ;
    }
}
