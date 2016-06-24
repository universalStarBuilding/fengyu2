package com.fengyu.modules.service.user;

import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/22.
 */
@Service(value="userInfoService")
@Transactional
public class UserInfoService extends CrudService<UserInfoDao,UserInfo> {
    @Autowired
    private UserInfoDao userInfoDao;
    //获取用户的详细信息
    public UserInfo getUserInfo(Integer id){
        if (id==null){
            throw new UserException("用户信息获取失败");
        }
        return userInfoDao.getUserInfo(id);
    }
    //修改用户信息
    public Integer updateUserInfo(UserInfo userInfo){
        if (userInfo.getUserId()==null){
            throw new UserException("用户信息修改失败");
        }
        return userInfoDao.updateUserInfo(userInfo);
    }
}
