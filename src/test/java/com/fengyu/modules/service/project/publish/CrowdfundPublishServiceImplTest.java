package com.fengyu.modules.service.project.publish;

import com.fengyu.modules.model.AccUserBank;
import com.fengyu.modules.service.account.AccUserBankService;
import com.fengyu.modules.service.project.publish.CrowdfundPublishService;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishRequestVo;
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
public class CrowdfundPublishServiceImplTest {


    @Autowired
    private CrowdfundPublishService crowdfundPublishService;

    private static Integer id=1;

    @Test
    public void insertUserBank(){

        CrowdfundPublishRequestVo vo = new CrowdfundPublishRequestVo();
        vo.setUserId(2);
        vo.setProjectName("雀巢纸尿裤");
        vo.setProjectSummary("天才雀巢纸尿裤");
        vo.setFundAmt(10000.00);
        vo.setFundLimitAmt(100000.00);
        vo.setLastingFundFlag(true);
        vo.setFundPeriod(10);
        vo.setProjectType("project");
        vo.setProjectVideo("这是视频内容介绍");
        vo.setProjectCategory("project_no1");
        vo.setProjectListImage("/img/list.img");
        vo.setProjectImage("img/project.img");
        vo.setProjectSynopsis("这是项目详情");
        vo.setOrganizerName("郭政");
        vo.setOrganizerIntroduction("发起方详细介绍");
        vo.setWeiboUrl("http://www.weibo.com");
        vo.setTelephone("15269103792");
        vo.setThankYouNote("这是测试笔记");
        vo.setFundPeriod(10);
        vo.setLastingFundFlag(true);
        vo.setProjectDetail("这是什么鬼？");

        crowdfundPublishService.saveCrowdfundPublish(vo);
       // Assert.assertTrue("Failed to find user " + accUserBank, accUserBank != null);
    }
}
