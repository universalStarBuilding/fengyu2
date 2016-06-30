package com.modules.service.project.publish;

import com.fengyu.modules.dao.project.msg.CrowdfundBasicinfoDao;
import com.fengyu.modules.dao.project.publish.CrowdfundOrganizerDao;
import com.fengyu.modules.service.project.publish.CrowdfundOrganizerService;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundOrganizerRequestVo;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class OrganizerServiceImplTest {

    private CrowdfundOrganizerRequestVo crowdfundOrganizerRequestVo=new CrowdfundOrganizerRequestVo();
    @Autowired
    private CrowdfundOrganizerService crowdfundOrganizerService;
    @Test
    public void getLaunch(){
        crowdfundOrganizerRequestVo.setOrganizerNo("1962ca055a52476788a9493648e31fb1");
        crowdfundOrganizerService.getLaunch(crowdfundOrganizerRequestVo);
        Assert.assertTrue("Failed to find user " + crowdfundOrganizerRequestVo, crowdfundOrganizerRequestVo != null);
    }
}