package com.fengyu.modules.dao.account;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.AccUserBank;
import com.fengyu.modules.webservice.account.vo.AccUserBankVo;

@MyBatisDao
public interface AccUserBankDao extends CrudDao<AccUserBank> {
    //绑定银行卡
    int insert(AccUserBank record);
    //查询是否有银行卡绑定
    String getUserBank(Integer id);
    //查询用户的银行个人信息
    //AccUserBankVo accUserBank(Integer id);
    AccUserBank accUserBank(AccUserBankVo accUserBankVo);
}