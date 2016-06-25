package com.fengyu.common.exception.MapperSupport.Constant;

/**
 * Created by admin on 2016/6/24.
 */
public enum PersistenceExceptionType {

    LoginNotFund("不存在的登录账号！"),
    RequireLogined("用户未登录！"),
    InvalidNewPasswd("无效的新密码！"),
    InvalidOldPasswd("原始密码不正确！"),
    LoginInvalidPasswd("无效的登录密码！"),
    LoginInvalidStatus("用户状态异常！"),
    UserAccountDuplicate("重复的用户信息！"),
    RoleNameDuplicate("重复的角色信息！");


























    private PersistenceExceptionType(String value){
        this.type = value;
    }

    private String type;


    @Override
    public String toString() {
        return this.type;
    }
}
