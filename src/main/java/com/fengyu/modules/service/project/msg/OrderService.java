package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.OrderDao;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "orderService")
@Transactional
public class OrderService {


    @Autowired
    private OrderDao orderMapper;

    /**
     * 分页：我支持的项目列表
     * @param orderVo
     * @return
     */
    public SearchResult getPageList(OrderVo orderVo) {

        SearchResult<Order> result = new SearchResult<>();
        result.setTotalRows(orderMapper.queryById(orderVo));
        result.setRows(orderMapper.orderPageList(orderVo));

        return result ;
    }




}
