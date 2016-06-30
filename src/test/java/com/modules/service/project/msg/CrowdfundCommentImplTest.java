package com.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundCommentDao;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.service.project.msg.CrowdfundCommentService;
import com.fengyu.modules.webservice.project.vo.CrowdfundCommentRequestVo;
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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class CrowdfundCommentImplTest {

    private CrowdfundCommentRequestVo ccrv=new CrowdfundCommentRequestVo();
    @Autowired
    private CrowdfundCommentService crowdfundCommentService;

    @Test
    public void queryById(){
        ccrv.setTopicId(1);
        ccrv.setPage(1);

        ccrv.setRows(2);
        crowdfundCommentService.queryById(ccrv);
        Assert.assertTrue("Failed to find user " + ccrv, ccrv != null);
    }


}
