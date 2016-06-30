package com.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundIfmtDscleDao;
import com.fengyu.modules.model.CrowdfundIfmtDscle;
import com.fengyu.modules.service.project.msg.CrowdfundIfmtDscleService;
import com.fengyu.modules.webservice.project.vo.CrowdfundIfmtDscleRequestVo;
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

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundIfmtDscleImplTest {

    @Autowired
    private CrowdfundIfmtDscleService crowdfundIfmtDscleService;
    private CrowdfundIfmtDscleRequestVo cdrv=new CrowdfundIfmtDscleRequestVo();

    @Test
    public void insert(){

        cdrv.setProjectNo(2);
        cdrv.setDsclNode("未上线");
        cdrv.setIfmtType("text");
        cdrv.setIfmtContentDesc("D盘下的不知道");
        cdrv.setState("未审核");
        cdrv.setAuditor(2);
        crowdfundIfmtDscleService.insert(cdrv);
        Assert.assertTrue("Failed to find user " + cdrv, cdrv != null);
    }
}
