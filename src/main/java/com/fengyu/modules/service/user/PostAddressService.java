package com.fengyu.modules.service.user;

import com.fengyu.common.exception.MapperSupport.Constant.WebExceptionType;
import com.fengyu.common.exception.MapperSupport.WebActionException;
import com.fengyu.common.service.CrudService;
import com.fengyu.modules.dao.user.PostAddressDao;
import com.fengyu.modules.model.PostAddress;
import com.fengyu.modules.webservice.user.vo.PostAddressRequestVo;
import com.fengyu.modules.webservice.user.vo.PostAddressResponseVo;
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
     * @param postAddressResponseVo
     * @return
     */
    public PostAddress getPostAddress(PostAddressResponseVo postAddressResponseVo){
        if (postAddressResponseVo.getId()==null){
            throw new RuntimeException("收货地址获取失败");
        }
        return postAddressDao.getPostAddress(postAddressResponseVo);
    }

    /**
     * 添加收货地址
     * @param postAddress
     * @return
     */
    public Integer insert(PostAddress postAddress){

        return postAddressDao.insert(postAddress);
    }

    /**
     *  修改收货地址
     * @param postAddressResponseVo
     * @return
     */
    public Integer updatePostAddress(PostAddressResponseVo postAddressResponseVo){
        if (postAddressResponseVo.getId()==null){
            throw new WebActionException(WebExceptionType.UPDATEPOSTACCESS,postAddressResponseVo);
        }
        return postAddressDao.updatePostAddress(postAddressResponseVo);
    }

    /**
     * 删除收货地址
     * @param id
     * @return
     */
    public Integer deletePostAddress(Integer id){
        if (id==null){
            throw new WebActionException(WebExceptionType.DELETEPOSTACCESS,id);
        }
        PostAddressResponseVo postAddressResponseVo=new PostAddressResponseVo();
        postAddressResponseVo.setId(id);
        return postAddressDao.delete(id);
    }

    /**
     * 分页查询收获地址
     * @param postAddressRequestVo
     * @return
     */
    public SearchResult getListPostAddress(PostAddressRequestVo postAddressRequestVo){
        SearchResult<PostAddressRequestVo> result=new SearchResult<>();
        result.setTotalRows(postAddressDao.postAddressPage(postAddressRequestVo));
        result.setRows(postAddressDao.getListPostAddress(postAddressRequestVo));
        return result;
    }
}
