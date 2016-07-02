package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.model.Order;
import com.fengyu.modules.service.project.msg.OrderService;
import com.fengyu.modules.webservice.project.vo.OrderVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created by admin on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class OederServiceImplTest {
    private OrderVo orderVo=new OrderVo();
    @Autowired
    private OrderService orderService;

    @Test
    public void getPageList(){

        orderVo.setOrderOwner(1);
        orderVo.setPage(1);
        orderVo.setRows(2);
        orderService.getPageList(orderVo);
        Assert.assertTrue("Failed to find user " + orderVo, orderVo != null);
    }

}
