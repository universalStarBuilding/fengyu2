package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.model.CrowdfundEvaluate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created by admin on 2016/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundEvaluateImplTest {
    private CrowdfundEvaluate crowdfundEvaluate=new CrowdfundEvaluate();

    @Autowired
    private CrowdfundEvaluateService crowdfundEvaluateService;

    @Test
    public void insert(){
        crowdfundEvaluate.setProjectNo("1");
        crowdfundEvaluate.setUserId(1);
        crowdfundEvaluate.setSatisfation(5);
        crowdfundEvaluate.setLabel("你猜");
        crowdfundEvaluate.setContent("带你装逼带你飞");
        crowdfundEvaluate.setImg("list/img.jpg");
        crowdfundEvaluateService.insert(crowdfundEvaluate);
    }
}
