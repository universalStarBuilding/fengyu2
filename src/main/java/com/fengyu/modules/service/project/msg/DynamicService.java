package com.fengyu.modules.service.project.msg;

import com.fengyu.modules.dao.project.msg.DynamicDao;
import com.fengyu.modules.model.Dynamic;
import com.fengyu.modules.webservice.project.vo.DynamicRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by admin on 2016/6/24.
 */
@Service(value = "dynamicService")
@Transactional
public class DynamicService {

    @Autowired
    private DynamicDao dynamicDao;

    /**
     * 添加项目动态
     * @param dynamicVo
     * @return
     */
    public Integer insert(DynamicRequestVo dynamicVo){
        if (dynamicVo==null){
            throw new RuntimeException("添加失败");
        }
        Dynamic dynamic=new Dynamic();
        dynamic.setProjectNo(dynamicVo.getProjectNo());
        dynamic.setDsclUser(dynamicVo.getDsclUser());
        dynamic.setDsclNode(dynamicVo.getDsclNode());
        dynamic.setIfmtType(dynamicVo.getIfmtType());
        dynamic.setIfmtContentDesc(dynamicVo.getIfmtContentDesc());
        dynamic.setState(dynamicVo.getState());
        dynamic.setDsclTime(new Date());
        dynamic.setAuditor(dynamicVo.getAuditor());
        dynamic.setAuditTime(new Date());
        return dynamicDao.insert(dynamic);
    }
}
