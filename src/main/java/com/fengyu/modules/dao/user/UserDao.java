package com.fengyu.modules.dao.user;


import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.User;
import com.fengyu.modules.webservice.user.vo.SendMsgVo;
import com.fengyu.modules.webservice.user.vo.UserVo;

@MyBatisDao
public interface UserDao extends CrudDao<User> {
    //根据用户id查询手机号是否存在
    String getPhone(Integer id);
    //查询Email是否存在
    String getEmail(Integer id);
    //隐藏手机号和邮箱的一些字段
    String getContact(Integer id);
    //修改手机号
    Integer updatePhone(User user);
    //修改邮箱
    Integer updateEmail(User user);
    //修改登录密码
    Integer updateLoginPwd(User user);
    //手机注册账号
    Integer insertPhone(SendMsgVo sendMsgVo);
    //邮箱注册账号
    Integer inserEmail(User user);
    //判断手机号是否重复
    User findByMoblie(String phone);
    //判断邮箱是否存在
    User findByEmail(String email);
}