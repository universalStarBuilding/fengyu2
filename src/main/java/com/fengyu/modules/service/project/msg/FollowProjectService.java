package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.FollowProjectMapper;
import com.fengyu.modules.model.FollowProject;
import com.fengyu.modules.webservice.project.vo.FollowProjectVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/22.
 * @FollowProjectService 我关注的项目
 */
@Service(value = "followProjectService")
@Transactional
public class FollowProjectService {
    @Autowired
    private FollowProjectMapper followProjectMapper;

    public SearchResult queryById(FollowProjectVo followProjectVo){
        if (followProjectVo==null){
            throw new OrderException("获取信息列表失败");
        }
        //分页
        SearchResult<FollowProject> result = new SearchResult<>();
        result.setTotalRows(followProjectMapper.queryById(followProjectVo));
        result.setRows(followProjectMapper.getListFollow(followProjectVo));

        return result ;
    }
}
