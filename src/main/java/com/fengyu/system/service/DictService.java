package com.fengyu.system.service;

import com.fengyu.common.service.CrudService;
import com.fengyu.system.dao.DictDao;
import com.fengyu.system.model.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2016/6/29.
 */
@Service(value="dictService")
@Transactional
public class DictService extends CrudService<DictDao,Dict>{

    @Autowired
    private DictDao dictDao;

    public List<Dict> getListByTypeCode(String typecode) {

        return dictDao.getListByTypeCode(typecode);
    }

    public Dict getListByCode(String code) {

        return dictDao.getListByCode(code);
    }
}
