package com.fengyu.modules.webservice.project.returnset;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.model.CrowdfundReturnset;
import com.fengyu.modules.service.project.returnset.CrowdfundReturnsetService;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by admin on 2016/6/27.
 */
@Component
@Path("/project/returnset")
public class CrowdfundReturnsetController {


    @Autowired
    private CrowdfundReturnsetService crowdfundReturnsetService;


    /**
     * 获取指定项目的回报列表
     * @param id
     * @return
     */
    @GET
    @Path("list/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String list(@PathParam("id") String id){

        List<CrowdfundReturnsetReponseVo> vo = crowdfundReturnsetService.getListByProjectNo(id);
        if(vo == null){
            throw new WebActionException(WebExceptionType.CROWDFUNDRETURNSETNOTFUND,vo);
        }

        return JSON.toJSONString(vo);
    }

    /**
     * 增加项目回报
     * @return
     */
    @POST
    @Path("save")
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo){

        Integer rows = crowdfundReturnsetService.saveCrowdfundReturnset(crowdfundReturnsetRequestVo);
        if(rows == 0){
            throw  new WebActionException(WebExceptionType.DELETEINVALIDPROEJCTRETURNSET,crowdfundReturnsetRequestVo);
        }

    }

    /**
     * 修改项目回报
     * @return
     */
    @POST
    @Path("edit/{returnNo}")
    public void edit(@PathParam("returnNo")String returnNo, @Valid CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo){

        crowdfundReturnsetRequestVo.setReturnNo(returnNo);
        Integer rows = crowdfundReturnsetService.updateCrowdfundReturnset(crowdfundReturnsetRequestVo);
        if(rows == 0){
            throw  new WebActionException(WebExceptionType.UPDATEINVALIDPROEJCTRETURNSET,crowdfundReturnsetRequestVo);
        }
    }

//    /**
//     * 删除指定项目的回报
//     * @param returnNo
//     * @return
//     */
//    @POST
//    @Path("delete/{returnNo}")
//    public void delete(@PathParam("returnNo") String returnNo){
//
//        Integer rows = crowdfundReturnsetService.deleteByReturnNo(returnNo);
//        if(rows == 0){
//            throw  new WebActionException(WebExceptionType.DELETEINVALIDPROEJCTRETURNSET,returnNo);
//        }
//    }

    /**
     * 获取单条项目回报的详细信息
     * @param crowdfundReturnsetRequestVo
     * @return
     */
    @POST
    @Path("getCrowdfund")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getCrowdfund(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo){
          CrowdfundReturnset crowdfundReturnset=crowdfundReturnsetService.getCrowdfund(crowdfundReturnsetRequestVo);
        return JSON.toJSONString(crowdfundReturnset);
    }
}
