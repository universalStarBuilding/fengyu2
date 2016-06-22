package com.fengyu.modules.service.user;

import com.fengyu.common.exception.UserException;
import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.user.PostAddressDao;
import com.fengyu.modules.model.PostAddress;
import com.fengyu.system.entity.LogAccess;
import com.fengyu.system.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2016/6/22.
 */
@Service(value = "postAddressService")
@Transactional
public class PostAddressService extends CrudService<PostAddressDao,PostAddress> {
    @Autowired
    private PostAddressDao postAddressDao;

    /**
     * 查询详细收货地址
     * @param id
     * @return
     */
    public PostAddress getPostAddress(Integer id){
        if (id==null){
            throw new UserException("收货地址获取失败");
        }
        return postAddressDao.getPostAddress(id);
    }

    /**
     * 添加收货地址
     * @param postAddress
     * @return
     */
    public Integer insert(PostAddress postAddress){
        postAddress.setUserId(postAddress.getUserId());
        postAddress.setPostCode(postAddress.getPostCode());
        postAddress.setPostUser(postAddress.getPostUser());
        postAddress.setMobile(postAddress.getMobile());
        postAddress.setProvinceId(postAddress.getProvinceId());
        postAddress.setCityId(postAddress.getCityId());
        postAddress.setCountyId(postAddress.getCountyId());
        postAddress.setAddressDetail(postAddress.getAddressDetail());
        postAddress.setIsDefault(postAddress.getIsNewRecord());
        return postAddressDao.insert(postAddress);
    }

    /**
     *  修改收货地址
     * @param postAddress
     * @return
     */
    public Integer updatePostAddress(PostAddress postAddress){
        if (postAddress.getUserId()==null){
            throw new UserException("收货地址修改失败");
        }
        postAddress.setUserId(postAddress.getUserId());
        postAddress.setPostCode(postAddress.getPostCode());
        postAddress.setPostUser(postAddress.getPostUser());
        postAddress.setMobile(postAddress.getMobile());
        postAddress.setProvinceId(postAddress.getProvinceId());
        postAddress.setCityId(postAddress.getCityId());
        postAddress.setCountyId(postAddress.getCountyId());
        postAddress.setAddressDetail(postAddress.getAddressDetail());
        postAddress.setIsDefault(postAddress.getIsNewRecord());
        return postAddressDao.updatePostAddress(postAddress);
    }

    /**
     * 删除收货地址
     * @param id
     * @return
     */
    public Integer deletePostAddress(Integer id){
        if (id==null){
            throw new UserException("收货地址删除失败");
        }
        PostAddress postAddress=new PostAddress();
        postAddress.setUserId(id);
        return postAddressDao.delete(id);
    }

    /**
     * 分页查询收获地址
     * @param logAccess
     * @return
     */
    public SearchResult getListPostAddress(LogAccess logAccess){
        SearchResult<LogAccess> result=new SearchResult<>();
        result.setTotalRows(postAddressDao.postAddressPage(logAccess));
        result.setRows(postAddressDao.getListPostAddress(logAccess));
        return result;
    }
}
