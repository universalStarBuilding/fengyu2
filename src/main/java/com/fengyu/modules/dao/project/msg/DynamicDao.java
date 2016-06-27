package com.fengyu.modules.dao.project.msg;

import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.Dynamic;


@MyBatisDao
public interface DynamicDao {

    //添加项目动态信息
    int insert(Dynamic record);

}