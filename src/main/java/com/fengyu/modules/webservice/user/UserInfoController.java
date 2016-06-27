package com.fengyu.modules.webservice.user;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.common.utils.Constant;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.user.UserInfoService;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GET
    @Path("get/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getUserInfo(@PathParam("id") Integer id) {
        UserInfo userInfo = userInfoService.getUserInfo(id);
        if(userInfo == null){
            throw  new WebActionException(WebExceptionType.UserNotFund,userInfo);
        }
        return JSON.toJSONString(userInfo);
    }



    @POST
    @Path("update")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateUserInfo(UserInfo userInfo){
        Integer rows = userInfoService.updateUserInfo(userInfo);
        if(rows == 0){
            throw  new WebActionException(WebExceptionType.UpdateInvalidUserInfo,userInfo);
        }
        return JSON.toJSONString(rows);
    }
    @GET
    @Path("web/{id}")
    public String getException(@PathParam("id")Integer id){
        if (id == 0) {
            throw new WebActionException(WebExceptionType.LoginNotFund, id);
        }

        return null;
    }

    @GET
    @Path("test/{phone}")
    @Produces(MediaType.TEXT_PLAIN)
    public String updateUserInfo(@PathParam("phone") @Pattern(message = Constant.PhoneInvalidError, regexp = "[0-9]{3,9}") String phone){

        return phone;
    }
}
