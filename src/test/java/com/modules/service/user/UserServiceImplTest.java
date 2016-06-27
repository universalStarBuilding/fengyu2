package com.modules.service.user;

import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.user.UserInfoService;
import com.fengyu.modules.service.user.UserService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

/**
 * Created by guozheng.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
//@ContextConfiguration(classes=AppConfig.class, loader=AnnotationConfigContextLoader.class)
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class UserServiceImplTest {

    @Autowired
    private UserInfoService userInfoService;

    private static Integer id = 1;

    @Test
    public void testCreationDuplicate() {

        UserInfo userInfo = userInfoService.getUserInfo(id);

        System.out.println(userInfo.getRealName());

        Assert.assertTrue("Failed to find user " + userInfo.getNickName(), userInfo != null);

    }


}