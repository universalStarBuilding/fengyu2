package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.MessageDao;
import com.fengyu.modules.dao.project.msg.MessageTextDao;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.Message;
import com.fengyu.modules.model.MessageText;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.project.msg.MessageService;
import com.fengyu.modules.webservice.project.vo.MessageRequestVo;
import com.fengyu.modules.webservice.project.vo.MessageResponseVo;
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

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2016/6/23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class MessageImplTest {
    @Autowired
    private MessageService messageService;
    MessageRequestVo messageRequestVo=new MessageRequestVo();

    @Test
    public void insert(){
        messageRequestVo.setSendId(1);
        messageRequestVo.setRecId(2);
        messageRequestVo.setMessageType(3);
        messageRequestVo.setTitle("大爷的");
        messageRequestVo.setMessage("困啊");
        messageService.insert(messageRequestVo);
        Assert.assertTrue("Failed to find user " + messageRequestVo, messageRequestVo != null);
    }

    @Test
    public void getSendMsgListByRecId(){
        messageRequestVo.setPage(1);
        messageRequestVo.setRows(2);
        messageRequestVo.setRecId(1);
        messageRequestVo.setMessageType(1);
        messageService.getSendMsgListByRecId(messageRequestVo);
        Assert.assertTrue("Failed to find user " + messageRequestVo, messageRequestVo != null);

    }

    @Test
    public void deleteById(){
        messageRequestVo.setId(1);
        messageService.deleteById(messageRequestVo);
        Assert.assertTrue("Failed to find user " + messageRequestVo, messageRequestVo != null);

    }
}
