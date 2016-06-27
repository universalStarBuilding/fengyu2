package com.fengyu.modules.webservice.project.msg;

import com.fengyu.modules.service.project.msg.MessageService;
import com.fengyu.modules.webservice.project.vo.MessageRequestVo;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/23.
 */
@Component
@Path("/project/msg/message")
public class MessageController {


        @Autowired
        private MessageService messageService;

        @POST
        @Path("inserts")
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        public ResultAPI pageList(MessageRequestVo messageTextVo){

            ResultAPI resultAPI = new ResultAPI();
            try {
                resultAPI.setMsg(messageService.insert(messageTextVo));
                resultAPI.setAccess_result("SUCCESS");
            }catch (Exception e){
                e.printStackTrace();
                resultAPI.setAccess_result("FAILURE");
                resultAPI.setMsg("服务器异常");
            }


            return resultAPI;
        }


    @POST
    @Path("privateLetter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI privateLetter(MessageRequestVo messageRequestVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(messageService.getSendMsgListByRecId(messageRequestVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }


        return resultAPI;
    }

    @POST
    @Path("deleteLetter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI deleteLetter(MessageRequestVo messageTextVo){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(messageService.deleteById(messageTextVo));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }

        return resultAPI;
    }

}
