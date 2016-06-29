package com.fengyu.system.webservice;

import com.alibaba.fastjson.JSON;
import com.fengyu.system.entity.LogAccess;
import com.fengyu.system.entity.ResultAPI;
import com.fengyu.system.model.Dict;
import com.fengyu.system.service.DictService;
import com.fengyu.system.service.LogAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@Path("/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    @GET
    @Path("list/{typecode}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String list(@PathParam("typecode") String typecode){

        List<Dict> dict = dictService.getListByTypeCode(typecode);

        return JSON.toJSONString(dict);
    }


    @GET
    @Path("get/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String get(@PathParam("code") String code){

        Dict dict = dictService.getListByCode(code);

        return JSON.toJSONString(dict);
    }

}
