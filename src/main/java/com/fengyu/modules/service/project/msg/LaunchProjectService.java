package com.fengyu.modules.service.project.msg;

import com.fengyu.common.exception.OrderException;
import com.fengyu.modules.dao.project.msg.LaunchProjectMapper;
import com.fengyu.modules.model.LaunchProject;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.LaunchProjectVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/22.
 * @LaunchProjectService 我发起的项目
 */
@Service(value = "launchProjectService")
@Transactional
public class LaunchProjectService {

    @Autowired
    private LaunchProjectMapper launchProjectMapper;

    public SearchResult queryBy(LaunchProjectVo launchProjectVo){
        if (launchProjectVo==null){
            throw new OrderException("查询发起项目失败");
        }
        //分页
        SearchResult<LaunchProject> result = new SearchResult<>();
        result.setTotalRows(launchProjectMapper.queryBy(launchProjectVo));
        result.setRows(launchProjectMapper.getListLaunch(launchProjectVo));

        return result ;
    }
}
