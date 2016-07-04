package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoRequestVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundBasicinfoImplTest {

    @Autowired
    private CrowdfundBasicinfoService crowdfundBasicinfoService;
    private CrowdfundBasicinfoRequestVo cbv=new CrowdfundBasicinfoRequestVo();

    @Test
    public void queryBy(){
            cbv.setPage(1);
            cbv.setRows(2);
            cbv.setUserId(2);
        Assert.assertTrue("Failed to find user " + cbv, cbv != null);
    }

    @Test
    public void selectHot(){
        cbv.setHot(true);
        cbv.setProjectState("funding");
        cbv.setPage(0);
        cbv.setRows(3);
        crowdfundBasicinfoService.selectHot(cbv);
        Assert.assertTrue("Failed to find user " + cbv, cbv != null);
    }
    @Test
    public void selectConduct(){
        cbv.setProjectState("funding");
        cbv.setPage(0);
        cbv.setRows(3);
        crowdfundBasicinfoService.selectConduct(cbv);
        Assert.assertTrue("Failed to find user " + cbv, cbv != null);
    }

    @Test
    public void selectDetails(){
        cbv.setProjectNo("08d553a369cc45deb6535a4458f5694b");
        crowdfundBasicinfoService.selectDetails(cbv);
        Assert.assertTrue("Failed to find user " + cbv, cbv != null);
    }
}
