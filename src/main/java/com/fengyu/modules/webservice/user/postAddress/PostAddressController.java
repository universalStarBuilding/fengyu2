package com.fengyu.modules.webservice.user.postAddress;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.PostAddress;
import com.fengyu.modules.service.user.PostAddressService;
import com.fengyu.system.entity.ResultAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/22.
 */
@Component
@Path("/user/postAddress")
public class PostAddressController {

    protected Logger logger = LoggerFactory.getLogger(PostAddressController.class);
    @Autowired
    private PostAddressService postAddressService;

    @GET
    @Path("get")
    public ResultAPI get() {

        ResultAPI resultAPI = new ResultAPI();

        return resultAPI;
    }

    /**
     * 获取收获地址
     * @param id
     * @return
     */
    @GET
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI getPostAddress(@PathParam("id")Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(postAddressService.getPostAddress(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 添加收货地址
     * @param postAddress
     * @return
     */
    @POST
    @Path("insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI insertPostAddress(PostAddress postAddress){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(postAddressService.insert(postAddress));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 修改收获地址
     * @param postAddress
     * @return
     */
    @POST
    @Path("update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI updatePostAddress( PostAddress postAddress){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(postAddressService.updatePostAddress(postAddress));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }

    /**
     * 删除收获地址
     * @param id
     * @return
     */
    @GET
    @Path("delete/{id}")
    public String deletePostAddress(@PathParam("id")Integer id){
        Integer rows=postAddressService.deletePostAddress(id);
        if (rows==0){
            throw new WebActionException(WebExceptionType.DeletePostAccess,id);
        }
        return JSON.toJSONString(rows);
    }

    /**
     * 分页查询收获地址
     * @param postAddress
     * @return
     */
    @POST
    @Path("pageList")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(PostAddress postAddress){

       return null;
    }
}
