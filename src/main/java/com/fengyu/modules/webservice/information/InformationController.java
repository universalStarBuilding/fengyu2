package com.fengyu.modules.webservice.information;

import com.alibaba.fastjson.JSON;
import com.fengyu.modules.model.Information;
import com.fengyu.modules.service.information.InformationService;
import com.fengyu.modules.webservice.information.vo.InformationRequestVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by admin on 2016/7/4.
 */
@Component
@Path("/information")
public class InformationController {
    @Autowired
    private InformationService informationService;

    /**
     * 获取资讯列表
     * @param informationRequestVo
     * @return
     */
    @POST
    @Path("getInformation")
    public String getListInformation(InformationRequestVo informationRequestVo){
        if (informationRequestVo.getPublishUserid()==null){
            throw new RuntimeException("获取资讯列表失败");
        }
        SearchResult result=informationService.getListInformation(informationRequestVo);

        return JSON.toJSONString(result);
    }

    /**
     * 根据ID查询资讯详细信息
     * @param informationRequestVo
     * @return
     */
    @POST
    @Path("selectById")
    public String selectById(InformationRequestVo informationRequestVo){
        if (informationRequestVo.getId()==null){
            throw new RuntimeException("资讯详细信息获取失败");
        }
        Information information=informationService.selectById(informationRequestVo);
        return JSON.toJSONString(information);
    }
}
