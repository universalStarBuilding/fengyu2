package com.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundBasicinfoDao;
import com.fengyu.modules.dao.project.msg.OrderDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.service.project.msg.CrowdfundBasicinfoService;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoVo;
import com.fengyu.modules.webservice.project.vo.HotResponseVo;
import com.fengyu.system.entity.SearchResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundBasicinfoImplTest {

    @Autowired
    private CrowdfundBasicinfoService crowdfundBasicinfoService;
    private CrowdfundBasicinfoVo cbv=new CrowdfundBasicinfoVo();

    @Test
    public void queryBy(){
            cbv.setPage(1);
            cbv.setRows(2);
            cbv.setUserId(2);
        Assert.assertTrue("Failed to find user " + cbv, cbv != null);
    }

}
