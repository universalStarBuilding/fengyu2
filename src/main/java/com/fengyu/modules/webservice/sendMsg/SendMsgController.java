package com.fengyu.modules.webservice.sendMsg;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.User;
import com.fengyu.modules.service.sendMsg.SendMsgService;
import com.fengyu.modules.service.user.UserService;
import com.fengyu.modules.webservice.user.vo.SendMsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/25.
 */
@Component
@Path("/send")
public class SendMsgController {

    @Autowired
    private SendMsgService sendMsgService;
    @Autowired
    private UserService userService;
    /**
     * 发送验证码
     * @param sendMsgVo
     * @return
     */
    @POST
    @Path("sendMsg")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String sendMsg(SendMsgVo sendMsgVo){

        SendMsgVo rows=sendMsgService.sendMsgPhone(sendMsgVo);

        return JSON.toJSONString(rows);
    }
    /**
     * 验证验证码
     * @param sendMsgVo
     */
    @POST
    @Path("verifyCode")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void VerifyCode(SendMsgVo sendMsgVo){
        //获取到验证码
       Integer resultCode =  sendMsgService.verification(sendMsgVo.getVerifyCode());
        if(resultCode == 0){
            throw  new WebActionException(WebExceptionType.VERIFYCODE,sendMsgVo);
        }
    }

    /**
     * 手机号注册账号
     * @param user
     * @return
     */
    @POST
    @Path("registerPhone")
    @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        public String insertPhone(User user,SendMsgVo sendMsgVo){
        if (sendMsgVo.getTypes().equals("phone")){
            sendMsgVo.getVerifyCode();
        }

        return JSON.toJSONString(null);
    }
}
