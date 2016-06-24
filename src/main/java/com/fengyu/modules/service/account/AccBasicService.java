package com.fengyu.modules.service.account;

import com.fengyu.common.exception.AccountException;
import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.modules.dao.user.AccBasicDao;
import com.fengyu.modules.model.AccBasic;
import com.fengyu.modules.webservice.user.vo.SercurityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/23.
 */
@Service(value = "accBasicService")
@Transactional
public class AccBasicService extends CrudService<AccBasicDao,AccBasic> {

    @Autowired
    private AccBasicDao accBasicDao;

    //查询是否设置支付密码

    public SercurityVo getPayPwd(Integer id){
        if (id==null){
            throw new AccountException("支付密码查询失败");
        }
        SercurityVo vo=new SercurityVo();
        String payPwd=accBasicDao.getPayPwd(id);
        if (StringUtils.isNotEmpty(payPwd)){
            vo.setPayPwdStatus(true);
        }else {
            vo.setPayPwdStatus(false);
        }
        return vo;
    }

    /**
     * 修改支付密码
     * @param accBasic
     * @return
     */
    public Integer updatePayPwd(AccBasic accBasic){
        if (accBasic.getUserId()==null){
            throw new AccountException("支付密码修改失败");
        }
        return accBasicDao.updatePayPwd(accBasic);
    }
}
