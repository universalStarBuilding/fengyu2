package com.fengyu.modules.service.user;

import com.fengyu.common.exception.UserException;
import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
        userInfo.setUserId(userInfo.getUserId());
        userInfo.setRealName(userInfo.getRealName());
        userInfo.setNickName(userInfo.getNickName());
        userInfo.setSex(userInfo.getSex());
        userInfo.setBrithday(new Date());
        userInfo.setProvinceId(userInfo.getProvinceId());
        userInfo.setProvinceId(userInfo.getCityId());
        userInfo.setCountyId(userInfo.getCountyId());
        userInfo.setAddress(userInfo.getAddress());
        return userInfoDao.updateUserInfo(userInfo);
    }
}
