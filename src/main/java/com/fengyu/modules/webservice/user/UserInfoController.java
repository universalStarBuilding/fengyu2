package com.fengyu.modules.webservice.user;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.common.utils.Constant;
import com.fengyu.modules.model.User;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.user.UserInfoService;
import com.alibaba.fastjson.JSON;
import com.fengyu.modules.service.user.UserService;
import com.fengyu.modules.webservice.user.vo.FormVo;
import com.fengyu.modules.webservice.user.vo.SendMsgVo;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.json.Json;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * 用户详细信息 Controller
 * Controller
 *
 * @author Wudonglin
 * @version 2016-06-22
 */
@Component
@Path("/user")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    /**
     * 获取用户详细信息
     * @param id
     * @return
     */
    @GET
    @Path("get/{id}")
    public String getUserInfo(@PathParam("id") Integer id) {
        UserInfo userInfo = userInfoService.getUserInfo(id);
        if(userInfo == null){
            throw  new WebActionException(WebExceptionType.USERNOTFUND,userInfo);
        }
        return JSON.toJSONString(userInfo);
    }
    //修改用户信息
    @POST
    @Path("update")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateUserInfo(UserInfo userInfo){
        Integer rows = userInfoService.updateUserInfo(userInfo);
        if(rows == 0){
            throw  new WebActionException(WebExceptionType.UPDATEINVALIDUSERINFO,userInfo);
        }
        return JSON.toJSONString(rows);
    }

    @GET
    @Path("update/{type}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateUserInfo1(@PathParam("type") String update){

        return null;
    }


    /**
     * 添加实名信息
     * @param userInfo
     * @return
     */
    @POST
    @Path("insertRealName")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String insertRealName(UserInfo userInfo){
        Integer rows=userInfoService.insertRealName(userInfo);
        if (rows==0){
            throw new WebActionException(WebExceptionType.LOGINNOTFUND,userInfo);
        }
        return JSON.toJSONString(rows);
    }

    /**
     * 手机注册
     * @param
     * @return
     */
    @POST
    @Path("insertPhone")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String insertPhone(User user){
        Integer rows=userService.insertPhone(user);
        if (rows==null){
            throw new WebActionException(WebExceptionType.USERPHONENOTNULL,user);
        }
        return JSON.toJSONString(user);
    }

    /**
     * 邮箱注册
     * @param user
     * @return
     */
    @POST
    @Path("insertEmail")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String insertEmail(User user){
        Integer rows=userService.insertEmail(user);
        if (rows==null){
            throw new WebActionException(WebExceptionType.USEREMAILNOTNULL,user);
        }
        return JSON.toJSONString(user);
    }
}
