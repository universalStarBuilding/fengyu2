package com.fengyu.modules.service.user;


import com.fengyu.common.exception.UserException;
import com.fengyu.common.service.BaseService;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.user.UserDao;
import com.fengyu.modules.model.User;
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
    public Integer getPhone(Integer id){
        if (id==null){
            throw  new UserException("");
        }
        return userDao.getPhone(id);
    }
}
