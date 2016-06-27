package com.fengyu.modules.webservice.user.Security;

import com.fengyu.common.channel.email.SendMail;
import com.fengyu.common.channel.phone.AliMsgApi;
import com.fengyu.common.config.Cache;
import com.fengyu.modules.model.User;
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

    /**
     * 查询安全中心信息
     * @param id    用户编号
     * @return
     */
    @GET
    @Path("get/{id}")
    public ResultAPI get(@PathParam("id")Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(userService.getSercurityById(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            resultAPI.setMsg(e.getMessage());
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
        }catch (Exception e){
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 发送验证码
     * @param
     * @return
     */
    @GET
    @Path("sendCode/{type}/{value}")
    public ResultAPI sendCode(@PathParam("type")String type,@PathParam("value")String value){

        String code = "123213";
        if(type.equals("email")){
            SendMail.send(value,"测试邮箱接口","SUCCESS,code:"+code);
        }else if(type.equals("phone")){
            AliMsgApi.sendMsg(null,value,code);
        }
        Cache.setCodeCache(code);

        return null;
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
        }catch (Exception e){
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
        }catch (Exception e){
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
        }catch (Exception e){
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

}
