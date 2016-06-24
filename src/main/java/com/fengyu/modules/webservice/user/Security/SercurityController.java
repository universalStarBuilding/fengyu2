package com.fengyu.modules.webservice.user.Security;

import com.fengyu.common.exception.AccountException;
import com.fengyu.common.exception.UserException;
import com.fengyu.modules.model.AccBasic;
import com.fengyu.modules.model.User;
import com.fengyu.modules.service.account.AccBasicService;
import com.fengyu.modules.service.user.UserService;
import com.fengyu.system.entity.ResultAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by admin on 2016/6/23.
 */
@Component
@Path("/security")
public class SercurityController {
    @Autowired
    private UserService userService;

    @GET
    @Path("get")
    public ResultAPI get() {

        ResultAPI resultAPI = new ResultAPI();

        return resultAPI;
    }

    /**
     * 查询手机号是否存在
     * @param id
     * @return
     */
    @GET
    @Path("get/{id}")
    public ResultAPI getPhone(@PathParam("id")Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.getSercurityById(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 查询邮箱是否存在
     * @param id
     * @return
     */
    @GET
    @Path("email/{id}")
    public ResultAPI getEmail(@PathParam("id") Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.getEmailById(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 查询模糊手机号和邮箱
     * @param id
     * @return
     */
    @GET
    @Path("contact/{id}")
    public ResultAPI getContact(@PathParam("id") Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.getContact(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 修改手机
     * @param user
     * @return
     */
    @POST
    @Path("update")
    public ResultAPI updatePhone(User user){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.updatePhone(user));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 修改邮箱
     * @param user
     * @return
     */
    @POST
    @Path("emailUpdate")
    public ResultAPI updateEmail(User user){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.updateEmail(user));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 修改登录密码
     * @param user
     * @return
     */
    @POST
    @Path("updateLoginPwd")
    public ResultAPI updateLoginPwd(User user){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.updateLoginPwd(user));
            resultAPI.setAccess_result("SUCCESS");
        }catch (UserException e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

}
