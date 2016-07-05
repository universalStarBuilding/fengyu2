package com.fengyu.modules.dao.project.returnset;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.CrowdfundReturnset;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetReponseVo;
import com.fengyu.modules.webservice.project.vo.CrowdfundReturnsetRequestVo;

import java.util.List;

@MyBatisDao
public interface CrowdfundReturnsetDao extends CrudDao<CrowdfundReturnset>{

    /**
     * 提价项目回报
     * @param record
     * @return
     */
    int insert(CrowdfundReturnset record);

    /**
     * 修改项目回报
     * @param record
     * @return
     */
    int update(CrowdfundReturnset record);

    /**
     * 查询指定项目的回报列表
     * @param projectNo
     * @return
     */
    List<CrowdfundReturnsetReponseVo> getListByProjectNo(String projectNo);

    /**
     * 删除指定项目的回报
     * @return
     */
    Integer deleteByReturnNo(String returnNo);

    /**
     * 查询指定项目回报的详细信息
     * @return
     */
    CrowdfundReturnset getCrowdfund(CrowdfundReturnsetRequestVo crowdfundReturnsetRequestVo);
}