package com.fengyu.modules.service.project.returnset;

import com.fengyu.modules.service.project.publish.CrowdfundPublishService;
import com.fengyu.modules.webservice.project.vo.CrowdfundPublishRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

/**
 * Created by admin on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundReturnsetServiceImplTest {


    @Autowired
    private CrowdfundReturnsetService crowdfundReturnsetService;

    private  String returnNo = "";


    /**
     * 列表
     */
    @Test
    public void list(){

        List<CrowdfundReturnsetReponseVo> list = crowdfundReturnsetService.getListByProjectNo("2");
        System.out.println(list.size());

    }

    /**
     * 添加
     */
    @Test
    public void save(){

        CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo = new CrowdfundReturnsetRequestVo();
        crowdfundReturnsetRequestVo.setProjectNo("08d553a369cc45deb6535a4458f5694b");
        crowdfundReturnsetRequestVo.setPrice(2000.0);
        crowdfundReturnsetRequestVo.setNumberLimits(10);
        crowdfundReturnsetRequestVo.setReturnContent("这是回报内容");
        crowdfundReturnsetRequestVo.setReturnType("goods");
        crowdfundReturnsetRequestVo.setReturnImageDesc("/img/aa.png");
        crowdfundReturnsetRequestVo.setReturnChannel("app");
        crowdfundReturnsetRequestVo.setAppPerfScale(0.04);
        crowdfundReturnsetRequestVo.setRemark("这是备注信息");
        crowdfundReturnsetRequestVo.setPostFlag(true);
        crowdfundReturnsetRequestVo.setCourierFees(200.0);
        crowdfundReturnsetRequestVo.setInvoiceFlag(true);
        crowdfundReturnsetRequestVo.setReturnDate(10);
        crowdfundReturnsetService.saveCrowdfundReturnset(crowdfundReturnsetRequestVo);
        // Assert.assertTrue("Failed to find user " + accUserBank, accUserBank != null);
    }

    /**
     * 修改
     */
    @Test
    public void update(){
        CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo = new CrowdfundReturnsetRequestVo();
        crowdfundReturnsetRequestVo.setReturnNo("2016062995902765");
        crowdfundReturnsetRequestVo.setPrice(2000.0);
        crowdfundReturnsetRequestVo.setNumberLimits(10);
        crowdfundReturnsetRequestVo.setReturnContent("这是回报内容111111111111111111");
        crowdfundReturnsetRequestVo.setReturnType("goods");
        crowdfundReturnsetRequestVo.setReturnImageDesc("/img/aa.png");
        crowdfundReturnsetRequestVo.setReturnChannel("app");
        crowdfundReturnsetRequestVo.setAppPerfScale(0.04);
        crowdfundReturnsetRequestVo.setRemark("这是备注信息");
        crowdfundReturnsetRequestVo.setPostFlag(true);
        crowdfundReturnsetRequestVo.setCourierFees(200.0);
        crowdfundReturnsetRequestVo.setInvoiceFlag(true);
        crowdfundReturnsetRequestVo.setReturnDate(10);
        crowdfundReturnsetService.updateCrowdfundReturnset(crowdfundReturnsetRequestVo);
        // Assert.assertTrue("Failed to find user " + accUserBank, accUserBank != null);
    }
    /**
     * 删除
     */
    @Test
    public void delete(){

        crowdfundReturnsetService.deleteByReturnNo("2016062995902765");
       // Assert.assertTrue("Failed to find user " + accUserBank, accUserBank != null);
    }
}
