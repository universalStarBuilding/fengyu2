package com.modules.service.user;

import com.fengyu.modules.model.User;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.user.UserInfoService;
import com.fengyu.modules.service.user.UserService;
import com.fengyu.modules.webservice.user.vo.UserVo;
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
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
/*
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
*/

import java.util.Date;
import java.util.List;

/**
 * Created by guozheng.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@TestExecutionListeners(value = { DependencyInjectionTestExecutionListener.class })
public class UserServiceImplTest {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    private static Integer id = 1;

    private UserInfo userInfo=new UserInfo();

    private User user=new User();

    private UserVo userVo=new UserVo();

    /**
     * 查询用户真实姓名
     */
    @Test
    public void testCreationDuplicate() {

        UserInfo userInfo = userInfoService.getUserInfo(id);

        System.out.println(userInfo.getRealName());

        Assert.assertTrue("Failed to find user " + userInfo.getRealName(), userInfo != null);

    }
    /**
     * 添加真实姓名
     */
    @Test
    public void insertRealName(){
        UserInfo userInfo=new UserInfo();
        userInfo.setUserId(1);
        userInfo.setRealName("大爷");
        userInfoService.insertRealName(userInfo);
        Assert.assertTrue("Failed to find user " + userInfo, userInfo != null);
    }
    /**
     * 修改用户信息
     */
    @Test
    public void updateUserInfo(){
        userInfo.setUserId(id);
        userInfo.setRealName("张三");
        userInfo.setNickName("你猜");
        userInfo.setSex(1);
        userInfo.setBrithday(new Date());
        userInfoService.updateUserInfo(userInfo);
        Assert.assertTrue("Failed to find user " + userInfo, userInfo != null);
    }

    /**
     * 修改手机手机号
     */
    @Test
    public void updateUserPhone(){
        user.setId(id);
        user.setPhone("15634038589");
        userService.updatePhone(user);
    }

    /**
     * 修改邮箱
     */
    @Test
    public void updateUserEmail(){
        user.setId(id);
        user.setEmail("87157043@qq.com");
        userService.updateEmail(user);
    }
    /**
     * 修改登录密码
     */
    @Test
    public void updateUserLoginPwd(){
        user.setId(id);
        user.setPwdLogin("456qwe");
        userService.updateLoginPwd(user);
    }
    /**
     * 查询手机号是否存在
     */
    @Test
    public void getPhone(){
        user.setPhone("13127158258");
        userService.checkMobileRegister(user.getPhone());
    }
    @Test
    public void getEmail(){
        user.setEmail("87157042@qq.com");
        userService.checkEmailRegister(user.getEmail());
    }
}