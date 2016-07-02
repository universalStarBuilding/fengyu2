package com.fengyu.modules.dao.account;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.modules.model.AccUserBank;

@MyBatisDao
public interface AccUserBankDao extends CrudDao<AccUserBank> {

    int insert(AccUserBank record);

    String getUserBank(Integer id);

    AccUserBank getInformation(Integer id);
}