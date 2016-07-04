package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.service.project.msg.CrowdfundAttentionService;
import com.fengyu.modules.webservice.project.vo.CrowdfundAttentionRequestVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.Date;

/**
 * Created by admin on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class AttentionServiceImplTest {
    @Autowired
    private CrowdfundAttentionService crowdfundAttentionService;
    private CrowdfundAttentionRequestVo crv=new CrowdfundAttentionRequestVo();
    @Test
    public void queryById(){
        crv.setPage(1);
        crv.setRows(2);
        crv.setUserId(1);
        crv.setPage(1);
        crv.setRows(2);
        crowdfundAttentionService.queryById(crv);
        Assert.assertTrue("Failed to find user " + crv, crv != null);
    }
    @Test
    public void insert(){
        crv.setUserId(1);
        crv.setAttentionNo("2");
        crv.setAttentionTime(new Date());
        crowdfundAttentionService.insert(crv);
        Assert.assertTrue("Failed to find user " + crv, crv != null);
    }
}
