package com.fengyu.common.exception.MapperSupport.Constant;

/**
 * Created by admin on 2016/6/24.
 */
public enum WebExceptionType {


    //登录
    LoginNotFund("不存在的登录账号！"),
    RequireLogined("用户未登录！"),
    InvalidNewPasswd("无效的新密码！"),
    InvalidOldPasswd("原始密码不正确！"),
    LoginInvalidPasswd("无效的登录密码！"),
    LoginInvalidStatus("用户状态异常！"),
    UserAccountDuplicate("重复的用户信息！"),
    RoleNameDuplicate("重复的角色信息！"),

    //用户基本信息
    UserNotFund("用户不存在！"),
    UpdateInvalidUserInfo("用户信息修改异常！"),
    UserPhoneEmail("手机号不存在或邮箱不存在"),
    UserPassword("原密码错误，修改失败"),
    //账户
    UpdatePayPwdAccUserBank("修改支付密码"),
    InsertInvalidAccUserBank("绑定银行卡失败"),
    //收货地址
    DeletePostAccess("删除收货地址失败"),
    InsertPostAccess("收货地址添加失败"),
    UpdatePostAccess("收货地址修改失败"),
    UpdateInvalidUserInfo("用户信息修改异常！"),

    //项目回报设置
    DeleteInvalidProejctReturnset("删除项目回报异常！"),
    UpdateInvalidProejctReturnset("更新项目回报异常！"),
    CrowdFundReturnsetNotFund("项目回报不存在！"),

    PostAccessNotFund("收货地址不存在"),
    //添加
    InsertDynamic("添加失败！"),
    //查询我的私信列表
    QueryById("获取信息列表失败"),
    //我发起的项目列表
    QueryBy("获取列表失败"),
    //查询热门项目列表
    SelectHot("获取热门项目列表失败"),
    //查询我的私信列表
    GetSendMsgListByRecId("获取我的私信失败"),
    //删除私信
    DeleteById("删除私信失败"),
    //我支持的项目列表
    GetPageList("获取支持项目失败");



























    private WebExceptionType(String value){
        this.type = value;
    }

    private String type;


    @Override
    public String toString() {
        return this.type;
    }
}
