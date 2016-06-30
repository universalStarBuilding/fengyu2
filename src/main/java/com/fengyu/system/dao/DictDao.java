package com.fengyu.system.dao;

import com.fengyu.common.persistence.CrudDao;
import com.fengyu.common.persistence.annotation.MyBatisDao;
import com.fengyu.system.model.Dict;

import java.util.List;

@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

    List<Dict> getListByTypeCode(String typecode);

    Dict getListByCode(String code);
}