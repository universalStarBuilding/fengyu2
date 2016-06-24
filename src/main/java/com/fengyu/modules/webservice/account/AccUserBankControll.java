package com.fengyu.modules.webservice.account;

import com.fengyu.common.exception.AccountException;
import com.fengyu.modules.model.AccUserBank;
import com.fengyu.modules.service.account.AccUserBankService;
import com.fengyu.system.entity.ResultAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Scanner;

/**
 * Created by admin on 2016/6/24.
 */
@Component
@Path("/accuserbank")
public class AccUserBankControll {
    @Autowired
    private AccUserBankService accUserBankService;

    @GET
    @Path("get")
    public ResultAPI get() {

        ResultAPI resultAPI = new ResultAPI();

        return resultAPI;
    }
    @POST
    @Path("insert")
    public ResultAPI insertAccUserBank(AccUserBank accUserBank){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(accUserBankService.insert(accUserBank));
            resultAPI.setAccess_result("SUCCESS");
        }catch (AccountException e){
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }
}
