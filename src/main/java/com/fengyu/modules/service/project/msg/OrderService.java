package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.OrderDao;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.OrderReponseVo;
import com.fengyu.modules.webservice.project.vo.OrderRequestVo;
import com.fengyu.modules.webservice.project.vo.OrderRequestVo;
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
     *
     * @param orderVo
     * @return
     */
    public SearchResult getPageList(OrderRequestVo orderVo) {

        SearchResult<OrderReponseVo> result = new SearchResult<>();
        result.setTotalRows(orderMapper.queryById(orderVo));
        result.setRows(orderMapper.orderPageList(orderVo));

        return result;
    }

    /*
    * @param orderRequestVo
    * @return
    */
    public SearchResult getOrderList(OrderRequestVo orderRequestVo) {

        SearchResult<OrderRequestVo> result = new SearchResult<>();
        result.setTotalRows(orderMapper.orderPage(orderRequestVo));
        result.setRows(orderMapper.getOrderList(orderRequestVo));
        return result;
    }

    /**
     * 待付款的列表
     * @param orderRequestVo
     * @return
     */
   public SearchResult getPayment(OrderRequestVo orderRequestVo) {
       orderRequestVo.setOrderState("0");
        SearchResult<OrderVo> result = new SearchResult<>();
        result.setTotalRows(orderMapper.orderStatePage(orderRequestVo));
        result.setRows(orderMapper.getStateOrderList(orderRequestVo));
        return result;
    }

    /**
     * 查询待评价的列表
     * @param orderRequestVo
     * @return
     */
    public SearchResult getEvaluate(OrderRequestVo orderRequestVo){
        orderRequestVo.setOrderState("1");
        SearchResult<OrderVo> result = new SearchResult<>();
        result.setTotalRows(orderMapper.orderStatePage(orderRequestVo));
        result.setRows(orderMapper.getStateOrderList(orderRequestVo));
        return result;
    }
}
