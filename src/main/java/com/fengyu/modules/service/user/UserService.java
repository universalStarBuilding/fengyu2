package com.fengyu.modules.service.user;


import com.fengyu.common.service.BaseService;
import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.user.UserDao;
import com.fengyu.modules.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value="userService")
@Transactional
public class UserService extends CrudService<UserDao,User>
{
	@Autowired
    UserDao userDao;


}
