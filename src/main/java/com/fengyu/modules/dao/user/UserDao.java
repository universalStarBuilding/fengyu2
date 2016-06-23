package com.fengyu.modules.dao.user;


import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.User;

@MyBatisDao
public interface UserDao extends CrudDao<User> {
    //根据用户id查询手机号是否存在
    Integer getPhone(Integer id);
}