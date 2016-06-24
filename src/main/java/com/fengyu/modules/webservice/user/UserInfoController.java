package com.fengyu.modules.webservice.user;

import com.fengyu.common.exception.MapperSupport.Constant.WebActionExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.service.user.UserInfoService;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GET
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI getUserInfo(@PathParam("id") Integer id) {
        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(userInfoService.getUserInfo(id));
            resultAPI.setAccess_result("SUCCESS");
        } catch (Exception e) {
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }
    @POST
    @Path("update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI updateUserInfo(UserInfo userInfo){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userInfoService.updateUserInfo(userInfo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    @GET
    @Path("web/{id}")
    public ResultAPI getException(@PathParam("id")Integer id){
        ResultAPI resultAPI = new ResultAPI();
        if (id == 0) {
            throw new WebActionException(WebActionExceptionType.LoginNotFund, id);
        }

        return resultAPI;
    }
}
