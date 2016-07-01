package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.CrowdfundAttentionDao;
import com.fengyu.modules.dao.project.msg.CrowdfundBasicinfoDao;
import com.fengyu.modules.dao.project.msg.OrderDao;
import com.fengyu.modules.model.CrowdfundAttention;
import com.fengyu.modules.model.CrowdfundBasicinfo;
import com.fengyu.modules.model.Order;
import com.fengyu.modules.webservice.project.vo.HotResponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundBasicinfoVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;


@Service(value = "launchProjectService")
@Transactional
public class CrowdfundBasicinfoService {

    @Autowired
    private CrowdfundBasicinfoDao launchProjectMapper;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CrowdfundAttentionDao crowdfundAttentionDao;

    /**
     * 分页：我发起的项目列表
     * @param launchProjectVo
     * @return
     */
    public SearchResult queryBy(CrowdfundBasicinfoVo launchProjectVo){

        SearchResult<CrowdfundBasicinfo> result = new SearchResult<>();
        result.setTotalRows(launchProjectMapper.queryBy(launchProjectVo));
        result.setRows(launchProjectMapper.getListLaunch(launchProjectVo));

        return result ;
    }

    /**
     * 查询热门项目列表
     * @param launchVo
     * @return
     */
    public SearchResult selectHot(CrowdfundBasicinfoVo launchVo){

        List<HotResponseVo> list = launchProjectMapper.selectHot(launchVo);
        for (HotResponseVo vo :list){
            Order order=new Order();
            order.setOrderOwner(vo.getProjectNo());
            Integer count = orderDao.supportNumber(order);
            vo.setNumber(count);
        }
        Integer count=launchProjectMapper.getTotal(launchVo);
        SearchResult<HotResponseVo> result = new SearchResult<>();
        result.setTotalRows(count);
        result.setRows(list);

        return result;
    }
    /**
     * 进行中或者预热中的项目
     * @param launchVo
     * @return
     */
    public SearchResult selectConduct(CrowdfundBasicinfoVo launchVo){
        List<HotResponseVo> list=launchProjectMapper.selectConduct(launchVo);
        for (HotResponseVo vo:list){
            Order order=new Order();
            order.setOrderOwner(vo.getProjectNo());
            Integer count=orderDao.supportNumber(order);
            vo.setNumber(count);
        }
        Integer count=launchProjectMapper.getPreheat(launchVo);
        SearchResult<HotResponseVo> result = new SearchResult<>();
        result.setTotalRows(count);
        result.setRows(list);
        return result;
    }

    /**
     * 项目详情
     * @param launchVo
     * @return
     */
    public List<HotResponseVo> selectDetails(CrowdfundBasicinfoVo launchVo){
        List<HotResponseVo> list=launchProjectMapper.selectDetails(launchVo);
        for (HotResponseVo vo:list){
            Order order=new Order();
            order.setOrderOwner(vo.getProjectNo());
            Integer count=orderDao.supportNumber(order);
            vo.setNumber(count);
            CrowdfundAttention crowdfundAttention=new CrowdfundAttention();
            crowdfundAttention.setAttentionNo(vo.getProjectNo());
            Integer followcount=crowdfundAttentionDao.getDetails(crowdfundAttention);
            vo.setFollowNumber(followcount);
        }
        return list;
    }
}
