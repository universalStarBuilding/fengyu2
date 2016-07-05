package com.fengyu.modules.dao.information;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Information;
import com.fengyu.modules.webservice.information.vo.InformationRequestVo;

import java.util.List;

@MyBatisDao
public interface InformationDao extends CrudDao<Information>{
    //查询列表详细信息
    Information selectById(InformationRequestVo informationRequestVo);
    //获取资讯列表
    List<Information> getListInformation(InformationRequestVo informationRequestVo);
    //统计数量
    long getInformationPage(InformationRequestVo informationRequestVo);
}