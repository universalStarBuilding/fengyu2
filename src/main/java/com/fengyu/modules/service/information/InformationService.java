package com.fengyu.modules.service.information;

import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.information.InformationDao;
import com.fengyu.modules.model.Information;
import com.fengyu.modules.webservice.information.vo.InformationRequestVo;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/7/4.
 */
@Service(value = "informationService")
@Transactional
public class InformationService extends CrudService<InformationDao,Information> {

    @Autowired
    private InformationDao informationDao;

    /**
     * 根据发布人查询资讯列表
     * @param informationRequestVo
     * @return
     */
    public SearchResult getListInformation(InformationRequestVo informationRequestVo){
        SearchResult<Information>result=new SearchResult<>();
        result.setTotalRows(informationDao.getInformationPage(informationRequestVo));
        result.setRows(informationDao.getListInformation(informationRequestVo));
        return result;
    }

    /**
     * 根据id获取资讯详细信息
     * @param informationRequestVo
     * @return
     */
    public Information selectById(InformationRequestVo informationRequestVo){
        if (informationRequestVo.getId()==null){
            throw new RuntimeException("详细咨询获取失败");
        }
        return informationDao.selectById(informationRequestVo);
    }
}
