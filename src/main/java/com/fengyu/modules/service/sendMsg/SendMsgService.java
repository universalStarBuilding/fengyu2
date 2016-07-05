package com.fengyu.modules.service.sendMsg;

import com.fengyu.common.channel.email.SendMail;
import com.fengyu.common.channel.phone.AliMsgApi;
import com.fengyu.common.config.Cache;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.webservice.user.vo.SendMsgVo;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 2016/6/25.
 */

@Service(value="sendMsgService")
@Transactional
public class SendMsgService {

    public SendMsgVo sendMsgPhone(SendMsgVo sendMsgVo) {
        //发送验证码
        String messageCode = String.valueOf(Math.random()).substring(2,8);
        sendMsgVo.setVerifyCode(messageCode);
        String type=sendMsgVo.getTypes();
        String code=sendMsgVo.getVerifyCode();
        String email=sendMsgVo.getEmail();
        String title=sendMsgVo.getTitle();
        String context=sendMsgVo.getContext();
        String phone=sendMsgVo.getPhone();
        if (type.equals("phone")){
            AliMsgApi.sendMsg(null,phone,code);
        }else if (type.equals("email")){
            SendMail.send(email,title,context+""+code);
        }
        //保存验证码
        Cache.setCodeCache(code);

        System.out.println(Cache.getCodeCache());
        return sendMsgVo;
    }
    //验证验证码
    public Integer verification(String messageCode) {
        //取出验证码
        String code=Cache.getCodeCache();
        if (!code.equals(messageCode)) {
            return 0;
        }
       return  1;
    }
}