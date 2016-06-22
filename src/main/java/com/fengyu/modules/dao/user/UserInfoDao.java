package com.fengyu.modules.dao.user;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.UserInfo;

@MyBatisDao
public interface UserInfoDao extends CrudDao<UserInfo> {
    //获取单个用户的详细信息
    UserInfo getUserInfo(Integer id);
    //修改用户信息
    Integer updateUserInfo(UserInfo userInfo);
}