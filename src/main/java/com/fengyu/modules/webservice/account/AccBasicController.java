package com.fengyu.modules.webservice.account;

import com.fengyu.modules.model.AccBasic;
import com.fengyu.modules.service.account.AccBasicService;
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
@Path("/accbasic")
public class AccBasicController {

    @Autowired
    private AccBasicService accBasicService;

    /**
     * 获取支付密码
     * @param id
     * @return
     */
    @GET
    @Path("paypwd/{id}")
    public ResultAPI getPayPwd(@PathParam("id")Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(accBasicService.getPayPwd(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }
    /**
     * 修改支付密码
     * @param accBasic
     * @return
     */
    @POST
    @Path("payPwdUpdate")
    public ResultAPI updatePayPwd(AccBasic accBasic){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(accBasicService.updatePayPwd(accBasic));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }
}
