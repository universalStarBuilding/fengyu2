package com.fengyu.common.exception.MapperSupport;

import com.fengyu.common.exception.MapperSupport.Constant.PersistenceExceptionType;
import com.fengyu.common.exception.MapperSupport.Constant.WebActionExceptionType;

/**
 * Created by admin on 2016/6/24.
 */
public class WebActionException extends AbstractException {

    private WebActionExceptionType type;
    private Object data;

    public WebActionException(Throwable ex, WebActionExceptionType type, Object data){
        super(ex);
        this.type = type;
        this.data = data;
    }

    @Override
    public String getExceptionType() {
        return "WebActionExceptionType";
    }

    public WebActionException(WebActionExceptionType type, Object data){
        this(null,type,data);
    }

    public WebActionExceptionType getType(){
        return  type;
    }
    public  Object getData(){
        return  data;
    }
}
