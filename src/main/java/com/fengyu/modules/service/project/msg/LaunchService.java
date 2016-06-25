package com.fengyu.modules.service.project.msg;

import com.fengyu.common.exception.OrderException;
import com.fengyu.modules.dao.project.msg.LaunchDao;
import com.fengyu.modules.model.Launch;
import com.fengyu.modules.webservice.project.vo.LaunchVo;
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
public class LaunchService {

    @Autowired
    private LaunchDao launchProjectMapper;

    /**
     * 分页：我发起的项目列表
     * @param launchProjectVo
     * @return
     */
    public SearchResult queryBy(LaunchVo launchProjectVo){
        if (launchProjectVo==null){
            throw new OrderException("查询发起项目失败");
        }

        SearchResult<Launch> result = new SearchResult<>();
        result.setTotalRows(launchProjectMapper.queryBy(launchProjectVo));
        result.setRows(launchProjectMapper.getListLaunch(launchProjectVo));

        return result ;
    }
}
