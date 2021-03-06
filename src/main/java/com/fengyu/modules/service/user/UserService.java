package com.fengyu.modules.service.user;


import com.fengyu.common.channel.email.SendMail;
import com.fengyu.common.channel.phone.AliMsgApi;
import com.fengyu.common.config.Cache;
import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.account.AccBasicDao;
import com.fengyu.modules.dao.account.AccUserBankDao;
import com.fengyu.modules.dao.user.UserDao;
import com.fengyu.modules.dao.user.UserInfoDao;
import com.fengyu.modules.model.User;
import com.fengyu.modules.webservice.user.vo.SendMsgVo;
import com.fengyu.modules.webservice.user.vo.SercurityVo;
import com.fengyu.modules.webservice.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service(value = "userService")
@Transactional
public class UserService extends CrudService<UserDao, User> {
    @Autowired
    private UserDao userDao;

    @Autowired
    private AccBasicDao accBasicDao;

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private AccUserBankDao accUserBankDao;

    /**
     * 查询手机号是否存在
     *
     * @return
     */
    public SercurityVo getSercurityById(Integer id) {
        if (id == null) {
            throw new WebActionException(WebExceptionType.GETPHONEEXISTS,id);
        }
        SercurityVo vo = new SercurityVo();
        //手机
        String phone = userDao.getPhone(id);
        if (StringUtils.isNotEmpty(phone)) {
            phone = phone.replace(phone.substring(3, 7), "****");
            vo.setVaguePhone(phone);
            vo.setPhoneStatus(true);
        } else {
            vo.setPhoneStatus(false);
        }
        //邮箱
        String email = userDao.getEmail(id);
        if (StringUtils.isNotEmpty(email)) {
            email=email.replace(email.substring(3, 7), "****");
            vo.setVagueEmail(email);
            vo.setEmailStatus(true);
        } else {
            vo.setEmailStatus(false);
        }
        //支付密码
        String payPwd = accBasicDao.getPayPwd(id);
        if (StringUtils.isNotEmpty(payPwd)) {
            vo.setPayPwdStatus(true);
        } else {
            vo.setPayPwdStatus(false);
        }
        //实名
        String realName = userInfoDao.getRealName(id);
        if (StringUtils.isNotEmpty(realName)) {
            realName=realName.replace(realName.substring(2), "*");
            vo.setVagueRealName(realName);
            vo.setRealNameStatus(true);
        } else {
            vo.setRealNameStatus(false);
        }
        //银行卡
        String userBank = accUserBankDao.getUserBank(id);
        if (StringUtils.isNotEmpty(userBank)) {//622 2804 3360 1000 3614
            userBank=userBank.replace(userBank.substring(3,15),"************");
            vo.setVagueUserBank(userBank);
            vo.setUserBankStatus(true);
        } else {
            vo.setUserBankStatus(false);
        }
        return vo;
    }

    /**
     * 查询手机号和邮箱是否存在
     *
     * @param id
     * @return
     */
    public SercurityVo getContact(Integer id) {
        if (id == null) {
            throw new WebActionException(WebExceptionType.USERPHONEEMAIL,id);
        }
        SercurityVo vo = new SercurityVo();
        String phone = userDao.getPhone(id);
        String email = userDao.getEmail(id);
        if (StringUtils.isNotEmpty(email) && StringUtils.isNotEmpty(phone)) {
            email=email.replace(email.substring(3, 7), "****");
            phone=phone.replace(email.substring(3, 7), "****");
            vo.setVaguePhone(phone);
            vo.setVagueEmail(email);
            vo.setEmailStatus(true);
        } else {
            vo.setEmailStatus(false);
        }
        return vo;
    }

    /**
     * 修改手机号
     *
     * @param user
     * @return
     */
    public Integer updatePhone(User user) {
        if (user.getPhone()==null) {
            throw new WebActionException(WebExceptionType.UPDATEPHONEEXISTS,user);
        }
        return userDao.updatePhone(user);
    }

    /**
     * 修改邮箱
     *
     * @param user
     * @return
     */
    public Integer updateEmail(User user) {
        if (user.getEmail()==null) {
            throw new WebActionException(WebExceptionType.UPDATEEMAILEXISTS,user);
        }
        return userDao.updateEmail(user);
    }

    /**
     * 修改登录密码
     *
     * @param user
     * @return
     */
    public Integer updateLoginPwd(User user) {
        if (user == null) {
            throw new RuntimeException("密码修改失败");
        }
        return userDao.updateLoginPwd(user);
    }

    /**
     * 验证手机号的唯一性
     *
     * @param phone
     */
    public void checkMobileRegister(String phone) {
        if (phone == null) {
            throw new WebActionException(WebExceptionType.USERPHONENOTNULL,phone);
        }
        User user = this.userDao.findByMoblie(phone);
        if (user!= null) {
            throw new WebActionException(WebExceptionType.USERPHONEEXISTS, phone);
        }
    }
    /**
     * 验证邮箱是否存在
     * @param email
     */
    public void checkEmailRegister(String email){
        if (email==null){
            throw new WebActionException(WebExceptionType.USEREMAILNOTNULL,email);
        }
        User user=this.userDao.findByEmail(email);
        if (user!=null){
            throw new WebActionException(WebExceptionType.USEREMAILEXISTS, email);
        }
    }

    /**
     * 手机注册
     * @param user
     * @return
     */
    public Integer insertPhone(User user){

        if (user.getPhone()==null){
            throw new WebActionException(WebExceptionType.USERPHONENOTNULL,user);
        }
        //检查手机号是否唯一
        this.checkMobileRegister(user.getPhone());
        //设置手机号是登录账户
        user.setNameLogin(user.getPhone());
        //用户注册的时间
        user.setTimeCreate(new Date());
        //默认为1
        user.setUserType(1);
        return userDao.insertPhone(user);
    }

    /**
     * 邮箱注册账号
     * @param user
     * @return
     */
    public Integer insertEmail(User user){
        if (user.getEmail()==null){
            throw new WebActionException(WebExceptionType.USEREMAILNOTNULL,user);
        }
        this.checkEmailRegister(user.getEmail());
        user.setNameLogin(user.getEmail());
        user.setTimeCreate(new Date());
        return userDao.inserEmail(user);
    }
}

