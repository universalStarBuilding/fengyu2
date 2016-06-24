package com.fengyu.modules.service.user;

import com.fengyu.common.exception.UserException;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.User;
import com.fengyu.modules.model.UserInfo;
import com.fengyu.modules.webservice.user.vo.SercurityVo;
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
        return userInfoDao.updateUserInfo(userInfo);
    }

    /**
     *查询真实姓名
     * @param id
     * @return
     */
    public SercurityVo getRealName(Integer id){
        if (id==null){
            throw new UserException("真实姓名查询失败");
        }
        SercurityVo vo=new SercurityVo();
        String realName=userInfoDao.getRealName(id);
        if (StringUtils.isNotEmpty(realName)){
            vo.setVagueRealName(realName);
            realName.replace(realName.substring(2),"*");
            vo.setRealNameStatus(true);
        }else {
            vo.setRealNameStatus(false);
        }
        return vo;
    }

    /**
     * 添加用户实名信息
     * @param userInfo
     * @return
     */
    public Integer insertRealName(UserInfo userInfo){
        if (userInfo.getUserId()==null){
            throw new UserException("添加实名信息失败");
        }
        return userInfoDao.insertRealName(userInfo);
    }
}
