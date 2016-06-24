package com.fengyu.system.service.impl;

import com.fengyu.common.service.CrudService;
import com.fengyu.common.utils.StringUtils;
import com.fengyu.system.dao.MessageTemplatesDao;
import com.fengyu.system.entity.MessageTemplates;
import com.fengyu.system.service.MessageTemplatesService;
import org.springframework.beans.factory.annotation.Autowired;



public class MessageTemplatesServiceImpl extends CrudService<MessageTemplatesDao,MessageTemplates> implements MessageTemplatesService
{
    @Autowired
    private MessageTemplatesDao messageTemplatesDao;

    /**
     * @Name:
     * @Author: junz（作者）
     * @Version: V1.00 （版本号）
     * @Create Date: 2016-06-23（创建日期）
     * @Description:
     *往信息模板里的变量注入内容
     * 分为List 跟 Map两种 map需要名称对应key List需要次序正确
     * String dynamicContent= "${cat} really needs some ${beverage}.";
     */
    public String inject2MsgTpl4Code(Object params, String msgTplCode) throws Exception
    {
        MessageTemplates msgTpl=new MessageTemplates();
        msgTpl.setMsgTplCode(msgTplCode);
        msgTpl= messageTemplatesDao.get(msgTpl);
        String dynamicContent=msgTpl.getMsgTplContent();
//


        return StringUtils.injectParams2DynamicStr(params,dynamicContent);
    }

}