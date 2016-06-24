package com.fengyu.common.exception.MapperSupport;

import com.fengyu.common.exception.MapperSupport.Constant.PersistenceExceptionType;

/**
 * Created by admin on 2016/6/24.
 */
public class WebActionException extends AbstractException {
    protected PersistenceExceptionType type;
    protected Object data;
    public WebActionException(Throwable ex, PersistenceExceptionType type, Object data){
        super(ex);
        this.type = type;
        this.data = data;
    }

    @Override
    public String getExceptionType() {
        return "WebActionExceptionType";
    }

    public WebActionException(PersistenceExceptionType type, Object data){
        this(null,type,data);
    }
    @Override
    public PersistenceExceptionType getUserDefindExType(){
        return this.type;
    }
    public  Object getData(){
        return  this.data;
    }

}
