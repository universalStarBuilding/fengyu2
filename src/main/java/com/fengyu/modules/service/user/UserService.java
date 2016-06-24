package com.fengyu.modules.service.user;


import com.alibaba.druid.sql.visitor.functions.Substring;
import com.fengyu.common.exception.UserException;
import com.fengyu.common.service.BaseService;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.user.UserDao;
import com.fengyu.modules.model.User;
import com.fengyu.modules.webservice.user.vo.SercurityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
@Transactional
public class UserService extends CrudService<UserDao, User> {
    @Autowired
    private UserDao userDao;

    /**
     *查询手机号是否存在
     * @return
     */
    public SercurityVo getSercurityById(Integer id){
        if (id==null){
            throw  new UserException("用户手机号获取失败");
        }
        SercurityVo vo = new SercurityVo();
        String phone = userDao.getPhone(id);
        if (StringUtils.isNotEmpty(phone)){
            vo.setVaguePhone(phone);
            phone.replace(phone.substring(3,7),"****");
            vo.setPhoneStatus(true);
        }else {
            vo.setPhoneStatus(false);
        }

        return vo;
    }

    /**
     * 查询电子邮箱是否存在
     * @param id
     * @return
     */
    public SercurityVo getEmailById(Integer id){
        if (id==null){
            throw new UserException("邮箱获取失败");
        }
        SercurityVo vo=new SercurityVo();
        String email=userDao.getEmail(id);
        if (StringUtils.isNotEmpty(email)){
            vo.setVagueEmail(email);
            email.replace(email.substring(3,7),"****");
            vo.setEmailStatus(true);
        }else {
            vo.setEmailStatus(false);
        }
        return vo;
    }
    public SercurityVo getContact(Integer id){
        if (id==null){
            throw new UserException("查询手机号和邮箱失败");
        }
        SercurityVo vo=new SercurityVo();
        String phone=userDao.getPhone(id);
        String email=userDao.getEmail(id);
        if (StringUtils.isNotEmpty(email)&&StringUtils.isNotEmpty(phone)){
            email.replace(email.substring(3,7),"****");
            phone.replace(email.substring(3,7),"****");
            vo.setEmailStatus(true);
        }else {
            vo.setEmailStatus(false);
        }
        return vo;
    }

    /**
     * 修改手机号
     * @param user
     * @return
     */
    public Integer updatePhone(User user){
        if (user==null){
            throw new UserException("手机号修改失败");
        }
        return userDao.updatePhone(user);
    }

    /**
     * 修改邮箱
     * @param user
     * @return
     */
    public Integer updateEmail(User user){
        if (user==null){
            throw  new UserException("邮箱修改失败");
        }
        return userDao.updateEmail(user);
    }

    /**
     * 修改登录密码
     * @param user
     * @return
     */
    public Integer updateLoginPwd(User user){
        if (user==null){
            throw new UserException("密码修改失败");
        }
        return userDao.updateLoginPwd(user);
    }
}
