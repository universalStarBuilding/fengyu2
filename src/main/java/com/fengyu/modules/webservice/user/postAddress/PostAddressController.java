package com.fengyu.modules.webservice.user.postAddress;

import com.fengyu.common.exception.SystemException;
import com.fengyu.modules.model.PostAddress;
import com.fengyu.modules.service.user.PostAddressService;
import com.fengyu.system.entity.LogAccess;
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
    @GET
    @Path("getPostAddress/{id}")
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
    @POST
    @Path("insertPostAddress")
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
    @POST
    @Path("updatePostAddress")
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
    @GET
    @Path("deletePostAddress/{id}")
    public ResultAPI deletePostAddress(@PathParam("id")Integer id){
        ResultAPI resultAPI=new ResultAPI();
        try {
            resultAPI.setMsg(postAddressService.deletePostAddress(id));
            resultAPI.setAccess_result("SUCCESS");
        }catch (Exception e){
            e.printStackTrace();
            resultAPI.setAccess_result("FAILURE");
        }
        return resultAPI;
    }
    @POST
    @Path("pageList")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResultAPI pageList(@BeanParam LogAccess logAccess){

        ResultAPI resultAPI = new ResultAPI();
        try {
            resultAPI.setMsg(postAddressService.getListPostAddress(logAccess));
            resultAPI.setAccess_result("SUCCESS");
        }catch (SystemException e){
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg(e.getMessage());
        }catch (Exception e){
            resultAPI.setAccess_result("FAILURE");
            resultAPI.setMsg("服务器异常");
        }
        return resultAPI;
    }
}
