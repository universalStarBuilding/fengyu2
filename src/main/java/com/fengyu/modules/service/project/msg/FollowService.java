package com.fengyu.modules.service.project.msg;

import com.fengyu.common.exception.OrderException;
import com.fengyu.modules.dao.project.msg.FollowDao;
import com.fengyu.modules.model.Follow;
import com.fengyu.modules.webservice.project.vo.FollowVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service(value = "followProjectService")
@Transactional
public class FollowService {
    @Autowired
    private FollowDao followProjectMapper;

    /**
     * 分页：我关注的项目列表
     * @param followProjectVo
     * @return
     */
    public SearchResult queryById(FollowVo followProjectVo){
        if (followProjectVo==null){
            throw new OrderException("获取信息列表失败");
        }

        SearchResult<Follow> result = new SearchResult<>();
        result.setTotalRows(followProjectMapper.queryById(followProjectVo));
        result.setRows(followProjectMapper.getListFollow(followProjectVo));
        return result ;
    }

    /**
     * 添加关注的项目
     * @param followProjectVo
     * @return
     */
    public Integer insert(FollowVo followProjectVo){
        if (followProjectVo==null){
            throw new OrderException("添加失败");
        }
        Follow followProject=new Follow();
        followProject.setUserId(followProjectVo.getUserId());
        followProject.setAttentionNo(followProjectVo.getAttentionNo());
        followProject.setAttentionTime(new Date());

        return followProjectMapper.insert(followProject);
    }
}
