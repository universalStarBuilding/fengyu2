package com.fengyu.modules.webservice.project.msg;

import com.alibaba.fastjson.JSON;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.modules.service.project.msg.CrowdfundBasicinfoService;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoRequestVo;
import com.fengyu.modules.webservice.project.vo.HotResponseVo;
import com.fengyu.system.entity.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@Path("/project/msg/launchProject")
public class LaunchController {


    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(LaunchController.class);



    @Autowired
    private CrowdfundBasicinfoService launchProjectService;

    /**
     * 我发起的项目列表
     * @param launchProjectVo
     * @return
     */
    @POST
    @Path("queryBy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String pageList(CrowdfundBasicinfoRequestVo launchProjectVo){
        if (launchProjectVo==null){
            throw new WebActionException(WebExceptionType.GETINVALIDLAUNCHPROJECT,launchProjectVo);
        }
        SearchResult searchResult=launchProjectService.queryBy(launchProjectVo);


        return JSON.toJSONString(searchResult);
    }

    /**
     * 查询热门项目列表
     * @param launchVo
     * @return
     */
    @POST
    @Path("selectHot")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String selectHot(CrowdfundBasicinfoRequestVo launchVo){

            if (launchVo==null){
                throw new WebActionException(WebExceptionType.SELECTINVALIDHOT,launchVo);
            }
        SearchResult  searchResult=launchProjectService.selectHot(launchVo);

        return JSON.toJSONString(searchResult);
    }

    /**
     * 进行中和预热中的项目
     * @param launchVo
     * @return
     */
    @POST
    @Path("selectConduct")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String selectConduct(CrowdfundBasicinfoRequestVo launchVo){

        if (launchVo==null){
            throw new WebActionException(WebExceptionType.SELECTINVALIDHOT,launchVo);
        }
        SearchResult  searchResult=launchProjectService.selectConduct(launchVo);
        return JSON.toJSONString(searchResult);
    }

    /**
     * 项目详情
     * @param launchVo
     * @return
     */
    @POST
    @Path("selectDetails")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String selectDetails(CrowdfundBasicinfoRequestVo launchVo){

        if (launchVo==null){
            throw new WebActionException(WebExceptionType.SELECTINVALIDHOT,launchVo);
        }
        List<HotResponseVo> searchResult=launchProjectService.selectDetails(launchVo);
        return JSON.toJSONString(searchResult);
    }


}
