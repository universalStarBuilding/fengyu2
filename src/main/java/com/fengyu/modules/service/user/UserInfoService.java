package com.fengyu.modules.service.user;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.User;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.webservice.user.vo.SercurityVo;
import com.sun.mail.imap.protocol.UIDSet;
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

        return userInfoDao.getUserInfo(id);
    }
    //修改用户信息
    public Integer updateUserInfo(UserInfo userInfo){
        if (userInfo.getUserId()==null){
            throw new WebActionException(WebExceptionType.GETRINVALADDRESS,userInfo);
        }
        return userInfoDao.updateUserInfo(userInfo);
    }

    /**
     * 添加用户实名信息
     * @param userInfo
     * @return
     */
    public Integer insertRealName(UserInfo userInfo){
        if (userInfo.getUserId()==null){
            throw new WebActionException(WebExceptionType.INSERTINVALIDREALNAME,userInfo);
        }
        return userInfoDao.insertRealName(userInfo);
    }
}
