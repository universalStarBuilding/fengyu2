package com.fengyu.modules.webservice.project.Returnset;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.utils.Constant;
import com.fengyu.modules.service.project.returnset.CrowdfundReturnsetService;
import com.fengyu.modules.webservice.user.vo.FormVo;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 2016/6/27.
 */
@Component
@Path("/project/returnset")
public class CrowdfundReturnsetController {

    private CrowdfundReturnsetService crowdfundReturnsetService;

    @GET
    @Path("test/{phone}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@PathParam("phone") @Pattern(message = Constant.PhoneInvalidError, regexp = "[0-9]{3,9}") String phone){

        return phone;
    }

    @POST
    @Path("test/form")
    public String testPhone(@Valid FormVo form){

        return JSON.toJSONString(form);
    }

}
