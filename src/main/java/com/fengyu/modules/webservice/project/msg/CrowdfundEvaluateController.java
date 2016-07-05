package com.fengyu.modules.webservice.project.msg;

import com.alibaba.fastjson.JSON;
import com.fengyu.modules.model.CrowdfundEvaluate;
import com.fengyu.modules.service.project.msg.CrowdfundEvaluateService;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundEvaluateRequestVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by admin on 2016/7/4.
 */
@Component
@Path("/porject/msg/crowdfundComment")
public class CrowdfundEvaluateController{

    @Autowired
    private CrowdfundEvaluateService crowdfundEvaluateService;

    /**
     * 添加详细信息
     * @param crowdfundEvaluate
     * @return
     */
    @POST
    @Path("insertEvaluate")
    public String insert(CrowdfundEvaluate crowdfundEvaluate){
        Integer rows=crowdfundEvaluateService.insert(crowdfundEvaluate);

        if (rows==null){
            throw new RuntimeException("评价失败");
        }

        return JSON.toJSONString(rows);
    }

    /**
     * 根据用户查询项目评价
     * @param crowdfundEvaluateReponseVo
     * @return
     */
    @POST
    @Path("getUserEvaluate")
    public String getUserEvaluate(CrowdfundEvaluateReponseVo crowdfundEvaluateReponseVo){
        if (crowdfundEvaluateReponseVo.getUserId()==null){

        }
        CrowdfundEvaluate crowdfundEvaluate=crowdfundEvaluateService.getUserEvaluate(crowdfundEvaluateReponseVo);

        return JSON.toJSONString(crowdfundEvaluate);
    }

    /**
     * 查询项目评价列表
     * @param crowdfundEvaluateRequestVo
     * @return
     */
    @POST
    @Path("getProjectEvaluate")
    public String getProjectEvaluate(CrowdfundEvaluateRequestVo crowdfundEvaluateRequestVo){
        SearchResult searchResult=crowdfundEvaluateService.getProjectEvaluate(crowdfundEvaluateRequestVo);
        return JSON.toJSONString(searchResult);
    }
}
